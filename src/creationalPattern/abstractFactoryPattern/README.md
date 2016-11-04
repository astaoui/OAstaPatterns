**Fabrique abstraite (abstract Factory)**

Le motif de conception Abstract Factory (fabrique abstraite) permet de fournir une interface unique pour instancier des
objets d'une même famille sans avoir à connaître les classes à instancier.

L'utilisation de ce motif est pertinente lorsque :

        •   Le système doit être indépendant de la création des objets qu'il utilise.
        •   Le système doit être capable de créer des objets d'une même famille.

Le principal avantage de ce motif de conception est d'isoler la création des objets retournés par la fabrique. L'utilisation
d'une fabrique abstraite permet de facilement remplacer une fabrique par une autre selon les besoins.

Dans cet exemple, les classes suffixées par un chiffre correspondent aux classes relatives à une famille donnée.
Les classes misent en oeuvre sont :

    • IProduitFactory : interface pour les fabriques de création d'objets. Elle définit donc les méthodes nécessaires à la
        création des objets
    • ProduitFactory1 et ProduitFactory2 : fabriques qui réalisent la création des objets
        
    • ProduitA et ProduitB : interfaces des deux familles de produits (En Java, cela peut être une classe abstraite ou une interface)
    • ProduitA1, ProduitA2, ProduitB1 et ProduitB2 : implémentations des produits des deux familles
    • Client : classe qui utilise la fabrique pour obtenir des objets

C'est une des classes filles de la fabrique qui se charge de la création des objets d'une famille. Ainsi tous les objets créés
doivent hériter d'une classe abstraite qui sert de modèle pour toutes les classes de la famille.

Le client utilise une implémentation concrète de la fabrique abstraite pour obtenir une instance d'un produit créé par la
fabrique.

Cette instance est obligatoirement du type de la classe abstraite dont toutes les classes concrètes héritent. Ainsi des objets
concrets sont retournés par la fabrique mais le client ne peut utiliser que leur interface abstraite.