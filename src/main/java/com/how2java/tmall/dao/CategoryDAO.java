package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Autour:ycw
 * @Date；2019/11/27 15:27
 * @Version 1.0
 */
public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
