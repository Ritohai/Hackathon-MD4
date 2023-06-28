package ra.service;

import ra.model.Catalog;

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
//    public int getNewId(){
//        int max = 0;
//        for (Catalog ca : catalogs ) {
//            if(ca.getCatalogId(newId) > max ){
//                max = ca.getCatalogId(newId);
//            }
//        }
//        return max+1;
//    }
}
