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
        id: 70000,
        start: new Date(2022, 11-1, 6, 18, 16, 17),
        end: new Date(2022, 11, 7, 13, 58, 34),
        name: "Tool Tag 1"
      },
        {
        id: 70000,
        start: new Date(2022, 11-1, 7, 13, 59, 16),
        end: new Date(2022, 11, 7, 14, 3, 8),
        name: "Tool Tag 1"
        },
        {
        id: 70000,
        start: new Date(2022, 11-1, 7, 14, 6, 36),
        end: new Date(2022, 11, 7, 14, 15, 5),
        name: "Tool Tag 1"
        },
        {
        id: 70000,
        start: new Date(2022, 11-1, 7, 14, 15, 29),
        end: new Date(2022, 11, 14, 14, 13, 1),
        name: "Tool Tag 1"
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
          <TimeLine data={this.data} links={this.links} />
        </div>
      </div>
    );
  }
}
const rootElement = document.getElementById("root");
ReactDOM.render(<App />, rootElement);
