package com.project.restflame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/api")
public class PHPController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/phpdata")
    public ResponseEntity<String> getDataFromPHP() {
        String phpUrl = "http://localhost/01_restflame/index.php"; // Cambia esta URL Prueba la ruta de tu script PHP

        // Realiza la petición al script PHP y recibe la respuesta
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);

        // Retorna la respuesta al cliente
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/inicio")
    public ResponseEntity<String> getInicioPage() {
        String phpUrl = "http://localhost/01_restflame/inicio.php"; // Cambia a la ruta de tu archivo PHP de contacto
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/carta")
    public ResponseEntity<String> getCartaPage() {
        String phpUrl = "http://localhost/01_restflame/carta.php"; // Cambia a la ruta de tu archivo PHP de contacto
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/evento")
    public ResponseEntity<String> getEventoPage() {
        String phpUrl = "http://localhost/01_restflame/evento.php"; // Cambia a la ruta de tu archivo PHP de contacto
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/contacto")
    public ResponseEntity<String> getContactoPage() {
        String phpUrl = "http://localhost/01_restflame/contacto.php"; // Cambia a la ruta de tu archivo PHP de contacto
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/reserva")
    public ResponseEntity<String> getReservaPage() {
        String phpUrl = "http://localhost/01_restflame/reserva.php"; // Cambia a la ruta de tu archivo PHP de contacto
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/pedido")
    public ResponseEntity<String> getPedidoPage() {
        String phpUrl = "http://localhost/01_restflame/pedido.php"; // Cambia a la ruta de tu archivo PHP de contacto
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }

    @GetMapping("/registropedido")
    public ResponseEntity<String> getRegistropedidoPage() {
        String phpUrl = "http://localhost/01_restflame/registropedido.php"; // Cambia a la ruta de tu archivo PHP de contacto
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }
    /*@GetMapping("/almacenarpedido")
    public ResponseEntity<String> getAlmacenarpedidoPage() {
        String phpUrl = "http://localhost/01_restflame/almacenarpedido.php"; // Cambia a la ruta de tu archivo PHP de contacto
        ResponseEntity<String> response = restTemplate.getForEntity(phpUrl, String.class);
        return ResponseEntity.ok(response.getBody());
    }*/


}
