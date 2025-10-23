
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance(){
        advance(1);
    }
    
    public void advance(int howManyDays){
        
        if ((this.day + howManyDays) > 30){
            if ((this.month +1) > 12){
                this.day = this.day + howManyDays - 30;
                this.month = 1;
                this.year+=1;
            }else{
                this.month++;
                this.day = 1;
            }
          
        }else{
            this.day += howManyDays;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        int newDay = 0;
        int newMonth = 0;
        int newYear = 0;
        if ((this.day + days) > 30){
            if ((this.month + 1)> 12){
                newDay = this.day + days - 30;
                newMonth = this.month + 1 - 12; 
                newYear = this.year + 1;
            }else{
                newDay = this.day + days - 30;
                newMonth = this.month++;
                newYear = this.year;
            }
        }else{
            newDay = this.day + days;
            newMonth = this.month;
            newYear = this.year;
        } 
        SimpleDate newDate = new SimpleDate(newDay, newMonth, newYear);
        
        
        
        
        
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
