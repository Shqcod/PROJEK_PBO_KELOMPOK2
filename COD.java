public class COD extends Pembayaran {
    public COD(String id) {
        super(id);
    }

    @Override
    public String getTipePembayaran() {
        return "COD";
    }
}