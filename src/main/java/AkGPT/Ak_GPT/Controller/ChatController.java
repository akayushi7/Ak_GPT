package AkGPT.Ak_GPT.Controller;



import org.springframework.web.bind.annotation.*;


@RestController
public class ChatController {

    @GetMapping("/api/chat")
    public String chat(@RequestParam String message) {
        // Mock response for simplicity
        return "Response from ChatGPT: " + message;
    }
}