import React from "react";
import ReactDom from "react-dom";
import FileList from "../app/fileList";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {files: []};
    }

    componentDidMount() {
        return fetch('/fileList')
            .then((response) => response.json())
            .then((responseJson) => {
                this.setState({files: responseJson});
            })
            .catch((error) => {
                console.error(error);
            });
    }

    render() {
        return (
            <FileList files={this.state.files}/>
        )
    }
}

// class FileList extends React.Component {
//     render() {
//         var files = this.props.files.map(file =>
//             <File key={file.fileId} file={file}/>
//         );
//         return (
//             <table>
//                 <tbody>
//                 <tr>
//                     <th>File Name</th>
//                 </tr>
//                 {files}
//                 </tbody>
//             </table>
//         )
//     }
// }



ReactDom.render(<App/>, document.getElementById('react'));