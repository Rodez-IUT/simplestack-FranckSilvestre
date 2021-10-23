# Git Rebase

## Exercice 1 – Simple rebase (sans conflit)

1. Ouvrez votre terminal “Git bash” et placez vous à la racine du projet *SimpleStack* sur lequel vous travaillez en binôme.
2. Soit M1 et M2 les 2 membres de votre binôme. Mettez-vous d’accord avec votre binôme pour identifier qui de vous 2 est M1 et qui est M2.  
3. Mise en place de la branche `develop`   
   1. M1 : créez la branche develop sur votre dépôt local, créez le fichier `package-info.java`à la racine du package `org.mpa` et complétez 
      ce fichier avec une courte documentation du package. Effectuez un push sur le dépôt distant. 
   2. M2 : créer la branche develop sur votre dépôt local ; effectuez les commandes vous permettant de récupérer les modifications de la branche develop sur le dépôt distant.
4. Sur vos dépôts git locaux respectifs :
   1. M1 : créez la branche `m1/improveTestCode`.
   2. M2 : créez la branche `m2/improveMainCode`.
   3. Modifiez chacun respectivement la classe de test `DefaultStackTest` (M1) et la classe `DefaultStack` (M2).
   4. Commitez sur chacune de vos branches respectives vos modifications avec un message explicite sur votre modification (“modification sur le fichier…”).
   5. Reproduisez une série de 2 commits sur vos fichiers respectifs et commitez les sur vos branches respectives.
5. Mise à jour de la branche `develop` par M1 :
   1. M1 : modifiez votre branche local `develop` de telle sorte que celle-ci intègre les commits de votre branche `m1/improveTestCode`. Pour cela, utiliser un `merge` non `fast-forward` et inscrivez en message du commit de merge “fix improve test code”.
   2. M1 :Poussez les modifications de la branche sur le dépôt distant.
   3. M1 : Une fois vérifiée l’historique des commits sur `develop`, supprimez la branche `m1/improveTestCode`.
6. Récupération de la dernière version de `develop` par M2 :
   1. M2 : Effectuez la ou les commandes vous permettant de récupérer localement les dernières mises à jour de la branche `develop` distante sur votre branche `develop` locale.
   2. M2 : Vérifiez que l’historique des commits est conforme à ce qui est attendu : la branche `develop` a évolué en parallèle de votre branche `m2/improveMainCode`.
7. Mise à jour de la branche “develop” par M2
      1. M1 et M2 : dessinez l’arbre des commits obtenu si la branche `develop` est mise à jour avec une approche “merge”. Vérifiez avec votre binôme que vous ête d’accord sur l’arbre qui serait obtenu dans ce cas.
      2. M1 et M2 : dessinez l’arbre des commits obtenu si vous effectuez un rebase de la branche `m2/improveMainCode` sur `develop`. Vérifiez avec votre binôme que vous ête d’accord sur l’arbre à obtenir.
      3. M2 : effectuez un rebase de votre branche `m2/improveMainCode` sur `develop`. Vérifiez que l’arbre de commit obtenu est conforme à ce que vous avez dessiné.
      4. M2 : modifiez votre branche local `develop` de telle sorte que celle-ci intègre les commits de votre branche `m2/improveMainCode`. Pour cela, utilisez un `merge` non `fast-forward` et inscrivez en message du commit de merge “fix improve main code”.
      5. M2 :Poussez les modifications de la branche sur le dépôt distant.
      6. M2 : Une fois vérifiée l’historique des commits sur `develop`, supprimez la branche `m2/improveMainCode`.
8. Récupération de la dernière version de “develop” par M1.
   1. M1 : effectuez la ou les commandes vous permettant de récupérer localement les dernières mises à jour de la branche `develop` distante sur votre branche `develop` locale.
   2. M1 et M2 : vérifiez que vous avez le même historique de commits sur chacun de vos dépôts locaux.

## Exercice 2 – Rebase simple
Rejouez l’exercice 1 en inversant les rôles.

## Exercice 3 – Rebase avec conflit
Rejouer l’exercice 1 mais cette fois-ci en travaillant sur un même fichier dans vos branches respectives `m1/improveCode` et `m2/improveCode`.

## Exercice 4  - Conflit dans le Rebase
Rejouez l’exercice 3 en inversant les rôles.

## Exercice 5 - Découverte du Worflow Git
Lire de manière active le tutoriel disponible ici :
https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow
1. Notez vos questions sur ce qui vous semble confus, incompréhensible, etc.
2. Deuxième lecture : imaginez 3 questions qui pourraient être posées le jour du contrôle sur le workflow Git.

