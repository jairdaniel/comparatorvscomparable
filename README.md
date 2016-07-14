# comparatorvscomparable
This small project implements Comparable and Comparator in order to find PROS and CONS in the use of each.

Comparable is an interface offered to every object inside the package java.lang. By implementing it, the classes will override the method compareto(), which will specify if the current object is lesser, greater, or equal than the given object. The purpose of this compare is to find an order to objects of this class inside Collections (e.g. using Collections.sort()), use the class as objects inside a Set (without implementing a Comparator), or even use it as a key inside a Map.

In the current project a class Reptile is created implementing Comparator (me.jairdaniel.comparable.Reptile) and this implementation compares (using String's natural comparison) the reptiles using names, and if equal species.
This implementation is tested inside me.jairdaniel.comparable.TestComparable, where a list is created with reptile objects created and then sorted. Also creating a Set colelction with those items.


