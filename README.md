# finch-robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret how the built in sensors detect light and color</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |             |
|    ❌     | Develop Code |             |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

- I wanted to create an automated pencil transfer machine to patrol classrooms.
- My motivation for this project was the idea of transporting school materials and how a small bowling ball could easily hold multiple pencils in a clever design
- This could be useful for during tests so students dont have to get up and grab a pencil from the front of the room and instead can have a fresh pencil delivered to them.
- From this project, I was able to understand a general idea on how sensors function and respond.
</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### Include commentary on your experience with the design cycle during this project

---

### Code to Highlight
```
Finch f = new Finch();	
f.setMotors(10, 10);
f.pause(3);
f.stop();
int t = (int)(Math.random() * 360) + 1;
f.setTurn("R", t, 50);
System.out.println(t);
f.stop();
```

---

### Choose At Least Three of the Following to Include:
- What was your motivation?
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
- What problem does it solve?
- What did you learn?
- What makes your project stand out?
