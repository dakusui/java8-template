package com.github.dakusui.java8.template;

import com.github.dakusui.java8.template.testutils.TestBase;
import com.github.dakusui.thincrest_pcond.fluent.Statement;
import com.github.dakusui.thincrest_pcond.forms.Printables;
import org.junit.jupiter.api.Test;

import static com.github.dakusui.thincrest.TestFluents.assertStatement;

public class Java8AppTest extends TestBase {
  @Test
  public void testMain() {
    Java8App.main("Hello", "world");
  }
  
  @Test
  public void givenHello_whenProcess_thenProcessedHello() {
    String s = "hello";
    assertStatement(Statement.objectValue(new Java8App())
            .toString(Printables.function("process", app -> app.process(s)))
            .then()
            .isEqualTo(""));
  }
}
