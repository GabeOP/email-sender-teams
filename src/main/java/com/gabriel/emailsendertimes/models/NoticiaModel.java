package com.gabriel.emailsendertimes.models;

public class NoticiaModel {
  private String tituloNoticia;
  private String autorNoticia;
  private String UrlNoticia;

  public NoticiaModel() {}

  public NoticiaModel(String tituloNoticia, String autorNoticia, String urlNoticia) {
    this.tituloNoticia = tituloNoticia;
    this.autorNoticia = autorNoticia;
    this.UrlNoticia = urlNoticia;
  }

  public String getTituloNoticia() {
    return tituloNoticia;
  }

  public void setTituloNoticia(String tituloNoticia) {
    this.tituloNoticia = tituloNoticia;
  }

  public String getAutorNoticia() {
    return autorNoticia;
  }

  public void setAutorNoticia(String autorNoticia) {
    this.autorNoticia = autorNoticia;
  }

  public String getUrlNoticia() {
    return UrlNoticia;
  }

  public void setUrlNoticia(String urlNoticia) {
    UrlNoticia = urlNoticia;
  }

  @Override
  public String toString() {
    return "TÍTULO DA NOTÍCIA: " + tituloNoticia + "\n" +
            "AUTOR DA NOTÍCIA: " + autorNoticia + "\n" +
            "LINK PARA A NOTÍCIA: " + UrlNoticia + "\n\n" ;
  }
}
