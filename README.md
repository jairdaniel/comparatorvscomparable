# comparatorvscomparable
This small project implements Comparable and Comparator in order to find PROS and CONS in the use of each.

Comparable is an interface offered to every object inside the package java.lang. By implementing it, the classes will override the method compareTo(), which will specify if the current object is lesser, greater, or equal than the given object. The purpose of this compare action is to find an order to objects of this class inside Collections (e.g. using Collections.sort()), use the class as objects inside a Set in order to find uniqueness (in some implementations, such as TreeSet), or even use it as a key inside a Map.

In the current project a class Reptile is created implementing Comparator (me.jairdaniel.comparable.Reptile) and this implementation compares (using String's natural comparison) the reptiles using names and species.
This implementation is tested inside me.jairdaniel.comparable.TestComparable, where a list is created with reptile objects created and then sorted. Also creating a Set colelction with those items.

Comparator interface is an interface, which not necessarily has to be implemented in the "sortable" class, that defines the same goal as Comparable's compareTo: compare 2 objects and define which one is greater than which for sorting purposes. A nice way to implement the compare() is using a Java lambda, as shown inside me.jairdaniel.comparator.TestComparator.

Comparator vs Comparable: Since the algorithms inside both compare methods could be the same, the decision of using one against the other will depend on each case's design. If the purpose is to create a natural and standard way to compare class objects and order them in collections, then Comparable is a better option. If, after having a natural order compare, you want to specify another compare criteria, then use a Comparator, where lambdas are an elegant option for it, however an inner class method implementation is always an alternative.
