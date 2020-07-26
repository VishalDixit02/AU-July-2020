const myArr=['fruits','mango','apple'];
const num=[1,2,3,4,5];

const myArr2=['banana', 'peach', 'pomegranate'];

//1st function
const v= myArr.concat(myArr2);

//2nd function
function check(age)
{
    return age<4;
}

const n= num.every(check);

//3rd function

const x=num.filter(((num)=> {
    return num<4;
}))

//4th function
num.forEach(pa => {
    console.log(pa*2);
})

//5th function
console.log(num.indexOf(2));

//6th function
console.log(myArr.join(','));

//7th function
console.log(num.lastIndexOf(1));

//8th function
let c=num.map((n)=>{
    return n*10;
})

console.log(c);

//9th function
myArr.pop();

//10th function
myArr.push('flog');

//11th function
console.log(num.reduce((curval,acc)=>curval+acc));

//12th function
console.log((curval,acc)=>curval.concat(acc));

//13th function
console.log(num.reverse());

//14th function
console.log(num.shift());

//15th function
console.log(num.slice(1,2));

//16th function
console.log(num.some((n)=> n<2))

//17th function
//console.log(myArr.toSource());

//18th function
console.log(myArr.sort());

//19th function
console.log(myArr.splice(1,0,'hjkl'));

//20th function
console.log(num.toString());

//21th function
console.log(num.unshift(1,2,3,4,5));