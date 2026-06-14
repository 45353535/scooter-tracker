package io.appmetrica.analytics.idsync.impl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class u {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "none";
        }
        if (i10 == 2) {
            return "success";
        }
        if (i10 == 3) {
            return "incompatible_precondition";
        }
        if (i10 == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "FAILURE" : "INCOMPATIBLE_PRECONDITION" : "SUCCESS" : "NONE";
    }
}
