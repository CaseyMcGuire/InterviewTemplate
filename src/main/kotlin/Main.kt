import java.net.URI
import java.net.http.*
import java.net.http.HttpResponse.BodyHandlers
import kotlinx.serialization.*
import kotlinx.serialization.json.Json

fun main(args: Array<String>) {
  println("Hello World!")

  // Try adding program arguments via Run/Debug configuration.
  // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
  println("Program arguments: ${args.joinToString()}")

  val client = HttpClient.newHttpClient()
  val request = HttpRequest.newBuilder()
    .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
    .build()


  val response: HttpResponse<String> = client.send(request, BodyHandlers.ofString())
  println(response.body())
  val foo = Json.decodeFromString<Post>(response.body())
  println(foo)
}

@Serializable
data class Post(val userId: Int, val id: Int, val title: String, val completed: Boolean)