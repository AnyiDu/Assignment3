public class problem2 {
	public int countSubarrays(int[] nums) {
		int n = nums.length;
		int[] prefixSum = new int[n+1];
		int count = 0;
		prefixSum[0] = 0;
		for (int i = 1; i <= n; i++) {
			prefixSum[i] = prefixSum[i-1] + (nums[i-1] == 1 ? 1 : -1);
			for (int j = 0; j < i; j++) {
				if (prefixSum[i] > prefixSum[j]) {
					count++;
				}
			}
		}
		return count;
	}
}
