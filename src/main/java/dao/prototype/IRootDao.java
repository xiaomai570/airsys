package dao.prototype;

import entity.Root;

public interface IRootDao {
	Root search(String root_number,String root_password);
}
