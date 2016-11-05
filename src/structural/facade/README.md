**_Façade (Facade)_**

Une bonne pratique de conception est d'essayer de limiter le couplage existant entre des fonctionnalités proposées par
différentes entités. Dans la pratique, il est préférable de développer un petit nombre de classes et de proposer une classe
pour les utiliser. C'est ce que propose le motif de conception façade.

Le but est de proposer une interface facilitant la mise en oeuvre d'un ensemble de classes généralement regroupées dans
un ou plusieurs sous-systèmes. Le motif Façade permet d'offrir un niveau d'abstraction entre l'ensemble de classes et
celles qui souhaitent les utiliser en proposant une interface de plus haut niveau pour utiliser les classes du sous-système.

Exemple : un client qui utilise des classes d'un sous-système directement
[See the Docs here :](https://www.jmdoudoux.fr/java/dej/chap-design-patterns.htm)
 
-----------------------------------------------------------

Facade pattern hides the complexities of the system and provides an interface to the client using
which the client can access the system. This type of design pattern comes under structural pattern
as this pattern adds an interface to exiting system to hide its complexities.

This pattern involves a single class which provides simplified methods which are required by client
and delegates calls to existing system classes methods.
