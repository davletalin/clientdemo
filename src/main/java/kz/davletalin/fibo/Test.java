package kz.davletalin.fibo;

import kz.davletalin.fibo.entity.Request;
import kz.davletalin.fibo.entity.Status;
import kz.davletalin.fibo.service.RequestService;

import java.time.LocalDateTime;

public class Test {
    public static void main(String[] args) {
        RequestService requestService=new RequestService();
        //Request request = new Request(LocalDateTime.now(),11,"89", Status.SUCCESS);
        //requestService.saveRequest(request);
        requestService.deleteRequest(requestService.getRequest(4));
        requestService.deleteRequest(requestService.getRequest(5));
    }
}
