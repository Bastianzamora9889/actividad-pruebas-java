Feature: Inicio de sesión

  Como usuario registrado
  Quiero iniciar sesión
  Para acceder al sistema

  Scenario: Inicio de sesión exitoso
    Given que el usuario está registrado con correo "usuario@test.com" y contraseña "123456"
    When ingresa el correo "usuario@test.com" y la contraseña "123456"
    Then el sistema debe permitir el inicio de sesión

  Scenario Outline: Inicio de sesión con credenciales incorrectas
    Given que el usuario está registrado con correo "usuario@test.com" y contraseña "123456"
    When ingresa el correo "<correo>" y la contraseña "<contraseña>"
    Then el sistema debe rechazar el inicio de sesión

    Examples:
      | correo           | contraseña |
      | usuario@test.com | 999999     |
      | otro@test.com    | 123456     |
