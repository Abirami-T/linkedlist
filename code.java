/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    Node head=null;
    public static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
 public Node tail=null;
  public void insert(int data){
      Node newnode=new Node(data);
      if(head==null){
          head=tail=newnode;
      }else{
          tail.next=newnode;
          tail=newnode;
      }
  }
  public void display(){
      Node temp=head;
      while(temp.next!=null){
          System.out.println(temp.data);
          temp=temp.next;
      }
      System.out.println(temp.data);
  }
  
  public void insertf(int data){
      Node newnode=new Node(data);
      if(head==null){
          head=newnode;
      }else{
          newnode.next=head;
          head=newnode;
      }
  }
  public void insertat(int index,int data){
      Node temp=head;
      Node newnode=new Node(data);
      int count=0;
      while(temp==null){
          count++;
          if(count==index-1){
              break;
          }
          temp=temp.next;
      }
      newnode.next=temp.next;
      temp.next=newnode;
  }
  public void deletef(){
      head=head.next;
  }
  public void deletel(){
      Node temp=head;
      while(temp!=null){
          System.out.println("summaa fun"+temp.data);
          if(temp.next.next==null){
              temp.next=null;
          }
          temp=temp.next;
      }
      temp=null;
  }
  public void deleteat(int index){
      Node temp=head;
      int count=0;
      while(temp!=null){
          count++;
          System.out.println("summaa fun//"+temp.data);
          if(count==index-1){
               Node f=temp.next;
               temp.next=f.next;
              break;
          }
          temp=temp.next;
      }
     
   }

	public static void main(String[] args) {
		System.out.println("Hello World");
	    Main l=new Main();
		l.insert(2);
		l.insert(7);
		
		l.display();
		System.out.println("------------------");
		l.insert(3);
		
		l.display();
		System.out.println("------------------");
		l.insertf(1);
		
		l.display();
		System.out.println("------------------");
		l.insertat(2,5);
		
		l.display();
		System.out.println("------------------");
		l.deletef();
		
		l.display();
		System.out.println("------------------");
		l.deletel();
		
		l.display();
		System.out.println("------------------");
		l.deleteat(2);
		
		l.display();
		System.out.println("------------------");
	}
}
