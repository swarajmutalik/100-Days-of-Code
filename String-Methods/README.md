### String Methods 

#### == Vs .equals() method 

== operator is used for reference comparison. It means == operator checks if both the objects point to the same memory location or not.

.equals() method used for content comparison. It means it is used to check object value.

#### .length() method 

It is a method that counts the number of characters in the string and returns it in integer.

#### .isEmpty() method 

This method returns true if the given string is empty, else it returns false or we can say that this method returns true if the length of the string is 0.

#### .trim() method 

It is a method that eliminates only leading and trailing spaces if they are present in the string.

#### .equalsIgnoreCase() method 

It is a method that is used to compare specified string to another string,ignoring case considerations i.e., lower or upper case.

#### .compareTo() method 

It is a method that is used to compare two strings lexicographically i.e., each character of the string is converted into a unicode value for comparison. If both the strings are equal then this method returns 0 else it returns a positive or a negative value.

#### .concat() method

It is a method that concatenates one string to the end of another string. This method returns a string with the value of the string passed into the method, appended to the end of the string.

#### .join() method 

It is a static method which concatenates the given elements with the delimiter and returns the concatenated string.

#### .subSequence() method 

It is a method that returns a CharSequence, it starts with the char value at the specified index and ends with the char value at (end - 1).

#### .subString() method 

It returns a new string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at the endIndex - 1.

#### .replace() method 

It is a method that returns a string replacing all the old characters to new characters.

#### replaceFirst() method

It is a method that replaces the first substring that fits the specified regular expression with the replacement string.

#### replaceAll() method

It is a method that replaces all the substring that fits the specified regular expression with the replacement string. The benefit of this method is that we can use regular expressions in it to replace any part of the string.

#### indexOf() method 

It is a method that returns the position of the first occurrence of specified characters in a string or return -1, if the character does not occur.

#### lastIndexOf() method 

It is a method returns the position of the last occurrence of the specified characters in a string or return -1, if the character does not exist.

#### charAt() method

It is a method that returns the character at the specified index. The index value should lie between 0 and length() - 1.

#### contains() method 

It is a method that searches the sequence of characters in the given string. It returns true if sequence of the char values are found in the string otherwise it returns false.

#### startswith() method 

It is a method that tests if a string starts with a specified prefix beginning from 1st index. If yes then it returns true else it returns false.

#### endswith() method 

It is a method that checks whether the string ends with a specified suffix. It yes, then the method will return true otherwise it will return false.

#### toUpperCase() method 

It is a method that converts all the characters of the string into uppercase letters.

#### toLowerCase() method

It is a method that converts all the characters of the string into lowercase letters.

#### valueOf() method 

It is a method that converts different types of values into string.