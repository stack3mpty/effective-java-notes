package com.stack3mpty.effective.java.item02;

/**
 * @author stack3mpty
 * @date 2025/8/24 21:36
 */
public class NyPizza extends Pizza{

    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        public Builder(Size size) {
            this.size = size;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }


        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }

    public static void main(String[] args) {
        NyPizza pizza1 = new NyPizza.Builder(NyPizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.ONION)
                .build();

        System.out.println(pizza1);

        NyPizza pizza2 = new NyPizza(
                new NyPizza.Builder(NyPizza.Size.LARGE)
                        .addTopping(Pizza.Topping.SAUSAGE)
        );

        System.out.println(pizza2);
    }
}
