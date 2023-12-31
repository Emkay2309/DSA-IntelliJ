package Binary_Search_Trees;

public class SortedArraytoBalancedBST {
    public static void main(String[] args) {
        int arr [] = {3,5,6,8,10,11,12};
        TreeNode ans = createBST(arr , 0 , arr.length-1);
        inOrder(ans);
        System.out.println("Null");
    }

    private static void inOrder(TreeNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+"-->");
        inOrder(root.right);
    }
    private static TreeNode createBST(int[] arr, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr , start , mid-1);
        root.right = createBST(arr , mid+1 , end);

        return root;
    }
}
