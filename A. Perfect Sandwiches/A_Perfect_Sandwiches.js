const fs = require('fs');

function main() {
    const input = fs.readFileSync(0, 'utf-8').trim().split(/\s+/);
    if (input[0] === "") return;

    let ptr = 0;
    let t = parseInt(input[ptr++], 10);

    while (t-- > 0) {
        let a = parseInt(input[ptr++], 10);
        let b = parseInt(input[ptr++], 10);
        let diff = a - b;

        if (diff <= 0) {
            console.log(-1);
        } else {
            console.log(Math.min(b, diff));
        }
    }
}

main();
