package com.bytedance.sdk.openadsdk.yt;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.adjust.sdk.purchase.ADJPConstants;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import com.taurusx.tax.y.z.w.s;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static Context mzz;
    private com.bytedance.sdk.openadsdk.yt.lnr.qdl lnr;
    private Boolean mml;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ud f17900ud;
    private static final long mo = System.currentTimeMillis();
    public static final long qdl = com.bytedance.sdk.openadsdk.yt.mml.qdl.qdl();

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17901wd = 0;
    private final ArrayList<mml> jpc = new ArrayList<>();
    private Runnable tvp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.qdl.2
        @Override // java.lang.Runnable
        public void run() {
            qdl qdlVar = qdl.this;
            qdlVar.mml = Boolean.valueOf(qdlVar.f17900ud.isMonitorOpen());
            if (qdl.this.mml.booleanValue()) {
                qdl qdlVar2 = qdl.this;
                qdlVar2.qdl(qdlVar2.jpc);
                qdl.this.jpc.clear();
            }
        }
    };
    private Runnable to = new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.qdl.4
        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6 = "extra";
            String str7 = "is_init";
            String str8 = "mediation";
            try {
                SQLiteDatabase sQLiteDatabaseUd = com.bytedance.sdk.openadsdk.yt.qdl.qdl.ud();
                if (sQLiteDatabaseUd != null) {
                    String[] strArr = {"_id", ADJPConstants.KEY_SDK_VERSION, "scene", "start_count", "success_count", "fail_count", "rit", s.z.f67720z, "label", "timestamp", "mediation", "is_init", "extra"};
                    try {
                        String[] strArr2 = {String.valueOf(qdl.this.f17900ud.getOnceLogInterval() < 86400000 ? qdl.mo : qdl.qdl)};
                        int iMax = Math.max(10, qdl.this.f17900ud.getOnceLogCount());
                        if (iMax > 100) {
                            iMax = 10;
                        }
                        Cursor cursorQuery = sQLiteDatabaseUd.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(iMax));
                        if (cursorQuery != null) {
                            int i10 = iMax;
                            ArrayList arrayList = new ArrayList();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                while (cursorQuery.moveToNext()) {
                                    ArrayList arrayList3 = arrayList;
                                    com.bytedance.sdk.openadsdk.yt.ud.qdl qdlVar = new com.bytedance.sdk.openadsdk.yt.ud.qdl();
                                    if (cursorQuery.getColumnIndex("_id") >= 0) {
                                        str2 = str6;
                                        str3 = str7;
                                        str4 = str8;
                                        long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                        qdlVar.qdl(j10);
                                        arrayList2.add(String.valueOf(j10));
                                    } else {
                                        str2 = str6;
                                        str3 = str7;
                                        str4 = str8;
                                    }
                                    if (cursorQuery.getColumnIndex(ADJPConstants.KEY_SDK_VERSION) >= 0) {
                                        qdlVar.qdl(cursorQuery.getString(cursorQuery.getColumnIndex(ADJPConstants.KEY_SDK_VERSION)));
                                    }
                                    if (cursorQuery.getColumnIndex("scene") >= 0) {
                                        qdlVar.ud(cursorQuery.getString(cursorQuery.getColumnIndex("scene")));
                                    }
                                    if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                        qdlVar.qdl(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                        qdlVar.ud(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                        qdlVar.lnr(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("rit") >= 0) {
                                        qdlVar.lnr(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                                    }
                                    if (cursorQuery.getColumnIndex(s.z.f67720z) >= 0) {
                                        qdlVar.mml(cursorQuery.getString(cursorQuery.getColumnIndex(s.z.f67720z)));
                                    }
                                    if (cursorQuery.getColumnIndex("label") >= 0) {
                                        qdlVar.mzz(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                                    }
                                    if (cursorQuery.getColumnIndex("timestamp") >= 0) {
                                        qdlVar.ud(cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp")));
                                    }
                                    String str9 = str4;
                                    if (cursorQuery.getColumnIndex(str9) >= 0) {
                                        qdlVar.mo(cursorQuery.getString(cursorQuery.getColumnIndex(str9)));
                                    }
                                    str7 = str3;
                                    if (cursorQuery.getColumnIndex(str7) >= 0) {
                                        qdlVar.mml(cursorQuery.getInt(cursorQuery.getColumnIndex(str7)));
                                    }
                                    String str10 = str2;
                                    if (cursorQuery.getColumnIndex(str10) >= 0) {
                                        str5 = str9;
                                        qdlVar.wd(cursorQuery.getString(cursorQuery.getColumnIndex(str10)));
                                    } else {
                                        str5 = str9;
                                    }
                                    arrayList3.add(qdlVar);
                                    arrayList = arrayList3;
                                    str6 = str10;
                                    str8 = str5;
                                }
                                ArrayList arrayList4 = arrayList;
                                cursorQuery.close();
                                str = "BusMonitorCenter";
                                try {
                                    Log.i(str, "exec upload ...");
                                    if (arrayList4.isEmpty()) {
                                        return;
                                    }
                                    try {
                                        qdl.this.f17900ud.onMonitorUpload(arrayList4);
                                        SQLiteDatabase sQLiteDatabaseQdl = com.bytedance.sdk.openadsdk.yt.qdl.qdl.qdl();
                                        if (sQLiteDatabaseQdl != null && sQLiteDatabaseQdl.isOpen()) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("_id IN (");
                                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                                sb2.append("?");
                                                if (i11 < arrayList2.size() - 1) {
                                                    sb2.append(StringUtils.COMMA);
                                                }
                                            }
                                            sb2.append(")");
                                            sQLiteDatabaseQdl.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                                            if (qdl.this.lnr != null) {
                                                qdl.this.lnr.qdl(qdl.mo);
                                            }
                                        }
                                        if (arrayList4.size() < i10 || qdl.this.f17901wd > 1000) {
                                            return;
                                        }
                                        qdl.this.qdl(false);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Log.e(str, th.getMessage());
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str = "BusMonitorCenter";
                                Log.e(str, th.getMessage());
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                str = "BusMonitorCenter";
            }
        }
    };

    private qdl(ud udVar) {
        try {
            this.f17900ud = new BusMonitorDependWrapper(udVar);
            this.lnr = new com.bytedance.sdk.openadsdk.yt.lnr.qdl(udVar.getContext());
            mzz = udVar.getContext();
        } catch (Throwable th2) {
            Log.e("BusMonitorCenter", th2.getMessage());
        }
    }

    static /* synthetic */ int mml(qdl qdlVar) {
        int i10 = qdlVar.f17901wd;
        qdlVar.f17901wd = i10 + 1;
        return i10;
    }

    private boolean lnr() {
        if (this.mml == null) {
            ud udVar = this.f17900ud;
            return (udVar == null || udVar.getContext() == null || this.f17900ud.getHandler() == null) ? false : true;
        }
        ud udVar2 = this.f17900ud;
        return (udVar2 == null || udVar2.getContext() == null || !this.f17900ud.isMonitorOpen() || this.f17900ud.getHandler() == null) ? false : true;
    }

    public static qdl qdl(ud udVar) {
        return new qdl(udVar);
    }

    public static Context qdl() {
        Context context = mzz;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void qdl(final mml mmlVar) {
        if (mmlVar == null || !lnr()) {
            return;
        }
        this.f17900ud.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                qdl qdlVar = qdl.this;
                qdlVar.mml = Boolean.valueOf(qdlVar.f17900ud.isMonitorOpen());
                if (qdl.this.mml.booleanValue()) {
                    qdl.this.jpc.add(mmlVar);
                    if (qdl.this.jpc.size() >= 10) {
                        qdl qdlVar2 = qdl.this;
                        qdlVar2.qdl(qdlVar2.jpc);
                        qdl.this.jpc.clear();
                    }
                }
            }
        });
        this.f17900ud.getHandler().removeCallbacks(this.tvp);
        this.f17900ud.getHandler().postDelayed(this.tvp, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca A[Catch: all -> 0x01ae, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01ae, blocks: (B:45:0x01aa, B:59:0x01ca), top: B:68:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl(java.util.List<com.bytedance.sdk.openadsdk.yt.mml> r27) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.yt.qdl.qdl(java.util.List):void");
    }

    public void qdl(final boolean z10) {
        ud udVar = this.f17900ud;
        if (udVar == null || udVar.getHandler() == null || this.f17900ud.getContext() == null || this.lnr == null || !this.f17900ud.isMonitorOpen()) {
            return;
        }
        this.f17900ud.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yt.qdl.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    qdl.mml(qdl.this);
                    if (z10) {
                        long jQdl = qdl.this.lnr.qdl();
                        if (jQdl == 0) {
                            qdl.this.lnr.qdl(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.yt.mml.qdl.qdl(jQdl) && System.currentTimeMillis() - jQdl < qdl.this.f17900ud.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (qdl.this.f17900ud.getHandler() != null) {
                        qdl.this.f17900ud.getHandler().post(qdl.this.to);
                    }
                } catch (Throwable th2) {
                    Log.e("BusMonitorCenter", th2.getMessage());
                }
            }
        }, Math.max(this.f17900ud.getOnceLogInterval(), 10000));
    }
}
