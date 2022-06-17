package com.ssd.gingermarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.ssd.gingermarket.service.CommentInfoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j //로그 
@Controller 
@RequestMapping("/comments")
@RequiredArgsConstructor
public class RemoveCommentController {

	private final CommentInfoService commentInfoService;
	
	@DeleteMapping("/{cid}")
	public RedirectView removeComment(@PathVariable("cid") Long cid) {
		commentInfoService.removeComment(cid);
		
		return new RedirectView("/comments");
	}
}
