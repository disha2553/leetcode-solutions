<h2><a href="https://leetcode.com/problems/minimum-size-subarray-sum">209. Minimum Size Subarray Sum</a></h2><h3>Medium</h3><hr><p>Given an array of positive integers <code>nums</code> and a positive integer <code>target</code>, return <em>the <strong>minimal length</strong> of a </em><span data-keyword="subarray-nonempty"><em>subarray</em></span><em> whose sum is greater than or equal to</em> <code>target</code>. If there is no such subarray, return <code>0</code> instead.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> target = 7, nums = [2,3,1,2,4,3]
<strong>Output:</strong> 2
<strong>Explanation:</strong> The subarray [4,3] has the minimal length under the problem constraint.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> target = 4, nums = [1,4,4]
<strong>Output:</strong> 1
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> target = 11, nums = [1,1,1,1,1,1,1,1]
<strong>Output:</strong> 0
</pre>

<hr>

<h3>Approach: Sliding Window</h3>
<p>We use two pointers to create a sliding window. We expand the window by moving the right pointer and keep adding elements to the current sum. Once the sum is greater than or equal to the target, we try to shrink the window from the left while maintaining the condition. During this, we update the minimum window size. If no valid subarray is found, we return 0.</p>

<h3>Time Complexity:</h3>
<p>O(n) — Each element is visited at most twice, once by the right pointer and once by the left.</p>

<h3>Space Complexity:</h3>
<p>O(1) — Constant space is used regardless of input size.</p>
