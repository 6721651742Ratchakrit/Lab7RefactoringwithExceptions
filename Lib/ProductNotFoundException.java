package Lib;
/**
 * จะโยน exception ออกไปเมื่อไม่เจอสินค้า
 */
public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message){
        super(message);
    }
}
