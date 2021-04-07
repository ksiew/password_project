# Password_project
A group of websites with password-protection.

# Purpose
The goal of this project was to create a set of password-protected websites in such a way that adding new ones 
would be easy.

Superclasses and interfaces make
adding new websites easy, as only the custom functions of the websites
have to be added, and the login system can be inherited using polymorphism from
the Website and Account classes.

# Learning Objectives
With an efficient interface, work can be cut down as similar classes do not have to
be written individually.

By completing this project, I have improved my skills in planning out
superclasses and interfaces, learning how to plan out my classes before
working to minimize repetitive code.

# Changelog
**V 0.1:** Project is functional and contains two websites

**V 0.15:** 
Changed Web, now instead of having to manually add each new Website as a static object and as a FrontPage case, now new websites can be added just by adding them to the list in the web constructor.

**V 0.2:**
Updated addAccount method to be in superclass Website to streamline the process of adding a new website. Instead of having to create a custom addAccount method in each new Website, only a createAccount method must be made to define any extra steps in the account adding process.

Also added basic encryption for passwords

# Plans
* add documentation
* Group up user prompting methods

