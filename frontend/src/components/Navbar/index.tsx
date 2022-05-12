import { ReactComponent as GithubIcon } from '../../assets/img/github.svg';
import './styles.css';

function Navbar() {
    return (
    <header>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>DSVideos</h1>                  
            <div className="dsmovie-contact-link">                               
            <GithubIcon/>    
              <a href="https://github.com/leandroibraim/"target="_blank" rel="noreferrer">Github</a>                           
            </div>           
          </div>
        </nav>
      </header>
    );

}

export default Navbar;