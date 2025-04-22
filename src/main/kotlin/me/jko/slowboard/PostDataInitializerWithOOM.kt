//package me.jko.slowboard
//
//import org.springframework.boot.CommandLineRunner
//import org.springframework.stereotype.Component
//import java.time.LocalDateTime
//
//@Component
//class PostDataInitializer(
//    private val postRepository: PostRepository
//) : CommandLineRunner {
//
//    override fun run(vararg args: String?) {
//        println("**************** 대량 데이터 삽입 시작 **************** ")
//
//        val posts = mutableListOf<Post>()
//
//        for (i in 1..10_000_000) {
//            val post = Post(
//                postId = 0,
//                title = "제목 $i",
//                content = "내용 $i",
//                boardId = 1L,
//                writerId = 1L,
//                createdAt = LocalDateTime.now(),
//                updatedAt = LocalDateTime.now()
//            )
//            posts.add(post)
//        }
//
//        postRepository.saveAll(posts)
//
//        println("****************  대량 데이터 삽입 완료 **************** ")
//    }
//}
