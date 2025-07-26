<h2><a href="https://leetcode.com/problems/same-tree">100. Same Tree</a></h2><h3>Easy</h3><hr><p>Given the roots of two binary trees <code>p</code> and <code>q</code>, write a function to check if they are the same or not.</p>

<p>Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/20/ex1.jpg" style="width: 622px; height: 182px;" />
<pre>
<strong>Input:</strong> p = [1,2,3], q = [1,2,3]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/20/ex2.jpg" style="width: 382px; height: 182px;" />
<pre>
<strong>Input:</strong> p = [1,2], q = [1,null,2]
<strong>Output:</strong> false
</pre>

<p><strong class="example">Example 3:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/12/20/ex3.jpg" style="width: 622px; height: 182px;" />
<pre>
<strong>Input:</strong> p = [1,2,1], q = [1,1,2]
<strong>Output:</strong> false
</pre>

<hr> 
<h3>Approach: Recursive Tree Comparison</h3> 
<p>We use recursion to compare both trees simultaneously. If both nodes are null, we return true. If one is null and the other is not, or if their values don’t match, we return false. Otherwise, we recursively check the left and right children of both nodes. This ensures both structure and values are matched.</p> 

<h3>Time Complexity:</h3> 
<p>O(n) — We visit each node once, where n is the total number of nodes in both trees.</p> 

<h3>Space Complexity:</h3> 
<p>O(h) — Where h is the height of the tree, due to the recursive call stack. In the worst case (skewed tree), it could be O(n).</p>
