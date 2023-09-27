package main.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import io.github.cdimascio.dotenv.Dotenv;

public class QuizDAO {
    private static final Dotenv dotenv;
    private static final String dbUrl;
    private static final String user;
    private static final String password;

    static {
        dotenv = Dotenv.load();
        dbUrl = dotenv.get("dbUrl");
        user = dotenv.get("user");
        password = dotenv.get("password");
    }

    public class QuestionResult {
        public int questionId;
        public String topic;
        public String difficultyRank;
        public String questionContent;
        public String responseText;
        public boolean isAnswerCorrect;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Starting...");

            insertData();
            // 可以添加更多的方法调用以进行测试，例如:
            // updateData();
            // deleteData();
            // List<QuestionResult> results = SearchQuestionByTopic();
            // printResults(results); // 你可能需要定义这个printResults方法来显示结果

            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static Connection getDatabaseConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, user, password);
    }

    public static void insertData() {

        try (Connection conn = getDatabaseConnection(); Statement stmt = conn.createStatement()) {
            String insert_table_quiz = "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('Math','1','Rise stock response hit give expert much.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('Math','2','Whole heart so shoulder drive order network also agent vote spend.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('History','6','Manager down rise who like last.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('Literature','6','Common beyond chair kind fact home shoulder.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('Music','5','Necessary total key against ball company face magazine guess lot.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('Sports','2','Staff lot and water site month employee single something management.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('History','4','Think site writer first kind among forget top onto choose official project.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('Music','1','Decide across American away prevent step challenge relate.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('Sports','2','Show responsibility hundred month more about evidence clearly since generation.');\n"
                    + //
                    "INSERT INTO quiz (topic, difficulty_rank, question_content) values ('Sports','5','Important these think my stuff opportunity worker.');";
            String insert_table_responses = "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('1', 'Case through.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('1', 'Certainly land.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('1', 'Message include.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('2', 'Exist.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('2', 'Leave eight nice.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('2', 'Miss say.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('3', 'Theory would arm.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('3', 'He blood often.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('3', 'Admit rather interest.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('4', 'Admit performance tend.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('4', 'Focus fear.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('4', 'Activity purpose star blood.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('5', 'Fast painting.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('5', 'Success reach once.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('5', 'During face under form.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('6', 'Than as agreement.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('6', 'Weight cut enough.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('6', 'Energy five training magazine.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('7', 'Run hope police.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('7', 'Technology model.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('7', 'Past nothing.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('8', 'Dinner politics bill.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('8', 'Require.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('8', 'Speech force.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('9', 'Test very song.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('9', 'Play eat dark.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('9', 'Into style lawyer.', false);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('10', 'Discover however end.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('10', 'Themselves hot.', true);\n"
                    + //
                    "INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('10', 'Red scene.', false);";

            // split query and inset one by one
            String[] insertQuizQueries = insert_table_quiz.split(";");
            for (String query : insertQuizQueries) {
                stmt.execute(query);
            }

            String[] insertResponsesQueries = insert_table_responses.split(";");
            for (String query : insertResponsesQueries) {
                stmt.execute(query);
            }

        } catch (SQLException se) {
            System.out.println("Error executing SQL query: " + se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void updateData() {
        try (Connection conn = getDatabaseConnection(); Statement stmt = conn.createStatement()) {
            String update_table_quiz = "update quiz \n" + //
                    "set topic = 'History',difficulty_rank= '2', question_content = 'Who is Caocao?'\n" + //
                    "where question_id = '1';";
            String update_table_response = "update responses \n" + //
                    "set response_text = 'Caocao is a great poet from China', is_answer_correct = true \n" + //
                    "where question_id = '1' and response_id = '1' ;";
            stmt.execute(update_table_quiz);
            stmt.execute(update_table_response);

        } catch (SQLException se) {
            System.out.println("Error executing SQL query: " + se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void deleteData() {
        try (Connection conn = getDatabaseConnection(); Statement stmt = conn.createStatement()) {
            String delete_table_quiz = "delete from quiz \n" + //
                    "where question_id = '2';";
            stmt.execute(delete_table_quiz);

        } catch (SQLException se) {
            System.out.println("Error executing SQL query: " + se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<QuestionResult> searchQuestionsByTopic() {
        List<QuestionResult> results = new ArrayList<>();

        try (Connection conn = getDatabaseConnection(); Statement stmt = conn.createStatement()) {
            String search_topic_sql = "select\n" + //
                    "*\n" + //
                    "from quiz,responses\n" + //
                    "where topic = 'History' and quiz.question_id = responses.question_id;";
            ResultSet rs = stmt.executeQuery(search_topic_sql);
            while (rs.next()) {
                QuestionResult result = new QuestionResult();
                result.questionId = rs.getInt("question_id");
                result.topic = rs.getString("topic");
                result.difficultyRank = rs.getString("difficulty_rank");
                result.questionContent = rs.getString("question_content");
                result.responseText = rs.getString("responseText");
                result.isAnswerCorrect = rs.getBoolean("is_answer_correct");
                // // Print the values
                // System.out.println("Question ID: " + result.questionId);
                // System.out.println("Topic: " + result.topic);
                // System.out.println("Difficulty Rank: " + result.difficultyRank);
                // System.out.println("Question Content: " + result.questionContent);
                // System.out.println("Response Text: " + result.responseText);
                // System.out.println("Is Answer Correct: " + result.isAnswerCorrect);
                // System.out.println("-------------------------------");
            }
        } catch (SQLException se) {
            System.out.println("Error executing SQL query: " + se.getMessage());
            se.printStackTrace();
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
            e.printStackTrace();
        }
        return results;
    };

}