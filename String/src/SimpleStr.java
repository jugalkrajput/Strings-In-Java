import java.util.Arrays;

public class SimpleStr {
    static void main(String[] args) {
        String str = "JugalKishorRajput";

        String a = "hello";
        String b = "hello";
        String c = "Hello";

//      Simple Basic Method
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(5));

//      Convert String to Character Array=> toCharArray() Method
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

//      substring() Method
        String result = str.substring(5);
        String result1 = str.substring(0, 5);
        System.out.println(result);
        System.out.println(result1);

//      equals() method
        System.out.println(a.equals(b));                            // == compares references.

//      equalsIgnoreCase() Method
        System.out.println(b.equalsIgnoreCase(c));

//      == Method
        String d = new String("hello");
        String e = new String("hello");
        System.out.println(d == e);                                 // equals() compares String content.

//      contains() Method
        String str2 = "Hello World";
        System.out.println(str2.contains("World"));

//      endsWith()
        System.out.println(str.endsWith("Rajput"));

//      indexOf() Method
        System.out.println(str.indexOf('a'));
//      For String:
        System.out.println(str.indexOf("Ra"));
//      lastIndexOf()
        System.out.println(str.lastIndexOf('a'));

//      toLowerCase()
        System.out.println(str.toLowerCase());

//      toUpperCase()
        System.out.println(str.toUpperCase());

//      trim()
//      Removes leading and trailing whitespace.
//      Important: it doesn't remove spaces between words.
        String str3 = "   Hello   ";
        String str4 = "Hello         World";
        System.out.println(str3.trim());
        System.out.println(str4.trim());

//      replace()
        String str5 = "banana";
        System.out.println(str5.replace('a', 'x'));

//      replaceAll()
//      This uses regular expressions. \d means a digit in regex.
        String str6 = "hello123world456";
        String result2 = str6.replaceAll("\\d", "");
        System.out.println(result2);

//      split()
//      Extremely useful.
        String str7 = "Java is very powerful";
        String[] words = str7.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

//      You can split by comma:
        String str8 = "Apple,Banana,Mango";
        String[] fruits = str8.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

//        isEmpty()
        String str9 = "";
        System.out.println(str9.isEmpty());


//      isBlank()
//      Modern Java provides:
        String str10 = "   ";
        System.out.println(str10.isBlank());

//      concat()
        String f = "Hello";
        String g = "World";
        String result5 = f.concat(g);
        System.out.println(result5);

//        join()
//        Useful for joining multiple strings.
        String result6 = String.join("-", "2026", "09", "17");
        System.out.println(result6);

//        valueOf()
//        Converts values into Strings.
        int num = 100;
        String str11 = String.valueOf(num);
        System.out.println(str11);

//        String → Integer Conversion
//        Integer.parseInt()
        String str12 = "123";
        int num1 = Integer.parseInt(str12);
        System.out.println(num1 + 10);


//        StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb);
//        append()
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World");
        System.out.println(sb1);
//        insert()
        StringBuilder sb2 = new StringBuilder("Helo");
        sb2.insert(2, "l");
        System.out.println(sb2);
//        delete()
        StringBuilder sb3 = new StringBuilder("Hello World");
        sb3.delete(5, 11);
        System.out.println(sb3);
//        reverse()
        StringBuilder sb4 = new StringBuilder("Hello");
        sb4.reverse();
        System.out.println(sb4);

//        concat()
        String s = "Hello";
        s.concat(" World");
        System.out.println(s);          //concat() returns a new String.
        s = s.concat(" World");
        System.out.println(s);

//      Count Characters
        String str13 = "banana";
        int count = 0;
        for (int i = 0; i < str13.length(); i++) {
            if (str13.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);

//        Character Frequency
//        This is a very important DSA pattern.
        String str14 = "banana";
        int[] freq = new int[26];
        for (int i = 0; i < str14.length(); i++) {
            char ch = str14.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + " = " + freq[i]);
            }
        }

        
    }
}
