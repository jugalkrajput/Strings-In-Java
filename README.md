Java Strings & String Methods
==============================

1. What is a String?
   ==================
A String is a sequence of characters used to store text in Java.

In Java, String is a class and Strings are immutable, meaning once a String object is created, its value cannot be changed.

String name = "Java";

2. Creating Strings
   =================
Using String Literal
String str = "Hello";


Java stores String literals in the String Pool.

Using new Keyword
String str = new String("Hello");


This explicitly creates a new String object.

3. String Immutability
   =====================
Strings cannot be modified after creation.

String s = "Hello";

s.concat(" World");

System.out.println(s);


Output:

Hello


concat() creates a new String instead of modifying the existing one.

s = s.concat(" World");

System.out.println(s);


Output:

Hello World

4. Important String Methods
   =========================
length()
--------
Returns the number of characters in a String.

String s = "Hello";

System.out.println(s.length());


Output:

5

charAt()
--------
Returns the character at a specified index.

String s = "Hello";

System.out.println(s.charAt(1));


Output:

e


Index starts from 0.

substring()
------------
Extracts part of a String.

substring(beginIndex)
String s = "Hello World";

System.out.println(s.substring(6));


Output:

World

substring(beginIndex, endIndex)
--------------------------------
System.out.println(s.substring(0, 5));


Output:

Hello


endIndex is exclusive.

equals()
---------
Compares two Strings based on their content.

String a = "Java";
String b = "Java";

System.out.println(a.equals(b));


Output:

true

equalsIgnoreCase()
-------------------
Compares Strings without considering uppercase/lowercase.

String a = "Java";
String b = "JAVA";

System.out.println(a.equalsIgnoreCase(b));


Output:

true

== vs equals()
---------------
== compares references

equals() compares String contents

String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);       // false
System.out.println(a.equals(b));  // true


For comparing String values, generally use equals().

compareTo()
-----------
Compares two Strings lexicographically.

String a = "Apple";
String b = "Banana";

System.out.println(a.compareTo(b));


Possible results:

0 → Strings are equal

< 0 → first String comes before second

> 0 → first String comes after second

compareToIgnoreCase()
----------------------
Performs the comparison without considering case.

"java".compareToIgnoreCase("JAVA");


Returns:

0

concat()
----------
Joins two Strings.

String a = "Hello";
String b = " World";

String result = a.concat(b);

System.out.println(result);


Output:

Hello World


The + operator can also concatenate Strings:

String result = a + b;

contains()
----------
Checks whether a String contains a specific sequence.

String s = "Hello Java";

System.out.println(s.contains("Java"));


Output:

true

startsWith()
-------------
Checks whether a String starts with a particular value.

String s = "Hello Java";

System.out.println(s.startsWith("Hello"));


Output:

true

endsWith()
-----------
Checks whether a String ends with a particular value.

String s = "Hello Java";

System.out.println(s.endsWith("Java"));


Output:

true

indexOf()
----------
Returns the index of the first occurrence.

String s = "Hello Java";

System.out.println(s.indexOf("Java"));


Output:

6


If the value is not found:

System.out.println(s.indexOf("Python"));


Output:

-1

lastIndexOf()
--------------
Returns the index of the last occurrence.

String s = "Java Java";

System.out.println(s.lastIndexOf("Java"));

toUpperCase()
--------------
Converts the String to uppercase.

String s = "hello";

System.out.println(s.toUpperCase());


Output:

HELLO

toLowerCase()
-------------
Converts the String to lowercase.

String s = "HELLO";

System.out.println(s.toLowerCase());


Output:

hello

trim()
-------
Removes leading and trailing whitespace.

String s = "   Hello   ";

System.out.println(s.trim());


Output:

Hello


trim() does not remove spaces between words.

strip()
-------
Removes leading and trailing whitespace and provides better Unicode whitespace handling than trim().

String s = "   Hello   ";

System.out.println(s.strip());

replace()
---------
Replaces characters or literal sequences.

String s = "Java is easy";

System.out.println(s.replace("easy", "powerful"));


Output:

Java is powerful

replaceFirst()
---------------
Replaces only the first matching occurrence.

String s = "Java Java";

System.out.println(s.replaceFirst("Java", "Python"));


Output:

Python Java

replaceAll()
-------------
Replaces all matches using a regular expression.

String s = "Java123";

System.out.println(s.replaceAll("[0-9]", ""));


Output:

Java

split()
---------
Splits a String into an array.

String s = "Java,Python,C++";

String[] languages = s.split(",");

for (String language : languages) {
    System.out.println(language);
}


Output:

Java
Python
C++

isEmpty()
----------
Checks whether the String has length 0.

String s = "";

System.out.println(s.isEmpty());


Output:

true

isBlank()
---------
Checks whether a String is empty or contains only whitespace.

String s = "   ";

