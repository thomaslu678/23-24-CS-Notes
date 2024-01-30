package org.canyonsdistrict.hhs.chapter11;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDialogApp {

    public static void main(String[] args) throws FileNotFoundException {

        JFileChooser chooser = new JFileChooser();
        Scanner in = null;
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            var file = chooser.getSelectedFile();
            in = new Scanner(file);

        }

    }

}
