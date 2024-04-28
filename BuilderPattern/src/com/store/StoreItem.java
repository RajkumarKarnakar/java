package com.store;
public class StoreItem {
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer quantity;
    private final String packagingType;

    private StoreItem(StoreItemBuilder storeItemBuilder) {
        this.name = storeItemBuilder.name;
        this.price = storeItemBuilder.price;
        this.shortDescription = storeItemBuilder.shortDescription;
        this.longDescription = storeItemBuilder.longDescription;
        this.quantity = storeItemBuilder.quantity;
        this.packagingType = storeItemBuilder.packagingType;
        if (name == null || price == null )
            throw new IllegalArgumentException("Name and price are required");
        }

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", quantity=" + quantity +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }
    public static class StoreItemBuilder {
        private final String name;
        private final Double price;
        private String shortDescription;
        private String longDescription;
        private Integer quantity;
        private String packagingType;

        public StoreItemBuilder (String name, Double price){
            this.name = name;
            this.price = price;
        }

        public StoreItemBuilder ShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return this;
        }
        public StoreItemBuilder LongDescription(String longDescription) {
            this.longDescription = longDescription;
            return this;
        }
        public StoreItemBuilder Quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public StoreItemBuilder PackagingType(String packagingType) {
            this.packagingType = packagingType;
            return this;
        }
        public StoreItem build() {
            return new StoreItem(this);
        }
    }
}

































