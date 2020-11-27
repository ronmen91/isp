# Interface Segregation Principle

**According to Robert Martin:** \
The interface-segregation principle (ISP) states that no client should be forced to depend on methods it does not use.

**or practically:** \
ISP splits interfaces that are very large into smaller and more specific ones so that clients will only have to know about the methods that are of interest to them. Such shrunken interfaces are also called role interfaces.

## How can we violate the rule?
1. Our abstraction logic is wrong at the beginning → Finding correct abstractions is more of an art. You should explore your domain, probably build some semantic nets, come up with a set of user stories, draw interaction diagrams  -  and all of that doesn’t necessarily lead you to correct abstractions so you need to practice. 
2. We extend our existing interface with additional methods (e.g.: a new requirement came and we wanted to implement it quickly) and we broke our existing abstraction logic by adding methods which are not needed for other existing clients and will be only dummy methods for them.

## The key message
Your abstractions should be correct, thus the classes implementing them end up being small, and cohesive, and solid.
