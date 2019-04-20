package cn.rgq.basetest.core;


import cn.rgq.basetest.api.ATestDataFile;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.HashMap;

public class AExcelDataProvider  {

    public  static  String METHOD ="aTestData";
    protected   static  String BASEPATH ="testdata/";



    @DataProvider(name="aTestData")
    public Object[][] excelDataProvider(Method method){
        String methodName = method.getName();
        String fileName = method.getName();
        Class clazz = method.getDeclaringClass();
        if(clazz.isAnnotationPresent(ATestDataFile.class)) {
            ATestDataFile datafileAnnotation =(ATestDataFile) clazz.getAnnotation(ATestDataFile.class);
            fileName =datafileAnnotation.value();
        } else {
            fileName="";
        }
        if ("".equals(fileName)) {
            return new Object[][]{};
        }
        String filePath = BASEPATH + fileName;

        readExcelFile(filePath);










        return null;
    }

    private static void readExcelFile(String filePath) {

    }


}
