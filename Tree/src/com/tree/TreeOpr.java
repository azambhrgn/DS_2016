package com.tree;

import java.util.concurrent.Delayed;

public class TreeOpr {

	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node createTree_rec(Node temp, int num) {

		if (temp == null) {
			Node n_root = new Node(num);
			temp = n_root;
			return temp;
		}

		if (temp.num >= num) {
			temp.left = createTree_rec(temp.left, num);
		} else {
			temp.right = createTree_rec(temp.right, num);
		}

		return temp;
	}

	public void entryFunct(int num) {
		Node root = getRoot();
		root = createTree_rec(root, num);
		setRoot(root);
	}

	public void display(Node temp) {
		if (temp == null) {
			return;
		}

		display(temp.left);
		System.out.println(temp.num);
		display(temp.right);

	}

	/* Size of tree */

	public int findSize(Node temp) {

		if (temp == null) {
			return 0;
		}

		return 1 + findSize(temp.left) + findSize(temp.right);

	}

	/* Check if tree are identicals */

	public boolean isIdentical(Node t1, Node t2) {

		if (t1 == null && t2 == null) {
			return true;
		}

		if (t1 != null && t2 != null) {

			return ((t1.num == t2.num) && (isIdentical(t1.left, t2.left)) && (isIdentical(
					t1.right, t2.right)));
		}

		return false;
	}

	/* Find Depth */
	public int findDepth(Node temp) {
		int left = 0, right = 0;
		if (temp == null) {
			return 0;
		}

		left = 1 + findDepth(temp.left);
		right = 1 + findDepth(temp.right);

		if (left > right) {
			return left;
		} else {
			return right;
		}
	}

	/* Mirror tree */

	public void mirrortree(Node temp) {

		if (temp == null) {
			return;
		}

		mirrortree(temp.left);
		mirrortree(temp.right);

		Node tswap = temp.left;
		temp.left = temp.right;
		temp.right = tswap;

	}

	/* Print Root to leaf path */

	public void printPath(Node temp, int[] arr, int len) {
		if (temp == null) {
			return;
		}

		arr[len] = temp.num;
		len++;

		if (temp.left == null && temp.right == null) {
			//int l = arr.length;
			for (int i = 0; i < len; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			printPath(temp.left, arr, len);
			printPath(temp.right, arr, len);
		}

	}
	
/* Find LCA of given two nodes*/ 
	
	public Node findLCA(Node temp,int a,int b) {
		if(temp == null) {
			return null;
		}
		
		if(temp.num > a && temp.num > b) {
			return findLCA(temp.left,a,b);
		}
		if(temp.num < a && temp.num < b) {
			return findLCA(temp.right,a,b);
		}
		return temp;
	}
}










