function findLargestWord(str) {
    // Step 1: Split the string into an array of words
    const words = str.split(" ");
    
    // Step 2: Initialize the largest word variable
    let largestWord = "";
    
    // Step 3: Loop through the array of words and update the largest word variable
    for (let i = 0; i < words.length; i++) {
      const word = words[i];
      if (word.length > largestWord.length) {
        largestWord = word;
      }
    }
    
    // Step 4: Return the largest word found
    return largestWord;
  }
  
  // Example usage
  const str = "The quick brown fox jumped over the lazy dog";
  const largestWord = findLargestWord(str);
  console.log("Largest word:", largestWord); // "jumped"
  