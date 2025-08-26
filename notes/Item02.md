## Item02 Consider a builder when faced with many constructor parameters
If there is a class with many constructor parameters, you want to create some instances of that class, 
but you don't want to specify all the parameters each time. You must do not want to create different constructors 
for each combination of parameters.

JavaBeans pattern is easy, but it has some problems.
1. Construction is split across multiple calls.
2. A JavaBean can be in an inconsistent state during construction.
3. The class does not hava the option of enforcing consistency merely by checking the validity of the constructor parameters.
4. Attempting to use an object when it is in an inconsistent state can lead to exceptions at runtime.
5. It precludes the possibility of making a class immutable and requires added effort on the part of the programmer to 
ensure thread safety.

Builder pattern solves these problems.
Instead of making the desired object directly, the client calls a constructor(or static factory) with all the required
parameters and gets a builder object. Then the client calls setter-like methods on the builder object to set each optional 
parameter. Finally, the client calls a parameterless build method to create the desired object.
