package com.ldh.book.springboot.web;

import com.ldh.book.springboot.service.posts.PostsService;
import com.ldh.book.springboot.web.dto.PostsResponseDto;
import com.ldh.book.springboot.web.dto.PostsSaveRequestDto;
import com.ldh.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto updateRequestDto) {
        return postsService.update(id, updateRequestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
