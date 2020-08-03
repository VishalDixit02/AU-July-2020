import React, { useState } from "react";
import { Text, View, StyleSheet, Button } from "react-native";
import TodoInsert from "./TodoInsert";
import List from "./List";

export default function Main({ navigation }) {
  const [todo, setTodos] = useState([]);

  const add = (text) => {
    setTodos([...todo, { id: Math.random().toString(), textValue: text }]);
  };

  const onRemove = (id) => {
    setTodos(todo.filter((t) => t.id !== id));
    alert("Item with ID " + id + " deleted Successfully!");
  };

  const logout = () => {
    navigation.navigate("Logout");
  };
  return (
    <View style={styles.container}>
      <Text style={styles.title}>CREATE YOUR ToDoLIST!</Text>
      <View style={styles.card}>
        <TodoInsert onaddItem={add} />
        <List todos={todo} onRemove={(id) => onRemove(id)} />
      </View>
      <Button title={"LOGOUT"} color="rgb(2,57,110)" onPress={logout} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "green",
    justifyContent: "center",
    alignItems: "center",
  },
  title: {
    color: "rgb(2,16,57)",
    fontSize: 30,
    textAlign: "center",
    fontWeight: "bold",
    margin: 10,
  },
  card: {
    flex: 1,
    backgroundColor: "blue",
    width: 330,
  },
});
