import { myAxios } from "./connection";

export const registerTournament = (user)=>{
    return myAxios.post('/registercontroller/registerTournament', user)
    .then((response)=> response.data)
    .catch(error => {
        console.error('Error Posting Tournaments Data:', error);
        throw error; 
    });
};