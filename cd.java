import java.util.*;
class cd
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter an alphabet from a to z to know which is a vowel and which is a consonant");
        char choice = ob.next().charAt(0);
        switch(choice)
        {
            case 'a':
                case 'e':
                    case 'i': 
                        case 'o':
                            case 'u':
                                case 'A':
                case 'E':
                    case 'I': 
                        case 'O':
                            case 'U':
                                System.out.println("The alphabet is a vowel");
                                default : System.out.println("The alphabet is a consonant");
        }
    }
}