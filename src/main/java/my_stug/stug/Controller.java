package my_stug.stug;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {
    @PostMapping("/dadada")
    public ResponseEntity<?> handlePostRequest(@RequestBody Persona request) {
        String message = "Nice to meet you, " + request.getName() + ". The total amount of your account is " + request.getAccount() + " Uzbek Sym.";
        Map<String, Object> response = new HashMap<>();
        response.put("message", message);
        return ResponseEntity.ok(response);
    }

}
