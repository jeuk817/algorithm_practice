// 입출력 예
// n	build_frame	result
// 5	[[1,0,0,1],[1,1,1,1],[2,1,0,1],[2,2,1,1],[5,0,0,1],[5,1,0,1],[4,2,1,1],[3,2,1,1]]	[[1,0,0],[1,1,1],[2,1,0],[2,2,1],[3,2,1],[4,2,1],[5,0,0],[5,1,0]]
// 5	[[0,0,0,1],[2,0,0,1],[4,0,0,1],[0,1,1,1],[1,1,1,1],[2,1,1,1],[3,1,1,1],[2,0,0,0],[1,1,1,0],[2,2,0,1]]	[[0,0,0],[0,1,1],[1,1,1],[2,1,1],[3,1,1],[4,0,0]]


function solution(n, build_frame) {
    var answer = [];

    function isPossible0(arr) {
        if (arr[2] === 0) return true;
        if (answer.indexOf([arr[0] - 1, arr[1], 1]) || answer.indexOf([arr[0], arr[1] - 1, 0])) return true;
        return false;
    }

    function isPossible1(arr) {
        if (answer.indexOf([arr[0], arr[1] - 1, 0]) || answer.indexOf([arr[0] + 1, arr[1] - 1, 0])) return true;
        if (answer.indexOf([arr[0] - 1, arr[1], 1]) && answer.indexOf([arr[0] + 1, arr[1], 1])) return true;
        return false;
    }

    function write(arr) {
        if (arr[3] === 1) {
            if (arr[2] === 0) {
                if (isPossible0(arr)) {
                    answer.push([arr[0], arr[1], 0])
                }
            }
            if (arr[2] === 1) {
                if (isPossible1(arr)) {
                    answer.push([arr[0], arr[1], 0])
                }
            }
        } else {
            var del = answer.indexOf([arr[0], arr[1], arr[2]]);
            if (del) {
                answer.splice(del, 1);
            }
        }
    }

    write(build_frame);
    answer.sort((a, b) => {
        if (a[0] === b[0]) return a[1] - b[1];
        return a[0] - b[0];
    })

    console.log('answer', answer)
    return answer;
}

solution(5, [[1, 0, 0, 1], [1, 1, 1, 1], [2, 1, 0, 1], [2, 2, 1, 1], [5, 0, 0, 1], [5, 1, 0, 1], [4, 2, 1, 1], [3, 2, 1, 1]]);