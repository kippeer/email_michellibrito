# Microserviço de Envio de E-mail

Este é um microserviço simples para envio de e-mails, desenvolvido em Java como parte dos estudos do vídeo da Michelli Brito.

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Mail
- Apache Maven

## Configuração
Antes de iniciar o serviço, configure o arquivo `application.properties` com os dados do seu provedor de e-mail:

```properties
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=seuemail@gmail.com
spring.mail.password=suasenha
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

**Nota:** Para o Gmail, pode ser necessário ativar o "Acesso a aplicativos menos seguros" ou configurar uma senha de aplicativo.

## Endpoints
O microserviço expõe um endpoint para envio de e-mails:

### Enviar E-mail
**POST** `/sending-email`

**Corpo da Requisição:**
```json
{
  "ownerRef": "fabio",
  "emailFrom": "fabiot92@gmail.com",
  "emailTo": "fabiot92@gmail.com",
  "subject": "2ª Edição E-Book: Spring Boot Da API REST aos Microservices",
  "text": "Olá! Tudo bem?"
}
```

**Resposta:**
```json
{
  "status": "Sucesso",
  "mensagem": "E-mail enviado com sucesso"
}
```

## Como Executar

1. Clone o repositório:
   ```sh
   git clone https://github.com/seuusuario/microservico-email.git
   cd microservico-email
   ```
2. Compile e execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```

A aplicação ficará disponível na porta `8080` por padrão.

## Testando a API
Utilize o Postman, cURL ou outra ferramenta para testar o endpoint de envio de e-mails.

Exemplo com `cURL`:
```sh
curl -X POST http://localhost:8080/sending-email \
     -H "Content-Type: application/json" \
     -d '{"ownerRef":"fabio", "emailFrom":"fabiot92@gmail.com", "emailTo":"fabiot92@gmail.com", "subject":"2ª Edição E-Book: Spring Boot Da API REST aos Microservices", "text":"Olá! Tudo bem?"}'
```

## Contribuições
Sinta-se à vontade para sugerir melhorias ou abrir um pull request!

## Licença
Este projeto é de livre uso para fins educacionais.

