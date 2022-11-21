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
        start: new Date(2022, 11-1, 21, 13, 56, 45),
        end: new Date(2022, 11-1, 21, 13, 58, 21),
        name: "Silver Tool 1"
        },
        {
        id: 503808,
        start: new Date(2022, 11-1, 21, 13, 56, 49),
        end: new Date(2022, 11-1, 21, 13, 59, 11),
        name: "Tool Tag 3"
        },
        {
        id: 454656,
        start: new Date(2022, 11-1, 21, 13, 58, 17),
        end: new Date(2022, 11-1, 21, 13, 58, 54),
        name: "Black Scissors 1"
        },
        {
        id: 458752,
        start: new Date(2022, 11-1, 15, 13, 58, 57),
        end: new Date(2022, 11-1, 15, 13, 59, 7),
        name: "Silver Tool 1"
        },
        {
        id: 454656,
        start: new Date(2022, 11-1, 15, 13, 59, 0),
        end: new Date(2022, 11-1, 15, 13, 59, 9),
        name: "Black Scissors 1"
        },
          {
          id: 458752,
          start: new Date(2022, 11-1, 18, 14, 39, 17),
          end: new Date(2022, 11-1, 18, 14, 39, 19),
          name: "Silver Tool 1"
          },
          {
          id: 454656,
          start: new Date(2022, 11-1, 18, 14, 39, 19),
          end: new Date(2022, 11-1, 18, 14, 39, 21),
          name: "Black Scissors 1"
          },
          {
            id: 458752,
            start: new Date(2022, 11-1, 18, 14, 39, 20),
            end: new Date(2022, 11-1, 18, 14, 39, 38),
            name: "Silver Tool 1"
            },
            {
            id: 454656,
            start: new Date(2022, 11-1, 18, 14, 39, 39),
            end: new Date(2022, 11-1, 18, 14, 44, 33),
            name: "Black Scissors 1"
            },
            {
            id: 458752,
            start: new Date(2022, 11-1, 18, 14, 40, 14),
            end: new Date(2022, 11-1, 18, 14, 45, 37),
            name: "Silver Tool 1"
            },
            {
              id: 454656,
              start: new Date(2022, 11-1, 18, 14, 47, 16),
              end: new Date(2022, 11-1, 21, 14, 9, 16),
              name: "Black Scissors 1"
              },
              {
              id: 458752,
              start: new Date(2022, 11-1, 18, 12, 47, 18),
              end: new Date(2022, 11-1, 18, 14, 27, 19),
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
              start: new Date(2022, 11-1, 21, 12, 9, 19),
              end: new Date(2022, 11-1, 21, 14, 18, 21),
              name: "Black Scissors 1"
              },
              {
              id: 35317286,
              start: new Date(2022, 11-1, 21, 14, 9, 22),
              end: new Date(2022, 11-1, 21, 17, 9, 23),
              name: "Tool Tag 4"
              },
              {
              id: 35317286,
              start: new Date(2022, 11-1, 21, 14, 9, 24),
              end: new Date(2022, 11-1, 21, 16, 9, 26),
              name: "Tool Tag 4"
              },
              {
              id: 454656,
              start: new Date(2022, 11-1, 21, 14, 9, 25),
              end: new Date(2022, 11-1, 21, 15, 9, 27),
              name: "Black Scissors 1"
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
