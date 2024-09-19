package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplication {

    private MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String receiver) {
        if (checkerReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }
    private boolean checkerReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}

