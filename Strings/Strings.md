<h3>Strings</h3>

- Strings are the type of objects that can be used to store character value and in java, each character is stored in 16 bits.
- Strings are immutable which means a constant and it cannot be changed once it has been created.
  
<h3>Ways of Creating a String</h3>

- String Literal
- Using new keyword

<h3>String Constant Pool</h3>

String Constant Pool is a place in heap memory where all the strings defined in the program are stored. 

One thing that is to be kept in mind is that the objects present in string constant pool are not applicable for Garbage collection because a reference variable internally is maintained by the JVM.

<h3>Why Strings are Immutable ?</h3>

Strings are immutable, meaning once created, their values cannot be changed.

- Thread Safety: Since strings cannot be modified, they are inherently thread-safe. Multiple threads can access and share string objects without the risk of concurrent modification issues.

- Performance: Immutable strings allow certain optimizations, such as string interning, which reduces memory usage and improves performance by reusing existing string instances rather than creating new ones.

- Security: Immutable strings enhance security by preventing unintended changes to sensitive data, such as passwords or cryptographic keys.

- Simplicity: Immutable objects simplify programming by eliminating the need to manage changes to string values manually. This can lead to clearer and more maintainable code

### Why to use char[] array over a string for storing passwords ? 

1. Strings are immutable - Strings are immutable in Java and therefore if a password is stored as plain text it will be available in memory until Garbage collector clears it and as Strings are used in the String pool for re-usability there are high chances that it will remain in memory for long duration, which is a security threat. Strings are immutable and there is no way that the content of Strings can be changed because any change will produce new String.
   Within an array, the data can be wiped explicitly after its work is completed. The array can be overwritten and the password won’t be present anywhere in the system, even before garbage collection.

2. Security - Any one who has access to memory dump can find the password in clear text and that’s another reason to use encrypted password than plain text.  So Storing password in character array clearly mitigates security risk of stealing password.

3. Log file safety - With an array, one can explicitly wipe the data , overwrite the array and the password won’t be present anywhere in the system.
   With plain String, there are much higher chances of accidentally printing the password to logs, monitors or some other insecure place. char[] is less vulnerable.