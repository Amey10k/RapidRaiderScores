import React, { useState, useEffect } from 'react';
import { fetchTournaments } from '../Services/getTournamentDataService';
import { Button, Card } from 'react-bootstrap';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faLocationDot } from '@fortawesome/free-solid-svg-icons';
import {faCalendarDays} from '@fortawesome/free-solid-svg-icons';
import KabaddiChampionshipImage1 from '../Assests/KabaddiChampionship.png';
import KabaddiChampionshipImage2 from '../Assests/KabaddiChampionship2.png';
import KabaddiChampionshipImage3 from '../Assests/KabaddiChampionship3.png';


const ShowTournament = () => 
{
    const [tournaments, setTournaments] = useState([]);
    const images = [KabaddiChampionshipImage1, KabaddiChampionshipImage2, KabaddiChampionshipImage3]
    useEffect(() => {
        // Define a function to fetch tournaments and update state
        const fetchData = async () => {
            try {
                const data = await fetchTournaments();
                console.log(data);
                setTournaments(data);
            } catch (error) {
                // Handle error
                console.error('Error fetching tournaments:', error);
            }
        };

        // Call the fetchData function when the component is mounted or rendered
        fetchData();
    }, []);

    const formatDate = (dateString) => {
        const date = new Date(dateString);
        const day = String(date.getDate()).padStart(2, '0');
        const month = new Intl.DateTimeFormat('en', { month: 'short' }).format(date);
        const year = date.getFullYear();
        return `${day}-${month}-${year}`;
    };

    return (
        <div>
            <h2 style={{textAlign:'center'}}>Tournaments</h2>
            <div style={{display:'flex', flexWrap:'wrap'}}>
                {tournaments.map((tournament, index) => (
                    <div key={tournament.tournamentId} style={{margin:'20px'}}>
                        <Card style={{ width: '18rem' }}>
                            <Card.Img variant="top" src={images[index]} style={{height:'6cm', width:'7.58cm'}}/>
                            <Card.Body>
                            <Card.Title>{tournament.tournamentName}</Card.Title>
                            <Card.Text>
                                <FontAwesomeIcon icon={faCalendarDays} /> &nbsp;
                                {formatDate(tournament.startDate)} <b>to</b> {formatDate(tournament.endDate)}
                                <br />
                                <FontAwesomeIcon icon={faLocationDot} /> &nbsp;
                                {tournament.locationVenue}
                            </Card.Text>
                            <Button variant="primary">Register</Button>
                            </Card.Body>
                        </Card>    
                    </div>
                    
                ))}
            </div>
        </div>
    );
}

export default ShowTournament;