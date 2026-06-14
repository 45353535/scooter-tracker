package com.bytedance.sdk.openadsdk.multipro.qdl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.mo;
import com.bytedance.sdk.openadsdk.core.mzz;
import com.bytedance.sdk.openadsdk.multipro.mml;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static mo qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Object> f17772ud = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:3:0x0002, B:4:0x0005, B:6:0x0009, B:8:0x000f, B:9:0x001f), top: B:14:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.mo.qdl.mo qdl(android.content.Context r1) {
        /*
            if (r1 != 0) goto L5
            com.bytedance.sdk.openadsdk.core.yt.qdl()     // Catch: java.lang.Throwable -> L26
        L5:
            com.bytedance.sdk.component.mo.qdl.mo r1 = com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L2b
            boolean r1 = com.bytedance.sdk.openadsdk.multipro.ud.lnr()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L1f
            com.bytedance.sdk.openadsdk.multipro.aidl.qdl r1 = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl()     // Catch: java.lang.Throwable -> L26
            r0 = 5
            android.os.IBinder r1 = r1.qdl(r0)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.component.mo.qdl.mo r1 = com.bytedance.sdk.component.mo.qdl.mo.qdl.qdl(r1)     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L1f:
            com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mo r1 = com.bytedance.sdk.openadsdk.multipro.aidl.qdl.mo.ud()     // Catch: java.lang.Throwable -> L26
            com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl = r1     // Catch: java.lang.Throwable -> L26
            goto L2b
        L26:
            java.lang.String r1 = "binder error"
            com.bytedance.sdk.openadsdk.utils.gy.jpc(r1)
        L2b:
            com.bytedance.sdk.component.mo.qdl.mo r1 = com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.multipro.qdl.qdl.qdl(android.content.Context):com.bytedance.sdk.component.mo.qdl.mo");
    }

    private static String qdl() {
        return mml.f17770ud + "/t_db/ttopensdk.db/";
    }

    public static void qdl(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (qdl(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                mzz.qdl(context).qdl().qdl(str, (String) null, contentValues);
                return;
            }
            mo moVarQdl = qdl(context);
            if (moVarQdl != null) {
                moVarQdl.qdl(Uri.parse(qdl() + str), contentValues);
            }
        }
    }

    public static int qdl(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        synchronized (qdl(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                return mzz.qdl(context).qdl().qdl(str, str2, strArr);
            }
            mo moVarQdl = qdl(context);
            if (moVarQdl != null) {
                return moVarQdl.qdl(Uri.parse(qdl() + str), str2, strArr);
            }
            return 0;
        }
    }

    public static int qdl(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            synchronized (qdl(str)) {
                if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                    return mzz.qdl(context).qdl().qdl(str, contentValues, str2, strArr);
                }
                mo moVarQdl = qdl(context);
                if (moVarQdl != null) {
                    return moVarQdl.qdl(Uri.parse(qdl() + str), contentValues, str2, strArr);
                }
            }
        }
        return 0;
    }

    public static Map<String, List<String>> qdl(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (qdl(str)) {
            if (!com.bytedance.sdk.openadsdk.multipro.ud.lnr()) {
                return qdl(mzz.qdl(context).qdl().qdl(str, strArr, str2, strArr2, str3, str4, str5));
            }
            mo moVarQdl = qdl(context);
            if (moVarQdl != null) {
                return moVarQdl.qdl(Uri.parse(qdl() + str), strArr, str2, strArr2, str5);
            }
            return null;
        }
    }

    public static Map<String, List<String>> qdl(Cursor cursor) {
        HashMap map = new HashMap();
        if (cursor != null) {
            try {
                String[] columnNames = cursor.getColumnNames();
                while (cursor.getCount() > 0 && cursor.moveToNext()) {
                    for (String str : columnNames) {
                        if (!map.containsKey(str)) {
                            map.put(str, new LinkedList());
                        }
                        ((List) map.get(str)).add(cursor.getString(cursor.getColumnIndex(str)));
                    }
                }
                cursor.close();
                return map;
            } catch (Throwable unused) {
                cursor.close();
            }
        }
        return map;
    }

    private static Object qdl(String str) {
        Object obj;
        ConcurrentHashMap<String, Object> concurrentHashMap = f17772ud;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 != null) {
            return obj2;
        }
        synchronized (qdl.class) {
            try {
                obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new Object();
                    concurrentHashMap.put(str, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
