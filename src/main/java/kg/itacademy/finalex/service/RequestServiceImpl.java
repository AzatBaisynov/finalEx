package kg.itacademy.finalex.service;

import kg.itacademy.finalex.entity.Request;
import kg.itacademy.finalex.repo.RequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private RequestRepo repo;

    @Override
    public Integer countAll() {
        List<Request> reqs = repo.findAll();
        Integer count = 0;
        for (int i = 0; i < reqs.size(); i++){
            count = count + 1;
        }
        return count;
    }

    @Override
    public Request create(Request req) {
        return repo.save(req);
    }

    @Override
    public List<Request> getAll() {
        return repo.findAll();
    }
}
