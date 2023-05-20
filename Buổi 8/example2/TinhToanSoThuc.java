package day8.generic.example2;

public class TinhToanSoThuc implements ITinhToan<Double>{

    @Override
    public Double cong(Double t1, Double t2) {
        return t1 + t2;
    }

    @Override
    public Double tru(Double t1, Double t2) {
        return t1 - t2;
    }

    @Override
    public Double nhan(Double t1, Double t2) {
        return t1 * t2;
    }

    @Override
    public Double chia(Double t1, Double t2) {
        if (t1 != 0 && t2 != 0){
            return t1 / t2;
        }else {
            return 0.0;
        }
    }
}
