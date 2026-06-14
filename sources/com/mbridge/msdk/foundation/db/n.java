package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import net.pubnative.lite.sdk.analytics.Reporting;

/* JADX INFO: loaded from: classes10.dex */
public class n extends a<com.mbridge.msdk.foundation.entity.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f48376a = "com.mbridge.msdk.foundation.db.n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static n f48377b;

    private n(f fVar) {
        super(fVar);
    }

    public static n a(f fVar) {
        if (f48377b == null) {
            synchronized (n.class) {
                try {
                    if (f48377b == null) {
                        f48377b = new n(fVar);
                    }
                } finally {
                }
            }
        }
        return f48377b;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0026 A[EXC_TOP_SPLITTER, PHI: r0 r1
  0x0026: PHI (r0v4 int) = (r0v0 int), (r0v6 int) binds: [B:17:0x0024, B:14:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:17:0x0024, B:14:0x001e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int d() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from reward_report"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            if (r1 == 0) goto L1e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            if (r2 == 0) goto L1e
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1a java.lang.Exception -> L1c
            goto L1e
        L1a:
            r0 = move-exception
            goto L2e
        L1c:
            r2 = move-exception
            goto L21
        L1e:
            if (r1 == 0) goto L2c
            goto L26
        L21:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2c
        L26:
            r1.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            goto L2c
        L2a:
            r0 = move-exception
            goto L34
        L2c:
            monitor-exit(r4)
            return r0
        L2e:
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L33
        L33:
            throw r0     // Catch: java.lang.Throwable -> L2a
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.d():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x033c A[EXC_TOP_SPLITTER, PHI: r10 r21
  0x033c: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v14 android.database.Cursor) binds: [B:105:0x033a, B:99:0x0321] A[DONT_GENERATE, DONT_INLINE]
  0x033c: PHI (r21v3 java.util.List<com.mbridge.msdk.foundation.entity.n>) = 
  (r21v2 java.util.List<com.mbridge.msdk.foundation.entity.n>)
  (r21v6 java.util.List<com.mbridge.msdk.foundation.entity.n>)
 binds: [B:105:0x033a, B:99:0x0321] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.mbridge.msdk.foundation.entity.n> a(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(java.lang.String):java.util.List");
    }

    public synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        try {
            if (nVar != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C4240b4.i.W, nVar.n());
                    contentValues.put("networkType", Integer.valueOf(nVar.q()));
                    contentValues.put("network_str", nVar.r());
                    contentValues.put("isCompleteView", Integer.valueOf(nVar.m()));
                    contentValues.put("watchedMillis", Integer.valueOf(nVar.F()));
                    contentValues.put("videoLength", Integer.valueOf(nVar.C()));
                    if (!TextUtils.isEmpty(nVar.s())) {
                        contentValues.put("offerUrl", nVar.s());
                    }
                    if (!TextUtils.isEmpty(nVar.t())) {
                        contentValues.put("reason", URLEncoder.encode(nVar.t(), D5.N));
                    }
                    contentValues.put("result", Integer.valueOf(nVar.x()));
                    contentValues.put("duration", nVar.g());
                    contentValues.put("videoSize", Long.valueOf(nVar.D()));
                    contentValues.put("type", nVar.h());
                    String strI = nVar.i();
                    if (!TextUtils.isEmpty(strI)) {
                        contentValues.put(CampaignEx.ENDCARD_URL, strI);
                    }
                    String strE = nVar.E();
                    if (!TextUtils.isEmpty(strE)) {
                        contentValues.put("video_url", strE);
                    }
                    String strU = nVar.u();
                    if (!TextUtils.isEmpty(strU)) {
                        contentValues.put("rid", strU);
                    }
                    String strV = nVar.v();
                    if (!TextUtils.isEmpty(strV)) {
                        contentValues.put("rid_n", strV);
                    }
                    String strZ = nVar.z();
                    if (!TextUtils.isEmpty(strZ)) {
                        contentValues.put("template_url", strZ);
                    }
                    String strL = nVar.l();
                    if (!TextUtils.isEmpty(strL)) {
                        contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, strL);
                    }
                    String strA = nVar.a();
                    if (!TextUtils.isEmpty(strA)) {
                        contentValues.put("ad_type", URLEncoder.encode(strA, D5.N));
                    }
                    contentValues.put("unitId", nVar.B());
                    contentValues.put("campaignId", nVar.d());
                    if ("2000039".equals(nVar.n())) {
                        String strB = o.b(nVar);
                        if (a1.b(strB)) {
                            contentValues.put("h5_click_data", strB);
                        }
                    }
                    String strW = nVar.w();
                    if (!TextUtils.isEmpty(strW)) {
                        contentValues.put("resource_type", URLEncoder.encode(strW, D5.N));
                    }
                    String strF = nVar.f();
                    if (!TextUtils.isEmpty(strF)) {
                        contentValues.put("device_id", URLEncoder.encode(strF, D5.N));
                    }
                    String strE2 = nVar.e();
                    if (!TextUtils.isEmpty(strE2)) {
                        contentValues.put(Reporting.Key.CREATIVE, URLEncoder.encode(strE2, D5.N));
                    }
                    contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.b()));
                    return getWritableDatabase().insert("reward_report", null, contentValues);
                } catch (Exception e10) {
                    q0.b(f48376a, e10.getMessage());
                }
            }
            return -1L;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
