'''
fake_data_generator.py
This is for generating SQL statments for testing the functions of operating database.


'''
from faker import Faker
import random

fake = Faker()
topics = ['Music','Math','Literature','Sports','History']
difficulty_range = [1,2,3,4,5,6]
for i in range(10):
    topic = random.choice(topics)
    difficulty_rank = random.choice(difficulty_range)
    question_content = fake.sentence(nb_words=10, variable_nb_words=True)
    print(f"INSERT INTO quiz (topic, difficulty_rank, question_content) values ('{topic}','{difficulty_rank}','{question_content}');")

    
for i in range(1,11):
# Generate responses for each question
    correct_answer = fake.sentence(nb_words=3, variable_nb_words=True)
    wrong_answer1 = fake.sentence(nb_words=3, variable_nb_words=True)
    wrong_answer2 = fake.sentence(nb_words=3, variable_nb_words=True)
    print(f"INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('{i}', '{correct_answer}', true);")
    print(f"INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('{i}', '{wrong_answer1}', false);")
    print(f"INSERT INTO responses (question_id, response_text, is_answer_correct) VALUES ('{i}', '{wrong_answer2}', false);")

          
