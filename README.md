# SeleniumTest

[todomvc](https://todomvc.com/examples/vanillajs/)
Spend some time on the application and understand its structure to write automated test scripts.

### Deliverable

You are provided with an abstract Base Class Selenium Test which has the method:

```java
public abstract void runTest(Object val);
```

You have to create selenium test cases for the following 3 features:

1. Add a Todo
2. Mark a Todo as Completed
3. Delete a Todo

You have to implement the code in the _runTest_ method of the following 3 classes that extend the _
SeleniumTest_ class. Each of these classes is used to test one of the features mentioned above.

### TestForAddTodo.runTest

- Tests "Add a Todo"
- _runTest_ method takes the todo title as an input parameter. Make sure you cast the input object
  to the correct type.
- Write a code to add a new todo with the title that was passed in using the Selenium driver.

### TestForMarkCompleted.runTest

- Tests "Mark a Todo as completed"
- _runTest_ method takes the index of the todo that is to be marked as completed. The index starts
  at 0. Make sure you cast the input object to the correct type.
- Write a code to mark a todo at the specified index as completed using the Selenium driver.

**Extra** - if `index` of that todo doesn't exist. You print `todo's index is out of bound` to 
the console.

### TestForDeleteTodo.runTest

- Tests "Delete Todo"
- _runTest_ method takes the title of the todo that is to be deleted. Make sure you cast the input
  object to the correct type.
- Write a code to delete todo with the todo's title that was passed using the Selenium driver.

**Extra** - if there is no todo's name match with argument. print `todo <todo_name> doesn't 
exist.` to the console.
