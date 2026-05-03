long gcf(long a, long b) {
    if(a%b == 0) {
        return b;
    } else {
        return gcf(b, a%b);
    }
}

class Rational {
    long nu;
    long de;

    public String toString() {
        if (de == 0) {
            return "undefined";
        }
        return "" + nu + "/" + de;
    }

    Rational divide(Rational other) {
        long nu = this.nu * other.de;
        long de = this.de * other.nu;
        return new Rational(nu, de);
    }
    Rational add(Rational other) {
        long nu = this.nu * other.de + other.nu * this.de;
        long de = this.de * other.de;
        return new Rational(nu, de);
    }
    
    Rational multiply(Rational other) {
        long nu = this.nu * other.nu;
        long de = this.de * other.de;
        return new Rational(nu, de);
    }
    

    Rational(long nu, long de) {
        long gcf = gcf(nu,de);
        this.nu = nu/gcf;
        this.de = de/gcf;
    }

    Rational() {
    }
}

void main() {
    Rational x = new Rational(3, 5);
    println(x);

    Rational y = new Rational(7, 9);
    println(y);

    Rational z = x.multiply(y);
    println("z = " + z);

    Rational w = x.divide(y);
    println("w = " + w);

    println(z.multiply(w));

    Rational a = new Rational(3, 9);
    println(a);

    println((new Rational(7, 10)).add(new Rational(1, 10)));
}
