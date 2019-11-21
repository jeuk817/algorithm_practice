// words	queries	result
// ["frodo", "front", "frost", "frozen", "frame", "kakao"]	["fro??", "????o", "fr???", "fro???", "pro?"]	[3, 2, 4, 1, 0]

// .match(/1/g).length;

function solution(words, queries) {

    queries.map((query) => {
        var len = query.length;

        if(query[0] === '?'){
            
        }

        var str = query.replace(/\?/g, '');
        var qLen = len - str.length;
        var filteredArr = words.filter((el) => {
            if (el.length === len) {
                if (el.length === qLen) return true;
                if (query[0] === '?') {
                    if (str === el.slice(-str.length)) return true;
                } else {
                    if (str === el.slice(0, str.length)) return true;
                }
            }
        })
        return filteredArr.length;
    })
}