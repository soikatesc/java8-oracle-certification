package academy.learprogramming.methods.common;

public class Common {

    public void publicPrint() {
        System.out.println("public");
    }

    protected void protectedPrint() {
        System.out.println("protected");
    }

    void defaultPrint() {
        System.out.println("default print");
    }

    private void privatePrint() {
        System.out.println("private print");
    }

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        common.privatePrint();
    }
}
