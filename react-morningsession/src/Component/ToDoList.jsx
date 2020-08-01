import React, { Component } from "react";
import TodoItems from "./TodoItems";

class ToDoList extends Component {
  state = {};

  constructor(props) {
    super(props);

    this.state = {
      items: [],
    };

    this.addItem = this.addItem.bind(this);
    this.deleteItem = this.deleteItem.bind(this);
  }

  deleteItem(key) {
    var filteredItems = this.state.items.filter(function (item) {
      return item.key !== key;
    });

    this.setState({
      items: filteredItems,
    });
  }

  addItem = (e) => {
    if (this._inputElement.value !== "") {
      var newItem = {
        text: this._inputElement.value,
        key: Date.now(),
      };

      this.setState((prevState) => {
        return {
          items: prevState.items.concat(newItem),
        };
      });

      this._inputElement.value = "";
    }

    console.log(this.state.items);

    e.preventDefault();
  };

  render() {
    return (
      <React.Fragment>
        <div className="todoListMain">
          <div className="header">
            <form onSubmit={this.addItem}>
              <input
                ref={(a) => (this._inputElement = a)}
                placeholder="enter task"
              ></input>
              <button type="submit">add</button>
            </form>
          </div>
          <TodoItems delete={this.deleteItem} entries={this.state.items} />
        </div>
      </React.Fragment>
    );
  }
}

export default ToDoList;
