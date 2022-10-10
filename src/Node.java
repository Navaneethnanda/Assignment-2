class Node{
    int count=0;
    int value;
    Node right=null;
    Node left=null;

    public Node(int value ){
        this.value=value;
        left=null;
        right=null;
    }

    public void visited(){
count+=1;
    }


}