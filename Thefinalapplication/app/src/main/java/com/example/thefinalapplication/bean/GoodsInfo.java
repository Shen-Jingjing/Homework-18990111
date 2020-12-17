package com.example.thefinalapplication.bean;

import com.example.thefinalapplication.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个曲奇商品的名称数组
    private static String[] mNameArray = {
            "Danisa", "Franzzi", "HONG KONG MX", "BOL QUET", "BOURBON", "Nextar", "YOTIME", "Sable"
    };
    // 声明一个曲奇商品的描述数组
    private static String[] mDescArray = {
            "Danisa皇冠丹麦黄油曲奇 908g 进口饼干糕点",
            "Franzzi法丽兹夹心曲奇饼干 零食小吃组合礼盒 多口味零食",
            "HONG KONG MX中国香港美心三重奏曲奇酥饼 331g 进口饼干小吃",
            "BOL QUET卜珂蔓越莓曲奇饼干 600g 散装多口味手工抹茶饼",
            "BOURBON布尔什锦奶油巧克力曲奇饼干 297g 日本进口零食 ",
            "Nextar丽芝士曲奇饼干 112g 进口巧克力食品爆浆零食",
            "YOTIME什锦曲奇饼干 580g 手工网红美食礼盒",
            "Sable莎布蕾武士曲奇饼干 700g 夹心爆浆软曲奇纷享盒"
    };
    // 声明一个曲奇商品的价格数组
    private static float[] mPriceArray = {148, 99, 175, 54, 59, 46,129,79};
    // 声明一个曲奇商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.danisa_s, R.drawable.franzzi_s, R.drawable.hongkongmx_s,
            R.drawable.bolquet_s, R.drawable.bourbon_s, R.drawable.nextar_s, R.drawable.yotime_s, R.drawable.sable_s
    };
    // 声明一个曲奇商品的大图数组
    private static int[] mPicArray = {
            R.drawable.danisa, R.drawable.franzzi, R.drawable.hongkongmx,
            R.drawable.bolquet, R.drawable.bourbon, R.drawable.nextar, R.drawable.yotime, R.drawable.sable
    };

    // 获取默认的曲奇信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}

