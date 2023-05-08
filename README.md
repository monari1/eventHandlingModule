# eventHandlingModule

In Jav/aFX, we can develop GUI applications, web applications and graphical applications. In such applications, whenever a user interacts with the application (nodes), an event is said to have been occurred.

For example, clicking on a button, moving the mouse, entering a character through keyboard, selecting an item from list, scrolling the page are the activities that causes an event to happen.

Types of Events
The events can be broadly classified into the following two categories −

Foreground Events − Those events which require the direct interaction of a user. They are generated as consequences of a person interacting with the graphical components in a Graphical User Interface. For example, clicking on a button, moving the mouse, entering a character through keyboard, selecting an item from list, scrolling the page, etc.

Background Events − Those events that don't require the interaction of end-user are known as background events. The operating system interruptions, hardware or software failure, timer expiry, operation completion are the example of background events.

Events in JavaFX
JavaFX provides support to handle a wide varieties of events. The class named Event of the package javafx.event is the base class for an event.

An instance of any of its subclass is an event. JavaFX provides a wide variety of events. Some of them are are listed below.

Mouse Event − This is an input event that occurs when a mouse is clicked. It is represented by the class named MouseEvent. It includes actions like mouse clicked, mouse pressed, mouse released, mouse moved, mouse entered target, mouse exited target, etc.

Key Event − This is an input event that indicates the key stroke occurred on a node. It is represented by the class named KeyEvent. This event includes actions like key pressed, key released and key typed.

Drag Event − This is an input event which occurs when the mouse is dragged. It is represented by the class named DragEvent. It includes actions like drag entered, drag dropped, drag entered target, drag exited target, drag over, etc.

Window Event − This is an event related to window showing/hiding actions. It is represented by the class named WindowEvent. It includes actions like window hiding, window shown, window hidden, window showing, etc.

Event Handling
Event Handling is the mechanism that controls the event and decides what should happen, if an event occurs. This mechanism has the code which is known as an event handler that is executed when an event occurs.

JavaFX provides handlers and filters to handle events. In JavaFX every event has −

Target − The node on which an event occurred. A target can be a window, scene, and a node.

Source − The source from which the event is generated will be the source of the event. In the above scenario, mouse is the source of the event.

Type − Type of the occurred event; in case of mouse event – mouse pressed, mouse released are the type of events.
