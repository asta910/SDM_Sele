// var count = 0;
// var id = setInterval(()=>{
//     count++;
//     let az = `Printing after every 1s for ${count} time \n\n\n`;
//     document.querySelector('.name').innerHTML=az;
//     if(count === 10){
//         clearInterval(id);
//     }
    
// },1000);


console.log("Code started");


var okay = setTimeout(() => {
    for(let i = 0;i <10000; i++){
        console.log("Hello");
    }  
}, 2000);

console.log("Code Ended");
