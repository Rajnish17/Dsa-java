function panildrome(input) {
    let change =input.toString();
  let reverseword = "";
  for (let i = change.length - 1; i >= 0; i--) {
    reverseword = reverseword + change[i];
  }
  if(change===reverseword){
    console.log("True");
  }else{

      console.log("false");
  }
}

panildrome(1000001);
