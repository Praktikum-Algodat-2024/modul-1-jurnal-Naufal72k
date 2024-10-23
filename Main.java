

 class Node {
    String nama;
    String skill;
    int umur;
    String hobi;
    Node next;
   

    public Node (String nama,String skill,int umur , String hobi ){
        this.nama=nama;
        this.skill=skill;
        this.umur=umur;
        this.hobi=hobi;
    }
    @Override
    public String toString(){
        return nama + umur + hobi;
    }
}
 


class LL {
    
    Node head;
    

    
    public void TambahFirst (String nama,String skill,int umur, String hobi){
        Node baru = new Node(nama,skill,umur,hobi);

        if(head == null){
            head = baru;
            
            
            
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next=baru;
            
            
        }
    }
    public void TambahLast (String nama,String skill,int umur, String hobi){
        Node baru = new Node(nama,skill,umur,hobi);

        if(head == null){
            head = baru;
            
            
        }else{
            baru.next=head;
            head=baru;
            
        }
    }
   

    public void Tampilkan (){
        Node current = head;
        while (current != null){
            System.out.println("nama : "+current.nama);
            System.out.println("skill : "+ current.skill);
            System.out.println("Umur : "+current.umur);
            System.out.println("Hobi : "+current.hobi);
            System.out.println("===============================");
            current = current.next;
        }
    }
    public Node DeleteFisrt(){
        
        if (head!= null){
            head = head.next;
        }
        return null;
       
    }
    public Node DeleteLast (){
        if (head.next == null){
            head = null;
        }else {
            Node temp = head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next =null;
        }
        return null;
    }
}


public class Main {
    


    public static void main(String[] args) {
        LL n = new LL();

        n.TambahLast("Vadel;", "Dancer geter", 19, "dance");
        n.TambahLast("Loli", "ATM Berjalan", 16, "bola");
        n.TambahLast("Agus", "Agus sakit", 35, "donasi");
        n.TambahLast("Fufa Fafa", "Roasting", 30, "Buku Kaskus");
        n.TambahFirst("kak Gem", "Kasi faham", 32, "Bernafas");
      
       
        n.DeleteLast();
        n.DeleteFisrt();
        n.Tampilkan();
        
//        System.out.println ("hai");

    }
}

