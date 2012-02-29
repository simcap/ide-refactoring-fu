API compatibility

- preview for all refactorings (thanks to JDT)
- notify of all potential problems

- interactive mode / scripts mode
- scripts based on refactoring history
- scripts can be applied to any arbitrary workspace

- four types of errors
INFORMATION (fine)
WARNINGS (fine)
ERRORS (compilation or semantic, you can choose to continue)
STOP PROBLEMS (stopped)

- menu Java > Preferences

* RENAME
** deprecation of a method

* MOVE
** Needs a target
** Drag & drop
** Package (Create package wizard)

* Change Method Signature
** Exceptions

* EXTRACT METHOD, VARIABLE & CONSTANTS
**

* INLINE
** remove methods by emptying the method and inlining

* Convert local variable to field
** Initialization in newly created constructor

* Convert anonymous class to nested class
** Cursor inside anonymous class

* Extract class
** New container from parameters

* Introduce parameter object
** Cursor on / in method
