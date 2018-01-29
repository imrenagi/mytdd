import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

  private MyStack stack;

  @Before
  public void setUp() throws Exception {
    this.stack = new MyStack();
  }

  @Test
  public void numberOfElementsShouldBeZeroAfterInitialization() {
    Assert.assertEquals(0, this.stack.size());
  }

  @Test
  public void shouldCreateEmptyStackAfterIntialization() {
    Assert.assertTrue(this.stack.isEmpty());
  }

  @Test
  public void shouldContainsCorrectNumberOfElementAfterPushingNElements() {
    this.stack.push(1);
    this.stack.push(2);

    Assert.assertEquals(2, this.stack.size());
    Assert.assertFalse(this.stack.isEmpty());
  }

  @Test
  public void pushThenPopSHouldReturnCorrectValueAndFinalSize() {
    this.stack.push(1);
    this.stack.push(2);
    int poppedVal = this.stack.pop();

    Assert.assertEquals(1, this.stack.size());
    Assert.assertEquals(2, poppedVal);
  }

  @Test
  public void pushTenPeekShouldReturnCorrectValueAndNotChangeStackSize() {
    this.stack.push(1);
    int peekedVal = this.stack.peek();

    Assert.assertEquals(1, this.stack.size());
    Assert.assertEquals(1, peekedVal);

  }

  @Test
  public void ifTheSizeIsNThenAfterNPopsThenTheStackIsEmptyAndHasSizeZero() {
    this.stack.push(1);
    this.stack.push(2);
    this.stack.push(3);
    this.stack.push(4);

    Assert.assertEquals(4, this.stack.size());

    this.stack.pop();
    this.stack.pop();
    this.stack.pop();
    this.stack.pop();

    Assert.assertEquals(0, this.stack.size());
    Assert.assertTrue(this.stack.isEmpty());
  }

  @Test
  public void shouldReturnExceptionIfPopWhenStackIsEMpty() {
    try {
      this.stack.pop();
      fail();
    } catch (Exception e) {

    }
  }

  @Test(expected = NoSuchElementException.class)
  public void shouldReturnNoSuchElementExceptionIfPeekWhenStackIsEmpty() {
    this.stack.peek();
  }

  @Test
  public void shouldBeABleToPushManyElements() {
    this.stack.push(1);
    this.stack.push(2);
    this.stack.push(3);
    this.stack.push(4);
    this.stack.push(5);
    this.stack.push(6);
    this.stack.push(7);
    this.stack.push(8);
    this.stack.push(9);
    this.stack.push(10);
    this.stack.push(11);
    this.stack.push(12);

    Assert.assertEquals(12, this.stack.size());
    Assert.assertEquals(12, this.stack.pop());
    Assert.assertEquals(11, this.stack.pop());
    Assert.assertEquals(10, this.stack.pop());
    Assert.assertEquals(9, this.stack.pop());
    Assert.assertEquals(8, this.stack.pop());
    Assert.assertEquals(7, this.stack.pop());
  }

  @After
  public void tearDown() throws Exception {
  }
}

