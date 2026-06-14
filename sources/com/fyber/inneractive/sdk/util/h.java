package com.fyber.inneractive.sdk.util;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f23871a;

    public h(String str) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            lValueOf = null;
        }
        this.f23871a = lValueOf;
    }
}
