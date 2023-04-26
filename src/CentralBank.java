public class CentralBank {
    int getInterrestRate() {
        return 0;
    }
}
class BOC extends CentralBank{
    int getInterrestRate() {
        return 8;
    }
}
class PeopleBank extends CentralBank {
    int getInterrestRate(){
        return 10;
    }
}
class CommercialBank extends CentralBank{
    int getInterrestRate(){
        return 12;
    }
}
class TestOverriding{
    public static void main(String[] args) {
        BOC b = new BOC();
        PeopleBank p =new PeopleBank();
        CommercialBank c =new CommercialBank();
        System.out.println("Interest Rate : " + b.getInterrestRate() + "%");
        System.out.println("Interest Rate : " + p.getInterrestRate() + "%");
        System.out.println("Interest Rate : " + c.getInterrestRate() + "%");
    }
}
