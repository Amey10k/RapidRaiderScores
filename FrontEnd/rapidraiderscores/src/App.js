import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import MainNavbar from '../src/Components/MainNavbar';
import {Routes, Route, BrowserRouter} from 'react-router-dom';


function App() {
  return (
    <div className='App-header'>      
      <BrowserRouter>
        <Routes>
          <Route index element = {<MainNavbar/>}/>
          <Route path = "/main" element = {<MainNavbar/>}/>         
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
