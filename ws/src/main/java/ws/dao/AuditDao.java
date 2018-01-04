package ws.dao;

import java.util.ArrayList;
import java.util.List;

import ws.bean.Audit;

public class AuditDao {
	public static List<Audit> getAllAudits(){
		List<Audit> list = new ArrayList<Audit>();
		Audit audit = new Audit();
		audit.setName("ABC");
		list.add(audit);
		return list;		
	}
}
