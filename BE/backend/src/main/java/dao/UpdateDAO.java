import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDAO {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/menglutao";
        String user = "postgres";
        String password = "postgres";

        String update_table_quiz = "update quiz \n" + //
                "set topic = 'History',difficulty_rank= '2', question_content = 'Who is Caocao?'\n" + //
                "where question_id = '1';";
        String update_table_response = "update responses \n" + //
                "set response_text = 'Caocao is a great poet from China', is_answer_correct = true \n" + //
                "where question_id = '1' and response_id = '1' ;";

        try {
            Connection conn = null;
            conn = DriverManager.getConnection(dbUrl, user, password);
            Statement statement = conn.createStatement();
            statement.execute(update_table_quiz);
            statement.execute(update_table_response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}