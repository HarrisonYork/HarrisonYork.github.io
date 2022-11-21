import React, { Component } from "react";
import ReactDOM from "react-dom";

import TimeLine from "react-gantt-timeline";
import "./styles.css";
//import DataDriver from "DataDriver.js";

class App extends Component {
  constructor(props) {
    super(props);

    //let newData = new DataDriver();
    //const dataArrayList = newData.getScans();


    this.data = [
      
              {
              id: 458752,
              start: new Date(2022, 11-1, 21, 8, 47, 18),
              end: new Date(2022, 11-1, 21, 10, 27, 19),
              name: "Silver Tool 1"
              },
              {
              id: 35317286,
              start: new Date(2022, 11-1, 21, 11, 9, 12),
              end: new Date(2022, 11-1, 21, 14, 39, 20),
              name: "Tool Tag 4"
              },
              {
              id: 454656,
              start: new Date(2022, 11-1, 21, 9, 9, 19),
              end: new Date(2022, 11-1, 21, 12, 38, 21),
              name: "Black Scissors 1"
              },
              {
              id: 35317286,
              start: new Date(2022, 11-1, 21, 10, 9, 22),
              end: new Date(2022, 11-1, 21, 17, 9, 23),
              name: "Surgeon Tag 1"
              },
              {
                id: 35317286,
                start: new Date(2022, 11-1, 21, 14, 9, 24),
                end: new Date(2022, 11-1, 21, 18, 9, 26),
                name: "Tool Tag 4",
                color: "grey"
                },
                {
                id: 454656,
                start: new Date(2022, 11-1, 21, 13, 9, 25),
                end: new Date(2022, 11-1, 21, 17, 9, 27),
                name: "Surgeon 1",
                color: "red"
                }
    ];
    this.links = [{}];
  }

  render() {
    return (
      <div className="app-container">
        <h1 class="header1">Timeline</h1>
        {/* DayWidth<input type="range" min="30" max="500" value={this.state.daysWidth} onChange={this.handleDayWidth} step="1"/>
       Item Height<input type="range" min="30" max="500" value={this.state.itemheight} onChange={this.handleItemHeight} step="1"/> */}
        <div className="time-line-container">
          <TimeLine data={this.data} links={this.links} mode={"day"}/>
        </div>
      </div>
    );
  }
}
const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);
