
package io.jboot.demo.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 *  Auto generated, do not modify this file.
 */
@SuppressWarnings("serial")
public class BaseUser<M extends BaseUser<M>> extends JbootModel<M> implements IBean {

	public static final String ACTION_ADD = "user:add";
	public static final String ACTION_DELETE = "user:delete";
	public static final String ACTION_UPDATE = "user:update";

	@Override
	protected String addAction() {
		return ACTION_ADD;
	}

	@Override
	protected String deleteAction() {
		return ACTION_DELETE;
	}

	@Override
	protected String updateAction() {
		return ACTION_UPDATE;
	}

	@Override
	public boolean equals(Object o) {
		if(o == null){ return false; }
		if(!(o instanceof BaseUser<?>)){return false;}

		BaseUser<?> m = (BaseUser<?>) o;
		if(m.getId() == null){return false;}

		return m.getId().equals(getId());
	}

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setLoginName(java.lang.String loginName) {
		set("login_name", loginName);
	}

	public java.lang.String getLoginName() {
		return get("login_name");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}

	public java.lang.String getPassword() {
		return get("password");
	}

}
