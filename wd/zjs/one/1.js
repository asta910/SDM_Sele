colouring = () => {

}

var id = setInterval(()=>{
    let red = Math.floor(Math.random() * 120);
    let green = Math.floor(Math.random() * 120);
    let blue = Math.floor(Math.random() * 120);
    const rgb = `rgb(${red},${green},${blue})`

    document.querySelector('body').style.background=rgb;

},2000);