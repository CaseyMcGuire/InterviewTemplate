import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MainKtTest {

  @Test
  fun `test pass`() {
    Assertions.assertEquals(1, 1)
  }

  @Test
  fun `test fail`() {
    Assertions.assertEquals(1, 2)
  }
}