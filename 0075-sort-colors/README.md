<h2><a href="https://leetcode.com/problems/sort-colors">75. Sort Colors</a></h2><h3>Medium</h3><hr><p>Given an array <code>nums</code> with <code>n</code> objects colored red, white, or blue, sort them <strong><a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> </strong>so that objects of the same color are adjacent, with the colors in the order red, white, and blue.</p>

<p>We will use the integers <code>0</code>, <code>1</code>, and <code>2</code> to represent the color red, white, and blue, respectively.</p>

<p>You must solve this problem without using the library&#39;s sort function.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,0,2,1,1,0]
<strong>Output:</strong> [0,0,1,1,2,2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,0,1]
<strong>Output:</strong> [0,1,2]
</pre>

<hr>

<h3>Approach: Counting Sort (Two-pass)</h3>
<p>We first count the number of 0s, 1s, and 2s in the array using three counters. Then we overwrite the array by placing the exact number of 0s, then 1s, then 2s in order. This method is efficient because the number of distinct elements is fixed and small.</p>

<h3>Time Complexity:</h3>
<p>O(n) — One full pass for counting and another full pass for rewriting the array.</p>

<h3>Space Complexity:</h3>
<p>O(1) — Only three integer variables are used for counting. No extra array is needed.</p>
