package com.fanhl.cqw.ui.base;

import java.util.List;

/**
 * 增删改的通用接口
 * Created by fanhl on 2016/5/30.
 */
public interface Listable<ITEM> {
    //----------------数据增删-------------------
    void addItem(ITEM item);

    void addItems(List<ITEM> items);

    void clear();

    void replaceItems(List<ITEM> items);
}
