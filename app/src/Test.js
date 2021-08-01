import React, { Component } from 'react';

class Test extends Component {

    constructor(props) {
        super(props);
        this.state = {liczba: "", isLoading: true};
    }

    componentDidMount() {
        this.setState({isLoading: true});

        fetch('cos/1')
            .then(response => response.json())
            .then(data => this.setState({liczba: data, isLoading: false}));
    }

    render() {

        if (this.state.isLoading) {
            return <p>Loading...</p>;
        }



        return (
            <div>
                {this.state.liczba}
            </div>
        );
    }
}

export default Test;