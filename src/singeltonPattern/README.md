**_Singleton pattern_**
Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes
under creational pattern as this pattern provides one of the best way to create an object.

This pattern involves a single class which is responsible to creates own object while making sure
that only single object get created. This class provides a way to access its only object which can be
accessed directly without need to instantiate the object of the class.

**Implementation**
We're going to create a TheLonelyMan class. TheLonelyMan class have its constructor as private and
have a static instance of itself.

TheLonelyMan class provides a static method to get its static instance to outside world.
Main, our demo class will use TheLonelyMan class to get a TheLonelyMan object