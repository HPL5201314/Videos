package com.example.admin.news.module.video.presenter;

import com.example.admin.news.base.BasePresenter;

/**
 * ClassName: IVideoListPresenter<p>
 * Author: oubowu<p>
 * Fuction: 视频列表代理接口<p>
 * CreateDate: 2016/2/23 17:09<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface IVideoListPresenter extends BasePresenter{

    void refreshData();

    void loadMoreData();
    
    void onVisibleToUser();
    
    void onInvisibleToUser();

}
