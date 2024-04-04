// How do you show a diamond problem with multiple inheritance in Java?
public class DiamondProblem {

}

interface I {
  void foo();
}

class A implements I {
  public void foo() {
  }
}

class B implements I {
  public void foo() {
  }
}

class C extends A, B {

  public void bar() {
    super.foo();
  }
}
