package Aapna_College_DSA.Recursion.Advanced_Level;

public class Invite_People {
//      Find the number of ways in which you can invite n people to your
//    party,single or in pairs

    public static int invitePeople(int n) {
        if (n==1) {
            return 1;
        }
        if(n==2) {
            return 2;
        }

        // single inviting
        int ways1 = invitePeople(n - 1);
        // pair inviting
        int ways2= (n-1) * invitePeople(n - 2);
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n=2;
        int total = invitePeople(n);
        System.out.println(total);
    }
}

