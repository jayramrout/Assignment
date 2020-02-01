# Variables in Java
A variable is a name which is associated with a value that can be changed. 
For example when I write int i=10; here variable name is i which is associated with value 10, 
int is a data type that represents that this variable can hold integer values. 

### How to Declare a variable in Java

**data_type variable_name = value;**

eg:
    `int num;`

###Types of Variables

There are three types of variables in java:

- local variable
- instance variable
- static variable

1) Local Variable

A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

A local variable cannot be defined with "static" keyword.

2) Instance Variable

A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.

It is called instance variable because its value is instance specific and is not shared among instances.

3) Static variable

A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. Memory allocation for static variable happens only once when the class is loaded in the memory.

# Data Types Java
- Integer
- Floating
- Boolean
- Character

*1 Byte = 8 Bits*

> 8 bits: maximum representable value  2^8 − 1 = 255 (- 2^7 to + 2^7-1)
>
> 16 bits: maximum representable value 2^16 − 1 = 65,535
>
> 32 bits: maximum representable value 2^32 − 1 = 4,294,967,295 (the most common width for personal computers as of 2005),
>
> 64 bits: maximum representable value 2^64 − 1 = 18,446,744,073,709,551,615 (the most common width for personal computer CPUs, as of 2017),


| Data Types | Default Value | Default Size | 
| ------ | ------ | ------ | 
|boolean|	false	|1 bit
|char	|'\u0000'	|2 byte
|byte	|0	|1 byte
|short	|0	|2 byte
|int	|0	|4 byte
|long	|0L	|8 byte
|float	|0.0f|	4 byte
|double	|0.0d|	8 byte
