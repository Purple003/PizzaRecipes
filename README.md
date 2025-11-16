# PizzaRecipes

PizzaRecipes est une application Android qui permet de consulter une liste de pizzas avec leurs détails, incluant ingrédients, description, durée de préparation et prix. Elle est conçue pour apprendre la structure d’un projet Android avec DAO, Service, Adapter et UI.

---

## Fonctionnalités

- Splash Screen animé à l’ouverture de l’application.
- Liste des pizzas avec image, nom, durée et prix.
- Affichage détaillé pour chaque pizza :
  - Image
  - Nom et durée de préparation
  - Prix
  - Ingrédients
  - Description
  - Étapes de préparation
- Navigation simple entre la liste et le détail.

---

## Architecture

- **classes/** : contient l’entité `Produit` représentant une pizza.
- **dao/** : interface générique `IDao` pour les opérations CRUD.
- **service/** : `ProduitService` pour gérer les données en mémoire.
- **adapter/** : `PizzaAdapter` pour lier les données aux vues.
- **ui/** : activités Android (`SplashActivity`, `ListPizzaActivity`, `PizzaDetailActivity`).

---

## Structure des layouts

- `res/layout/activity_splash.xml` : écran de démarrage avec logo.
- `res/layout/activity_list_pizza.xml` : liste des pizzas.
- `res/layout/row_pizza.xml` : item de la liste.
- `res/layout/activity_pizza_detail.xml` : écran de détails d’une pizza.

---

## Installation

1. Cloner le projet :

```bash
git clone https://github.com/ton-utilisateur/PizzaRecipes.git
```
- Ouvrir le projet dans Android Studio.
- Vérifier que le SDK minimum est API 24.
- Build et Run sur un émulateur ou un appareil Android.


## Démonstration
https://github.com/user-attachments/assets/e7739886-24ac-44e8-aece-4bc2f44b7f49

## Notes
- Les images des pizzas sont stockées dans res/mipmap.
- L’application est entièrement en mémoire (pas de base de données externe).
- Le code est structuré pour un apprentissage simple des bonnes pratiques Android.

### Auteur
- Nom : Arroche Aya
- Cours : Programmation Mobile – Android avec Java
- Date : Novembre 2025
- Encadré par: Pr. Mohamed LACHGAR
