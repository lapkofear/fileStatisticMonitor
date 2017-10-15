import React from "react";
import LineStatistic from "../app/lineStatistic"

export default class File extends React.Component {
    render() {
        let lines = this.props.file.lineStatistics.map(line =>
            <LineStatistic key={line.lineId} line={line}/>
        );
        return (
            [
                <tr className= "fileNameRow">
                    <td rowSpan={this.props.file.lineStatistics.length + 1}>{this.props.file.fileName}</td>
                </tr>
                , lines]
        )
    }
}