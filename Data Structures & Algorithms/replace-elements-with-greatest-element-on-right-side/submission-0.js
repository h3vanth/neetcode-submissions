class Solution {
    /**
     * @param {number[]} arr
     * @return {number[]}
     */
    replaceElements(arr) {
        const resArr = [];
        let r = 1;
        while (r < arr.length) {
            let max = 0;
            for (let i = r; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            resArr.push(max);
            r++;
        }
        resArr.push(-1);
        return resArr;
    }
}
