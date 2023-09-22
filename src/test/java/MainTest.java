import org.binaracademy.Main;
import org.binaracademy.model.menu;
import org.binaracademy.model.pesanan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

        @Test  // pengujian unit untuk pesanan
        public void testGetTotal() {
            menu menu1 = new menu("Nasi Goreng", 15000);
            pesanan pesanan1 = new pesanan(menu1, 2);

            double total = pesanan1.getTotal();

            assertEquals(30000, total, 0.01); // Assert that the total is as expected
        }

        @Test
        public void tesTotalHarga () {
            Assertions.assertThrows(NullPointerException.class, () -> Main.getTotalHarga(null,null));
        }
}



