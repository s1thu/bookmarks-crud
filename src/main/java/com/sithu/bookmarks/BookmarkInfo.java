package com.sithu.bookmarks;

import java.time.Instant;

public interface BookmarkInfo {
    Long getId();
    String getTitle();
    String getUrl();
    Instant getCreatedAt();
}
