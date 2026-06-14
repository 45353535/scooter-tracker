package com.ironsource;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class ah {
    public static /* synthetic */ String a(C4 c42, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c42.a(str, str2);
    }
}
