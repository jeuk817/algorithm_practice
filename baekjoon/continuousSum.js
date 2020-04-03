// var [len, ns] = '10\n10 -4 3 1 5 6 -35 12 21 -1'.split("\n");
// var [len, ns] = '10\n2 1 -4 3 4 -4 6 5 -5 1'.split("\n");
// var [len, ns] = '5\n-1 -2 -3 -4 -5'.split("\n");
// var ns =  //'10 -4 3 1 5 6 -35 12 21 -1'
        // '2 1 -4 3 4 -4 6 5 -5 1'
        // '-1 -2 -3 -4 -5'
        // '-5 1 2 3 -4 5'
        // '-1 0 -2 1'
        // '-3 5'
        // '-2 -1'
        // '1000 2 1 -99 100'
        // '3 9 -8 6 4 -7 5 -4 4 -2 5'
        // '10 -4 3 1 5 6 -35 12 1 -1'
        // '-4 -3 -2 -1 -10 -35 -2 -5 -1'
        // '-1 -2'
        // '-1'
        // '-1 0 5 -3 4'
        // '1 1 -1 1 1'
        // '4 -100 1000 -5 10'

// var [len, ns] = require('fs').readFileSync('/dev/stdin').toString().split("\n");
var arr = ns.split(' ').map(a => { return parseInt(a) })
var smallMinus;

var arr2 = arr.reduce((ac, cu) => {
    if(cu < 0 && (smallMinus === undefined || cu > smallMinus)) smallMinus = cu
    if(ac[0] === undefined) {
        ac.push(cu)
        return ac
    }
    var lastSum = ac.pop()
    if((lastSum >= 0 && cu >= 0) || (lastSum < 0 && cu < 0)) {
        lastSum += cu
        ac.push(lastSum)
    } else {
        ac.push(lastSum)
        ac.push(cu)
    }
    return ac
},[])

if(arr2.length === 1) {
    if(arr2[0] >= 0) return console.log(arr2[0])
    return console.log(smallMinus)
}

var bestSum;
var best;
var minus;
arr2.forEach((el, i) => {
    if(el < 0) return minus = el
    if(best === undefined) {
        bestSum = el
        return best = el
    }
    if(best + minus >= 0 && el + minus >= 0) {
        best += el + minus
    } else {
        best = el
    }
    if(best >= bestSum) bestSum = best
})

console.log(bestSum)