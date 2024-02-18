## 2.6 applet
**Q: What has replaced Java applets now?** <br>
**A:** The main technologies that have replaced Java applets are:
- HTML5
- JavaScript
- Related web technologies
- JavaScript/HTML5 Canvas
- WebGL
- CSS3
- Web APIs
- Front-End Frameworks and Libraries

**Q: How does API relate to Java development?** <br>
**A:** APIs play a crucial role in Java development:
- **Java Standard Library:** Includes APIs provided by Java itself, such as those for working with data structures, file handling, and networking.
- **Third-party Libraries:** These libraries come with their own APIs, offering various functionalities that developers can use in their Java applications.
- **Web APIs:** Used for interacting with web services, databases, and other web resources, often in web development.
- **GUI APIs:** Used for creating graphical user interfaces (GUIs) in desktop application development.
- **Mobile APIs:** Allow the development of Android applications that interact with device features and services.
- **Cloud Service APIs:** Used for integrating with cloud platforms and services.
- **Enterprise APIs:** Provided by Java EE for building enterprise-level applications.

## 3.6.9 stringBuilder
**Q: Is 'append' in StringBuilder is more efficiency than 'concat' in String?** <br>
**A:** 
- Yes, The key reasons for this efficiency difference are:
  1. Reduced Object Creation: StringBuilder avoids creating unnecessary intermediate string objects.
 When you use concat, a new string is created each time you concatenate two strings together.
 This can lead to the creation of multiple intermediate string objects, which consumes memory and
 increases garbage collection overhead. StringBuilder, on the other hand, operates on a mutable buffer,
 reducing the need for frequent object creation.
  2. Better Performance in Loops: When you need to concatenate strings inside a loop, using StringBuilder
 is typically much more efficient than repeatedly using concat. In a loop, the performance gains of
 StringBuilder become more pronounced as the number of concatenations increases.

## 4.3 static
**Q: What is the difference between final and static final?** <br>
**A:** 
 1. final: When you declare a variable as final within a class, it becomes a constant for each instance (object) of 
    that class, and each instance will have its own copy of that constant with the same value. However, each object can 
    have a different value for its final constant.
 2. Better Performance in Loops: When you need to concatenate strings inside a loop, using StringBuilder
    is typically much more efficient than repeatedly using concat. In a loop, the performance gains of
    StringBuilder become more pronounced as the number of concatenations increases.

## 4.8 classpath
**Q: What is the use of "-classpath"** <br>
**A:**
1. Compile Java Source Code:
   ```
   javac -classpath path/to/dependency.jar MyJavaFile.java
   ```
2. Run Java Programs:
   ```
   java -classpath path/to/dependency.jar MyJavaClass
   ```
3. Create Executable JAR Files:
   ```
   jar -cvfe MyExecutable.jar MyMainClass -C path/to/classes/ .
   ```