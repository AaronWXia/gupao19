package com.gupao.nxia.pattern.proxy.tools;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;

public class Proxy {

    private  NXInvocationHandler handler;

    public Proxy(NXInvocationHandler handler){
        this.handler = handler;
    }


    public static Object newProxyInstance(NXiaClassLoader classLoader, Class<?>[] interfaces,NXInvocationHandler handler){
        //生成源码File
        File file = generateSrc(interfaces);

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager =
                compiler.getStandardFileManager(null, null, null);
        try  {
            compiler.getTask(
                    null,
                    manager,
                    null,
                    null,
                    null,
                    manager.getJavaFileObjects(file)).call();
            //f.getName();
            Class clz = classLoader.getClass("$Proxy0");
            Constructor c = clz.getConstructor(InvocationHandler.class);
            return c.newInstance(handler);
        } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (NoSuchMethodException e) {
        e.printStackTrace();
    } catch (IllegalAccessException e) {
        e.printStackTrace();
    } catch (InstantiationException e) {
        e.printStackTrace();
    } catch (InvocationTargetException e) {
        e.printStackTrace();
    } finally {
        //f.delete();
    }
        return null;
    }

    private static File generateSrc(Class<?>[] interfaces) {
         StringBuffer  stringBuffer = new StringBuffer();
         stringBuffer.append("package com.gupao.nxia.pattern.proxy.tools;"+"\n");
         stringBuffer.append("import com.gupao.nxia.pattern.proxy.Person;\n" +
                 "import com.gupao.nxia.pattern.proxy.Rule;\n" +
                 "import java.lang.reflect.*;\n");
         stringBuffer.append("public final class $Proxy0 extends Proxy");
         for(int i =0;i<interfaces.length;i++){
             stringBuffer.append(" implements "+interfaces[0].getName()+",");
         }
         stringBuffer.substring(0,stringBuffer.length()-1);
         stringBuffer.append("{\n");
         stringBuffer.append("  public $Proxy0(NXInvocationHandler invocationhandler)\n" +
                 "    {\n" +
                 "        super(invocationhandler);\n" +
                 "    }\n");
         //循环迭代接口中所有方法
             for(int j=0;j<interfaces[0].getMethods().length;j++){
                 stringBuffer.append("public "+interfaces[0].getMethods()[j].getReturnType().getName()+" "+interfaces[0].getMethods()[j].getName()+" (Rule rule) {");
                         stringBuffer.append("Method m = "+interfaces[0].getName()+".class.getMethod(\""+interfaces[0].getMethods()[j].getName()+".new Class[]{};\")\n");
                 stringBuffer.append("}");
             }
        stringBuffer.append("}\n");


        FileWriter fileWriter = null;
        String src = "I:"+File.separator+"gupao19"+
                File.separator+"homework"+File.separator+"pattern"+
                File.separator+"src"+
                File.separator+"main"+File.separator+"java"+File.separator+"com"
                +File.separator+"gupao"+File.separator
                +"nxia"+File.separator+"pattern"+File.separator+"proxy"+File.separator+"tools"
                +File.separator+"$Proxy0.java";
         try{
              fileWriter = new FileWriter(new File(src
                    ));
             fileWriter.write(stringBuffer.toString());
             fileWriter.close();
         }catch (Exception e){
             e.printStackTrace();
         }
         File file =  new File(src);
         return file;
    }
}
