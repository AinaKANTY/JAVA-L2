# Projet Java - Exercice sur les Nombres Premiers
1. Ce code permet de trouver les nombre premier de 0 à n(vous pouvez specifier le n dans le main ligne 3).
2. Structure:
```shell
.
├── README.md # ce fichier
└── src 
├── CribleDEratosthene.java # la classe qui contient l'algo d'Ératosthène https://fr.wikipedia.org/wiki/Crible_d%27%C3%89ratosth%C3%A8ne
└── Main.java # Fonction principale

2 directories, 3 files
```
3. But: trouver les nombre premier jusqu'à n:
- On suppose que tous les nombres sont premiers.
- On prend chaque nombre p l'1 après l'autre
- Si un nombre n'est pas éliminé par les multiples des nombres précédents alors il est premier.

## Comment compiler et exécuter
1. Compile les classes en java:
```shell
javac -d out src/*.java
```
2. Exécuter le programme principale
```shell
java -cp out Main
```

**Ou en un seul ligne**
```shell
javac -d out src/*.java && java -cp out Main # si vous avez la fleme
```