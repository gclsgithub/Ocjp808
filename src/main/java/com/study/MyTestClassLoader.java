package com.study;

import java.io.*;

/**
 * 学习classLoader
 */
public class MyTestClassLoader extends ClassLoader {

    private String classLoadername;

    private final String fileExtension = ".class";

    /**
     * 将系统类加载器当作该类加载器的父类加载器
     *
     * @param classLoadername
     */
    public MyTestClassLoader(String classLoadername) {

        /**
         * 制定父类加载器为系统类加载器
         */
        super();
        this.classLoadername = classLoadername;
    }

    /**
     * @param parent          制定双亲,用于多自定义classloader实现
     * @param classLoadername
     */
    public MyTestClassLoader(ClassLoader parent, String classLoadername) {

        /**
         * 显示制定类加载器的父类加载器
         */
        super(parent);
        this.classLoadername = classLoadername;
    }


    @Override
    public String toString() {
        return "[" + this.classLoadername + "]";
    }

    @Override
    public Class<?> findClass(String name) {
        byte[] data = loadClassData(name);
        return this.defineClass(name, data, 0, data.length - 1);
    }

    /**
     * 根据二进制文件名字,将对应的文件以输入输出流的形式返回一个二进制文件信息
     * @param binaryName
     * @return
     */
    public byte[] loadClassData(String binaryName) {

        InputStream is = null;

        byte[] data = null;

        ByteArrayOutputStream baos = null;
        try {
            //将classloader路径变成文件系统的路径
            this.classLoadername = this.classLoadername.replace(".", ",");

            is = new FileInputStream(new File(binaryName + this.fileExtension));

            baos = new ByteArrayOutputStream();

            int ch = 0;

            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    /**
     * 测试代码,创建实例
     *
     * @param classLoader
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public void test(ClassLoader classLoader) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = loadClass("com.study.Demo02");
        Demo02 demo02 = (Demo02) clazz.newInstance();
        System.out.println(demo02);
    }


    /**
     * 调用
     * @param args
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        MyTestClassLoader myTestClassLoader = new MyTestClassLoader("loader1");

        myTestClassLoader.test(myTestClassLoader);
    }
}
