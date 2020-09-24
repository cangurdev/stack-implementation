import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class StackTests {
    @Test
    public void it_should_return_one_more_than_stack_size_when_push_an_element(){
        //Arrange
        Stack stack = new Stack();
        //Act
        stack.push("New Element");
        int result = stack.count();
        //Assert
        assertThat(result).isEqualTo(1);
    }
    @Test
    public void it_should_return_object_on_top_when_pop(){
        //Arrange
        Stack<String> stack = new Stack<String>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        //Act
        String result = stack.pop();
        //Assert
        assertThat(result).isEqualTo("d");
    }

    @Test
    public void it_should_return_the_object_on_the_top_of_the_stack_when_peek(){
        //Arrange
        Stack<String> stack = new Stack<String>();

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        //Act
        String result = stack.peek();

        //Assert
        assertThat(result).isEqualTo("d");
    }
    @Test
    public void it_should_throw_IllegalStateException_when_peek_to_empty_stack(){
        //Arrange
        Stack stack = new Stack();

        //Act
        Throwable throwable = catchThrowable(() -> stack.peek());

        //Assert
        assertThat(throwable).isInstanceOf(IllegalStateException.class).hasMessage("Stack is empty");
    }
    @Test
    public void it_should_throw_IllegalStateException_when_pop_to_empty_stack(){
        //Arrange
        Stack stack = new Stack();

        //Act
        Throwable throwable = catchThrowable(() -> stack.pop());

        //Assert
        assertThat(throwable).isInstanceOf(IllegalStateException.class).hasMessage("Stack is empty");
    }
    @Test
    public void it_should_throw_NullPointerException_when_push_null_element(){
        //Arrange
        Stack<String> stack = new Stack<String>();

        //Act
        Throwable throwable = catchThrowable(() -> stack.push(null));

        //Assert
        assertThat(throwable).isInstanceOf(NullPointerException.class).hasMessage("null object cannot be added");
    }

}
