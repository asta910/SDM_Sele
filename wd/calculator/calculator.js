/*
let string="";
let buttons=document.querySelectorAll('.button');
Array.from(buttons).forEach((button)=>{
    button.addEventListener('click', (e)=>{
        if(e.target.innerHTML=='='){
            string=eval(string);
            document.querySelector('input').value=string;
        }
        else if(e.target.innerHTML == 'AC'){ 
          // console.log(e.target)
            string=""
            document.querySelector('input').value=string;
        }
        else if(e.target.innerHTML=="x2"){
            //console.log("square" , e.terget)
            string=string*string;
            document.querySelector('input').value=string
        }
        else if(e.target.innerHTML=="x3"){
            string=string*string*string;
            document.querySelector('.input').value=string;
        }
        else{
        //console.log(e.target)
        string=string+e.target.innerHTML;
        document.querySelector('input').value=string;
        }
    })
})

console.log("me")


// Todo: Make M+ M- and MC functional
l        else if(e.target.innerHTML=="%"){
            console.log("modula" , e.terget)
            string=(a)=>{
                if(a % == 0){
                    document.querySelector('input').value="is Even"
                }else{
                    document.querySelector('input').value="is Odd"
                }
            }
        }





let str="";
let btn=document.querySelectorAll(".button");
Array.from(btn).forEach((bt)=>{
    bt.addEventListener("click",(e)=>{
    if(e.target.innerHTML== "="){
        str=eval(str);
        document.querySelector('input').value=str;
    }else if(e.target.innerHTML=="AC"){
        str="";
        document.querySelector('input').value=str;
    }else if(e.target.innerHTML=="x2"){
        str=str*str;
        document.querySelector('input').value=str;
    }else{
        str=str+e.target.innerHTML;
        document.querySelector('input').value=str;
    }
    })
})


let string1="";
let buttons1=document.querySelectorAll('.button');
Array.from(buttons1).forEach((btn)=>{
    btn.addEventListener('click',(e)=>{
    if(e.target.innerHTML=="="){
        string1=eval(string1);
        document.querySelector('input').value=string1;
    }else if(e.target.innerHTML=="AC"){
        string="";
        document.querySelector('input').value=string1;
    }else if(e.target.innerHTML=="x2"){
        string1=string1*string1;
        document.querySelector('input').value=string1;
    }else if(e.target.innerHTML=="x3"){
        string1=string1*string1*string1;
        document.querySelector('input').value=string1;
    }else if(e.target.innerHTML=="%"){
        string1="Modula function isnt working yet";
        document.querySelector('input').value=string1;
    }else{
        string1=string1+e.target.innerHTML;
        document.querySelector('input').value=string1
    }
    })
})


let str="";
let btns=document.querySelectorAll('.button');
Array.from(btns).forEach((btn=>{
    btn.addEventListener('click',(e)=>{
     if(e.target.innerHTML=="="){
            str=eval(str);
            document.querySelector('input').value=str;
        }else if(e.target.innerHTML=="AC"){
            str="";
            document.querySelector('input').value=str;
        }else if(e.target.innerHTML=="x2"){
            str=str*str;
            document.querySelector('input').value=str;
        }else if(e.target.innerHTML=="x3"){
            str=str*str*str;
            document.querySelector('input').value=str;
        }else if(e.target.innerHTML=='.'){
            str="Why u press dot";
            document.querySelector('input').value=str;
        }else{
            str=str+e.target.innerHTML;
            document.querySelector('input').value=str;
        }
    }
    )
}))
*/

let string2="";
let BUttons=document.querySelectorAll('.button');
Array.from(BUttons).forEach((bt=>{
    bt.addEventListener('click',(e)=>{
        if(e.target.innerHTML=="="){
            string2=eval(string2);
            document.querySelector('input').value=string2;
        }else if(e.target.innerHTML=="AC"){
            string2="";
            document.querySelector('input').value=string2;
        }else if(e.target.innerHTML=="x2"){
            string2=string2*string2;
            document.querySelector('input').value=string2;
        }else if(e.target.innerHTML=="x3"){
            string2=string2*string2*string2;
            document.querySelector('input').value=string2;
        }else{
            string2=string2+e.target.innerHTML;
            document.querySelector('input').value=string2;
        }
    })

}))