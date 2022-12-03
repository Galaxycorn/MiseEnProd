# MiseEnProd

Pour le déploiment : 

``` docker compose up --build ```

Pour l'utiliser : http://localhost:8080

Quand la page html s'ouvre elle exécute le script à l'intérieur pour fetch tous les centres de Paris et affiche leur nom et adresse. Cependant 
comme elle est censée lire ce qu'il y a dans la base de données et qu'elle est vide elle ne renvoie rien et vu que je n'ai pas réussi à la faire 
fonctionner j'ai pas eu le temps de faire un formulaire d'ajout. 

Pour l'utilisation de mogenius : 

- Deux services, l'un pour le serveur et l'autre pour l'application 
- Plusieurs variables en secrets qui sont disponibles dans application.properties pour se connecter à la base de données 

Lien du service : http://tcp-mo1.mogenius.io:62986/

Actuellement j'en suis à une erreur 404 pour le lien du service et je n'arrive pas à la résoudre car localement elle fonctionne bien...

