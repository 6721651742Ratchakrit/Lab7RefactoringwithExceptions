package Lib;
/**
 * จะโยน exception ออกไปเมื่อไม่เจอสินค้าในระบบ
 */
public class InvalidOperationException extends Exception {
    public InvalidOperationException(String message){
        super(message);
    }
}
