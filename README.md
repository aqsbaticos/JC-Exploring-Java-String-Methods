# Laboratory: Exploring Java `String` Methods
Developed by: Baticos, Andric Quinn S.

## Screenshot of Proof

---
### Exercise 1: `length()` - Finding the  String's Size

**Code Snippet**

![Screenshot Proof](/ss/e1-cs.png?raw=true "exercise-1-code-snippet")

**Prediction**: _This code will output 14 as there are 14 characters in the string "Hello, Cadets!" (including whitespace and symbols)._ 

**Output**

![Screenshot Proof](/ss/e1-o.png?raw=true "exercise-1-output")

**Observation**: _As expected, the value returned by the length() method was 14._

---
### Exercise 2: `charAt()` - Accessing a Character

**Code Snippet**

![Screenshot Proof](/ss/e2-cs.png?raw=true "exercise-2-code-snippet")

**Prediction**: _This code will output the character 'l'._

**Output**

![Screenshot Proof](/ss/e2-o.png?raw=true "exercise-2-output")

**Observation**: _As expected, the value returned by the charAt() method was 'l'._

---
### Exercise 3: `substring()` - Extracting a Part of a String

**Code Snippet**

![Screenshot Proof](/ss/e3-cs.png?raw=true "exercise-3-code-snippet")

**Prediction**: _This code will output the string 'is ' (including the whitespace)._

**Output**

![Screenshot Proof](/ss/e3-o.png?raw=true "exercise-3-output")

**Observation**: _The value returned by the substring() method was 'is' only._

---
### Exercise 4: `toUpperCase()` and `toLowerCase()` - Changing Case

**Code Snippet**

![Screenshot Proof](/ss/e4-cs.png?raw=true "exercise-4-code-snippet")

**Prediction**: _This code will output the strings "THIS IS A TEST" and "this is a test" respectively._

**Output**

![Screenshot Proof](/ss/e4-o.png?raw=true "exercise-4-output")

**Observation**: _As expected, the value returned by the toUpperCase() and toLowerCase() methods were "THIS IS A TEST" and "this is a test" respectively._

---
### Exercise 5: `indexOf()` - Finding a Character or Substring

**Code Snippet**

![Screenshot Proof](/ss/e5-cs.png?raw=true "exercise-5-code-snippet")

**Prediction**: _This code will output the indexes 16, 37, and -1._

**Output**

![Screenshot Proof](/ss/e5-o.png?raw=true "exercise-5-output")

**Observation**: _As expected, the value returned by indexOf() were 16 (first index 'f' when fox matches, 37 (match z), and -1 (no match)._

---
### Exercise 6: `equals()` vs. `equalsIgnoreCase()` - Comparing Strings

**Code Snippet**

![Screenshot Proof](/ss/e6-cs.png?raw=true "exercise-6-code-snippet")

**Prediction**: _This code will output the values false, true, and true._

**Output**

![Screenshot Proof](/ss/e6-o.png?raw=true "exercise-6-output")

**Observation**: _As expected, the values returned by equals() were false and true, and the value returned by equalsIgnoreCase() was true._

---
### Exercise 7: `replace()` - Replacing Characters

**Code Snippet**

![Screenshot Proof](/ss/e7-cs.png?raw=true "exercise-7-code-snippet")

**Prediction**: _This code will output the new string "I like dogs. Cats are cute"._

**Output**

![Screenshot Proof](/ss/e7-o.png?raw=true "exercise-7-output")

**Observation**: _As expected, the string "cats" was replaced by "dogs"._

---
### Exercise 8: `trim()` - Removing  Whitespace

**Code Snippet**

![Screenshot Proof](/ss/e8-cs.png?raw=true "exercise-8-code-snippet")

**Prediction**: _This code will remove the whitespace before and after 'Lots of spaces'. The length printed will be: 20 & 14._

**Output**

![Screenshot Proof](/ss/e8-o.png?raw=true "exercise-8-output")

**Observation**: _As expected, the whitespaces were removed and reduced the length of the string._
