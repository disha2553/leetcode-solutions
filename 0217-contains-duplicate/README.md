<h2><a href="https://leetcode.com/problems/contains-duplicate">217. Contains Duplicate</a></h2>

<h3>Easy</h3>
<hr>

<p>
Given an integer array <code>nums</code>, return <code>true</code> if any value appears <strong>at least twice</strong> in the array, and <code>false</code> if every element is distinct.
</p>

<h3>Example 1:</h3>

<pre>
<strong>Input:</strong> nums = [1, 2, 3, 1]
<strong>Output:</strong> true
</pre>

<h3>Example 2:</h3>

<pre>
<strong>Input:</strong> nums = [1, 2, 3, 4]
<strong>Output:</strong> false
</pre>

<h3>Example 3:</h3>

<pre>
<strong>Input:</strong> nums = [1,1,1,3,3,4,3,2,4,2]
<strong>Output:</strong> true
</pre>

<hr>

<h3>Approach: HashSet</h3>

<p>
We use a <code>HashSet</code> to store elements we’ve seen.  
While iterating through the array, if an element already exists in the set, we return <code>true</code> immediately.  
If no duplicates are found after the loop, we return <code>false</code>.
</p>

<h3>Time Complexity:</h3>

<p>
<code>O(n)</code> — We traverse the array once, and set operations take constant time on average.
</p>

<h3>Space Complexity:</h3>

<p>
<code>O(n)</code> — In the worst case, all n elements are added to the set.
</p>
