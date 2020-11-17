package edu.mve.prj.service.item.impls;

import edu.mve.prj.repository.ItemRepository;
import edu.mve.prj.data.FakeData;
import edu.mve.prj.model.Item;
import edu.mve.prj.service.item.interfaces.ICrudItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@Service
public class ICrudItemMongoImpl implements ICrudItem {
    @Override
    public Item create(Item item) {
        return null;
    }

    @Override
    public Item get(String id) {
        return null;
    }

    @Override
    public Item update(Item item) {
        return null;
    }

    @Override
    public Item delete(String id) {
        return null;
    }

    @Override
    public List<Item> getAll() {
        return null;
    }

    @Autowired
    FakeData trash;

    @Autowired
    ItemRepository repository;

    private List<Item> list = new ArrayList<>();

    @PostConstruct
    void init() {
        repository.deleteAll();
        list = trash.getItems();
        list.size();
        repository.saveAll(list);
    }
}