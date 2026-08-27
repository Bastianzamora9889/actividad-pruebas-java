package cl.actividad.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {

    private String correoRegistrado;
    private String contrasenaRegistrada;
    private boolean inicioSesionExitoso;

    @Given("que el usuario esta registrado con correo {string} y contrasena {string}")
    public void usuarioRegistrado(String correo, String contrasena) {
        correoRegistrado = correo;
        contrasenaRegistrada = contrasena;
    }

    @When("ingresa el correo {string} y la contrasena {string}")
    public void ingresaCredenciales(String correo, String contrasena) {
        inicioSesionExitoso =
                correoRegistrado.equals(correo)
                && contrasenaRegistrada.equals(contrasena);
    }

    @Then("el sistema debe permitir el inicio de sesion")
    public void sistemaPermiteInicioSesion() {
        assertEquals(true, inicioSesionExitoso);
    }

    @Then("el sistema debe rechazar el inicio de sesion")
    public void sistemaRechazaInicioSesion() {
        assertEquals(false, inicioSesionExitoso);
    }
}
