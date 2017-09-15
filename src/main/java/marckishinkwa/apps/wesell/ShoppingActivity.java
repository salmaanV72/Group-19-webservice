package marckishinkwa.apps.wesell;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import marckishinkwa.apps.wesell.adapters.ShopRecyclerViewAdapter;
import marckishinkwa.apps.wesell.entities.ProductObject;
import marckishinkwa.apps.wesell.helpers.SpacesItemDecoration;
import java.util.ArrayList;
import java.util.List;


public class ShoppingActivity extends AppCompatActivity {

    private static final String TAG = ShoppingActivity.class.getSimpleName();
    private RecyclerView shoppingRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        shoppingRecyclerView = (RecyclerView)findViewById(R.id.product_list);
        GridLayoutManager mGrid = new GridLayoutManager(ShoppingActivity.this, 2);
        shoppingRecyclerView.setLayoutManager(mGrid);
        shoppingRecyclerView.setHasFixedSize(true);
        shoppingRecyclerView.addItemDecoration(new SpacesItemDecoration(2, 12, false));
        ShopRecyclerViewAdapter shopAdapter = new ShopRecyclerViewAdapter(ShoppingActivity.this, getAllProductsOnSale());
        shoppingRecyclerView.setAdapter(shopAdapter);
    }
    private List<ProductObject> getAllProductsOnSale(){
        List<ProductObject> products = new ArrayList<ProductObject>();
        products.add(new ProductObject(1, "Sleek Black Top", R.drawable.bomberjacket, "Beautiful sleek black top for casual outfit and evening walk", 20, 38, "Black"));
        products.add(new ProductObject(1, "Flare Black Gown", R.drawable.casualjersey, "Beautiful sleek black top for casual outfit and evening walk", 20, 38, "Black"));
        products.add(new ProductObject(1, "Flare White Blouse", R.drawable.casualsweater, "Beautiful sleek black top for casual outfit and evening walk", 20, 38, "White"));
        products.add(new ProductObject(1, "Blue Swed Gown", R.drawable.floralbomber, "Beautiful sleek black top for casual outfit and evening walk", 20, 38, "Dark Blue"));
        products.add(new ProductObject(1, "Spotted Gown", R.drawable.hiphopbomber, "Beautiful sleek black top for casual outfit and evening walk", 20, 38, "Spotted Green"));
        products.add(new ProductObject(1, "Flare Wax Gown", R.drawable.mencasual, "Beautiful sleek black top for casual outfit and evening walk", 20, 38, "Multi-color"));
        return products;
    }

}
