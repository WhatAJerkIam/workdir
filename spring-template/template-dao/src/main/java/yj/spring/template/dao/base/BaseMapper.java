package yj.spring.template.dao.base;


public interface BaseMapper<R, PK>{

    int insert(R record);

    R selectByPrimaryKey(PK id);

    int updateByPrimaryKeySelective(R record);

    int updateByPrimaryKey(R record);
}
