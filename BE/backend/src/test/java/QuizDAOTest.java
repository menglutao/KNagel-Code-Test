package test.java.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import main.java.dao.QuizDAO;

public class QuizDAOTest {

    @Before
    public void setup() {
        try {
            QuizDAO.DatabaseInitializer();
            QuizDAO.insertData();
        } catch (Exception e) {
            fail("Setup method failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testUpdateData() {
        try {
            QuizDAO.updateData();
        } catch (Exception e) {
            fail("UpdateData method failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testDeleteData() {
        try {
            QuizDAO.deleteData();
        } catch (Exception e) {
            fail("DeleteData method failed with exception: " + e.getMessage());
        }
    }

    @Test
    public void testSearchQuestionsByTopic() {
        try {
            assertNotNull(QuizDAO.searchQuestionsByTopic());
        } catch (Exception e) {
            fail("SearchQuestionsByTopic method failed with exception: " + e.getMessage());
        }
    }

    @After
    public void cleanData() {
        try {
            QuizDAO.deleteAllData();
        } catch (Exception e) {
            fail("Setup method failed with exception: " + e.getMessage());
        }
    }
}
