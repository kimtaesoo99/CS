package design.iterator;

import java.util.Iterator;

public class Manager implements Aggregate{

    private Member[] members;
    private int last = 0;

    public Manager(int size) {
        members = new Member[size];
    }

    public Member getMember(int index) {
        return members[index];
    }

    public int getLength() {
        return last;
    }

    public void appendMember(Member member){
        if (last < members.length) {
            this.members[last] = member;
            last++;
            return;
        }
        System.out.println("멤버수가 가득 찼습니다.");
    }

    @Override
    public Iterator createIterator() {
        return new ManagerIterator(this);
    }
}
