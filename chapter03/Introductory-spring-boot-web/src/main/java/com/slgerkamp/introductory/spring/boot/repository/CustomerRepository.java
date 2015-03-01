package com.slgerkamp.introductory.spring.boot.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.slgerkamp.introductory.spring.boot.domain.Customer;

/**
 * 顧客情報を管理するリポジトリ
 * 
 * JpaRepositoryを継承した時点で、下記が実装される
 * findOne
 * findAll
 * save
 * delete
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

    /**
     * 名前順に顧客を取得する
     * QueryアノテーションにJPQLを定義
     * @return
     */
    @Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName")
    List<Customer> findAllOrderByName();

    /**
     * 名前順に顧客を取得する（ページング込み）
     * QueryアノテーションにJPQLを定義
     * 
     * @param pageable
     * @return
     */
    @Query("SELECT x FROM Customer x ORDER BY x.firstName, x.lastName")
    Page<Customer> findAllOrderByName(Pageable pageable);
}
