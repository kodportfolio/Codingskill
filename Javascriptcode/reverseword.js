function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Function to reverse a word and maintain its original case
    const reverseWord = (word) => {
        if (word === "") {
            return ""; // Handle empty strings
        }
        
        // Preserve the case of the first character
        const firstChar = word[0];
        const restOfWord = word.slice(1);
        
        // Reverse the rest of the word and combine it
        const reversedRest = restOfWord.split('').reverse().join('');
        
        // Recombine the first character and the reversed part
        return firstChar + reversedRest;
    };

    // Reverse each word and rejoin them into a sentence
    const reversedWords = words.map(reverseWord);
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

// Example usage
const inputSentence = prompt("Enter a sentence:");
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Reversed Sentence: " + reversedSentence);
