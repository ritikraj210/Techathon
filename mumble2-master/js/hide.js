window.onload = function() {
    // Your code here
    // This code will be executed when the page finishes loading
  
    const queryStringNew = window.location.search;
    const urlParamsNew = new URLSearchParams(queryStringNew);
    let roleId = urlParamsNew.get('role');
    console.log(roleId);

    if(roleId!=='seller')
    {
        console.log("Yes inside the if")
        document.getElementById('join-btn').style.display = 'none';
    }
    



  };
  