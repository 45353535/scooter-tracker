package com.bytedance.sdk.component.mo.qdl.qdl.qdl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes6.dex */
public class mzz implements com.bytedance.sdk.component.mo.qdl.qdl.mzz {
    public static final mzz qdl = new mzz();

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private volatile SQLiteDatabase f16543ud;

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String lnr() {
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String mml() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String mo() {
        return null;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String mzz() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public SQLiteDatabase qdl(Context context) {
        if (this.f16543ud == null) {
            synchronized (this) {
                try {
                    if (this.f16543ud == null) {
                        this.f16543ud = new mml(context).getWritableDatabase();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f16543ud;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String ud() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mzz
    public String qdl() {
        return "loghighpriority";
    }
}
