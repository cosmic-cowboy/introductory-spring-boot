package com.slgerkamp.introductory.spring.boot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import com.slgerkamp.introductory.spring.boot.domain.Customer;
import com.slgerkamp.introductory.spring.boot.service.CustomerService;

/**
 * 顧客情報管理
 * 
 * エンドポイントを設定
 *
 */
@RestController
@RequestMapping("api/customers")
public class CustomerRestController {

	@Autowired
	CustomerService customerService;
	
	/**
	 * 顧客情報全件取得
	 * 
	 * HTTPメソッドがGETで
	 * RequestMappingで定義したパスにアクセスがあった場合、
	 * この処理が実行される
	 * 
	 * デフォルトでは
	 * Javaオブジェクトの戻り値がJSON形式でシリアライズされ、
	 * HTTPレスポンスボディに設定される
	 * @return 
	 */
	@RequestMapping(method = RequestMethod.GET)
	List<Customer> getCustomers(){
		return customerService.findAll();
	}
	
	/**
	 * 顧客情報１件取得
	 * 
	 * HTTPメソッドがGETで
	 * RequestMappingで定義したパス api/customers/:id　にアクセスがあった場合、
	 * この処理が実行される
	 * 
	 * PathVariableアノテーションで引数名とプレースホルダをマッピングする
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value="{id}", method = RequestMethod.GET)
	Customer getCustomer(@PathVariable Integer id){
		return customerService.findOne(id);
	}
	
	
	/**
	 * 顧客新規作成
	 * HTTPメソッドがPOSTで
	 * RequestMappingで定義したパスにアクセスがあった場合、
	 * この処理が実行される
	 * 
	 * 実行が成功したら、201と登録された情報を返す
	 * 
	 * @param customer
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	Customer postCustomer(@RequestBody Customer customer){
		return customerService.create(customer);
	}

	/**
	 * 顧客１件更新
	 * HTTPメソッドがPUTで
	 * RequestMappingで定義したパス api/customers/:id　にアクセスがあった場合、
	 * この処理が実行される
	 * 
	 * 
	 * @param customer
	 * @return
	 */
	@RequestMapping(value="{id}", method = RequestMethod.PUT)
	Customer putCustomer(@PathVariable Integer id, @RequestBody Customer customer){
		customer.setId(id);
		return customerService.update(customer);
	}

	/**
	 * 顧客１件削除
	 * HTTPメソッドがDELETEで
	 * RequestMappingで定義したパス api/customers/:id　にアクセスがあった場合、
	 * この処理が実行される
	 * 
	 * @param customer
	 * @return
	 */
	@RequestMapping(value="{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void deleCustomer(@PathVariable Integer id){
		customerService.delete(id);
	}
	
}
