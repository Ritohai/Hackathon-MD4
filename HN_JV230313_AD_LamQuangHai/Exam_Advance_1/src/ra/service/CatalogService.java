package Exam_Advance_1.src.ra.service;

import Exam_Advance_1.src.ra.model.Catalog;

import java.util.List;

public class CatalogService implements IService{
    private List<Catalog> catalogs;


    @Override
    public List<Catalog> getALl() {
        return catalogs;
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
