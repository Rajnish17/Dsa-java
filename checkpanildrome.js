function foo(s) {
   
    let newWord =s.toLowerCase();
    let temp ="";
    console.log(temp)
     for(let i =newWord.length-1; i>=0;i--){
          temp =temp+newWord[i];
     }
     console.log(temp)
    if(newWord===temp){
        return true;
    }else{
        return false;
    }
};


// console.log();
foo("A man, a plan, a canal: Panama")