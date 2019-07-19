package com.sid;

import javax.swing.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hasher extends JFrame {
    private JPanel HashLable;
    private JLabel InputValue;
    private JTextField Input;
    private JButton Close;
    private JButton hash;
    private JTextArea Output;

    public Hasher(){
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
        add(HashLable);
        setTitle("Generate MD5");
        setSize(500, 450);

        hash.addActionListener((e) -> {
                String in = Input.getText();
                if(in.length() > 0 ) {
                    try {
                        String hashOut = GenerateHash(in);
                        Output.setText(hashOut);

                    } catch (NoSuchAlgorithmException e1) {
                        e1.printStackTrace();
                    }
                }
            });

        Close.addActionListener( (e) ->  this.dispose());
    }

    private String GenerateHash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(input.getBytes());
        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }



}
