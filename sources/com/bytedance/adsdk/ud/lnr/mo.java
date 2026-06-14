package com.bytedance.adsdk.ud.lnr;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private final String lnr;
    public final float qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public final float f16012ud;

    public mo(String str, float f10, float f11) {
        this.lnr = str;
        this.f16012ud = f11;
        this.qdl = f10;
    }

    public boolean qdl(String str) {
        if (this.lnr.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.lnr.endsWith("\r")) {
            String str2 = this.lnr;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
