package com.slgerkamp.introductory.spring.boot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 顧客を表すエンティティクラス
 * テーブル名を指定
 * 
 * lombokで
 * デフォルトコンストラクタ
 * フィールドをすべて引数にするコンストラクタ
 * getter/setter
 * を作成
 */

@Entity
@Table(name="customers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

	// 主キー、自動採番
	@Id
	@GeneratedValue
	private Integer id;
	
	@SuppressWarnings("unused")
	private String firstName;
	@SuppressWarnings("unused")
	private String lastName;
}
