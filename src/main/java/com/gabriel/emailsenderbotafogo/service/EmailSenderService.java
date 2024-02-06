package com.gabriel.emailsenderbotafogo.service;

import com.gabriel.emailsenderbotafogo.models.EmailModel;
import com.gabriel.emailsenderbotafogo.models.NoticiaModel;
import com.gabriel.emailsenderbotafogo.models.entities.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmailSenderService {

  @Autowired
  private JavaMailSender emailSender;

  @Transactional
  public void enviarEmail(Usuario usuario) {

    EmailModel model = new EmailModel();

    SimpleMailMessage message = new SimpleMailMessage();

    List<NoticiaModel> resultadoApi = consumirApi(usuario.getTime());

    message.setFrom(model.getEmailFrom());
    message.setTo(usuario.getEmail());
    message.setSubject(model.getTituloEmail());

    StringBuilder body = new StringBuilder();
    body.append("Aqui estão as notícias de hoje sobre o seu time \n\n");
    for (NoticiaModel item : resultadoApi) {
      body.append(item).append("\n");
    }

    message.setText(body.toString());
    emailSender.send(message);
  }
  private List<NoticiaModel> consumirApi(String nomeTime) {
    RestTemplate restTemplate = new RestTemplate();

    String apiUrl = "https://newsapi.org/v2/top-headlines?country=br&category=sports&apiKey=a9e0059ba2bc4282be6a0d18862faf84";
    ResponseEntity<Map> resposta = restTemplate.getForEntity(apiUrl, Map.class);

    Map<String, Object> respostaMap = resposta.getBody();

    List<Map<String, Object>> articles = (List<Map<String, Object>>) respostaMap.get("articles");

    List<NoticiaModel> noticiaModelList = new ArrayList<>();

    for (Map<String, Object> article : articles) {
      String[] palavrasTitulo = article.get("title").toString().toUpperCase().split("[ :]+");

      for(String existePalavra : palavrasTitulo) {
        if(existePalavra.equals(nomeTime.toUpperCase())) {
          NoticiaModel noticiaModel = new NoticiaModel(
                  article.get("title").toString(),
                  article.get("author").toString(),
                  article.get("url").toString());

          noticiaModelList.add(noticiaModel);
          break;
        }
      }
    }
    return noticiaModelList;
  }
}
