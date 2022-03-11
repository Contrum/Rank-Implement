<h1 align="center">🏅 Rank Implement 🏅</h1>

Este es una implementación para los productos de Panda, con esto vas a poder añadir tu "sistema privado de permisos" y así vas a poder usar nustros productos con tu sistema privado de permisos.

## Translations 🌐

This README is also available in other languages:

- [Español](https://github.com/Panda-Community/RankImplement/blob/master/README.md) (Spanish)
- [English](https://github.com/Panda-Community/RankImplement/blob/master/README_EN.md) (English)


## ¿Cómo agrego mi sistema de permisos?

1. Necesitas una API de tu sistema de permisos para poder obtener la información que nosotros necesitamos.
Lo ideal es que tu API contenga estas cosas:

- String getRankName(UUID uuid);
- String getRankPrefix(UUID uuid);
- String getRankSuffix(UUID uuid);
- String getRankColor(UUID uuid);
- int getRankWeight(UUID uuid);

2. Clona el repositorio para que puedas añadir/editar parte del codigo.
3. Una vez clonado el proyecto debes añadir tu API a la carpeta "ranks" y en archivo "pom.xml" agregar la dependencia de tu API.
4. Crea una clase en el proyecto con el nombre de tu sistema de permisos, recuerda que tiene que ser exactamente el mismo nombre.
5. Implementa "IRank" a tu clase, te puedes guiar con los otros sistemas de permisos que hay en el proyecto.
6. Luego de esto te va a pedir las funciones, para esto debes usar tu API y añadir en cada función el codigo de tu API para obtener esa cierta función.
7. Cuando ya tengas todo crea una pull request con la modificación del codigo que realizaste y un staff va a revisar tu petición para añadirlo a los proyectos de Panda.

## ¿Soporte? ⚙

Póngase en contacto con nosotros en https://discord.pandacommunity.org/development para cualquier pregunta adicional.
