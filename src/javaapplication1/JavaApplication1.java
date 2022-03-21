package javaapplication1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ulysses fedrick
 * <p>
 * racism simulator
 */
public class JavaApplication1 {


    private static final ArrayList<java.io.Serializable> names = new ArrayList<>();
    private static int nameTotal = 0;
    private static int dateTotal = 0;
    private static int shoeTotal = 0;
    private static int hairTotal = 0;
    private static int eyeTotal = 0;
    private static boolean isCallum = false;
    private static boolean isSebbie = false;
    private static final File myFile = new File("people.txt");


    public static void main(String[] args) {

        nameCool();
        birthCool();
        shoeCool();
        hairCool();
        eyeCool();

        if (isSebbie) {
            nameTotal = 0;
            dateTotal = 0;
            shoeTotal = 0;
            hairTotal = 0;
            eyeTotal = 0;
        }
        int combinedTotal = nameTotal + dateTotal + shoeTotal + hairTotal + eyeTotal;
        names.add("your total coolness is: " + combinedTotal);
        writeFile();


        System.out.println("your name coolness is: " + nameTotal + "  your birthday coolness is: " + dateTotal + " your foot coolness is: " + shoeTotal + " your hair coolness is " + hairTotal + " your eye coolness is " + eyeTotal + " so your combined coolness is: " + (combinedTotal));
        if (combinedTotal == 19) {
            System.out.println("your as cool as Hitler!");
        }
        if (combinedTotal == 23) {
            System.out.println("your as cool as Gandhi!");
        }
        if (combinedTotal == 21) {
            System.out.println("your as cool as Stalin!");
        }
        if (combinedTotal == 28) {
            System.out.println("your as cool as David Bowie!");
        }
        if (combinedTotal == 26) {
            System.out.println("your as cool as Boris Johnson!");
        }
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void nameCool() {
        String name = getInput("name");
        names.add("name: " + name + " : ");
        char now;
        int i;
        for (i = 0; i < name.length(); i++) {
            now = name.charAt(i);
            if (now == 'x' || now == 'z' || now == 's') {
                nameTotal = nameTotal + 10;
            }
            if (now == 'j' || now == 'v' || now == 'u') {
                nameTotal = nameTotal + 9;
            }
            if (now == 'y' || now == 'k' || now == 'l') {
                nameTotal = nameTotal + 8;
            }
            if (now == 'r' || now == 'f' || now == 'e') {
                nameTotal = nameTotal + 7;
            }
            if (now == 't' || now == 'g' || now == 'h') {
                nameTotal = nameTotal + 6;
            }
            if (now == 'a' || now == 'o' || now == 'd') {
                nameTotal = nameTotal + 5;
            }
            if (now == 'p' || now == 'i') {
                nameTotal = nameTotal + 4;
            }
            if (now == 'n' || now == 'q') {
                nameTotal = nameTotal + 3;
            }
            if (now == 'm' || now == 'c') {
                nameTotal = nameTotal + 2;
            } else {
                nameTotal = nameTotal + 1;
            }


        }
        nameTotal = nameTotal / name.length();
        names.add(nameTotal);
        if (name.equals("sebbie")) {
            isSebbie = true;
        }
        if (name.equals("callum")) {
            isCallum = true;
        }
    }

    public static void birthCool() {
        String birthday = getInput("birthday (dd/mm e.g 02/11)");
        names.add(" birthday: " + birthday + ": ");
        if (birthday.equals("01/04") || birthday.equals("01/06") || birthday.equals("05/09") || birthday.equals("05/11") || birthday.equals("04/01") || birthday.equals("31/010") || birthday.equals("02/11") || birthday.equals("06/02") || birthday.equals("25/01")) {
            names.add(dateTotal = 10);
            dateTotal = 10;
        } else {
            names.add(dateTotal = 0);
            dateTotal = 0;
        }
    }

    public static void shoeCool() {
        int shoeSize = getInt("shoe size");
        names.add(" shoe size: " + shoeSize + ": ");
        if (shoeSize == 8) {
            shoeTotal = 10;
            names.add(shoeTotal);
            return;
        }
        if (shoeSize == 7 || shoeSize == 9) {
            shoeTotal = 9;
            names.add(shoeTotal);
            return;
        }
        if (shoeSize == 6 || shoeSize == 10) {
            shoeTotal = 8;
            names.add(shoeTotal);
            return;
        }
        if (shoeSize == 5 || shoeSize == 11) {
            shoeTotal = 7;
            names.add(shoeTotal);
            return;
        }
        if (shoeSize == 4 || shoeSize == 12) {
            shoeTotal = 6;
            names.add(shoeTotal);
            return;
        }
        if (shoeSize == 3 || shoeSize == 13) {
            shoeTotal = 5;

        }
        names.add(shoeTotal);

    }

    public static void hairCool() {
        int lengthV = 0;
        int colourV = 0;
        int styleV = 0;
        int length = getInt("hair length | (cm)");
        String colour = getInput("hair colour | options: black, brown, auburn, blonde, dyed, ginger, white, grey.");
        String style = getInput("hair style | options : bald, buzz cut, under cut, comb over, mohawk, bowl, pony tail, braid, bob, bun, N/A");

        if (style.equals("bald")) {
            length = 0;
            colour = "white";
        }
        if (length == 0) {
            lengthV = lengthV + 15;
        }
        if ((length <= 5 && length >= 1) || (length <= 50 && length >= 25)) {
            lengthV = lengthV + 10;

        }
        if ((length <= 10 && length >= 6) || (length <= 100 && length >= 50)) {
            lengthV = lengthV + 8;

        }
        if ((length <= 15 && length >= 11) || (length <= 24 && length >= 20)) {
            lengthV = lengthV + 6;

        }
        if ((length <= 19 && length >= 16)) {
            lengthV = lengthV + 4;

        }
        if (colour.equals("white") || colour.equals("auburn")) {
            colourV = 10;

        }
        if (colour.equals("grey") || colour.equals("black") || colour.equals("blonde") || colour.equals("brown")) {
            colourV = 8;

        }
        if (colour.equals("dyed")) {
            colourV = 7;

        }
        if (colour.equals("ginger")) {
            colourV = -5;

        }
        if (style.equals("bald")) {
            styleV = 1;
        }
        if (style.equals("buzz cut") || style.equals("comb over")) {
            styleV = 4;
        }
        if (style.equals("braid") || style.equals("mohawk") || style.equals("bun") || style.equals("bob")) {
            styleV = 3;
        } else {
            styleV = styleV + 3;
        }
        names.add(" hair length: " + length + ": ");
        names.add(lengthV);
        names.add(" hair style: " + style + ": ");
        names.add(styleV);
        names.add(" hair colour: " + colour + ": ");
        names.add(colourV);
        hairTotal = (lengthV + colourV) / styleV;
        names.add(" hair total: " + hairTotal);
        if (isCallum && colour.equals("blonde")) {
            hairTotal = 0;
        }


    }

    public static void eyeCool() {
        boolean isHeterochromic = false;
        String colour = getInput("eye colour | (hex value)");
        String hetero = getInput("are you heterochromic?");
        if (hetero.equals("yes")) {
            isHeterochromic = true;
        }
        names.add("eye colour: " + colour + ": ");
        char now;
        int i;
        for (i = 0; i < colour.length(); i++) {
            now = colour.charAt(i);
            if (now == 'x' || now == 'z' || now == 's') {
                eyeTotal = eyeTotal + 10;
            }
            if (now == 'j' || now == 'v' || now == 'u' || now == '9') {
                eyeTotal = eyeTotal + 9;
            }
            if (now == 'y' || now == 'k' || now == 'l' || now == '8') {
                eyeTotal = eyeTotal + 8;
            }
            if (now == 'r' || now == 'f' || now == 'e' || now == '7') {
                eyeTotal = eyeTotal + 7;
            }
            if (now == 't' || now == 'g' || now == 'h' || now == '6') {
                eyeTotal = eyeTotal + 6;
            }
            if (now == 'a' || now == 'o' || now == 'd' || now == '5') {
                eyeTotal = eyeTotal + 5;
            }
            if (now == 'p' || now == 'i' || now == '4') {
                eyeTotal = eyeTotal + 4;
            }
            if (now == 'n' || now == 'q' || now == '3') {
                eyeTotal = eyeTotal + 3;
            }
            if (now == 'm' || now == 'c' || now == '2') {
                eyeTotal = eyeTotal + 2;
            } else {
                eyeTotal = eyeTotal + 1;
            }

        }
        if (isHeterochromic) {
            eyeTotal = eyeTotal * 2;
        }
        names.add(eyeTotal / colour.length());
        eyeTotal = eyeTotal / colour.length();

    }

    public static void writeFile() {
        try {
            FileWriter myWriter = new FileWriter(myFile.getName(), true);
            myWriter.write(String.valueOf(names));
            myWriter.close();
            System.out.println("added to file");


        } catch (IOException e) {
            System.out.println("did not add to file");
            e.printStackTrace();
        }
    }
}
