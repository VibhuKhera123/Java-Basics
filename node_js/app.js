//Modules  (encapsulated code --> sharing only what we need )



const name = require('./names');        //require is used to access export
const sayHi = require('./utils')
console.log(name);

sayHi("Vibhu")
sayHi(name.name1)
sayHi(name.name2)