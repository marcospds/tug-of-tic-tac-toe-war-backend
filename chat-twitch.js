function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

var list = [];

while(true){
    
    await sleep(1000);

    var msgs = document.getElementsByClassName("chat-line__message");

    for(msg in msgs){
        if(!list.includes(msgs[msg]) && msgs[msg].textContent != undefined){
            console.log(msgs[msg].textContent);
            var xhr = new XMLHttpRequest();

            
            
            xhr.open("POST", "http://localhost:8080/lines", true);
            xhr.setRequestHeader("Content-Type", "application/JSON; charset=UTF-8");
            xhr.send(msgs[msg].textContent);
        }
    }

    list = [];

    for(msg in msgs){
        list.push(msgs[msg]);
    }
}

