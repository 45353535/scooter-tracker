package com.bykv.vk.openvk.preload.geckox.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.appsflyer.AppsFlyerProperties;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class b extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f15736a;

    private b(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory) {
        super(context, str, cursorFactory, 1);
    }

    public static b a(Context context) {
        if (f15736a == null) {
            synchronized (b.class) {
                try {
                    if (f15736a == null) {
                        f15736a = new b(context.getApplicationContext(), "geckox_clean_statistic" + com.bykv.vk.openvk.preload.geckox.utils.a.a() + ".db", null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f15736a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists geckox_clean_statistic (id integer primary key autoincrement,access_key text,channel text,clean_type integer,status integer,pkg_id integer,err_code integer,clean_strategy integer,clean_duration integer,err_msg text)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    final void a(String str, String str2, int i10, int i11, long j10, int i12, String str3, long j11) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("access_key", str);
        contentValues.put(AppsFlyerProperties.CHANNEL, str2);
        contentValues.put("clean_type", Integer.valueOf(i10));
        contentValues.put("status", Integer.valueOf(i11));
        contentValues.put("pkg_id", Long.valueOf(j10));
        contentValues.put("err_code", Integer.valueOf(i12));
        contentValues.put("err_msg", str3);
        contentValues.put("clean_duration", Long.valueOf(j11));
        contentValues.put("clean_strategy", (Integer) 1);
        try {
            getWritableDatabase().insert("geckox_clean_statistic", null, contentValues);
        } catch (Exception e10) {
            GeckoLogger.w("clean-channel", "insert failed", e10);
        }
    }

    final List<StatisticModel.PackageStatisticModel> a() {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursorQuery = getWritableDatabase().query("geckox_clean_statistic", null, null, null, null, null, null);
        } catch (Exception e10) {
            e = e10;
        }
        if (cursorQuery == null) {
            return arrayList;
        }
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("access_key"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(AppsFlyerProperties.CHANNEL));
                int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_type"));
                int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                long j10 = cursorQuery.getInt(cursorQuery.getColumnIndex("pkg_id"));
                int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex("err_code"));
                String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("err_msg"));
                int i13 = cursorQuery.getInt(cursorQuery.getColumnIndex("clean_strategy"));
                long j11 = cursorQuery.getLong(cursorQuery.getColumnIndex("clean_duration"));
                StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                packageStatisticModel.accessKey = string;
                packageStatisticModel.channel = string2;
                packageStatisticModel.statsType = Integer.valueOf(i11);
                packageStatisticModel.f15867id = Long.valueOf(j10);
                packageStatisticModel.errCode = i12 == 0 ? null : String.valueOf(i12);
                packageStatisticModel.errMsg = string3;
                packageStatisticModel.cleanType = Integer.valueOf(i10);
                packageStatisticModel.cleanDuration = Long.valueOf(j11);
                packageStatisticModel.cleanStrategy = Integer.valueOf(i13);
                arrayList.add(packageStatisticModel);
            } catch (Exception e11) {
                e = e11;
                cursor = cursorQuery;
                GeckoLogger.w("clean-channel", "get all statistic failed!", e);
                cursorQuery = cursor;
            }
        }
        getWritableDatabase().delete("geckox_clean_statistic", null, null);
        CloseableUtils.close(cursorQuery);
        return arrayList;
    }
}
