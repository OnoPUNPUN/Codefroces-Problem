const fs = require('fs');
const input = fs.readFileSync(0, 'utf8').trim().split(/\s+/);

const n = BigInt(input[0]);
const k = BigInt(input[1]);

const oddCount = (n + 1n) / 2n;

let answer;
if (k <= oddCount) {
  answer = 2n * k - 1n;
} else {
  const idx = k - oddCount;
  answer = 2n * idx;
}

console.log(answer.toString());
