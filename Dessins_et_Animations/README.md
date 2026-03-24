# Projet Java - Exercice de Dessin et Animation

Par défaut le dessin est exécuté. Pour lancer l'animation, commentez/décommentez dans `Main.java`.

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