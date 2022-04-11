<h1 align="center">🏅 Rank Implement 🏅</h1>

This is an implementation for Panda products, with this you will be able to add your "private permissions system" and thus you will be able to use our products with your private permissions system.

## Translations 🌐

This README is also available in other languages:

- [Español](https://github.com/Panda-Community/RankImplement/blob/master/README.md) (Spanish)
- [English](https://github.com/Panda-Community/RankImplement/blob/master/README_EN.md) (English)


## How do I add my system permissions?

1. You need an API of your permissions system to be able to obtain the information that we need.
Ideally, your API should contain these things:

- String getRankName(UUID uuid);
- String getRankPrefix(UUID uuid);
- String getRankSuffix(UUID uuid);
- String getRankColor(UUID uuid);
- int getRankWeight(UUID uuid);

2. Clone the repository so you can add/edit part of the code.
3. Once the project is cloned, you must add your API to the "ranks" folder and in the "pom.xml" file add the dependency of your API.
4. Create a class in the project with the name of your permission system, remember that it has to be exactly the same name.
5. Implement "IRank" to your class, you can guide yourself with the other permission systems that exist in the project.
6. After this it will ask you for the functions, for this you must use your API and add in each function the code of your API to obtain that certain function.
7. When you have everything, create a pull request with the code modification you made and a staff will review your request to add it to Panda projects.

## Support? ⚙

Please contact us at https://discord.pandacommunity.org/ for any additional questions.
