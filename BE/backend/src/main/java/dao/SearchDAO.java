import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchDAO {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/menglutao";
        String user = "postgres";
        String password = "postgres";
        String search_topic_sql = "select\n" + //
                "*\n" + //
                "from quiz,responses\n" + //
                "where topic = 'History' and quiz.question_id = responses.question_id;";
        try {
            Connection conn = DriverManager.getConnection(dbUrl, user, password);
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(search_topic_sql);
            while (rs.next()) {
                // Print columns - adjust based on your actual columns
                int questionId = rs.getInt("question_id");
                String topic = rs.getString("topic");
                String difficultyRank = rs.getString("difficulty_rank"); // or rs.getInt if it's an integer
                String questionContent = rs.getString("question_content");
                String responseText = rs.getString("response_text");
                boolean isAnswerCorrect = rs.getBoolean("is_answer_correct");

                // Print the values
                System.out.println("Question ID: " + questionId);
                System.out.println("Topic: " + topic);
                System.out.println("Difficulty Rank: " + difficultyRank);
                System.out.println("Question Content: " + questionContent);
                System.out.println("Response Text: " + responseText);
                System.out.println("Is Answer Correct: " + isAnswerCorrect);
                System.out.println("-------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}