# JBits

```class A{ p s v test(){sout("A");} }
class B extends A{ p s v test(){sout("B");} }

class C{
  main(){
      A a2 = new B();
}
}
```


* what is the o/p?

* what this example refers to?

* what happens when you try to override a static method from parent class?  

* How can you find total number of instances created for a class?  

* Spring MVC architecture, annotations used, interceptors, bean scopes, etc..

* Core Java questions with simple programs on swapping without a third variable, finding non-duplicate characters in a string, etc.


# JSBits


* Array Duplicate Logic 

* what is set operator in JavaScript

* JavaScript has includes prototype

* what is transpiling, filter , reduce operator etc 

* UI

* WireFrames

* Routers  

* rxjs

# Unique Element in Mixed Array

[jsfiddle link](https://jsfiddle.net/ruffthawts/03pdwvm2/1/)


```var arr=[1,2,"s","s",[1,3],2,[1,3]];
var arr1=[];
var arr2=[];
for(let i of arr){
if(arr1.indexOf(JSON.stringify(i))==-1)
	arr1.push(JSON.stringify(i));
}
for(let i of arr1){
if(arr2.indexOf(JSON.parse(i))==-1)
	arr2.push(JSON.parse(i));
}
console.log(arr2);```

### 19012020
* Sharing information in independent modules.
* What is the difference between display none and visibility true?
* Practical application of closure?
* Function arguments is pass by value or pass by reference?
* XMLhttprequest vs AJAX?
* Shadow DOM vs Virtual DOM?



