**_Décorateur (Decorator)_**

[See the Docs here :](https://www.jmdoudoux.fr/java/dej/chap-design-patterns.htm) 

Le motif de conception décorateur (decorator en anglais) permet d'ajouter des fonctionnalités à un objet en mettant en
oeuvre une solution plus souple que l'héritage : il permet d'ajouter des fonctionnalités à une ou plusieurs méthodes
existantes d'une classe dynamiquement.

La programmation orientée objet propose l'héritage pour ajouter des fonctionnalités à une classe, cependant l'héritage
présente quelques contraintes et il n'est pas toujours possible de le mettre en oeuvre (par exemple si la classe est finale).
L'héritage crée une nouvelle classe qui reprend les fonctionnalités de la classe mère et les modifie ou les enrichie. Mais

il présente quelques inconvénients :
    
    • Il n'est pas toujours possible (par exemple pour une classe déclarée finale)
    • Cela peut faire augmenter le nombre de classes pour définir tous les cas de figure requis
    • L'ajout des fonctionnalités est statique

Avec l'héritage, il serait nécessaire de définir autant de classes filles que de cas ce qui peut vite devenir ingérable. Avec
l'utilisation d'un décorateur, il suffit de définir un décorateur pour chaque fonctionnalité et de les utiliser par combinaison
en fonction des besoins. L'héritage ajoute des fonctionnalités de façon statique (à la compilation) alors que le décorateur
ajoute des fonctionnalités de façon dynamique (à l'exécution).

Le modèle de conception décorateur apporte une solution à ces trois inconvénients et propose donc une alternative à
l'héritage.

Le motif de conception décorateur permet de définir un ensemble de classes possédant une base commune mais
proposant chacune des variantes sans utiliser l'héritage qui est le mécanisme de base par la programmation orientée
objet. Ceci permet d'enrichir une classe avec des fonctionnalités supplémentaires.

Ce motif est dédié à la création de variantes d'une classe plutôt que d'avoir une seule classe prenant en compte ces
variantes. Il permet aussi de réaliser des combinaisons de plusieurs variantes.

Ce motif de conception est donc généralement utilisé lorsqu'il n'est pas possible de prédéfinir le nombre de combinaisons
induites par l'ajout de nombreuses fonctionnalités ou si ce nombre est trop important. Le principe du motif de conception
décorateur est d'utiliser la composition : le décorateur contient un objet décoré. L'appel d'une méthode du décorateur
provoque l'exécution de la méthode correspondante du décoré et des fonctionnalités ajoutées par le décorateur.

Le motif décorateur repose sur deux entités :

    • le décoré : interface ou classe qui définit les fonctionnalités de base
    • le décorateur : classe enrichie qui contient les fonctionnalités de base plus celles ajoutées

Le décorateur encapsule le décoré dont l'instance est généralement fournie dans les paramètres d'un constructeur. Il est
important que l'interface du décorateur reprenne celle de l'objet décoré. Pour permettre de combiner les décorations, le
décoré et le décorateur doivent implémenter une interface commune.

.....
 
    Un des avantages de ce motif de conception est de n'avoir à créer qu'une seule classe pour proposer des fonctionnalités
    supplémentaires aux classes qui mettent en oeuvre ce motif. Avec l'héritage, il serait nécessaire de créer autant de classes
    filles que de classes concernées ou de gérer la fonctionnalité dans une classe mère en modifiant cette dernière pour
    prendre en compte cet ajout avec tous les risques que cela peut engendrer.