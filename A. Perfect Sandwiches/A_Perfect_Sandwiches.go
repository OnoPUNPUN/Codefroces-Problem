package main

import "fmt"

func main() {
	var t int
	fmt.Scan(&t)
	for ; t > 0; t-- {
		var a, b int
		fmt.Scan(&a, &b)
		diff := a - b
		if diff <= 0 {
			fmt.Println(-1)
		} else {
			fmt.Println(min(b, diff))
		}
	}
}
