# Multithreading-HelloWorldprinter
Print Hello World! from separate thread other main thread. A concept of Multi-threading and Concurrency.

##Thread(s)<br>
Threads are like workers that help in executing and carrying out processes/tasks in the cores of CPUs.
The Java Virtual Machine allows an application to have multiple threads of execution running concurrently.

##Concurrency<br>
Concurrency is the ability of a single-core processor to context-switch between several processes 
(program in execution) and execute them. In actual sense, only one task is running at a unit time.


##Parallelism<br>
Parallelism is the ability of a multi-core processor to context-switch between processes in every core
(brain/unit of execution) and henceforth carry out multiple tasks simultaneously.

##What actually happens and what to do?<br>
In main() method,  main thread executes all instructions.
To print anything from a separate thread, we actually first have to focus on the task we want to do.
1. Create a separate class for the task.
2. Implement Runnable Interface.
3. Override/Implement its run() method that takes no param and returns nothing (void).
4. Then, create the object of the custom class inside main class's main() method.
5. Create the object of the Thread class same there and pass the custom class's object inside that of Thread's.
6. Finally, write thread.start(); to spawn a new thread and execute the task desired in that separate thread.

This is how we execute tasks from a separate/different thread!!!!

---------------------------------------------------------------------------------------------------------------