Feature: Inicio de sesion

  Como usuario registrado
  Quiero iniciar sesion
  Para acceder al sistema

  Scenario: Inicio de sesion exitoso
    Given que el usuario esta registrado con correo "usuario@test.com" y contrasena "123456"
    When ingresa el correo "usuario@test.com" y la contrasena "123456"
    Then el sistema debe permitir el inicio de sesion

  Scenario Outline: Inicio de sesion con credenciales incorrectas
    Given que el usuario esta registrado con correo "usuario@test.com" y contrasena "123456"
    When ingresa el correo "<correo>" y la contrasena "<contrasena>"
    Then el sistema debe rechazar el inicio de sesion

    Examples:
      | correo           | contrasena |
      | usuario@test.com | 999999     |
      | otro@test.com    | 123456     |
