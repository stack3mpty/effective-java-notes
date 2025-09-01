## Item04 Enforce noninstantiability with a private constructor
Occasionally you’ll want to write a class that is just a grouping of static methods and static fields. 
Such classes have acquired a bad reputation because some people abuse them to avoid thinking in terms of objects, 
but they do have valid uses. In such cases, you can use a private constructor to enforce noninstantiability.