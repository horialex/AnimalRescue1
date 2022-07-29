# AnimalRescue1 - Evozon internship project

*Classes* - A blueprint for an object

*Object* - An instance of a class

*Encapsulation* - Identify the aspects of your applications that vary and separate them from what stays the same. 
If a component or module in your application is bound to change frequently, then it’s a good practice to separate this
part of code from the stable ones so that later we can extend or alter the part that varies without affecting 
those that don’t vary
 - more info can be found here: https://bootcamp.uxdesign.cc/software-design-principles-every-developers-should-know-23d24735518e
So encapsulation is not  only about having private fields and getters and setters but also about isolating complexity,
   so we can deal with it separately and not affect larger parts of the application if that changes
   
*Favour composition over inheritance* - Object oriented programming provides 2 types of relationships between classes 
and its instances. has-a (composition) and is-a (inheritance). This design principle essentially suggests us
that “has-a relationship should be preferred over is-a relationship”
Overuse of inheritance makes the code more rigid
It is easier and more feasible to compose object based on other objects than to hard-wire their 
connections using inheritance. If use use inheritance we will create tight coupled relations between objects