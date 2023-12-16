// Andre Williams LSP Final Exam

package org.howard.edu.lsp.exam.problem52;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Test the Strategy Pattern
        ShoppingCart cart1 = new ShoppingCart(new CreditCardPayment("1234-5678-9012-3456"));
        cart1.checkout(100.0);

        ShoppingCart cart2 = new ShoppingCart(new PayPalPayment("user@example.com"));
        cart2.checkout(50.0);

        ShoppingCart cart3 = new ShoppingCart(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
        cart3.checkout(75.0);
    }
}
