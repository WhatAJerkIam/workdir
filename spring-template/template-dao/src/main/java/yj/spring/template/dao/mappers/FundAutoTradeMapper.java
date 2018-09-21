package yj.spring.template.dao.mappers;

import com.github.pagehelper.Page;
import org.apache.ibatis.session.RowBounds;
import yj.spring.template.dao.base.BaseMapper;
import yj.spring.template.dao.model.FundAutoTrade;

public interface FundAutoTradeMapper extends BaseMapper<FundAutoTrade, Long> {

    Page<FundAutoTrade> selectByPage( RowBounds rowBounds );
}