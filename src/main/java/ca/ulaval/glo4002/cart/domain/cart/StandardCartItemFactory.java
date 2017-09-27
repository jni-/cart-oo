package ca.ulaval.glo4002.cart.domain.cart;

import ca.ulaval.glo4002.cart.domain.shop.ShopItem;

public class StandardCartItemFactory implements CartItemFactory {
    @Override
    public CartItem create(ShopItem shopItem) {
        return new CartItem(shopItem.getName(), 1);
    }
}
