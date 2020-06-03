package kz.davletalin.fibo;

import kz.davletalin.fibo.entity.Request;
import kz.davletalin.fibo.entity.Status;
import kz.davletalin.fibo.hibernate.HibernateSessionFactoryUtil;
import kz.davletalin.fibo.service.RequestService;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.time.LocalDateTime;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        RequestService requestService = new RequestService();
        Request request = new Request(LocalDateTime.now(), 100, "1100101", Status.SUCCESS);
        Request request2 = new Request(LocalDateTime.now(), 200, "2100101", Status.SUCCESS);
        Request request3 = new Request(LocalDateTime.now(), 300, "3100101", Status.SUCCESS);
        requestService.saveRequest(request);
        requestService.saveRequest(request2);
        requestService.saveRequest(request3);
        Request request11 = new Request(LocalDateTime.now(), 400, "1100101", Status.SUCCESS);
        Request request21 = new Request(LocalDateTime.now(), 500, "2100101", Status.SUCCESS);
        Request request31 = new Request(LocalDateTime.now(), 600, "3100101", Status.SUCCESS);
        requestService.saveRequest(request11);
        requestService.saveRequest(request21);
        requestService.saveRequest(request31);
        Request request12 = new Request(LocalDateTime.now(), 700, "1100101", Status.SUCCESS);
        Request request22 = new Request(LocalDateTime.now(), 800, "2100101", Status.SUCCESS);
        Request request32 = new Request(LocalDateTime.now(), 900, "3100101", Status.SUCCESS);
        requestService.saveRequest(request12);
        requestService.saveRequest(request22);
        requestService.saveRequest(request32);

//        requestService.deleteRequest(requestService.getRequest(4));
    }
}
