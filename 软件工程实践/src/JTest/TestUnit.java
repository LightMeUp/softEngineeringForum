package JTest;

import BaseDao.BaseDao;
import Bean.StudentEntity;
import Bean.UserEntity;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

/**
 * Created by Feng on 3/30/16.
 */
public class TestUnit {
    public TestUnit(){

    }

    @Test
    public void TestAdd()
    {
        BaseDao<UserEntity> studentEntityBaseDao = new BaseDao<UserEntity>();
        try {
            UserEntity userEntity = new UserEntity();
            userEntity.setId(12455);
            userEntity.setPassword("3234234");
            studentEntityBaseDao.addEntity(userEntity);
            System.out.printf("completed");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
