#Expressions Lambda
Surement une des évolutions les plus attendues, une expression lambda est une sorte de méthode “anonyme”. Jusqu’à aujourd’hui en Java pour simuler ce comportement on utilisait une classe anonyme qui implémentait une interface avec une seule méthode abstraite (SAM).

#Function
Une Function prend un argument et retourne un résultat.
#BiFunction
C’est un spécialisation d’une Function qui prend deux arguments et retourne un résultat.
#UnaryOperator
C’est une Function qui prend un argument et retourne un résultat du même type. Par exemple la fonction identity retourne toujours la valeur passée en argument.
#BinaryOperator
Un BinaryOperator est une spécialisation d’une BiFunction dont les paramètres et le résultat partagent le même type.
#Predicate
Un Predicate prend un argument et retourne un booléen.
#BiPredicate
Un BiPredicate prend deux arguments et retourne un booléen.
#Supplier
Un Supplier ne prend pas d’argument et produit un résultat.
#Consumer
Un Consumer prend un argument mais ne retourne pas de résultat.
#Comparator
Les Comparator sont devenus des FunctionalInterface.