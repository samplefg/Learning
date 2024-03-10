## When we complile and run java source code the execution take place in following form.


Consider Example.java as the source code 

* Javac Example.java:
Javac command is used to complile the java source code

* Java Example: 
This command is used to run source code class file

* Start JVM 

* Create an start main thread

* Locate Example.class file:
Main thread is responsible for checking if example.class is available or not, if example.class file is not available a complile time error saying "exception in thread main no class example found"

* Load Example.class:
Static variables are created

* Execute main()

* Unload main():
If execution completed and static variable are destroy

* Terminate main thread

* Shutdown JVM




