package academy.learprogramming.methods;

public class MethodDesign {

    public void jump() {

    }

    // default access modified in private
    void jump3() { }

    public final void jump4 () {}
    public static final void jump5 () {}
    public final static void jump6 () {}

   // public modifier void jump7() {} // does not compile
    // public String void jump8() {} // does not compile, two return type
}
