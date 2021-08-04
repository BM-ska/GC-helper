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
            userName: "undeclared",
            cacheName: "undeclared",
            cacheNumber: "undeclared",
            ifHint: false,
            whenHint: 0
        };

        this.handleInputChange = this.handleInputChange.bind(this);
    }

    handleInputChange(event) {

    }

    render() {
        return (
            <form>
                <label>Do you want a hint?: &nbsp; </label>
                <input
                    name="ifHint"
                    type="checkbox"
                    checked={this.state.ifHint}
                    onChange={this.handleInputChange} />

                <br />
                <label>After how many wrong answers?: &nbsp; </label>
                <input
                    name="whenHint"
                    type="number"
                    value={this.state.whenHint}
                    onChange={this.handleInputChange} />

            </form>
        );
    }
}

ReactDOM.render(
    <OwnerForm />,
    document.getElementById('root')
);
