
import java.util.LinkedList;
import java.util.Queue;
class SearchTree{
    Node root;
HelperClass help=new HelperClass();
    SearchTree(){
        root=null;
    }

    boolean add( int key ){
        Node temp=root;

        if(temp==null){
            root=new Node(key);
            return true;
        }
        while (true){
            if (key==temp.value){
                return false;
            }
            if(key<temp.value){
                if(temp.left==null){
                    temp.left=new Node(key);
                    return true;
                }
                temp=temp.left;

            } else{
                if(temp.right==null){
                    temp.right=new Node(key);
                    return true;
                }
                temp=temp.right;
            }

        }


    }

    int find( int key ){
        root=help.yup(root,key);


    return help.height(root,key);
    }

    void reset( ){
        help.tozero(root);
    }


//    String printTree( ) {}



     void printLevel() {

        int h=0;
        Queue<Node> q = new LinkedList<Node>();
        Queue<Node> p = new LinkedList<Node>();
        q.add(root);
        while (q.size() > 0 || p.size()>0)
        {
            if(h%2==0){
                Node n = q.remove();
                System.out.print(n.value+":"+n.count+"    "); //Only write the value when you dequeue it
                if (q.size()==0){
                    h+=1;
                    System.out.println("  -   "+h);
                }
                if (n.left !=null)
                {
                    p.add(n.left);//enqueue the left child
                }
                if (n.right !=null)
                {
                    p.add(n.right);//enque the right child
                }
            }


            else{
                Node n = p.remove();
                System.out.print(n.value+":"+n.count+"     "); //Only write the value when you dequeue it
                if (p.size()==0){
                    h+=1;
                    System.out.println("  -   "+h);
                }
                if (n.left !=null)
                {
                    q.add(n.left);//enqueue the left child
                }
                if (n.right !=null)
                {
                    q.add(n.right);//enque the right child
                }
            }



        }


    }




}