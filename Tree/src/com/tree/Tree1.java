package com.tree;




public class Tree1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeOpr tree1=new TreeOpr();
		TreeOpr tree2=new TreeOpr();
		
		tree1.entryFunct(10);
		tree1.entryFunct(5);
		tree1.entryFunct(15);
		tree1.entryFunct(30);
		tree1.entryFunct(45);
		tree1.entryFunct(25);
		tree2.entryFunct(10);
		tree2.entryFunct(5);
		tree2.entryFunct(15);
		
		
		
		//System.out.println(tree1.findSize(tree1.getRoot()));
		
		TreeOpr topr =new TreeOpr();
		//topr.display(tree1.getRoot());
		//topr.mirrortree(tree1.getRoot());
		//topr.display(tree1.getRoot());
		topr.printPath(tree1.getRoot(), new int[10], 0);
		//System.out.println(topr.isIdentical(tree1.getRoot(), tree2.getRoot()));
		System.out.println(topr.findLCA(tree1.getRoot(), 5, 45).num);
		//System.out.println("Depth " + topr.findDepth(tree1.getRoot()));
	}

}
