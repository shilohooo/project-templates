# Vue3 Typescript project template

This template should help get you started developing with Vue 3 in Vite.

## Stack

|     Name     | Version |           Documentation           |   Description   |
|:------------:|:-------:|:---------------------------------:|:---------------:|
|    NodeJS    | 22.14.0 |      <https://nodejs.org/en>      |     Runtime     |
|     PNPM     | 10.6.5  |        <https://pnpm.io/>         | Package Manager |
|  TypeScript  | ~5.8.0  | <https://www.typescriptlang.org/> |                 |
|     Vue      | ^3.5.13 |       <https://vuejs.org/>        |                 |
|     Vite     | ^6.2.4  |        <https://vite.dev/>        |   Build Tool    |
|  Vue Router  | ^4.5.0  |    <https://router.vuejs.org/>    |     Router      |
|    Pinia     | ^3.0.1  |    <https://pinia.vuejs.org/>     |      Store      |
| Tailwind CSS | ^4.1.3  |    <https://tailwindcss.com/>     |                 |
|    ESLint    | ^9.22.0 |       <https://eslint.org/>       |                 |
|   Prettier   | ^3.5.3  |      <https://prettier.io/>       |                 |

## Recommended IDE Setup

[VSCode](https://code.visualstudio.com/) + [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) (and
disable Vetur).

## Type Support for `.vue` Imports in TS

TypeScript cannot handle type information for `.vue` imports by default, so we replace the `tsc` CLI with `vue-tsc` for
type checking. In editors, we need [Volar](https://marketplace.visualstudio.com/items?itemName=Vue.volar) to make the
TypeScript language service aware of `.vue` types.

## Customize configuration

See [Vite Configuration Reference](https://vite.dev/config/).

## Project Setup

```sh
pnpm install
```

### Compile and Hot-Reload for Development

```sh
pnpm dev
```

### Type-Check, Compile and Minify for Production

```sh
pnpm build
```

### Lint with [ESLint](https://eslint.org/)

```sh
pnpm lint
```
