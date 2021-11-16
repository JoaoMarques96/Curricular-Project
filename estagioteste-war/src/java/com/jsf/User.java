/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class User {

    private String username = "";
    private String password = "";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String userLogin() {
        //Validar o login do utilizador
        if (username != null && username.equals("admin") && password != null && password.equals("admin")) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem vindo!", "Login efetuado com sucesso"));
            return "quadrogeral?faces-redirect=true";

        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Utilizador ou palavra passe incorretos"));

        }

        return "asd";
    }
}

/*<p:menuitem value="Quit" url="http://www.primefaces.org" icon="ui-icon-close" />
        <f:facet name="options">
            <p:inputText style="margin-right:10px" placeholder="Search"/>
            <p:commandButton type="button" value="Logout" icon="ui-icon-extlink" />
        </f:facet>*/
