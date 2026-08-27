# Sesión Three Amigos - Funcionalidad Login

## Objetivo

Definir los criterios de aceptación y ejemplos para una funcionalidad de inicio de sesión de usuarios.

## Participantes

### Product Owner

Define la necesidad del negocio: los usuarios registrados deben poder iniciar sesión utilizando sus credenciales.

### QA

Define los criterios de aceptación y los escenarios que deben ser comprobados para garantizar la calidad de la funcionalidad.

### Developer

Propone la implementación de la funcionalidad y valida que los escenarios definidos sean técnicamente realizables.

## Criterios de aceptación

1. Un usuario registrado debe poder iniciar sesión utilizando un correo y contraseña válidos.
2. El sistema debe rechazar credenciales incorrectas.
3. El sistema debe informar al usuario cuando las credenciales sean inválidas.
4. Los campos de correo y contraseña deben ser obligatorios.

## Ejemplos discutidos

| Ejemplo | Correo | Contraseña | Resultado esperado |
|---|---|---|---|
| Credenciales válidas | usuario@test.com | 123456 | Inicio de sesión exitoso |
| Contraseña incorrecta | usuario@test.com | 999999 | Acceso rechazado |
| Correo incorrecto | otro@test.com | 123456 | Acceso rechazado |
| Campos vacíos | vacío | vacío | Solicitar credenciales |

## Decisiones tomadas

Durante la sesión se acordó que la funcionalidad de login será validada mediante escenarios BDD escritos en lenguaje Gherkin.

Se utilizarán ejemplos positivos y negativos para comprobar el comportamiento esperado.

Los escenarios deberán ser independientes y fáciles de mantener.
