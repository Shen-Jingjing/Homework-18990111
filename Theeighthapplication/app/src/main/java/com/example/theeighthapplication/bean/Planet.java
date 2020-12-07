package com.example.theeighthapplication.bean;

import com.example.theeighthapplication.R;

import java.util.ArrayList;

public class Planet {

    public int image;
    public String name;
    public String desc;

    public Planet(int image, String name, String desc) {
        this.image = image;
        this.name = name;
        this.desc = desc;
    }

    private static int[] iconArray = { R.drawable.danisa, R.drawable.franzzi, R.drawable.hongkongmx,
            R.drawable.bolquet, R.drawable.bourbon, R.drawable.nextar, R.drawable.yotime, R.drawable.sable};
    private static String[] nameArray = {"Danisa", "Franzzi", "HONG KONG MX", "BOL QUET", "BOURBON", "Nextar", "YOTIME", "Sable"};
    private static String[] descArray = {
            "Danisa皇冠丹麦黄油曲奇 908g 进口饼干糕点",
            "Franzzi法丽兹夹心曲奇饼干 零食小吃组合礼盒 多口味零食",
            "HONG KONG MX中国香港美心三重奏曲奇酥饼 331g 进口饼干小吃",
            "BOL QUET卜珂蔓越莓曲奇饼干 600g 散装多口味手工抹茶饼",
            "BOURBON布尔什锦奶油巧克力曲奇饼干 297g 日本进口零食 ",
            "Nextar丽芝士曲奇饼干 112g 进口巧克力食品爆浆零食",
            "YOTIME什锦曲奇饼干 580g 手工网红美食礼盒",
            "Sable莎布蕾武士曲奇饼干 700g 夹心爆浆软曲奇纷享盒"

    };

    public static ArrayList<Planet> getDefaultList() {
        ArrayList<Planet> planetList = new ArrayList<Planet>();
        for (int i = 0; i < iconArray.length; i++) {
            planetList.add(new Planet(iconArray[i], nameArray[i], descArray[i]));
        }
        return planetList;
    }
}
