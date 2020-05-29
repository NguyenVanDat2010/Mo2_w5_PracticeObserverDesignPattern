/**Tạo lớp HexObserver kế thừa từ Observer thực hiện chuyển đổi từ số nguyên sang hệ hex*/

public class HexObserver extends Observer{
    public HexObserver(Subject subject){
        this.subject=subject;
        this.subject.add(this);
    }
    @Override
    public void update() {
        System.out.print(" " + Integer.toHexString(subject.getState()));
    }
}
