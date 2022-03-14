# quotes

- in this lab we have to read the json file as list of Quotes objects and then generate a random number to retrieve an object from index equal to the random number.  
- before we deal with the gson library we should install this dependency in the **build.gradle**: 
   ```
  // https://mvnrepository.com/artifact/com.google.code.gson/gson
  implementation 'com.google.code.gson:gson:2.9.0'
  ```
- then we should rebuild the project to install the dependency.

### Testing

- you can test my code using the unit tests that I created to test the output of my functions.
- Also you can run the main method from the App class, and it will give you the output.  

### Lab 9

- The application will make a **GET** request to an API to get a random quote and append it to the json file **dailyQuote**. 
