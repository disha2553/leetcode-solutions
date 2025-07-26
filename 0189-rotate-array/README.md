<h2><a href="https://leetcode.com/problems/rotate-array">189. Rotate Array</a></h2><h3>Medium</h3><hr><p>Given an integer array <code>nums</code>, rotate the array to the right by <code>k</code> steps, where <code>k</code> is non-negative.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong>Output:</strong> [5,6,7,1,2,3,4]
<strong>Explanation:</strong>
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [-1,-100,3,99], k = 2
<strong>Output:</strong> [3,99,-1,-100]
<strong>Explanation:</strong> 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

<hr>

<h3>Approach: Reversal Algorithm</h3>
<p>We use the reversal method to rotate the array in-place. First, reverse the entire array. Then reverse the first <code>k</code> elements, and finally reverse the remaining <code>n - k</code> elements. This technique achieves the desired rotation without using extra space and is efficient for large arrays.</p>

<h3>Time Complexity:</h3>
<p>O(n) — Each reversal takes O(n), and we perform three reversals.</p>

<h3>Space Complexity:</h3>
<p>O(1) — No extra space is used; all operations are in-place.</p>
