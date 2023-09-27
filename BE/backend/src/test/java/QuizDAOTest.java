package test.java.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QuizDAOTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testInsertData() {
        try {
            QuizDAO.insertData();
        } catch (Exception e) {
            fail("InsertData method failed with exception: " + e.getMessage());
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
}
