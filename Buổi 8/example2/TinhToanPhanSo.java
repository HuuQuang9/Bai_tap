package day8.generic.example2;

public class TinhToanPhanSo implements ITinhToan<PhanSo>{
    @Override
    public PhanSo cong(PhanSo t1, PhanSo t2) {
        PhanSo tong = new PhanSo();
        if(t1.getMauSo() == t2.getMauSo()){
            tong.setTuSo(t1.getTuSo()+t2.getTuSo());
            tong.setMauSo(t1.getMauSo());
        }else {
            tong.setTuSo(t1.getTuSo()*t2.getMauSo() + t2.getTuSo()*t1.getMauSo());
            tong.setMauSo(t1.getMauSo()*t2.getMauSo());
        }
        return tong ;
    }

    @Override
    public PhanSo tru(PhanSo t1, PhanSo t2) {
        PhanSo hieu = new PhanSo();
        if(t1.getMauSo() == t2.getMauSo()){
            hieu.setTuSo(t1.getTuSo()-t2.getTuSo());
            hieu.setMauSo(t1.getMauSo());
        }else {
            hieu.setTuSo(t1.getTuSo()*t2.getMauSo() - t2.getTuSo()*t1.getMauSo());
            hieu.setMauSo(t1.getMauSo()*t2.getMauSo());
        }
        return hieu ;
    }

    @Override
    public PhanSo nhan(PhanSo t1, PhanSo t2) {
        PhanSo tich = new PhanSo();
        tich.setTuSo(t1.getTuSo()*t2.getTuSo());
        tich.setMauSo(t1.getMauSo()*t2.getMauSo());
        return tich;
    }

    @Override
    public PhanSo chia(PhanSo t1, PhanSo t2) {
        PhanSo thuong = new PhanSo();
        thuong.setTuSo(t1.getTuSo()*t2.getMauSo());
        thuong.setMauSo(t1.getMauSo()*t2.getTuSo());
        return thuong;
    }
}
