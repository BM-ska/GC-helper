import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import Test from "./classes/Test";

ReactDOM.render(
  <React.StrictMode>
    <Test />
  </React.StrictMode>,
  document.getElementById('root')
);

class OwnerForm extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            userName: "",
            cacheName: "",
            GCCode: "",

            ifHint: false,
            hint: "",
            whenHint: 0,

            ifCoordinates : false,
            ifText : false,
            solveCoordinates: "",
            solveText: ""
        };

        this.handleTextChange = this.handleTextChange.bind(this);
        this.handleCheckboxChange = this.handleCheckboxChange.bind(this);

    }

    handleSubmit = (event) =>{
        alert('submit');
        event.preventDefault();
    }

    handleTextChange(event) {
        this.setState({[event.target.name]: event.target.value});
    }

    handleCheckboxChange(event) {
        this.setState({[event.target.name]: event.target.checked});

        if(event.target.name === "ifText")
            this.setState({ifCoordinates : false});

        else
            this.setState({ifText : false});

    }

    render() {
        return (
            <form onSubmit = {this.handleSubmit}>
                <div>
                    <label>User name: &nbsp; </label>
                    <input
                        name="userName"
                        type="text"
                        checked={this.state.userName}
                        onChange={this.handleTextChange} />

                    <br />
                    <label>Cache name: &nbsp; </label>
                    <input
                        name="cacheName"
                        type="text"
                        checked={this.state.cacheName}
                        onChange={this.handleTextChange} />

                    <br />
                    <label>GC-code: &nbsp; GC-</label>
                    <input
                        name="GCCode"
                        type="text"
                        checked={this.state.GCCode}
                        onChange={this.handleTextChange} />

                    <br />

                </div>

                <div >
                    <label>Do you want a hint?: &nbsp; </label>
                    <input
                        name="ifHint"
                        type="checkbox"
                        checked={this.state.ifHint}
                        onChange={this.handleCheckboxChange} />


                    {this.state.ifHint ?
                        <div>
                            <label>Hint: &nbsp; </label>
                            <input
                                name="hint"
                                type="text"
                                checked={this.state.hint}
                                onChange={this.handleTextChange} />


                            <br/>
                            <label>After how many wrong answers?: &nbsp; </label>
                            <input
                                name="whenHint"
                                type="number"
                                value={this.state.whenHint}
                                onChange={this.handleTextChange} />

                        </div> : null
                    }
                </div>

                <div >
                    <label>The form of the answer:</label>
                    <br/>
                    <label>Coordinates &nbsp; </label>
                    <input
                        name="ifCoordinates"
                        type="checkbox"
                        checked={this.state.ifCoordinates}
                        onChange={this.handleCheckboxChange} />

                    <label> &nbsp; Text &nbsp; </label>
                    <input
                        name="ifText"
                        type="checkbox"
                        checked={this.state.ifText}
                        onChange={this.handleCheckboxChange} />


                    {this.state.ifCoordinates ?
                        <div>
                            <label>Lat and Lon: &nbsp; </label>
                            <input
                                name="solveCoordinates"
                                type="text"
                                checked={this.state.solveCoordinates}
                                onChange={this.handleTextChange} />
                            <br/>

                        </div> : null
                    }
                    {this.state.ifText ?
                        <div>
                            <label>Text: &nbsp; </label>
                            <input
                                name="solveText"
                                type="text"
                                checked={this.state.solveText}
                                onChange={this.handleTextChange} />
                            <br/>

                        </div> : null
                    }

                </div>

                <input type="submit" value="Submit" />
            </form>
        );
    }
}

ReactDOM.render(
    <OwnerForm />,
    document.getElementById('root')
);
