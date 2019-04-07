package com.gupao.nxia.pattern.prototype.deep;

import java.io.*;

public class SunWuKong implements Money {

    private JinGuBang jinGuBang;



    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }




    @Override
    public Money clone(Money money){
        ObjectInputStream ois = null;
        ByteArrayInputStream bis = null;
        ByteArrayOutputStream  bos = null;
        ObjectOutputStream oos = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

             bis = new ByteArrayInputStream(bos.toByteArray());
             ois = new ObjectInputStream(bis);
            SunWuKong sunWuKong = (SunWuKong) ois.readObject();
            sunWuKong.jinGuBang = new JinGuBang();
            return sunWuKong;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  null;
    }
}
