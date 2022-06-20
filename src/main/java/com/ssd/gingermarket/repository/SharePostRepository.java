package com.ssd.gingermarket.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ssd.gingermarket.domain.SharePost;
import com.ssd.gingermarket.domain.User;

public interface SharePostRepository extends JpaRepository<SharePost, Long>{
	public List<SharePost> findAllByAuthor(User author);
	public SharePost findTop1ByCategoryOrderByCreatedDateDesc(String category);
}