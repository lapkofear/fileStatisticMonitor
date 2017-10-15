import React from "react";

export default class LineStatistic extends React.Component {
    render() {
        return (
            <tr className="lineStatisticRow">
                <td>{this.props.line.lineNumber}</td>
                <td>{this.props.line.lineLength}</td>
                <td>{this.props.line.longestWord}</td>
                <td>{this.props.line.shortestWord}</td>
                <td>{this.props.line.averageWordLength}</td>
            </tr>
        )
    }
}