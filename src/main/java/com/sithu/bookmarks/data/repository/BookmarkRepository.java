package com.sithu.bookmarks.data.repository;

import com.sithu.bookmarks.Bookmark;
import com.sithu.bookmarks.BookmarkInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookmarkRepository extends JpaRepository<Bookmark,Long> {
    List<BookmarkInfo> findAllByOrderByCreatedAtDesc();

    Optional<BookmarkInfo> findBookmarkById(Long id);
}
