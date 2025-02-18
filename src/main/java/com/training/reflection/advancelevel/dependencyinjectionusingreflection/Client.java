package com.training.reflection.advancelevel.dependencyinjectionusingreflection;

class Client {
    @Inject
    // Field to be injected with a Service instance
    private Service service;

    public void callService() {
        // Call the service method
        service.serve();
    }
}
