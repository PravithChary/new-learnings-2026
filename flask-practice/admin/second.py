from flask import Blueprint, render_template

second = Blueprint("second", __name__, static_folder="static", template_folder="templates")
# actually second = Blueprint("second", __name__) would suffice in this situation

@second.route("/")
@second.route("/home")
def home():
    return render_template("index.html")