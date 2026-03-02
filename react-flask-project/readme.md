# Reference

Youtube [Ssali Jonathan - Build a Full stack web app with Flask and ReactJS](https://www.youtube.com/playlist?list=PLEt8Tae2spYkfEYQnKxQ4vrOULAnMI1iF)

Source Code [GitHub](https://github.com/jod35/Flask-React-Recipes)

## Commands to run in venv

`python3 -m pip install flask_restx flask_sqlalchemy flask_jwt_extended python_decouple`

## Within the python interpreter,

`>>> import secrets`\
`>>> secrets.token_hex(12)`

## Commands to run for db setup

`python3 -m export FLASK_APP=main.py`\
`python3 -m flask shell`

An interpreter opens now,\
`>>> db`\
`>>> Recipe`\
`>>> db.create_all()`

## Commands to add requirements file

`pip freeze > requirements.py`
