package com.example.admin.news.module.video.view;

import com.example.admin.news.base.BaseView;
import com.example.admin.news.bean.NeteastVideoSummary;
import com.example.admin.news.common.DataLoadType;

import java.util.List;

/**
 * ClassName: IVideoListView<p>
 * Author: oubowu<p>
 * Fuction: 视频列表视图接口<p>
 * CreateDate: 2016/2/23 17:05<p>
 * UpdateUser: <p>
 * UpdateDate: <p>
 */
public interface IVideoListView extends BaseView {

    void updateVideoList(List<NeteastVideoSummary> data, @DataLoadType.DataLoadTypeChecker int type);

}
