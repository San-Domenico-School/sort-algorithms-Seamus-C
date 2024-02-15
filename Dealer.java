import greenfoot.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class declares, instantiates, and initializes a new deck.  Students 
 * should then implement the sort method at the botton of this class to see 
 * if they understanding basic ArrayList sort algorithms.
 * 
 * @author Bruce Gustin
 * @version Feb 8, 2023
 */

public class Dealer extends Actor
{
    private Deck deck;
    private Card[] shuffledDeck;
    private Card[] selectionSort;
    private Card[] insertionSort;
    private Card[] mergeSort;
    
    // Instantiates a new deck
    public Dealer()
    {
        deck = new Deck();
        shuffledDeck = deck.getShuffledDeck();
        initializeSortArrays();
    }
    
    // Adds cards to board after Deck is initialized
    public void addedToWorld(World world)
    {
        showCards(world, shuffledDeck, 80);
        showCards(world, selectionSort(selectionSort, shuffledDeck.length), 220);
        showCards(world, insertionSort(insertionSort, shuffledDeck.length), 360);
        showCards(world, mergeSort(mergeSort, shuffledDeck.length), 500);
    }    
    // Shuffles the unshuffled deck
    
    
    // Sets all the sorted arrays equal to the shuffledCard array
    private void initializeSortArrays()
    {
        selectionSort = new Card[shuffledDeck.length];
        insertionSort = new Card[shuffledDeck.length];
        mergeSort = new Card[shuffledDeck.length];
        
        for(int i = 0; i < shuffledDeck.length; i++)
        { 
            Card card1 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card2 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card3 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            selectionSort[i] = card1;
            insertionSort[i] = card2;
            mergeSort[i] = card3;
        }
    }
    
    // Places card on board at y
    private void showCards(World world, Card[] cards, int y)
    {
        
       for(int i = 0; i < cards.length; i++)
       {
           world.addObject(cards[i],58 + 30 * i, y);
       } 
    }
    
    /* This is where the students attempt their sort algorithm by taking the
     * cards from the shuffled list and adding them to the sorted list.     
    **/
    
    /* In this space write the pseudocode for your selection sort
     * 
     * it will get a unsorted arry of cards and starting from the first index it will
     * check with all all ther cards in deck if that cards value is smaller than its self.
     * If it is smaller than its self it swaps its value with the card checked. When it 
     * finds the smalles card in the deck it will put it in a nsorted card array in order 
     * of smallest to larges.
     * 
     */
    private Card[] selectionSort(Card[] arr, int n)
    {
        //put sort algorithm here
        
        for(int i = 0; i < arr.length; i++)
        {
            int currentSmallest = i;
            
            for(int k = i; k < arr.length; k++)
            {
                if(arr[currentSmallest].getValue() > arr[k].getValue())
                {
                    currentSmallest = k;
                }
            }
            
            Card holdWhileSwap = arr[i];
            arr[i] = arr[currentSmallest];
            arr[currentSmallest] = holdWhileSwap;
        }
        
        return arr;
    }
    
    /* In this space write the pseudocode for your insertion sort
     * 
     * everything gets added to and ArrayList. Then the rest of the card gets 
     * compared to the unsorted part. It itetating through all cards. If the card that is being checked is greater 
     * it checks if the  next card is grater. If it is smaller it is put before the card it is checking 
     * against. If it checkes all the card and is the graitest it is added to the end of the ussorted ArrayList
     * 
     */
    private Card[] insertionSort(Card[] arr, int n)
    {
        //put sort algorithm here
        ArrayList<Card> cards = new ArrayList(Arrays.asList(arr));
        
        for(int i = 1; i < arr.length; i++)
        {
            for(int k = 0; k < i; k++)
            {
                if(cards.get(i).getValue() < cards.get(k).getValue())
                {
                    cards.add(k, cards.get(i));
                    cards.remove(i + 1);
                    break;
                }
            }
        }
        
        
        /*
        for(int i = 1; i < arr.length; i++)
        {
            for(int k = 0; k < cards.size(); k++)
            {
                if(arr[i].getValue() < cards.get(k).getValue())
                {
                    cards.add(k, arr[i]);
                }
            }
        }
        */
       
        Card[] arrayCards = cards.toArray(new Card[cards.size()]);
        return arrayCards;
    }
    
    /* In this space write the pseudocode for your merge sort
     * 
     * 
     * 
     */
    private Card[] mergeSort(Card[] arr, int n)
     {
        
        //put sort algorithm here
        
        return mergeSort;
    }
}

