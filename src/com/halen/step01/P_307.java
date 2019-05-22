package com.halen.step01;

/**
 * 区域和检索-数组可修改，LeetCode第307题
 * @author halen
 *
 */
public class P_307 {
	
	//使用数组来解决
//	private int[] data;
//	private int[] sum;
//	public void NumArray(int[] nums) {
//        data = new int[nums.length];
//        for(int i=0;i<nums.length;i++)
//        	data[i] = nums[i];
//        sum = new int[nums.length+1];
//        sum[0] = 0;
//        for(int i=1;i<sum.length;i++)
//        	sum[i] = sum[i-1] + nums[i-1];
//    }
//    
//    public void update(int i, int val) {
//        data[i] = val;
//        for(int j=i+1;j<sum.length;j++) {
//        	sum[j] = sum[j-1] + data[j-1];
//        }
//    }
//    
//    public int sumRange(int i, int j) {
//        return sum[j+1] - sum[i];
//    }
	
	//使用线段树解决
	private SegmentTree<Integer> segTree;
	public void NumArray(int[] nums) {
		if(nums.length!=0) {
			Integer[] data = new Integer[nums.length];
			for(int i=0;i<nums.length;i++)
				data[i] = nums[i];
			segTree = new SegmentTree<Integer>(data, (a,b)->a+b);
		}
	}
	
	public void update(int i,int val) {
		if(segTree==null)
			throw new IllegalArgumentException("Error");
		segTree.set(i, val);
	}
	
	public int sumRange(int i,int j) {
		if(segTree==null)
			throw new IllegalArgumentException("Error");
		return segTree.query(i, j);
	}
    
    private interface Merger<E> {
        E merge(E a, E b);
    }
    
    private class SegmentTree<E>{
    	private E[] tree;
    	private E[] data;
    	private Merger<E> merger;
    	
    	public SegmentTree(E[] arr,Merger<E> merger) {
    		this.merger = merger;
    		data = (E[]) new Object[arr.length];
    		for(int i=0;i<arr.length;i++)
    			data[i] = arr[i];
    		tree = (E[]) new Object[4 * arr.length];
    		buildSegmentTree(0, 0, arr.length-1);
    	}
    	
    	private void buildSegmentTree(int treeIndex,int l,int r) {
    		if(l==r) {
    			tree[treeIndex] = data[l];
    			return ;
    		}
    		int leftTreeIndex = leftChild(treeIndex);
    		int rightTreeIndex = rightChild(treeIndex);
    		int mid = l + (r-l)/2;
    		buildSegmentTree(leftTreeIndex, l, mid);
    		buildSegmentTree(rightTreeIndex, mid+1, r);
    		tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);
    	}
    	
    	public int getSize() {
    		return data.length;
    	}
    	
    	public E get(int index) {
    		if (index < 0 || index >= data.length) {
                throw new IllegalArgumentException("Index is illegal");
            }
            return data[index];
    	}
    	
    	private int leftChild(int index) {
            return 2 * index + 1;
    	}
    	
    	private int rightChild(int index) {
            return 2 * index + 2;
        }
    	
    	//返回区间[queryL, queryR]的值
        public E query(int queryL, int queryR) {
            if (queryL < 0 || queryL >= data.length || queryR < 0 || queryR >= data.length
                    || queryL > queryR) {
                throw new IllegalArgumentException("Index is illegal.");
            }
            return query(0, 0, data.length - 1, queryL, queryR);
        }

        //在以treeID为根的线段树中[l...r]的范围里，搜索区间[queryL...queryR]的值
        private E query(int treeIndex, int l, int r,int queryL,int queryR) {
            if(l == queryL && r == queryR)
                return tree[treeIndex];
            int mid = l + (r - l) / 2;
            int leftTreeIndex = leftChild(treeIndex);
            int rightTreeIndex = rightChild(treeIndex);
            if(queryL >= mid + 1)
                return query(rightTreeIndex, mid + 1, r, queryL, queryR);
            else if (queryR <= mid)
                return query(leftTreeIndex, l, mid, queryL, queryR);
            E leftReuslt = query(leftTreeIndex, l, mid, queryL, mid);
            E rightResult = query(rightTreeIndex, mid + 1, r, mid + 1, queryR);
            return merger.merge(leftReuslt, rightResult);
        }
        
        public void set(int index, E e) {
            if (index < 0 || index >= data.length) {
                throw new IllegalArgumentException("Index is illegal");
            }
            data[index]  = e;
            set(0, 0, data.length - 1, index, e);
        }
        
        private void set(int treeIndex, int l, int r, int index, E e) {
            if (l == r) {
                tree[treeIndex] = e;
                return;
            }
            int mid = l + (r - l) / 2;
            int leftTreeIndex = leftChild(treeIndex);
            int rightTreeIndex = rightChild(treeIndex);
            if (index >= mid + 1)
                set(rightTreeIndex, mid + 1, r, index, e);
            else
                set(leftTreeIndex, l, mid, index, e);
            tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);
        }
        
    }
}
