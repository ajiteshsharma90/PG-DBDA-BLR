import pickle
from tkinter import *

with open(r"C:\Users\dbda\Desktop\Suchandra & Ajitesh\Machine Learning\Day-8\model.pkl",'rb') as fr:
    model = pickle.load(fr)



root = Tk()

def cgpred():
    att = float(e1.get())  
    thm = float(e2.get())  
    sth = float(e3.get())
    inp = [[att,thm,sth]]
    res = model.predict(inp)
    e4.insert(0,str(res[0]))
    
    
L1 = Label(root,text="CGPA Predictor")
L2 = Label(root,text='Enter Attendance (in %) :')
L3 = Label(root,text='Enter Theory Marks (1 - 100) :')
L4 = Label(root,text='Enter Study Hours (1-8) :')
L5 = Label(root,text='CGPA')

e1 = Entry(root)
e2 = Entry(root)
e3 = Entry(root)
e4 = Entry(root)

b1 = Button(text='Predict',command=cgpred)

L1.grid(row=0, column=1)
L2.grid(row=1, column=0)
L3.grid(row=2, column=0)
L4.grid(row=3, column=0)
L5.grid(row=4, column=0)

e1.grid(row=1, column=1)
e2.grid(row=2, column=1)
e3.grid(row=3, column=1)
e4.grid(row=4, column=1)

b1.grid(row=5, column=1)

root.mainloop()
