/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kerem
 */
public class listeyapisi {
    node head=null;
    node tail=null;
    node temp=null;
    
    void basaekle(int x)
    {   node eleman=new node();
        eleman.data=x;
        eleman.next=null;
        if(head==null)
        { head=eleman;
          tail=eleman;
          System.out.println("listenin ilk nesnesi eklendi");
        }else
        {   eleman.next=head;
            head=eleman;
           // head.next=tail;
           // tail=eleman;
            System.out.println("listenin başına yeni bir nesne  eklendi");
        } 
    }
    void sonaekle(int y)
    {  
       node eleman=new node();
       eleman.data=y;
       eleman.next=null;
       
       if(head==null)
       {
          head=eleman;
          tail=eleman;
          System.out.println("liste oluşdu ilk nesne  eklendi");
       }else
       {
          tail.next=eleman;
          tail=eleman;
          System.out.println("listenin sonuna yeni bir nesne  eklendi");
       }
    }   
    
     void yazdir()
      {   node temp=head;
          while(temp!=null)
          {
            System.out.print("-->"+temp.data);
            temp=temp.next;
          } 
      }      
    
}
