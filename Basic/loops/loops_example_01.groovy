// class Demo{
//     static void main(String[] args){
//         for (int i=0; i<=5; i++){
//             println "i: " + i;
//         }
//     }
// }

// Groovy Equivalent or shorter version of code.

//$it is a closure that gives the value of the current loop.
0.upto(5) {println "$it"} // 0..5

2.upto(5) {println "$it"} // 2..5

5.times{println "$it"}  // 0..4