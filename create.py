import os
import inquirer


def get_question_name():
    questions = [
        inquirer.Text(name='question_name', message='leetcode question name')
    ]
    
    answers = inquirer.prompt(questions)
    return answers['question_name']


def main():
    question_name = get_question_name()
    if question_name:
        create_dirs_and_files(question_name)


def create_dirs_and_files(question):
    java_file = os.getcwd() + f'/java/{question}/Solution.java'
    python_file = os.getcwd() + f'/python/{question}/solution.py'
    try:
        os.makedirs(os.path.dirname(java_file))
        os.makedirs(os.path.dirname(python_file))
        open(java_file, 'a').close()
        open(python_file, 'a').close()
    except OSError:
        pass


if __name__ == '__main__':
    main()
