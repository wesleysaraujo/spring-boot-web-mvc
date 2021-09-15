package br.com.agits.webmvc.model;

import javax.validation.constraints.NotBlank;

public class Jedi {

    @NotBlank(message="Informe um nome")
    private String name;

    @NotBlank(message = "Informe um sobrenome")
    private String lastName;

    public Jedi (final String name, final String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Jedi() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
