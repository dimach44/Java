
package ordernumbers;

public class Address
{
    private String houseNumber;
    private String apartmentNumber;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    Address()
    {
        
    }
    Address(String h, String s, String c, String t, String p)
    {
        houseNumber = h;
        street = s;
        city = c;
        state = t;
        postalCode = p;
    }
}
