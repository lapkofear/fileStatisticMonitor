import React from "react";
import File from "../app/file"

export default class FileList extends React.Component {
    render() {
        var files = this.props.files.map(file =>
            <File key={file.fileId} file={file}/>
        );
        return (
            <table className= "filesTable">
                <tbody>
                <tr className="header">
                    <th>File Name</th>
                    <th>Line Number</th>
                    <th>Line Length</th>
                    <th>Longest Word</th>
                    <th>Shortest Word</th>
                    <th>Average Word Length</th>
                </tr>
                {files}
                </tbody>
            </table>
        )
    }
}