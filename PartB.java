
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     * 
     * @param url
     *            String that represents an URL that the user has visited
     * @param numVisits
     *            An int that represents the number of times that the user has
     *            visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     * 
     * @return An int that represents the number of times that the user has visited
     *         the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     * 
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times that we have visited the url
     * 
     * @param an
     *            int that represents the number that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }

}

public class PartB{

    private static Queue<SiteStats> sites = new LinkedList<SiteStats>();


    // Main method to list top n visited sites
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {
        // WRITE CODE HERE
        //SORT USING RECURSION
       sortTheList(sites.peek());
       // REMOVE THE DUPLICATE SITE SInce it was just to initiate the recursion
       sites.remove();
       // PRINT THE TOP FIVE SITES
       for(SiteStats e : sites)
       {
            if(n==0)
            break;

            System.out.println(e);
            --n;
       }
    }
    public static void sortTheList(SiteStats obj)
    {
        if(sites.size()==0)
        {
            sites.add(obj);
        }
        else
        {
            SiteStats temp = getMax();
            removeMax(temp);
            sortTheList(temp);
            sites.add(temp);
            
        }
    }

    public static void removeMax(SiteStats temp)
    {
        int n = sites.size();
        for(int i = 0;i<n;i++)
        {
            if(temp.getUrl().equals(sites.peek().getUrl()))
            {
                sites.remove();
                
            }
            else
            {
                SiteStats a = sites.remove();
                sites.add(a);
            }
        }
    }
    public static SiteStats getMax()
    {
        SiteStats max = sites.peek();
        for(int i = 0;i<sites.size();i++)
        {
            if(max.getNumVisits()>sites.peek().getNumVisits())
            {
                max=sites.peek();
                SiteStats obj = sites.remove();
                sites.add(obj);
            }
            else{
                SiteStats obj = sites.remove();
                sites.add(obj);
            }
        }
        return max;
    }

    // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static void updateCount(String url) {
        // WRITE CODE HERE
        if(!hasSite(url))
        {
            sites.add(new SiteStats(url,1));
        }
        else
        {
            for(SiteStats e : sites)
            {
                if(e.getUrl().equals(url))
                {
                    int temp = e.getNumVisits();
                    e.setNumVisits(++temp);
                }
            }
        }
    }
    public static boolean hasSite(String url)
    {
        for(SiteStats e : sites)
        {
            if(e.getUrl().equals(url))
            {
                return true;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        String[] visitedSites = { "www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com" };

        for (String url : visitedSites) {
            updateCount(url);
        }
        listTopVisitedSites(sites, 5);

    }

}
