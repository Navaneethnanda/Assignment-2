class HelperClass{

Node yup(Node root,int key){
    if(root.value==key){
        return root;
    }
    if(root.left!=null && root.left.value==key){
        if(root.count<root.left.count+1){
            return leftRotate(root);
        }
        else{
            root.left.count+=1;
            return root;
        }
    }
    if(root.right!=null && root.right.value==key){
        if(root.count<root.right.count+1){
            return rightRotate(root);
        }
        else{
            root.right.count+=1;
            return root;
        }

    }

    if(root.value>key){
        root.left=yup(root.left,key);
    }
    else{
        root.right=yup(root.right,key);
    }

return root;
}
    int height(Node root,int key) {
        int h = 1;
        Node temp = root;
        while (temp != null) {

            if (key == temp.value) {
                return h;
            }
            if (key < temp.value) {
                temp = temp.left;

            } else {
                temp = temp.right;
            }
            h += 1;
        }
return 0;
    }

    Node leftRotate(Node parent){
        Node pl=parent.left;
        Node plr=parent.left.right;
        Node p=parent;


        parent=pl;
        parent.right=p;
        parent.right.left=plr;
        return parent;
    }
    Node rightRotate(Node parent){
        Node pr=parent.right;
        Node prl=parent.right.left;
        Node p=parent;


        parent=pr;
        parent.left=p;
        parent.left.right=prl;
        return parent;
    }

    void tozero(Node parent){
        if(parent ==null){
            return;
        }
        parent.count=0;
        tozero(parent.left);
        tozero(parent.right);
    }









}