System.out.println(s.isBlank());


Output:

true


isBlank() was introduced in Java 11.

valueOf()
---------
Converts different data types into a String.

int num = 100;

String s = String.valueOf(num);

System.out.println(s);


Output:

100

toCharArray()
-------------
Converts a String into a character array.

String s = "Java";

char[] chars = s.toCharArray();

for (char c : chars) {
    System.out.println(c);
}

getBytes()
-----------
Converts a String into a byte array.

String s = "Java";

byte[] bytes = s.getBytes();


Useful when working with byte-based data such as files or network communication.

intern()
---------
Returns the canonical representation of a String from the String Pool.

String s1 = new String("Java");
String s2 = s1.intern();

String s3 = "Java";

System.out.println(s2 == s3);


Output:

true

5. String Pool
   ============
Java maintains a special area called the String Pool for String literals.

String a = "Java";
String b = "Java";

System.out.println(a == b);


Output:

true


Both variables can refer to the same pooled String object.

But:

String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);


Output:

false


Because two different objects are created.

6. String Concatenation
   ======================

Using +
--------
String firstName = "John";
String lastName = "Doe";

String fullName = firstName + " " + lastName;

Using concat()
---------------
String fullName = firstName.concat(" ").concat(lastName);


For repeated modifications, prefer StringBuilder instead of repeatedly concatenating Strings.

7. String vs StringBuilder vs StringBuffer
   ========================================

Feature				|	String		|	StringBuilder		|	StringBuffer
--------------------------------|-----------------------|-------------------------------|--------------------------------------
Mutable				|	❌ No		|	✅ Yes			|	✅ Yes
Thread-safe			|	Immutable	|	❌ No			|	✅ Yes
Performance for modifications	|	Lower		|	High			|	Lower than StringBuilder
Common use			|	Fixed text	|	Frequent modifications	|	Thread-safe modifications


Example:

StringBuilder sb = new StringBuilder("Hello");

sb.append(" Java");
sb.append("!");

System.out.println(sb);


Output:

Hello Java!

8. Important Methods — Quick Revision
   ===================================

Method		|	Purpose
----------------|-------------------------------------
length()	|	Returns String length
charAt()	|	Returns character at index
substring()	|	Extracts part of String
equals()	|	Compares content
equalsIgnoreCase()|	Compares ignoring case
compareTo()	|	Lexicographical comparison
concat()	|	Joins Strings
contains()	|	Checks if sequence exists
startsWith()	|	Checks starting sequence
endsWith()	|	Checks ending sequence
indexOf()	|	Finds first occurrence
lastIndexOf()	|	Finds last occurrence
toUpperCase()	|	Converts to uppercase
toLowerCase()	|	Converts to lowercase
trim()		|	Removes leading/trailing basic whitespace
strip()		|	Removes leading/trailing whitespace
replace()	|	Replaces literal characters/sequences
replaceFirst()	|	Replaces first regex match
replaceAll()	|	Replaces all regex matches
split()		|	Splits String into array
isEmpty()	|	Checks if length is 0
isBlank()	|	Checks if empty/whitespace
valueOf()	|	Converts value to String
toCharArray()	|	Converts String to char[]
getBytes()	|	Converts String to byte[]
intern()	|	Returns pooled String


9. Common Interview Points
   ========================
1. Why are Strings immutable?
-------------------------------

Immutability provides benefits such as:

String Pool optimization

Security

Thread safety

Stable hash codes

Safe use as keys in collections such as HashMap

2. == vs equals()
--------------------
==          // compares references
equals()    // compares content

3. String is immutable
-----------------------
String s = "Hello";

s.concat(" World");

System.out.println(s); // Hello


To keep the result:

s = s.concat(" World");

4. StringBuilder is mutable
-----------------------------
StringBuilder sb = new StringBuilder("Hello");

sb.append(" World");

System.out.println(sb);


Output:

Hello World

10. One-Line Cheat Sheet
    =====================

Method		|	Do/Purpose
----------------|-------------------------------
length()        |  → String length
charAt()        |  → character at index
substring()     |  → extract part
equals()        |  → compare content
compareTo()     |  → lexicographical comparison
concat()        |  → join Strings
contains()      |  → check sequence
indexOf()       |  → first occurrence
lastIndexOf()   |  → last occurrence
toUpperCase()   |  → uppercase
toLowerCase()   |  → lowercase
trim()          |  → remove outer basic whitespace
strip()         |  → remove outer whitespace
replace()       |  → replace literal text
replaceFirst()  |  → replace first regex match
replaceAll()    |  → replace all regex matches
split()         |  → String → String[]
isEmpty()       |  → check length == 0
isBlank()       |  → check empty/whitespace
valueOf()       |  → value → String
toCharArray()   |  → String → char[]
getBytes()      |  → String → byte[]
intern()        |  → String Pool representation
