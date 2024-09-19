package com.kodilla.spring.basic.spring_dependency_injection;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
public class SimpleApplication {

    @Resource(name = "skypeMessageService")
    private MessageService messageService;

    public String processMessage(String message, String receiver) {
        if (checkerReceiver(receiver)) {
            return this.messageService.send(message, receiver);
        }
        return null;
    }

    private boolean checkerReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }

//    @Autowired
//    public void setMessageService(SkypeMessageService messageService) {
//        this.messageService = messageService;
//    }
}


// Beana możemy wstrzyknąć tylko do innego beana
// Adnotacja @Autowired mówi: "znajdź beana o typie określonym poniżej i przypisz go do wskazanej zmiennej".