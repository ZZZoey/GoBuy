package com.zoey.service;

import com.zoey.common.pojo.EUDataGridResult;
import com.zoey.pojo.TbItem;

public interface ItemService {
    TbItem getItemById(long itemId);
    EUDataGridResult getItemList(int page, int rows);

}
