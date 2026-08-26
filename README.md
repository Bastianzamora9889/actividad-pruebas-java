# Actividad de pruebas automatizadas

## Objetivo

Implementar un flujo básico de integración continua para un proyecto Java utilizando Maven, JUnit, Git y GitHub Actions.

## Tecnologías utilizadas

- Java 17
- Maven
- JUnit 5
- Git
- GitHub
- GitHub Actions

## Estructura del proyecto

El proyecto está organizado utilizando una estructura estándar de Maven.

- .github/workflows/ci.yml: configuración del pipeline de integración continua.
- .gitignore: archivos que Git debe ignorar.
- README.md: documentación del proyecto.
- pruebas-java/pom.xml: configuración de Maven y dependencias.
- pruebas-java/src/main/java/cl/actividad/: código principal.
- pruebas-java/src/test/java/cl/actividad/: pruebas unitarias.

## Pruebas unitarias

Se implementaron pruebas unitarias atómicas e independientes para las operaciones de suma y resta de la clase Calculadora.

Para ejecutar las pruebas localmente:

    mvn test

Resultado obtenido:

    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
    BUILD SUCCESS

## Control de versiones

Se utilizó Git para controlar las versiones del proyecto.

Se creó la rama:

    ffeature/suma

En esta rama se desarrolló la calculadora y sus pruebas.

Luego se realizó un commit con el mensaje:

    Agregar calculadora y pruebas unitarias

Finalmente, la rama feature/suma fue integrada a main mediante un merge.

## Archivo .gitignore

Se creó un archivo .gitignore para evitar agregar al repositorio archivos generados automáticamente o archivos locales.

## Integración continua

Se configuró GitHub Actions mediante:

    .github/workflows/ci.yml

El pipeline se ejecuta automáticamente cuando se realiza un push a main o feature/suma, y también ante Pull Requests hacia main.

El pipeline realiza las siguientes tareas:

1. Descarga el código.
2. Configura Java 17.
3. Ejecuta las pruebas mediante Maven.
4. Publica los reportes generados por Maven Surefire.

## Reporte de tests

GitHub Actions genera un artefacto llamado:

    reporte-tests

Este artefacto contiene los reportes generados por Maven Surefire y permite acceder a los resultados de las pruebas desde GitHub Actions.

## Flujo de trabajo

    Desarrollo
        |
        v
    Rama ffeature/suma
        |
        v
    Pruebas unitarias
        |
        v
    Commit
        |
        v
    Merge a main
        |
        v
    Push a GitHub
        |
        v
    GitHub Actions
        |
        v
    Ejecucion automatica de tests
        |
        v
    Reporte de tests

## Resultado final

El proyecto fue integrado correctamente con GitHub Actions.

Las pruebas se ejecutaron correctamente tanto de forma local como en el pipeline de integración continua.

Resultado final:

    Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
    BUILD SUCCESS
