import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDAO {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/menglutao";
        String user = "postgres";
        String password = "postgres";
        String delete_table_quiz = "delete from quiz \n" + //
                "where question_id = '2';";

        try {
            Connection conn = null;
            conn = DriverManager.getConnection(dbUrl, user, password);
            Statement statement = conn.createStatement();
            statement.execute(delete_table_quiz);
        } catch (Exception e) {
            e.printStackTrace();

        }

    };
}