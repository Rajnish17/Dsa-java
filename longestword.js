function serch(arr) {
  const newInput = arr.split(" ");

  let largestWord = "";

  for (let i = 0; i < newInput.length; i++) {
    // let word = newInput[i];
    // console.log(word);
    if ( newInput[i].length > largestWord.length) {
      largestWord =  newInput[i];
    }
  }
  return largestWord;
}

let string = "hello worldshdjhghj gooddjkiewi;uweidegg";

console.log(serch(string));
// serch(arr)
