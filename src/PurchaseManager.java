import java.util.ArrayList;

public class PurchaseManager implements IPurchaseManager {

    public final ArrayList<Category> categoryList;
    public final ArrayList<Purchase> purchaseList;

    public PurchaseManager(ArrayList<Category> categoryList, ArrayList<Purchase> purchaseList) {
        this.categoryList = categoryList;
        this.purchaseList = purchaseList;
    }

    @Override
    public float sumOfMonth(int year, int month) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sumOfMonth'");
    }

    @Override
    public float[] monthlyAverage(int year) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'monthlyAverage'");
    }

    @Override
    public float[] yearlyAveragePerCategory(int year) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'yearlyAveragePerCategory'");
    }
    
}
