from flask import Flask,abort,request,jsonify

app = Flask(__name__)


@app.route("/adder/", methods=["POST"])
def add():
   if request.json:
      num1 = request.json.get("num1",0)
      num2 = request.json.get("num2",0)
      ans = num1 + num2
      return jsonify({"result":ans},200)
   else:
      abort(404)

if __name__ == "__main__":
   app.run(debug=True)
