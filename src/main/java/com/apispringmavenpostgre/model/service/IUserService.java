package com.apispringmavenpostgre.model.service;

import java.util.List;

import com.apispringmavenpostgre.model.entity.User;
import com.apispringmavenpostgre.model.persistence.IOperations;

public interface IUserService extends IOperations<User> {
	public User findById(final long id);

	public List<User> findAll();

	public User create(final User user);

	public User update(final User user);

	public void deleteById(final long entityId);
}
