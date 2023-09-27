import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseInitializer {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/menglutao";
        String user = "postgres";
        String password = "postgres";
        String create_table_quiz = "create table  quiz (\n" + //
                "question_id serial primary key,\n" + //
                "topic TEXT not null,\n" + //
                "difficulty_rank INT not null,\n" + //
                "question_content TEXT not null\n" + //
                "); \n" + //
                "";

        String create_table_responses = "create table responses(\n" + //
                "response_id serial primary key,\n" + //
                "question_id INT not null references quiz(question_id) on delete cascade,\n" + //
                "response_text TEXT not null,\n" + //
                "is_answer_correct BOOLEAN not null\n" + //
                ");";
        try {
            Connection conn = null;
            conn = DriverManager.getConnection(dbUrl, user, password);
            Statement statement = conn.createStatement();
            statement.execute(create_table_quiz);
            statement.execute(create_table_responses);

        } catch (Exception e) {
            e.printStackTrace();

        }
        ;

    }
}