package designPattern.builder2;

public class Product {

    // parameters..
    private String name;
    private int price;

    // optional parameter
    private boolean isSell;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isSellEnabled() {
        return isSell;
    }

    // argument -> ProductBuilder instance.
    // private를 선언해서 직접적인 생성 금지시킴. ProductBuilder를 통해서만 가능하게
    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.isSell = builder.isSell;
    }

    
    //중첩클래스
    public static class ProductBuilder {
        private String name;
        private int price;
        private boolean isSell;

        public ProductBuilder(String name, int price) {
            this.name = name;
            this.price = price;
        }

        //선택적 파라미터에 대한 setter
        public ProductBuilder setIsSellEnabled(boolean isSell) {
            this.isSell = isSell;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

    }//end ProductBuilder
}
