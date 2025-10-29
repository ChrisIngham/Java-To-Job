
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newCents = 0;
        int newEuros = 0;

        if ((this.cents + addition.cents) > 99) {
            newCents = this.cents + addition.cents - 100;
            newEuros = this.euros + addition.euros + 1;
        } else {
            newCents = this.cents + addition.cents;
            newEuros = this.euros + addition.euros;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        return (this.euros < compared.euros) || (this.euros == compared.euros && this.cents < compared.cents);

    }

    public Money minus(Money decreaser) {
        int thisConvert = this.euros * 100 + this.cents;
        int thatConvert = decreaser.euros * 100 + decreaser.cents;
        int difference = thisConvert - thatConvert;

        if (difference < 0) {
            return new Money(0, 0);
        }

        int newEuros = difference / 100;
        int newCents = difference % 100;

        return new Money(newEuros, newCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
