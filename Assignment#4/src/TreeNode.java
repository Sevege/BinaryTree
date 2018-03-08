/**
 * Tree node implementation
 * @author yingdong
 */
public class TreeNode {
  private TreeNode leftNode;
  private TreeNode rightNode;
  private int value;
  /**
   * Node constructor with initial node value
   * @param value value of this node
   */
  public TreeNode(int value) {
    leftNode = null;
    rightNode = null;
    this.value = value;
  }
  /**
   * Set left node for this node
   * @param node Left node for this node
   */
  public void setLeftNode(TreeNode node){
    this.leftNode = node; 
  }
  /**
   * Set right node for this node
   * @param node Right node for this node
   */
  public void setRightNode(TreeNode node){
    this.rightNode = node; 
  }
  /**
   * Set value for this node
   * @param value Value for this node
   */
  public void setValue(int value){
    this.value = value;
  }
  /**
   * @return Left node for this node
   */
  public TreeNode getLeftNode() {
    return leftNode;
  }
  /**
   * @return Right node for this node
   */
  public TreeNode getRightNode() {
    return rightNode;
  }
  /**
   * @return Current value for this node
   */
  public int getValue() {
    return value;
  }
}