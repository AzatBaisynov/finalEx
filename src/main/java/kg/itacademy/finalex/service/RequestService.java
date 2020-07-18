package kg.itacademy.finalex.service;

import kg.itacademy.finalex.entity.Request;

import java.util.List;

public interface RequestService {
    Integer countAll();
    Request create(Request req);
    List<Request> getAll();
}
