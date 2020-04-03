// ()(((()())(())()))(())

function solution(arr) {
    var stack = 0
    var close = false
    var answer = 0
    arr.split('').forEach(el => {
        if(el === '(') {
            if(close) answer += stack
            else if(stack) answer += 1
            stack += 1
            close = false
        } else {
            if(close) answer += 1
            stack -= 1
            close = true
        }
    });
    return answer;
}