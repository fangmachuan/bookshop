package edu.hut.bookshop.dao;

import edu.hut.bookshop.pojo.Book;

import java.util.List;


public interface BookDisplayMapper {

    /**
     * 根据书名模糊查询
     * @param bookName
     * @return
     */
    List<Book> fuzzyQueryByBookName(String bookName);
}
