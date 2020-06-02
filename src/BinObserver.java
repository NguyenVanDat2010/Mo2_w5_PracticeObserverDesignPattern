/** Tạo lớp BinObserver kế thừa từ Observer thực hiện chuyển đổi từ số nguyên sang hệ binary*/

public class BinObserver extends Observer{
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
<<<<<<< HEAD
    // day la comment moi
=======
    //jhdfsadjfljkasdldkfj
    //kdfjkfsafkljlaksjdflk
>>>>>>> master

    @Override
    public void update() {
        System.out.print(" " + Integer.toBinaryString(subject.getState()));
    }
}
