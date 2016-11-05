**_Singleton pattern_**
Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes
under creational pattern as this pattern provides one of the best way to create an object.

This pattern involves a single class which is responsible to creates own object while making sure
that only single object get created. This class provides a way to access its only object which can be
accessed directly without need to instantiate the object of the class.

**Implementation**
We're going to create a TheLonelyMan class. TheLonelyMan class have its constructor as private and
have a static instance of itself.

TheLonelyMan class provides a static method to get its static instance to outside world.
Main, our demo class will use TheLonelyMan class to get a TheLonelyMan object

-----------------------------------------------------------------------------------------------------


Ce motif de conception propose de n'avoir qu'une seule et unique instance d'une classe dans une application.

Le Singleton est fréquemment utilisé dans les applications car il n'est pas rare de ne vouloir qu'une seule instance pour
certaines fonctionnalités (pool, cache, ...). Ce modèle est aussi particulièrement utile pour le développement d'objets de
type gestionnaire. En effet ce type d'objet doit être unique car il gère d'autres objets par exemple un gestionnaire de logs.

La mise en oeuvre du design pattern Singleton doit :

    • assurer qu'il n'existe qu'une seule instance de la classe
    • fournir un moyen d'obtenir cette instance unique

Un singleton peut maintenir un état (stateful) ou non (stateless).

La compréhension de ce motif de conception est facile mais son implémentation ne l'est pas toujours, notamment, à cause
de quelques subtilités de Java et d'une attention particulière à apporter dans le cas d'une utilisation multithreads.

Ce design pattern peut avoir plusieurs implémentations en Java.
    1) une implémentation classique avec initialisation tardive
    
    • le ou les contructeurs ont un attribut de visibilité private pour empêcher toute instanciation de l'extérieur de la
      classe : ne pas oublier de redéfinir le constructeur par défaut si aucun constructeur n'est explicitement défini
    • l'unique instance est une variable de classe
    • un getter static permet de renvoyer l'instance et de la créer au besoin
    • redefinir la méthode clone pour empêcher son utilisation
    • la classe est déclarée final pour empêcher la création d'une classe fille