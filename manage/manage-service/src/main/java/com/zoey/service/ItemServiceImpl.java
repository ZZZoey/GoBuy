package com.zoey.service;
import com.zoey.mapper.TbItemMapper;
import com.zoey.pojo.TbItem;
import com.zoey.pojo.TbItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品管理Service
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        //TbItem item=itemMapper.selectByPrimaryKey(itemId);
        TbItemExample example=new TbItemExample();
        //添加查询条件
        TbItemExample.Criteria criteria=example.createCriteria();
        List<TbItem> list=itemMapper.selectByExample(example);
        if (list!=null&&list.size()>0){
            TbItem item=list.get(0);
            return item;
        }
        return null;
    }
}
