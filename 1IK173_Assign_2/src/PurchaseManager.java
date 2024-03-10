import java.util.ArrayList;

public class PurchaseManager implements IPurchaseManager {

    public final ArrayList<Category> categoryList;
    public final ArrayList<Purchase> purchaseList;

    public PurchaseManager(ArrayList<Category> categoryList, ArrayList<Purchase> purchaseList) {
        this.categoryList = categoryList;
        this.purchaseList = purchaseList;
    }

    @SuppressWarnings("deprecation")
    @Override
    public float sumOfMonth(int year, int month) {
        float sum = 0;
        for (int i = 0; i < purchaseList.size(); i++) {
            Purchase p = purchaseList.get(i);
            if (p.date.getYear() == year && p.date.getMonth() == month) {
                sum = sum + p.amount;
            }
        }
        return sum;
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
