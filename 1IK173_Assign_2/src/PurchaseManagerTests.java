import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class PurchaseManagerTests {
    public ArrayList<Category> categoryList;
    public ArrayList<Purchase> purchaseList;
    public PurchaseManager purchaseManager;

    @SuppressWarnings("deprecation")
    @Before
    public void setUp() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Rent"));
        categoryList.add(new Category(2, "Food"));
        categoryList.add(new Category(3, "Fun"));
        categoryList.add(new Category(4, "Drugs"));


        purchaseList = new ArrayList<>();
        purchaseList.add(new Purchase(1, new Date(2020, 1, 1), 5000, "Monthly Rent", 1));
        purchaseList.add(new Purchase(2, new Date(2020, 1, 2), 30, "Burger", 2));
        purchaseList.add(new Purchase(3, new Date(2020, 1, 2), 10, "Red Bull", 2));
        purchaseList.add(new Purchase(4, new Date(2020, 1, 3), 2000, "Groceries", 2));
        purchaseList.add(new Purchase(5, new Date(2020, 2, 15), 3500, "Skiing Trip", 3));
        purchaseList.add(new Purchase(6, new Date(2020, 3, 5), 50, "Movies", 3));

        purchaseManager = new PurchaseManager(categoryList, purchaseList);
    }

    @Test
    public void sumOfMonthTest() {
        float testsum = 5000 + 30 + 10 + 2000;
        float sum = purchaseManager.sumOfMonth(2020, 1);
        assertEquals(testsum, sum, 0.01);
    }
}
