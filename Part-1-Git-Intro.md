# Premiers pas avec Git et Github

Créez un nouveau dossier (appelé "TP-Git" par exemple) dans votre espace de travail.

## Exercice 1 – Mise en place de l'environnement Github/Git et du projet

1. Allez sur le site [GitHub](https://github.com) et créez un compte gratuit. Vous recevrez alors un email avec un lien
   pour vérifier votre adresse (Sinon vous pouvez aller sur https://github.com/settings/emails pour renvoyer cet email de vérification).

2. Configurez votre identité Git locale en utilisant les commandes suivantes :  
   `git config --global user.name "mon_user_name"`  
   `git config --global user.email "mon_adresse"`  
   où "mon_user_name" est à remplacer par votre nom d'utilisateur GitHub et "mon_adresse" est  à remplacer par votre adresse
   électronique utilisée pour créer votre compte GitHub. Ensuite, pour vérifier votre configuration, vous pouvez utiliser la commande
   `git config --global -l`

3. Inscrivez-vous sur le projet Github Classroom en suivant le lien fourni par votre enseignant.

4. Dans votre dossier de travail, à l'aide d'un terminal `Git Bash` et de la commande `git clone`,
   clonez votre projet `SimpleStack` résultant du fork exécuté précédemment. Le clonage doit se faire en utilisant
   le protocole https (préfixe de l'URL : https:// ...).

5. Modifier le fichier README.md pour y ajouter votre nom, prénom et n° de groupe.  
   Reportez les changements dans votre dépôt local.  
   Rappel de quelques commandes :  
   `git status` pour vérifier l’état du dépôt par rapport à l’espace de travail.  
   `git add .` pour ajouter les fichiers à l'aire d'embarquement.  
   `git commit -m "Comment…"` pour ajouter les fichiers de l'aire d'embarquement dans le dépôt Git local.  
   `git status` pour vérifier le nouvel état du dépôt.

> Le message de commit à utiliser est le suivant :  
> `fix #1 fichier README complété` 

## Exercise 2 – Solo work - Solo branch

Le projet est un projet Java utilisant Gradle comme outil de *build*. Il contient les fichiers visant à implémenter une classe
représentant des objets de type *Stack* (pile). Étudiez le projet.

1. Modifiez la classe `DefaultStack` afin de permettre au projet de compiler sans erreur.
Reportez les changements dans votre dépôt local.

> Le message de commit à utiliser est le suivant :  
> `fix #2.1 projet compile`


2. Créer la classe de test associée à la classe `DefaultStack` et écrivez un test unitaire permettant de tester qu'une
`DefaultStack` qui vient d'être créée est vide (méthode `isEmpty()` retourne `true` et `getSize()` retourne 0). 
Implantez le code dans la classe `DefaultStack` pour que le test passe. 
Reportez les changements dans votre dépôt local.

> Le message de commit à utiliser est le suivant :  
> `fix #2.2 une nouvelle stack est vide`

3. Écrivez un test unitaire permettant de tester le bon fonctionnement de la méthode `push(Item item)`
de la classe `DefaultStack`.
Implantez le code dans la classe `DefaultStack` pour que le test passe.
Reportez les changements dans votre dépôt local.

> Le message de commit à utiliser est le suivant :  
> `fix #2.3 methode push OK`

## Exercise 3 – Solo work - Duo branch

1. Créez une branche nommée "dev/peek" et basculez sur cette branche.
Visualisez l'historique de votre dépôt avec les commandes "git log" et "gitk".

2. Écrivez un test unitaire permettant de tester le bon fonctionnement de la méthode `peek()`
de la classe `DefaultStack`.
Implantez le code dans la classe `DefaultStack` pour que le test passe.
Reportez les changements dans votre dépôt local.

> Le message de commit à utiliser est le suivant :  
> `fix #3 methode peek OK`

Visualisez l'historique de votre dépôt avec les commandes "git log" et "gitk".

3. Revenez à la branche master et fusionnez la branche "dev/peek".
La fusion effectuée est-elle une fusion "fast-forward" ? Que signifie une fusion "fast-forward" ?
"Envoyez" les modifications sur la branche master de votre dépôt GitHub. Vérifiez sur le site GitHub que vos 
modifications sont prises en compte.

Visualisez l'historique de votre dépôt avec les commandes "git log" et "gitk".

## Exercice 4 – Duo work

Vous allez maintenant voir comment Git prend en charge le développement collaboratif.
Choisissez un collaborateur. L'un des 2 collaborateurs doit être désigné comme le propriétaire du projet partagé sur GitHub. 
Le propriétaire du projet partagé doit, sur GitHub, ajouter son collaborateur à la liste des contributeurs de son projet. 
L'autre collaborateur doit ensuite faire un clone du projet partagé dans son dossier de travail. Une fois les manipulations 
effectuées, les 2 collaborateurs exécutent la commande `git remote -v` pour vérifier qu'ils pointent sur le même dépôt distant.

Chaque collaborateur doit alors :

1. Créer une branche dans son référentiel local. Chaque collaborateur choisit un nom de branche distinct.
2. Basculer sur la nouvelle branche.
3. Créer une nouvelle classe qui implémente l'interface `Item` (choisissez des noms de classe différents).
4. Reporter les changements dans son dépôt local dans sa branche.

> Le message de commit à utiliser est le suivant :  
> `fix #4 nouvelle classe Item`

5. "Envoyer" la branche sur le dépôt partagé de GitHub.
Vérifier sur GitHub que les deux branches sont dans le dépôt partagé.

6. Chaque collaborateur intègre à sa branche master les modifications effectuée sur sa branche.
   Ensuite un des deux collaborateurs (C1) effectue un push de la branche master sur le dépôt distant.
   L'autre collaborateur (C2) récupère la dernière version de la branche master sur sa branche master local puis push à son tour
   la branche master. (C1) récupère les modifications de la branche master.
   (C1) et (C2) vérifie qu'ils ont la même chose sur leur branche locale master.

## Exercice 5 – Duo work avec résolution de conflit

1. Chaque collaborateur doit basculer sur sa branche “master” et faire une fusion de la branche précédemment créée.  
Pour simuler un conflit (amical) entre collaborateurs, chaque collaborateur écrit un test unitaire permettant de 
tester le bon fonctionnement de la méthode `pop()` de la classe `DefaultStack` et implante le code dans la classe 
`DefaultStack` pour que le test passe.  
Chaque collaborateur reporte les changements dans son dépôt local dans sa branche `master`.

> Le message de commit à utiliser est le suivant :  
> `fix #5.1 méthode pop OK`

2. L'un des collaborateurs "envoie" les modifications à la branche `master` du dépôt GitHub partagé.  
L'autre collaborateur essaie d'envoyer les modifications à la branche “master” du dépôt distant.  
Vérifiez qu'un message d'erreur apparaît suggérant "git pull". Exécutez la commande “git pull” et vérifiez 
qu'un conflit est détecté.  
Le même collaborateur résout le conflit en éditant le fichier qui est en conflit.  
Il reporte les changements dans son dépôt local dans sa branche `master`.

> Le message du *merge commit* à utiliser est le suivant :  
> `fix #5.2 conflit sur methode pop resolu`

Ensuite, ce collaborateur peut "envoyer" les modifications sur la branche `master` du dépôt distant.

3. Le premier collaborateur doit maintenant mettre à jour son dépôt local avec les modifications apportées par le second 
collaborateur sur GitHub.
