import java.io.PrintStream;

class TreeNode{
	TreeNode left;
	TreeNode right;
	String value;
	
	TreeNode(String s){
		value=s;
	}
}

public class TreeTraverse
{

    public TreeTraverse()
    {
    }

    public static void main(String args[])
    {
    	TreeNode node = new TreeNode("70");
        node.left = new TreeNode("50");
        node.right = new TreeNode("90");
        node.left.left = new TreeNode("25");
        node.right.left = new TreeNode("85");
        node.right.right = new TreeNode("100");
        traverse(node);
    }

    public static void traverse(TreeNode node)
    {
        if(node == null)
        {
            return;
        } else
        {
            traverse(node.left);
            System.out.print(node.value +" ");
            traverse(node.right);
            return;
        }
    }
}