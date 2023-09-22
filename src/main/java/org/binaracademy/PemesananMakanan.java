package org.binaracademy;

import org.binaracademy.model.menu;
import org.binaracademy.model.pesanan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface PemesananMakanan {
    boolean isMenuPesanan(Scanner scanner, boolean menuPesanan, List<pesanan> daftarPesanan, StringBuilder struk, ArrayList<menu> Menu1);
    void pesanDanBayar(List<pesanan> daftarPesanan, StringBuilder struk, Scanner scanner) throws NullPointerException;

}
