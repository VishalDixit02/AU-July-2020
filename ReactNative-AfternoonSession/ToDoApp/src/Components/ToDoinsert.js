import React, { useState } from "react";
import {
  Button,
  StyleSheet,
  TextInput,
  View,
  AsyncStorage,
} from "react-native";

const TodoInsert = ({ onaddItem }) => {
  const [newTodo, setnewTodo] = useState("");

  const InputHandler = (newItem) => {
    setnewTodo(newItem);
  };

  const add = async () => {
    await AsyncStorage.setItem("newTodo", newTodo);
    onaddItem(newTodo);
    setnewTodo("");
    alert("" + newTodo + "added to todo list");
  };
  return (
    <View style={styles.container}>
      <TextInput
        style={styles.inputText}
        placeholder="Add"
        onChangeText={InputHandler}
        value={newTodo}
      />
      <Button title={"ADD"} onPress={add} />
    </View>
  );
};

const styles = StyleSheet.create({
  inputText: {
    flex: 1,
    padding: 10,
    borderBottomColor: "blue",
    borderBottomWidth: 1,
    fontSize: 15,
    marginLeft: 8,
  },
  container: {
    flexDirection: "row",
    justifyContent: "space-between",
    alignItems: "center",
  },
});

export default TodoInsert;
