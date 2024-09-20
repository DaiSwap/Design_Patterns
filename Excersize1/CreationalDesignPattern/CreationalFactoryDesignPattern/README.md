Factory design pattern is used in comples situations, what kind?
lets say if large number of objects needs to be created and need to specify each time , the type of object needs to be created.
Hence this design pattern provides the interface for creating objects aloowing the subclasses to alter type of objects that will be created.

I took of an example where initially, my application supports only truck transportation. As my application evolved, I needed to add support for sea transportation (ships) and later on other types of transportation in the future. The Factory Design Pattern helps manage this by centralizing object creation in factories.

The UML diagram explaining this scenario and my approach -
![UML Diagram](Excersize1/CreationalDesignPattern/CreationalFactoryDesignPattern/Excersize1/CreationalDesignPattern/CreationalFactoryDesignPattern/UML.drawio.png)

Output is as - 

![Output](Excersize1/CreationalDesignPattern/CreationalFactoryDesignPattern/Output.png)
