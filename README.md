# LFSR - Linear Feedback Shift Register
A linear feedback shift register is a collection of bits that shifts when triggered, and the next state is a linear function of its previous state. We use right-shift (>>) as the shift operation and XOR (^) as the linear function to generate the next state of the register.
You can learn more about this in the [video](https://youtu.be/Ks1pw1X22y4?si=Y-GT6AlasyH4Jzdj)


# Sample Usage
Import the project in IntelliJ or clone the repository. 
Compile the code with `javac Main.java` and then run `java Main`

```
$ java Main
12 1100
6 110
11 1011
5 101
10 1010
13 1101
14 1110
15 1111
7 111
3 11
1 1
8 1000
4 100
2 10
9 1001
```
