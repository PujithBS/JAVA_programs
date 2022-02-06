import java.lang.Math;
import java.util.Scanner;
class book{
         String name, author,nm,aut;
         double price,pr;
         int num_pages,no;
         book(String bname, String aname, double prc, int no_pages){
             this.name=bname;
             this.author=aname;
             this.price=prc;
             this.num_pages=no_pages;
          }
         book(){
          }
        void set_details(){
                  System.out.println("####### BOOK DETAILS INPUT INTERFACE #######");
                  Scanner input=new Scanner(System.in);
                  System.out.println("Please Input here the book name :");
                  nm=input.nextLine();
                  System.out.println("Please Enter Author name of the Boom here :");
                  aut=input.nextLine();
                  System.out.println("Enter here price details of the book:");
                  pr=input.nextDouble();
                  System.out.println("Number of pages in the book:");
                  no=input.nextInt();
             }
         void toString(){
                  System.out.println("### Details of the Book ###");
                  System.out.println("Book NAME :- "+name);
                  System.out.println("Author    :- "+author);
                  System.out.println("Price     :- "+price+"/-");
                  System.out.println("Number of Pages:- "+num_pages);
         }
  public static void main(){
                  int n;
                  Scanner input=new Scanner(System.in);
                  System.out.println("Enter the number of books you want to have in your library:");
                  n=input.nextInt();
                  book b[]=new book[n];
                  book t[]=new book[n];
                  for(int i=0;i<n;i++){
                      t[i]=new book();
                      t[i].set_details();
                      b[i]=new book(t[i].nm, t[i].aut, t[i].pr, t[i].no);
                      b[i].toString();
         }
   }
}
                     
                  
                  
                 
