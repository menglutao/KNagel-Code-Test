import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDAO {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://localhost:5432/menglutao";
        String user = "postgres";
        String password = "postgres";

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

        try {
            Connection conn = null;
            conn = DriverManager.getConnection(dbUrl, user, password);
            Statement statement = conn.createStatement();
            statement.execute(insert_table_quiz);
            statement.execute(insert_table_responses);
        } catch (Exception e) {
            e.printStackTrace();

        }
        ;

    }
}