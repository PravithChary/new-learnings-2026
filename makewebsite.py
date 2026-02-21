from flask import Flask

app = Flask(__name__)

@app.route("/")
def home():
    return "Hello Pravith <h1>Start flask course!</h1>"

@app.route("/home/<name>")
def home_page(name):
    return f"Welcome to homepage {name}"

if __name__ == "__main__":
    app.run()