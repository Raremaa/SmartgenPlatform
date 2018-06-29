package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.CreativeRemark;

public interface CreativeRemarkDAO {
    public ArrayList<CreativeRemark> CreremarkSelect(CreativeRemark creremark)  throws SQLException, ClassNotFoundException;//查询
    public boolean CreremarkInsert(CreativeRemark creremark) throws SQLException;//添加
    public boolean CreremarkDelete(CreativeRemark creremark) throws SQLException;//删除
    public boolean CreremarkUpdate(CreativeRemark creremark) throws SQLException;//修改
}
