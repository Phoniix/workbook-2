/* import com.pluralsight.Book;

import java.util.InputMismatchException;if(checkOut =='Y'){ // User Selects Yes to Check out book // ---------------------------------------

// User Check Out While Loop ----------------------------------------------------------------------
boolean confirmCheckOut = false;
                        while(!confirmCheckOut){ // UCO Loop Start // --------------------------------------------------

        System.out.

println("\nPlease choose an option from listed books: ");

int checkOutCounter = 0;

                            for(
Book checkOutbook :bookInventory){
        if(!checkOutbook.

getIsBookIsCheckedOut() &&checkOutbook !=null){
        System.out.

println("\n---------------------------------------------");
                                    System.out.

println("Book Entry #: "+checkOutbook.getBookID());
        System.out.

println("Book ISBN: "+checkOutbook.getBookISBN());
        System.out.

println("Book Title: "+checkOutbook.getBookTitle());
        System.out.

println("To check out this book press ("+checkOutbook.getBookID() +")");
        System.out.

println("---------------------------------------------");
                                }
                                        }

                                        // Check Out Selection // -------------------------------------------------------------------------

                                        System.out.

println("\nPlease make your selection now.");
                            System.out.

println("Enter: ");

int userCheckOut = 0;

// Try catch for valid input // -------------------------------------------------------------------
                            try{
userCheckOut =Integer.

parseInt(scanner.nextLine().

trim());
        }catch(
NumberFormatException e){
        System.out.

println("\n----------------------------");
                                System.out.

println("Invalid Input. Numbers Only.");
                                System.out.

println("----------------------------");
                            }catch(
InputMismatchException e){
        System.out.

println("\n----------------------------");
                                System.out.

println("Invalid Input. Number Out Of Range.");
                                System.out.

println("----------------------------");
                            }


                                    if(userCheckOut ==book.

getBookID()){
char userConfirm = 0;
                                while(userConfirm ==0){
        for(
Book checkOutBook :bookInventory){
        if(checkOutBook.

getBookID() ==userCheckOut){
        System.out.

println("\n---------------------------------------------");
                                            System.out.

println("Book Entry #: "+checkOutBook.getBookID());
        System.out.

println("Book ISBN: "+checkOutBook.getBookISBN());
        System.out.

println("Book Title: "+checkOutBook.getBookTitle());
        System.out.

println("---------------------------------------------");

                                            System.out.

println("Please Confirm (Y) or (N).");
                                            System.out.

println("(Y)es or (N)o?");

userConfirm =scanner.

nextLine().

trim().

toUpperCase().

charAt(0);

String userName = "";
                                            while(userName.

equals("")){
        if(userConfirm =='Y'){
        System.out.

println("\nPlease enter first and last name to check out.");
                                                    System.out.

println("Enter");

String[] userNameInput = scanner.nextLine().trim().toLowerCase().split(" ");
userName =userNameInput[0].

substring(0,1).

toUpperCase() +userNameInput[0].

substring(1) +userNameInput[1].

substring(0,1).

toUpperCase() +userNameInput[1].

substring(1);
                                                    checkOutBook.

checkOut(userName);
                                                }else if(userConfirm =='N'){
        System.out.

println("Returning to Display Screen...");
                                                    try{
                                                            Thread.

sleep(1000);
                                                    }catch(
InterruptedException e){
        System.out.

println("Code Broke");
                                                        throw new

RuntimeException();
                                                    }
confirmCheckOut =true;
        }else{
        System.out.

println("\n----------------------------");
                                                    System.out.

println("Invalid Input.");
                                                    System.out.

println("----------------------------");
                                                }
                                                        }
                                                        }
                                                        }


                                                        }
                                                        }
                                                        } // UCO Loop End // ------------------------------------------------------------------------------

                                                        }
                                                        }
                                                        }
                                                        }

                                                        }
                                                        }
*/