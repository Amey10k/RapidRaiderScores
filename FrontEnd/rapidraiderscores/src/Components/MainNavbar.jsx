import React, {useState} from 'react';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';
import Register_Tournament from './Register_Tournament';
import ShowTournament from './ShowTournaments';



const MainNavbar = () => 
{
  const [showRegisterTournament, setShowRegisterTournament] = useState(false);
  const [showTournament, setShowTournament]=useState(false);

  const handleRegisterTournamentClick = () => {
    setShowTournament(false);
    setShowRegisterTournament(true);
  };

  const handleShowTournamentClick = () => {
    setShowRegisterTournament(false)
    setShowTournament(true);
  };


  return(
    <div >
      <div>
        <Navbar bg="primary" data-bs-theme="dark">
          <Container>
            <Navbar.Brand href="/main">Rapid Raider Scores</Navbar.Brand>
            <Nav className="me-auto">
              <NavDropdown title="Tournament" id="basic-nav-dropdown">
                  <NavDropdown.Item onClick={handleRegisterTournamentClick}>Register Tournament</NavDropdown.Item>
                  <NavDropdown.Item onClick={handleShowTournamentClick} >Tournaments</NavDropdown.Item>
              </NavDropdown>
            </Nav>
          </Container>
        </Navbar>
        {showRegisterTournament && <Register_Tournament />}
        {showTournament && <ShowTournament/>}
      </div> 
    </div>
    
  );
};

export default MainNavbar;

