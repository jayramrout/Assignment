# Operators in Java
Operators in java is used primarly for operations like addition(+), substraction(-), multiplication(*) , division(/) etc...

### Different types of operators
    - Arithemetic
    - Bitwise 
    - Relational
    - Boolean Logical

#### Arithemetic Operators
![N|Solid](https://github.com/jayramrout/Assignment/blob/master/CoreJava/src/_02_Operators/ArithematicOperators.png?raw=true)

#### Bitwise Operators
![N|Solid](https://github.com/jayramrout/Assignment/blob/master/CoreJava/src/_02_Operators/BitwiseOperator.png?raw=true)

#### Relational Operators
![N|Solid](https://github.com/jayramrout/Assignment/blob/master/CoreJava/src/_02_Operators/RelationalOperator.png?raw=true)

#### Boolean Logical Operators
![N|Solid](https://github.com/jayramrout/Assignment/blob/master/CoreJava/src/_02_Operators/BooleanLogicalOperator.png?raw=true)

****
##### Examples of some operators:

**Short circuit Operator**
```
        int a_distance = 20;
        int b_distance = 44;
        int c_distance = 50;
        System.out.println(a_distance > b_distance  &&  c_distance++ > 20); // false
        System.out.println(c_distance); 50
```


**Unary Operator**

`int a = 40`
`System.out.println(a++);// final result will be 40`  
`System.out.println(++a);// final result will be 41, as its a pre-increment` 
`System.out.println(a--);` 
`System.out.println(--a);` 

**Left Shift Operator**

`System.out.println(10<<2);//10*2^2=10*4=40`  
`System.out.println(10<<3);//10*2^3=10*8=80` 

**Right Shift Operator**
`System.out.println(10>>2);//10/2^2=10/4=2`  
`System.out.println(20>>2);//20/2^2=20/4=5`
  