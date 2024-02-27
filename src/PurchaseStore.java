import java.util.ArrayList;
import java.util.Date;

public class PurchaseStore implements IPurchaseStore {
    public final ArrayList<Category> categoryList;
    public final ArrayList<Purchase> purchaseList;

    public PurchaseStore(ArrayList<Category> categoryList, ArrayList<Purchase> purchaseList) {
        this.categoryList = categoryList;
        this.purchaseList = purchaseList;
    }

    @Override
    public Purchase[] getPurchases(Date startDate, Date endDate) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getPurchases'");
    }

    @Override
    public Purchase[] getPurchasesByCategory(Date startDate, Date endDate, int catId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPurchasesByCategory'");
    }

    @Override
    public Category[] getAllCategories() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCategories'");
    }

}
