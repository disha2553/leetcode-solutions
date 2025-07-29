<h2><a href="https://leetcode.com/problems/longest-substring-without-repeating-characters">3. Longest Substring Without Repeating Characters</a></h2><h3>Medium</h3><hr><p>Given a string <code>s</code>, find the length of the <strong>longest</strong> <span data-keyword="substring-nonempty"><strong>substring</strong></span> without duplicate characters.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;abcabcbb&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;abc&quot;, with the length of 3.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;bbbbb&quot;
<strong>Output:</strong> 1
<strong>Explanation:</strong> The answer is &quot;b&quot;, with the length of 1.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> s = &quot;pwwkew&quot;
<strong>Output:</strong> 3
<strong>Explanation:</strong> The answer is &quot;wke&quot;, with the length of 3.
Notice that the answer must be a substring, &quot;pwke&quot; is a subsequence and not a substring.
</pre>

<hr>

<h3>Approach: Sliding Window with HashSet</h3>
<p>We use two pointers to maintain a window and a HashSet to store unique characters. If the current character is not in the set, we add it and update the maximum length. If it is already in the set, we remove characters from the left until the duplicate is removed. This allows us to efficiently track the longest substring without repeating characters.</p>

<h3>Time Complexity:</h3>
<p>O(n) — Each character is visited at most twice, once by the right pointer and once by the left.</p>

<h3>Space Complexity:</h3>
<p>O(k) — Where k is the number of unique characters in the string (could be up to 128 or 256 depending on character set).</p>
