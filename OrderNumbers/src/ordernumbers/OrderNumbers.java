
package ordernumbers;

public class OrderNumbers {

    public static void main(String[] args)
    {
        int lottoNumbers[] = new int[6];
        final int UPPER_LIMIT=100;
        for (int i=0;i<2;i++)
        {
            lottoNumbers[i] = (int)Math.floor(Math.random()*UPPER_LIMIT)+1;
            if (i>0)
            {
                for (int j=0;j<i;j++)
                {
                    if (lottoNumbers[i]==lottoNumbers[j])
                    {
                        i--;
                    }
                }
            }
        }
        boolean isSorted = true;
        for (int i = 1; i < lottoNumbers.length; i++)
        {
            if (lottoNumbers[i-1] > lottoNumbers[i])
            {
                isSorted = false;
                break;
            }
        }
        System.out.println("Sorted: " + isSorted);
        System.out.println("Sorted: " + isInOrder(lottoNumbers));
    }
    private static boolean isInOrder(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i-1] > arr[i])
            {
                return false;
            }
        }
        return true;
    }
}
