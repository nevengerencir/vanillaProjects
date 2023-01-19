import logo from "./logo.svg";
import "./App.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faBars } from "@fortawesome/free-solid-svg-icons";
import { faArrowRight } from "@fortawesome/free-solid-svg-icons";

import { useState } from "react";
function App() {
  const [isShown, setIsShown] = useState("");

  return (
    <div className="container">
      <section
        className={`container-menu  ${isShown === "open" ? "slide-in" : ""} ${
          isShown === "closed" ? "slide-out" : ""
        }`}
      >
        <div className="container-nav">
          <ul>
            <li>Home</li>
            <li>Projects</li>
            <li>About me</li>
            <li>Contact</li>
          </ul>
          <div
            className="menu"
            onClick={() => {
              setIsShown("closed");
            }}
          >
            <FontAwesomeIcon icon={faArrowRight} />
            <span>Close</span>
          </div>
        </div>
      </section>
      <section className="container-1">
        <div
          className="menu"
          onClick={() => {
            setIsShown("open");
          }}
        >
          <FontAwesomeIcon icon={faBars} />
          <span> Menu</span>
        </div>
        <section className="about">
          <p>
            Digital craftsmen by experience.{" "}
            <span className="underline">Carefully constructing your site</span>,
            one brick at a time.
          </p>
          <button>About Me</button>
        </section>
      </section>
      <div className="marquee">
        <div className="marquee__content">
          <span>Digitally crafting your solution</span>
        </div>
        <div className="marquee__content">
          <span>Digitally crafting your solution</span>
        </div>
      </div>
    </div>
  );
}

export default App;
