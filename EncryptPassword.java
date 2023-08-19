// Encryption and Decryption in Java

import java.security.MessageDigest;
import java.util.Base64;
import java.util.Arrays;
import java.io.*;
import java.util.*;

class EncryptPassword{
    public static void main(String[] args) {
        // String text = "hello"; //69609650
        // System.out.println(text.hashCode());
        try{
            String msg = "asdf";
            Scanner sc = new Scanner(System.in);
            // msg = sc.nextLine();

        
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(msg.getBytes());

            byte[] digest = md.digest();
            // System.out.println("Digest: "+digest);

            // System.out.println("-->"+Arrays.toString(digest));

            StringBuffer hexString = new StringBuffer();

            hexString.append(Integer.toHexString(0xFF & digest[0]));

            // for(int i = 0; i<digest.length; i++){
            //     hexString.append(Integer.toHexString(0xFF & digest[i]));

            // }

            System.out.println("Hex Format: " + hexString.toString());
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }

    }
}