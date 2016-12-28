package cn.ucai.fulicenter.model.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.application.I;
import cn.ucai.fulicenter.bean.BoutiqueBean;
import cn.ucai.fulicenter.bean.CategoryChildBean;
import cn.ucai.fulicenter.controller.activity.BoutiqueChildActivity_;
import cn.ucai.fulicenter.controller.activity.GoodsDetailActivity_;
import cn.ucai.fulicenter.controller.activity.MainActivity_;

/**
 * Created by clawpo on 2016/12/27.
 */

public class MFGT {
    public static void finish(Activity activity){
        activity.finish();
        activity.overridePendingTransition(R.anim.push_right_in,R.anim.push_right_out);
    }
    public static void startActivity(Activity activity, Intent intent){
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }
    public static void startActivity(Context context,Class<?> cls){
        Intent intent = new Intent(context,cls);
        startActivity(context,intent);
    }

    public static void startActivity(Context context,Intent intent){
        context.startActivity(intent);
        ((Activity)context).overridePendingTransition(R.anim.push_left_in,R.anim.push_left_out);
    }

    public static void gotoMain(Activity activity){
        startActivity(activity, MainActivity_.class);
    }

    public static void gotoGoodsDetailsActivity(Context context, int goodsId) {
        Intent intent = new Intent();
        intent.setClass(context, GoodsDetailActivity_.class);
        intent.putExtra(I.GoodsDetails.KEY_GOODS_ID,goodsId);
        startActivity(context,intent);
    }

    public static void gotoLogin(Activity context){
        Intent intent = new Intent();
//        intent.setClass(context,LoginActivity.class);
//        startActivityForResult(context,intent,I.REQUEST_CODE_LOGIN);
    }
    public static void gotoBoutiqueChildActivity(Context context, BoutiqueBean bean){
//        Intent intent = new Intent();
//        intent.setClass(context, BoutiqueChildActivity_.class);
//        intent.putExtra(I.Boutique.CAT_ID,bean);
//        startActivity(context,intent);
        BoutiqueChildActivity_.intent(context).extra(I.Boutique.CAT_ID,bean).start();
    }

    public static void gotoCategoryChildActivity(Context context, int catId, String groupName, ArrayList<CategoryChildBean> list){
        Intent intent = new Intent();
//        intent.setClass(context, CategoryChildActivity.class);
//        intent.putExtra(I.CategoryChild.CAT_ID,catId);
//        intent.putExtra(I.CategoryGroup.NAME,groupName);
//        intent.putExtra(I.CategoryChild.ID,list);
//        startActivity(context,intent);
    }
}
