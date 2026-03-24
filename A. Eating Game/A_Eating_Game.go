/*
I have no idea what to do with myself. And while I wait for my epiphany,
I feel the toxins collecting in my body.
*/

package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	in := bufio.NewReader(os.Stdin)
	out := bufio.NewWriter(os.Stdout)
	defer out.Flush()

	var t int
	fmt.Fscan(in, &t)

	for ; t > 0; t-- {
		var n int
		fmt.Fscan(in, &n)

		maxValue := 0
		count := 0

		for i := 0; i < n; i++ {
			var x int
			fmt.Fscan(in, &x)

			if i == 0 || x > maxValue {
				maxValue = x
				count = 1
			} else if x == maxValue {
				count++
			}
		}

		fmt.Fprintln(out, count)
	}
}
