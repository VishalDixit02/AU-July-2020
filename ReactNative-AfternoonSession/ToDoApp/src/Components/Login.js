import React, { useState, useEffect } from "react";
import {
  Text,
  TextInput,
  View,
  StyleSheet,
  Button,
  AsyncStorage,
} from "react-native";

const Login = ({ navigation }) => {
  const [username, setUserName] = useState("");

  useEffect(() => {
    checkAuth();
  }, []);

  const checkAuth = async () => {
    const userName = await AsyncStorage.getItem("username");
    if (userName) {
      navigation.navigate("Main");
    }
    return;
  };

  const login = async () => {
    await AsyncStorage.setItem("username", username);
    navigation.navigate("Main");
  };

  return (
    <View style={Styles.container}>
      <Text style={Styles.titleStyle}>ToDoLIST APP</Text>
      <Text style={Styles.loginTextStyle}>Login</Text>
      <TextInput
        style={Styles.textInputStyle}
        onChangeText={(text) => setUserName(text)}
        placeholder="Enter your username"
      />
      <Button title="Log in" onPress={login} />
    </View>
  );
};

const Styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
  loginTextStyle: {
    fontSize: 25,
    fontWeight: "700",
    marginVertical: 20,
    marginTop: 70,
  },
  textInputStyle: {
    borderColor: "blue",
    borderWidth: 1,
    borderRadius: 5,
    fontSize: 15,
    padding: 3,
    width: "60%",
    marginBottom: 15,
  },
  titleStyle: {
    color: "rgb(2,16,57)",
    fontSize: 40,
    textAlign: "center",
    fontWeight: "bold",
  },
});

export default Login;
