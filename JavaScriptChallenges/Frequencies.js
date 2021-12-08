// create a function that takes in an array of frequencies and returns
// information on whether it is the correct frequency for a guitar string

function tune( array ) {
    // input: (high E, B, G, D, A, low E)
    // let highE = 329.63 ;
    // let B = 246.94 ;
    // let G = 196 ;
    // let D = 146.83 ;
    // let A = 110 ;
    // let lowE = 82.41 ;

    const answer = [] ;

    const freq = [329.63, 246.94, 196, 146.83, 110, 82.41]; // these are the correct frequencies

    for (let i=0; i<array.length; i++) {
        let diff = freq[i] - array[i] ; // difference between entries
        // console.log(`${i} diff: `, diff);

        let percentage = Math.round((diff / freq[i] ) * 100) ; // percentage difference
        // console.log(`${i} percentage: `, percentage);
        // console.log("");

        if (percentage == 0) { // there is no difference, string is in tune
            answer[i] = "OK";
        } else if (percentage == 100) { // no input detected
            answer[i] = "-";


        } else if (percentage > 0 && Math.abs(percentage) < 3) { // tuning is slightly too low
            answer[i] = ">* ";
        } else if (percentage > 0 && Math.abs(percentage) >= 3) { // tuning is way too low
            answer[i] = ">>* ";


        } else if (percentage < 0 && Math.abs(percentage) < 3) { // tuning is slightly too high
            answer[i] = "*<";
        } else if (percentage < 0 && Math.abs(percentage) >= 3) { // tuning is way too high
            answer[i] = "*<<";
        } 

    }

    return answer ;
}


console.log(`tune([0, 246.94, 0, 0, 0, 80]) = `, tune([0, 246.94, 0, 0, 0, 80]));

console.log(`tune([329, 246, 195, 146, 111, 82]) = `, tune([329, 246, 195, 146, 111, 82]));

console.log(`tune([329.63, 246.94, 196, 146.83, 110, 82.41]) = `, tune([329.63, 246.94, 196, 146.83, 110, 82.41]));
