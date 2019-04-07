package com.gupao.nxia.pattern.proxy.tools;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class NXiaClassLoader extends  ClassLoader {

    private File classPathFile;

    public NXiaClassLoader(){
        String classPath = NXiaClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    protected Class<?> getClass(String name) throws ClassNotFoundException {
        String className = NXiaClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replaceAll("\\.", "/") + ".class");
            if (classFile.exists()) {
                try(FileInputStream in = new FileInputStream(classFile);
                    ByteArrayOutputStream out = new ByteArrayOutputStream()){
                    byte [] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1){
                        out.write(buff,0,len);
                    }
                    return defineClass(className,out.toByteArray(),0,out.size());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
