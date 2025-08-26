### Item03 Enforce the singleton property with a private constructor or an enum type
The main advantage of the public field approach is that the API makes it clear that the class is a singleton: 
the public static field is final, so it will always contain the same object reference. 
The second advantage is that it’s simpler.

One advantage of the static factory approach is that 
it gives you the flexibility to change your mind about whether the class is a singleton without changing its API. 
The factory method returns the sole instance, but it could be modified to return, say, a separate instance foreach thread that invokes it. 
A second advantage is that you can write a generic singleton factory if your application requires it(Item 30). 
A final advantage of using a static factory is that a method reference can be used as a supplier, for example Elvis::instance is a Supplier<Elvis>. 
Unless one of these advantages is relevant, the public field approach is preferable.