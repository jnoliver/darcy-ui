**darcy** is...
=========

* A framework for writing **page objects** in order to automate interaction with graphical user interfaces. Page objects are classes that model what a user can see and do. In Darcy each page, or subset of a page, is called a **View**.
* Automation library agnostic -- any library that can find UI elements and interact with them can work with Darcy. [Selenium WebDriver](https://code.google.com/p/selenium/) support is provided by [darcy-webdriver](https://github.com/rh-darcy/darcy-webdriver).
* Flexible and extendable by virtue of a declarative, **element-based DSL**. Write your page objects in terms of the UI buttons, labels, and widgets that you see. 
* Dependent on Java 8. [Get your lambda on](http://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)!

**darcy** is not...
=========

* Web-specific by default. Extend the DSL to add web browser interaction with [darcy-web](https://github.com/rh-darcy/darcy-web). Darcy-webdriver is an implementation of this API with a WebDriver backend. Your web automation projects can simply include darcy-webdriver and get going.
* An automatic solution to every problem. It's still on you to architect your automation code maintainably. Darcy will help by solving a whole host of nasty UI-automation related challenges out of the box, so you can concentrate on the deeper and more interesting complexities specific to your automation project.

darcy's best friend: **synq**
====

[Synq](https://github.com/rh-darcy/synq) is a sister project to Darcy. Synq helps Darcy and your automation code sync up with external asynchronous processes (such as dynamic content on a web page). For folks coming from WebDriver, Synq gets you what WebDriverWait and ExpectedConditions get you, but with more flexibility (wait for multiple conditions, throw errors if other conditions are met in the meantime ... stuff like that). [Read more here][1] to understand what warranted a separate library for this task.

contributing
============

There is a whole lot to do... Like write this section about contributing!

license
=======

**darcy** is licensed under [version 3 of the GPL][2].


  [1]: https://github.com/rh-darcy/synq
  [2]: https://www.gnu.org/copyleft/gpl.html