## Item01 Consider static factory methods instead of constructors
A class can provide its clients with static factory methods instead of, or in addition to, public constructors.
- advantage:
1. The name of a static factory method might be more descriptive of the object it creates than a constructor.
2. Static factory methods are not required to create a new object each time they’re invoked.They can use the
preconstructed instances, or to cache instances as they're constructed, and dispense them repeatedly to avoid creating 
unnecessary duplicate objects.
3. Static factory methods can return subtypes of the object they’re constructing.
4. The class of the returned object can vary from call to call as a function of the input parameters.
5. The class of the returned object need not exist when the class containing the method is written.
- disadvantage:
1. Class only has static factory methods but no public or protected constructors can not be subclassed.
2. Static factory methods are hard for programmers to find.
