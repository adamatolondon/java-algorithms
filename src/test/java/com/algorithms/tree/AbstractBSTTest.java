package com.algorithms.tree;

public abstract class AbstractBSTTest {
  /* .......... 10 ...... */
  /* ......... / \ ...... */
  /* ........ 7 . 12 .... */
  /* ....... / .......... */
  /* ...... 4 ........... */
  /* ..... / \ .......... */
  /* .... 3 . 6 ......... */
  protected BSTNode createSimpleTree() {
    BSTNode treeL4_1=new BSTNode(6);
    BSTNode treeL4_2=new BSTNode(3);

    BSTNode treeL3=new BSTNode(4);
    treeL3.left=treeL4_2;
    treeL3.right=treeL4_1;

    BSTNode treeL2_1=new BSTNode(7);
    treeL2_1.left=treeL3;

    BSTNode treeL2_2=new BSTNode(12);

    BSTNode treeL1=new BSTNode(10);
    treeL1.left=treeL2_1;
    treeL1.right=treeL2_2;
    return treeL1;
  }


  /* ............. 18 ............... */
  /* ......... / ...... \ ........... */
  /* ........ 13 ....... 30 ......... */
  /* ....... / \ ....... / .......... */
  /* ...... 5 . 14 .... 20 .......... */
  /* ..... / \ ...... / . \ ......... */
  /* .... 2 . 8 .... 19 .. 25........ */
  /* ....... / \ ........ / . \ ..... */
  /* ...... 7 . 9 ...... 24 . 40 .... */
  protected BSTNode createComplexTree() {
    BSTNode treeL5_1=new BSTNode(7);
    BSTNode treeL5_2=new BSTNode(9);
    BSTNode treeL5_3=new BSTNode(24);
    BSTNode treeL5_4=new BSTNode(40);

    BSTNode treeL4_1=new BSTNode(2);
    BSTNode treeL4_2=new BSTNode(8,treeL5_1,treeL5_2);
    BSTNode treeL4_3=new BSTNode(19);
    BSTNode treeL4_4=new BSTNode(25,treeL5_3,treeL5_4);

    BSTNode treeL3_1=new BSTNode(5,treeL4_1,treeL4_2);
    BSTNode treeL3_2=new BSTNode(14);
    BSTNode treeL3_3=new BSTNode(20,treeL4_3,treeL4_4);

    BSTNode treeL2_1=new BSTNode(13,treeL3_1,treeL3_2);
    BSTNode treeL2_2=new BSTNode(30,treeL3_3,null);

    BSTNode treeL1_1=new BSTNode(18,treeL2_1,treeL2_2);
    return treeL1_1;
  }

}
