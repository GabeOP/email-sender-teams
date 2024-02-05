package com.gabriel.emailsenderbotafogo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class EmailSenderService {

  public void consumirApi(String nomeTime) {
    nomeTime.split("")[0].toUpperCase();
    RestTemplate restTemplate = new RestTemplate();

    String apiUrl = "https://newsapi.org/v2/top-headlines?country=br&category=sports&apiKey=a9e0059ba2bc4282be6a0d18862faf84";
    ResponseEntity<Map> resposta = restTemplate.getForEntity(apiUrl, Map.class);

    Map<String, Object> respostaMap = resposta.getBody();

    List<Map<String, Object>> articles = (List<Map<String, Object>>) respostaMap.get("articles");

    for (Map<String, Object> article : articles) {
      String[] palavrasTitulo = article.get("title").toString().toUpperCase().split("[ :]+");

      for(String existePalavra : palavrasTitulo) {
        if(existePalavra.equals(nomeTime.toUpperCase())) {
          System.out.println("Título: " + article.get("title"));
          System.out.println("Autor: " + article.get("author"));
          System.out.println("URL: " + article.get("url"));
          System.out.println("-----------------------------------");
          break;
        }
      }
    }
  }
}
