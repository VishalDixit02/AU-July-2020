import React from "react";
import { Text, View, StyleSheet, Button, AsyncStorage } from "react-native";

const Logout = ({ navigation }) => {
  const logout = async () => {
    await AsyncStorage.clear();
    alert("Logged out Successfully!");
    navigation.navigate("Login");
  };

  const goback = () => {
    navigation.navigate("Main");
  };

  return (
    <View style={Styles.container}>
      <Text style={Styles.titleStyle}>Are you sure you want to log out? </Text>
      <Text></Text>
      <Button title={"YES"} onPress={logout} />
      <Text></Text>
      <Button color="red" title={"GO BACK"} onPress={goback} />
    </View>
  );
};

const Styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
  },
  titleStyle: {
    color: "rgb(2,16,57)",
    fontSize: 15,
    textAlign: "center",
    fontWeight: "bold",
  },
});

export default Logout;
