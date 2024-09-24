import React, { useState } from 'react'
import './Cards1.css'

function Card1() {

  const [count,setCount] = useState(0);

  function HandelCount(){
      setCount(c => c + 1);
  }

let counter=0;
let firstSelection="";
let secondSelection="";

const cards=document.querySelectorAll('.cards');
Array.from(cards).forEach((car)=>{
    car.addEventListener("click",()=>{
        car.classNameList.add("clicked");
      
setInterval(() => {
  let countdown= "";
  countdown=count.getAttribute('timer');
  let ct=countdown.innerHTML.value=countdown;
  ct--;
  return 0;
}, 1000);


  if(counter === 0 ){
  firstSelection=car.getAttribute("anime");
  counter++;
  }else{
    secondSelection=car.getAttribute("anime");
    counter=0;
        
          
   if (firstSelection === secondSelection) {
     const correctCards = document.querySelectorAll(".cards[anime='" + firstSelection + "']");
                
    setTimeout(() => {
    correctCards[0].classNameList.add("checked");
    correctCards[0].classNameList.remove("clicked");
    correctCards[1].classNameList.add("checked");
    correctCards[1].classNameList.add("sec");
    correctCards[1].classNameList.remove("clicked");
    }, 500);

              } else {
                const incorrectCards = document.querySelectorAll(".cards.clicked");
        
                incorrectCards[0].classNameList.add("shake");
                incorrectCards[1].classNameList.add("shake");
        
                setTimeout(() => {
                  incorrectCards[0].classNameList.remove("shake");
                  incorrectCards[0].classNameList.remove("clicked");
                  incorrectCards[1].classNameList.remove("shake");
                  incorrectCards[1].classNameList.remove("clicked");
                }, 500);

                setTimeout(()=>{
                    correctCards[1].classNameList.add("corr");

                },3000)
              }
            }
          });
        });



(function shuffel(){
  const cards=document.querySelectorAll('.cards');
  Array.from(cards).forEach((car)=>{
         let randomPosition=Math.floor(Math.random() * 24)
         car.style.order = randomPosition;

          });
 })();

      function remove(){
        e.parentNode.removeChild(e);
      }
      var click=0;
      function fun(){
        document.querySelector("#countt").innerHTML=++click;
        click=click;
      }

      var timer=100;
      function tim(){
        document.querySelector("#time-remaining").innerHTML=--timer;
        timer=timer;
      }

  

  return (
  <>
     <h1 className="gametitle"> 🎃 Remember-the-Card  🎃 </h1>
    <div className="game-container"> 

        <div className="card">
            <div className="card-back card-face">
            </div>
            <button className="clicked" onclick={HandelCount}></button>
            <p>{count}</p>
            <div className="card-front card-face">     
            </div>
        </div>

    
    <div className="card-inf game-container " id="cards11">

        <div className="cards" anime="naruto" onclick="fun()" img src="./images/15.jpg" >   </div>
        <div className="cards" anime="naruto1" onclick="fun()" img src="./images/18.jpg">   </div>
        <div className="cards" anime="naruto2" onclick="fun()" img src="./images/3.jpg">    </div>
        <div className="cards" anime="naruto3" onclick="fun()" img src="./images/4.jpg">    </div>
        <div className="cards" anime="naruto4" onclick="fun()" img src="./images/5.jpg">    </div>
        <div className="cards" anime="naruto5" onclick="fun()" img src="./images/6.jpg">    </div>
        <div className="cards" anime="naruto6" onclick="fun()" img src="./images/7.jpg">    </div>
        <div className="cards" anime="naruto7" onclick="fun()" img src="./images/21.jpg">   </div>
        <div className="cards" anime="naruto9" onclick="fun()" img src="./images/20.jpg">   </div>
        <div className="cards" anime="naruto10" onclick="fun()" img src="./images/17.jpg">   </div>
        <div className="cards" anime="naruto11" onclick="fun()" img src="./images/11.jpg" >  </div> 
        <div className="cards" anime="naruto12" onclick="fun()" img src="./images/23.jpg" >  </div> 



        <div className="cards" anime="naruto" onclick="fun()"  img src="./images/15.jpg" >   </div>
        <div className="cards" anime="naruto1" onclick="fun()" img src="./images/18.jpg">   </div>
        <div className="cards" anime="naruto2" onclick="fun()" img src="./images/3.jpg">    </div>
        <div className="cards" anime="naruto3" onclick="fun()" img src="./images/4.jpg">    </div>
        <div className="cards" anime="naruto4" onclick="fun()" img src="./images/5.jpg">    </div>
        <div className="cards" anime="naruto5" onclick="fun()" img src="./images/6.jpg">    </div>
        <div className="cards" anime="naruto6" onclick="fun()" img src="./images/7.jpg">    </div>
        <div className="cards" anime="naruto7" onclick="fun()" img src="./images/21.jpg">   </div>
        <div className="cards" anime="naruto9" onclick="fun()" img src="./images/20.jpg">   </div>
        <div className="cards" anime="naruto10" onclick="fun()" img src="./images/17.jpg">  </div>
        <div className="cards" anime="naruto11" onclick="fun()" img src="./images/11.jpg" > </div>
        <div className="cards" anime="naruto12" onclick="fun()" img src="./images/23.jpg" >  </div>


    </div>
    </div>
    </>
  )
}

export default Card1;
