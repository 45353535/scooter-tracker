package com.bytedance.sdk.openadsdk.mml;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    private long lnr;
    private long mml;
    private long mzz;
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17748ud;

    public void lnr(long j10) {
        if (this.lnr <= 0) {
            this.lnr = j10;
        }
    }

    public void mml(long j10) {
        if (this.mml <= 0) {
            this.mml = j10;
        }
    }

    public void mzz(long j10) {
        if (this.mzz <= 0) {
            this.mzz = j10;
        }
    }

    public void qdl(long j10) {
        if (this.qdl <= 0) {
            this.qdl = j10;
        }
    }

    public void ud(long j10) {
        if (this.f17748ud <= 0) {
            this.f17748ud = j10;
        }
    }

    public boolean qdl() {
        return this.qdl > 0;
    }

    public JSONObject ud() {
        return qdl((JSONObject) null);
    }

    public void qdl(long j10, float f10) {
        if (f10 > 0.0f) {
            qdl(j10);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            qdl(j10);
            ud(j10);
        }
        if (d10 >= 0.5d) {
            qdl(j10);
            ud(j10);
            lnr(j10);
        }
        if (d10 >= 0.75d) {
            qdl(j10);
            ud(j10);
            lnr(j10);
            mml(j10);
        }
        if (f10 >= 1.0f) {
            qdl(j10);
            ud(j10);
            lnr(j10);
            mml(j10);
            mzz(j10);
        }
    }

    public JSONObject qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j10 = this.qdl;
        if (j10 > 0) {
            jSONObject.put("show_start", j10);
            long j11 = this.f17748ud;
            if (j11 > 0) {
                jSONObject.put("show_firstQuartile", j11);
                long j12 = this.lnr;
                if (j12 > 0) {
                    jSONObject.put("show_mid", j12);
                    long j13 = this.mml;
                    if (j13 > 0) {
                        jSONObject.put("show_thirdQuartile", j13);
                        long j14 = this.mzz;
                        if (j14 > 0) {
                            jSONObject.put("show_full", j14);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}
