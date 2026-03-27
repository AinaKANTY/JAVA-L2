# Projet Java - Exercice de Dessin et Animation

Par défaut complexe mutable est exécuté. Pour lancer l'immutable, commentez/décommentez dans `Main.java`.

### Dépendances
- **JDK 11+**
- **make**

### Installation des dépendances
```shell
# debian/ubuntu
sudo apt install make default-jdk
# RHEL/Fedora
sudo dnf install make java-latest-openjdk-devel
# Arch/Manjaro
sudo pacman -S make jdk-openjdk
```

### Utilisation
```shell
make run    # compiler et exécuter
make re     # recompiler et exécuter
make clean  # nettoyer les fichiers de build
```

### Pourquoi `make`!?
Car j'ai la fleme d'apprendre `maven/gradle`.

### Sous package
Pour différencier les 2 class qui a la même nom ou qui fait la mâme chose mais de manière différent.

### Leur différences
`complexe.mutable`:
- Utilise des setters
- Des types `void` sur la plus part methodes de caluls

`complexe.immutable`:
- N'utilise pas des setters
- Des types `Complexe` sur la plus part des methodes de caluls

### La meilleure
Selon moi cest le `complexe.mutable`, car il utilise des setter pour faciliter la modification les valeurs dans la classe. En gros il est plus optimisé.