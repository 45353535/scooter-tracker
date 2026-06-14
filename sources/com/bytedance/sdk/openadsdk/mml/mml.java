package com.bytedance.sdk.openadsdk.mml;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    public static String qdl() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0 , channel INTEGER default 0)").toString();
    }

    public static String ud() {
        return "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0";
    }
}
