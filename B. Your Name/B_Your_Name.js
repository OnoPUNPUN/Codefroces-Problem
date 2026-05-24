/*
I'm not some pure heart chasing after dreams.
I know how difficult it is to live an ordinary life,
having to overlook each other's shortcomings.
*/

const fs = require('fs');
const input = fs.readFileSync(0, 'utf8').trim().split(/\s+/);

function check(str1, str2) {
    if(str1.split('').sort().join('') === str2.split('').sort().join('')) {
        return "YES";
    } else {
        return "NO";
    }
}

let idx = 0;
const next = () => input[idx++];

var t = Number(next());

for(let i = 0; i < t; i++) {
    const n = Number(next());

    const s = next();
    const u = next();

    console.log(check(s, u));
}