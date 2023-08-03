function calculate(){
    // alert("button is clicked")
    prin=parseInt(document.getElementById("prin").value)
    roi=parseInt(document.getElementById("roi").value)
    time=parseInt(document.getElementById("time").value)
    si=(prin*roi*time)/100
    document.getElementById("result").innerHTML="Simple Interest is "+si
 }

 function reset(){
     document.getElementById("prin").value=""
    document.getElementById("roi").value=""
    document.getElementById("time").value=""
    document.getElementById("result").innerHTML=""            
 }