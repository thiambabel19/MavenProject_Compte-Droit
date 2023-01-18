# MavenProject_Compte-Droit
Ceci est un projet maven intégré du web

<groupId>com.groupeisi</groupId>
<artifactId>Project_JPA</artifactId>
<version>0.0.1-SNAPSHOT</version>
<packaging>war</packaging>
<name>Project_JPA</name>
<description>Project maven & web</description>


Tout d'abord, nous avons ajouté toutes les dépendances nécessaire au bon fonctionnement du projet dans le fichier "pom.xml".
Pour ensuite créer nos différents packages dans "src/main/java" à savoir :
- com.project.config : pour y configurer la connexion à la base de données en utilisant JPA.
- com.project.dto : qui compose nos entités.
- com.project.dao : composé d'interfaces et de classes qui implémentent ces interfaces. C'est là où on definit l'ensemble des opérations effectuables.
- com.project.filter : pour géer la gestion de la sécurité.
- com.project.web : qui l'ensemble de nos servlets.

En ce qui concerne les vues, nous avons créé un fichier "index.jsp" dans "src/main/webapp/" puis un fichier "home.jsp" dans "src/main/webapp/WEB-INF/" .
Ainsi, nous avons aussi créé un dossier "view" dans "src/main/webapp/WEB-INF/" et dans "view" nous avons deux sous dossiers à savoir : "compte" et "droit" .
Dans chacun de ces dossiers nous avons les fichiers "add.jsp" et "list.jsp" pour pouvoir ajouter ou lister.
