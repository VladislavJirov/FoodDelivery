import com.epam.vzhirov.fooddelivery.dao.DaoFactory;
import com.epam.vzhirov.fooddelivery.dao.jdbcDao.JdbcDaoFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class DaoFactoryTest {

    @Test
    public void testGetInstance() throws Exception {

        DaoFactory daoFactory = DaoFactory.getInstance(DaoFactory.Type.JDBC);
        assertTrue(daoFactory instanceof JdbcDaoFactory);

    }
}