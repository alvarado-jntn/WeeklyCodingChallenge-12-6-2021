Math.avg = function ( array ) {
    // regular function to make an average

    let sum = 0;
    let length = array.length;

    for (let i = 0; i < length; i++){

        sum = sum + array[i] ;

    }

    return sum / length ;
}

console.log(`Math.avg([3,5,7]) = `, Math.avg([3,5,7])) ;
console.log(`Math.avg([3,6,30]) = `, Math.avg([3,6,30])) ;
console.log("");


console.log("Quadratic Mean")
Math.qAvg = function ( array, precision ) {
    // Quadratic Mean ( aka Root Mean Square )
    console.log("");

    let sum = 0;
    let length = array.length;
    let factor = 10 ** precision;
    console.log(`factor: `, factor);

    for (let i = 0; i< length; i++) {

        let entry = array[i] ** 2;

        sum = sum + entry ;
    }

    console.log(`sum: `, sum);

    let answer = ((sum / length) ** .5 );
    console.log(`answer: `, answer);

    let finalAnswer = Math.round(answer * factor) / factor;
    console.log(`finalAnswer: `, finalAnswer);

    return finalAnswer ;

}

console.log(`Math.qAvg([3, 5, 7], 1) = `, Math.qAvg([3, 5, 7], 1));
console.log(`Math.qAvg([3, 5, 7], 5) = `, Math.qAvg([3, 5, 7], 5));

console.log("");
console.log("Harmonic Mean")
Math.hAvg = function ( array, precision ) {
    // Harmonic Mean
    console.log("");

    let sum = 0;
    let length = array.length;
    let factor = 10 ** precision;
    console.log(`factor: `, factor);

    for (let i = 0; i< length; i++) {

        let entry = 1 / array[i];

        sum = sum + entry ;
    }

    console.log(`sum: `, sum);

    let answer = 1 / (sum / length);
    console.log(`answer: `, answer);

    let finalAnswer = Math.round(answer * factor) / factor;
    console.log(`finalAnswer: `, finalAnswer);

    return finalAnswer ;

}

console.log(`Math.hAvg([3, 5, 7], 1) = `, Math.hAvg([3, 5, 7], 1));
console.log(`Math.hAvg([3, 5, 7], 5) = `, Math.hAvg([3, 5, 7], 5));

console.log("");
console.log("Geometric Mean")
Math.gAvg = function ( array, precision ) {
    // Geometric Mean
    console.log("");

    let sum = 1;
    let length = array.length;
    let factor = 10 ** precision;
    console.log(`factor: `, factor);

    for (let i = 0; i< length; i++) {

        let entry = array[i];

        sum = sum * entry ;
    }

    console.log(`sum: `, sum);

    let answer = sum  ** (1 / length);
    console.log(`answer: `, answer);

    let finalAnswer = Math.round(answer * factor) / factor;
    console.log(`finalAnswer: `, finalAnswer);

    return finalAnswer ;

}

console.log(`Math.gAvg([3, 5, 7], 1) = `, Math.gAvg([3, 5, 7], 1));