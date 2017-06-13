package io.jboot.demo.model;

import io.jboot.db.annotation.Table;
import io.jboot.demo.model.base.BaseUser;

@Table(tableName = "user", primaryKey = "id")
public class User extends BaseUser<User> {
	
}
