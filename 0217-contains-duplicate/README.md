## 🔢 [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)  
**Difficulty:** Easy  

### 📝 Problem Statement  
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and `false` if every element is distinct.

### 🧪 Examples  

**Example 1:**  
> Input: `nums = [1, 2, 3, 1]`  
> Output: `true`  
> Explanation: The number 1 appears more than once.

**Example 2:**  
> Input: `nums = [1, 2, 3, 4]`  
> Output: `false`  
> Explanation: All elements are unique.

**Example 3:**  
> Input: `nums = [1,1,1,3,3,4,3,2,4,2]`  
> Output: `true`  
> Explanation: Several numbers are repeated.

### ✅ Constraints  
- `1 <= nums.length <= 10⁵`  
- `-10⁹ <= nums[i] <= 10⁹`  

---

### 💡 Approach (using HashSet)  
Use a set to keep track of elements seen so far. If an element is already in the set, a duplicate exists.  

- **Time Complexity**: O(n)  
- **Space Complexity**: O(n)  
