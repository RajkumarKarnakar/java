package test.store;

import com.store.StoreItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<StoreItem> items = new ArrayList<>();
    public static void main(String[] args) {
        var store1 = new StoreItem.StoreItemBuilder("cookie",120d)
                .PackagingType("fresh packed")
                .Quantity(35)
                .LongDescription("these are freshly made cookies")
                .build();
        addToStore(store1);
        System.out.println(items);

    }
    public static void addToStore(StoreItem item) {

        items.add(item);
    }
    public static List<StoreItem> getItems() {
        return items;
    }
}
