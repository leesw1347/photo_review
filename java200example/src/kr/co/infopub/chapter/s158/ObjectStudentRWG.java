package kr.co.infopub.chapter.s158;

import java.io.*;
import java.util.Vector;

// 제네릭스 타입 클래스
public class ObjectStudentRWG<T> {
    public int write(String fname, Vector<T> v) {
        int objectNumber = 0;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fname);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectNumber = v.size(); // Vector 객체의 개수를 저장한다
            objectOutputStream.writeInt(objectNumber);
            System.out.println(objectNumber + "개의 Data가 입력됨");

            for (int i = 0; i < objectNumber; i++) {
                objectOutputStream.writeInt(i);
                objectOutputStream.writeObject(v.get(i));
                objectOutputStream.flush();
                System.out.println(i + "번째의 Data가 입력됨");
            }

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objectNumber;
    }

    public void read(String fname) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fname);
            if (fileInputStream != null) {
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                int objectNumber = objectInputStream.readInt();
                System.out.println(objectNumber + "개의 Data를 읽음");
                for (int i = 0; i < objectNumber; i++) {
                    try {
                        System.out.print(objectInputStream.readInt() + "번째\t");
                        System.out.println(objectInputStream.readObject());
                    } catch (ClassNotFoundException e) {
                        System.out.println("잘못된 타입입니다");
                        e.printStackTrace();
                    }
                }

                objectInputStream.close();
                fileInputStream.close();
            }

        } catch (FileNotFoundException e) {
            System.out.println("잘못된 파일 이름을 입력했습니다");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
