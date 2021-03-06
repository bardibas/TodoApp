
### **Screenshots of the output**
1![1](https://user-images.githubusercontent.com/33457981/84870882-912aa080-b09f-11ea-99d1-f2916360d8bb.png)
![2](https://user-images.githubusercontent.com/33457981/84871589-71e04300-b0a0-11ea-8db0-4ef3f2903cd8.png)
It is the todo app with MVVM architecture where room data is used for the EDIT, UPDATE and DELETE PURPOSE
**Documentation (Model–view–viewmodel architecture in a nutshell)**

**Model–view–viewmodel (MVVM)** is a software architectural pattern that facilitates the separation of the development of the graphical user interface (the view) be it via a markup language or GUI code from the development of the business logic or back-end logic (the model) so that the view is not dependent on any specific model platform. The view model of MVVM is a value converter,meaning the view model is responsible for exposing (converting) the data objects from the model in such a way that objects are easily managed and presented. In this respect, the view model is more model than view, and handles most if not all of the view's display logic.The view model may implement a mediator pattern, organizing access to the back-end logic around the set of use cases supported by the view.

![image](https://user-images.githubusercontent.com/33457981/84872935-3777a580-b0a2-11ea-9e3e-1c697c737ef5.png)

**Key Features of application**

- ADD
- UPDATE
- DELETE
**Installation guideline**

- set up android studio (https://developer.android.com/studio)

- https://github.com/bardibas/TodoApp.git
### **
**Steps to follow**
my application
  -mvvm_model
    -Todo.java
     -TodoDao.java
      -TodoDatabase.java
       -DatConversion.java
       -TodoRespository.java
       -TodoViewModel.Java
      **-tasks**
       -TodoAdapter.java
        -AddEditTodoActivity.java
         -MainActivity.java

- [ ] Guideline Using the application

# Plugins and Dependencies
| Dependencies | Implements |
| --- | --- |
| Card View |  implementation "androidx.cardview:cardview:1.0.0" |
| View Model | implementation "androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version"|
|Live Data |  implementation "androidx.lifecycle:lifecycle-livedata:$lifecycle_version" |
|Annonation Processor |  annotationProcessor "androidx.lifecycle:lifecycle-compiler:$lifecycle_version" |
| Room | Database | implementation "androidx.room:room-runtime:$room_version" |
| Life Cycle |  implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0' 
**
Add Todo: Click on the floating button and add list

Add Todo Item: Fill the required fields and click on save

Edit Todo: Click on the Todo Item and edit the field then save

Delete List: Swipe either left or right to delete 1 item and click on delete all to delete all items












