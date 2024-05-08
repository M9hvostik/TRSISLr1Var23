
package Lr1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 0
 */
public class Product {
    private String name;
    private Date productionDate;
    private Date expirationDate;
    private final String formatDate = "yyyy-mm-dd";
    
    public Product(String newName, String newProductionDate, String newExpirationDate) throws ParseException
    {
        name = newName;
        productionDate = new SimpleDateFormat(formatDate).parse(newProductionDate);
        expirationDate = new SimpleDateFormat(formatDate).parse(newExpirationDate);
    }
    
    public void setName(final String newName)
    {
        name = newName;
    }
    public void setProductionDate(final Date newProdDate)
    {
        productionDate = newProdDate;
    }
    public void setProductionDate(final String newProdDate) throws ParseException
    {
        productionDate = new SimpleDateFormat(formatDate).parse(newProdDate);
    }
    
    public void setExpirationDate(final Date newExpDate)
    {
        expirationDate = newExpDate;
    }
    public void setExpirationDate(final String newExpDate) throws ParseException
    {
        expirationDate = new SimpleDateFormat(formatDate).parse(newExpDate);
    }
    
    public String getName()
    {
        return name;
    }
    
    public Date getProductionDate()
    {
        return productionDate;
    }
    public String getStringProductionDate()
    {
        return new SimpleDateFormat(formatDate).format(productionDate);
    }
    
    public Date getExpirationDate()
    {
        return expirationDate;
    }
    public String getStringExpirationDate()
    {
        return new SimpleDateFormat(formatDate).format(expirationDate);
    }
}
