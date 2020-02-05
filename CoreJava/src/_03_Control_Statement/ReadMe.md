# Control Statement
A control statement in java is a statement that determines whether the 
other statements will be executed or not. It controls the flow of a program. 
An 'if' statement in java determines the sequence of execution between a set of two statements.


- if statement
- if-else statement
- Nested if statement
- Switch statement
- Looping statements
- While
- Do-while
- For
- For-Each
- Break
- Continue

#### if statement
```java
if (condition) { 
    Statement 1; //executed if condition is true
}
    Statement 2; //executed irrespective of the condition
```

#### if-else statement
```java
if (condition) { 
    Statement 1; //executed if condition is true
} else{
    Statement 2; //executed if the first condition is false
}

```

#### Nested if statement
```java

if (condition1) {
    Statement 1; //executed if first condition is true
    if (condition2) {
        Statement 2; //executed if second condition is true
    }
}else {
    Statement 3; //executed if second condition is false
}


```
#### Switch statement
```java
int switch_value = 1; 
switch (switch_value){
    case 1:{
        
    }
    case 2:{
        
    }
    case 3:{
        
    }
}
```

### Looping statements

####While
```java

while (condition)
{
    statementOne;
}

```
####Do-while
```java
do{
    //code to be executed
}while(condition);

```
####For
```java

for (initialization; condition; increment/decrement)
{
    statement;
}

```
#### For-Each

####Break

####Continue
