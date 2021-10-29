›Alex Sobiek<br>
COMP 271 Fall 2021 Midterm

## Inheritance
Working backwards in order of the smallest body of Government to largest:

```java
public class Town extends County { ... }

public class County extends State { ... }

public class State extends Province { ... }

public class Province extends Country { ... }
```
*See Inheritance.java*
## Enums

### Country Class
`typeOfGovernment` and `currency` can be converted to make use of an enum object.
```java
public enum Government { DEMOCRACY, MONARCHY, COMMUNISM }

public enum Currency { USD, EUR, GBP, CAD }
```
```java
public class Country {
    private Government typeOfGovernment;
    private Currency currency;
    ...
    /**
     * Example constructor just to initialize typeOfGovernment
     * and currency
     */
    public Country() {
        typeOfGovernment = Government.DEMOCRACY;
        currency = Currency.USD;
    }
}
```
### State class
`stateBird` can be converted to make use of an enum object. 
```java
public enum StateBird { NORTHERN_CARDINAL, AMERICAN_ROBIN, MOCKINGBIRD }

public class State {
    private StateBird stateBird;
    ...
    /**
     * Example constructor just to initialize stateBird
     */
    public State() {
        stateBird = StateBird.MOCKINGBIRD;
    }
}
```
### <br><br><br></br><br><br><br></br>
### Town Class
`typeOfRule` can be converted to make use of an enum object.<br>
*Note: If Dillon's Rule is applied to the town, it is inherited from the state.*<br>
*The same rules would apply to that town as Home Rule would.*
```java
public enum TypeOfRule { HOME_RULE, DILLONS_RULE, NONE }

public class Town {
    private TypeOfRule typeOfRule;
    ...
    /**
     * Example constructor just to initialize typeOfRule
     */
    public Town() {
       typeOfRule = TypeOfRule.HOME_RULE;
    }
}

```
 
## Implement an Interface
```java
public class Node implements Comparable<Node> {
    ...
    /**
     * Compares the provided Node to this Node
     * @param node Node to compare to
     * @return int
     */
    @Override
    public int compareTo(Node node) {
        // aEven/bEven checks if the content's length is even
        boolean aEven = this.content.length() % 2 == 0;
        boolean bEven = node.content.length() % 2 == 0;
        int output = 0;
        if (aEven && !bEven) output = 1;        // even, odd
        else if (!aEven && bEven) output = -1;  // odd, even
        return output; // Output remains 0 if aEven == bEven
    }
}
```

## Write a `toString()`
*Sorry about the formatting on this one, I had to make it fit
within the PDF render area*
```java
public class Node {
    ...
    /**
     * Returns a String containing information about the Node
     * @return String
     */
    public String toString() {
        int children = 0;
        if (left != null) children++;
        if (right != null) children++;

        /**
         * Double ternary operator
         * If children is 0, childrenString = no children
         * If children is 1, childrenString = 1 child
         * else, childrenString = n children
         */
        String childrenString =
                children == 0 ? "no children" :
                        children == 1 ? "1 child" :
                                String.format("%d children", children);
        return String.format("This node contains \"%s\" and has %s.", 
                content, childrenString);
    }
}
```

## Conclusion
I've written a few tests into `Evaluate.java` (for TreesAndNodes) and 
`Inheritance.java` for the Inheritance and Enums sections. 

