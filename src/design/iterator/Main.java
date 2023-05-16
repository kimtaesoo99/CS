package design.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(10);

        Member member1 = new Member("member1");
        Member member2 = new Member("member2");
        Member member3 = new Member("member3");

        manager.appendMember(member1);
        manager.appendMember(member2);
        manager.appendMember(member3);

        System.out.println("현재 등록된 멤버 수 :" + manager.getLength() +"명");

        Iterator it = manager.createIterator();
        while (it.hasNext()){
            Member member = (Member) it.next();
            System.out.println(member.getName());
         }
    }
}
