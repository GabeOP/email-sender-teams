package com.gabriel.emailsendertimes.models;

import java.util.List;

public class EmailModel {

  private String emailFrom;
  private String emailTo;
  private String tituloEmail;
  private String noticiaModel;

  public EmailModel() {}

  public EmailModel(String emailUsuario, List<NoticiaModel> noticiaModel) {
    this.emailFrom = "gabeOP-projeto@teste.com";
    this.emailTo = emailUsuario;
    this.tituloEmail = "[PROJETO] Atualizações diárias";
    this.noticiaModel = String.format("");
  }

  public String getEmailFrom() {
    return emailFrom;
  }

  public void setEmailFrom(String emailFrom) {
    this.emailFrom = emailFrom;
  }

  public String getEmailTo() {
    return emailTo;
  }

  public void setEmailTo(String emailTo) {
    this.emailTo = emailTo;
  }

  public String getTituloEmail() {
    return tituloEmail;
  }

  public void setTituloEmail(String tituloEmail) {
    this.tituloEmail = tituloEmail;
  }
}