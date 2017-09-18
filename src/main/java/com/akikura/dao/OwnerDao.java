package com.akikura.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.springframework.transaction.annotation.Transactional;

import com.akikura.entity.Owner;

@ConfigAutowireable
@Dao
public interface OwnerDao {
	@Select
	List<Owner> selectAll();
	
	@Select
	Owner selectById(long id);
	
	@Insert
	@Transactional
	int insert(Owner owner);
}
