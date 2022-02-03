/**
 Mohamad Sayyad
991656975
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card ice = new Card("ice",5);
        ice.setSuit("Spades");
        System.out.println(""+ice.getSuit());
        System.out.println(""+ice.getValue());
    }
}
