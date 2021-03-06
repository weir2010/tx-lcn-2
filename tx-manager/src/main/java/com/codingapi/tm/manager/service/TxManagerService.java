package com.codingapi.tm.manager.service;

import com.codingapi.tm.netty.model.TxGroup;

/**
 * Created by lorne on 2017/6/7.
 */

public interface TxManagerService {


    /**
     * 创建事物组
     *
     * @param groupId 补偿事务组id
     */
    TxGroup createTransactionGroup(String groupId);


    /**
     * 添加事务组子对象
     *
     * @return
     */

    TxGroup addTransactionGroup(String groupId, String taskId,int isGroup, String modelName, String methodStr);


    /**
     *
     * @param groupId
     * @param taskId
     * @return  1 存在 0不存在 -1 未结束
     */
    int getTransaction(String groupId, String taskId);


    boolean closeTransactionGroup(String groupId,int state);


    void dealTxGroup(TxGroup txGroup, boolean hasOk );

    void deleteTxGroup(TxGroup txGroup);


    boolean clearTransaction(String groupId, String taskId, int isGroup);




}
