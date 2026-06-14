package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzabe extends IOException {
    public zzabe(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String strConcat = th2.getMessage() != null ? ": ".concat(String.valueOf(th2.getMessage())) : "";
        StringBuilder sb2 = new StringBuilder(simpleName.length() + 11 + strConcat.length());
        sb2.append("Unexpected ");
        sb2.append(simpleName);
        sb2.append(strConcat);
        super(sb2.toString(), th2);
    }
}
