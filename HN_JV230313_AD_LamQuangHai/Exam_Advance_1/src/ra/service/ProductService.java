package Exam_Advance_1.src.ra.service;

import Exam_Advance_1.src.ra.model.Product;

import java.util.List;

public class ProductService implements IService{
    private List<Product> products;
    @Override
    public List getALl() {
        return products;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void findById(Object o) {

    }

    @Override
    public void delete(Object o) {

    }
}
