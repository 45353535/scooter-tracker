package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class hw<T> {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hy f2431;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f2433;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ht f2434 = new ht();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Set<Object> f2435 = new HashSet();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Set<T> f2432 = new HashSet();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Set<hv> f2430 = new HashSet();

    public hw(hy hyVar) {
        this.f2431 = hyVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Set<hv> m6643() {
        return this.f2430;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Set<T> m6644() {
        return this.f2432;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final hw m6645() {
        this.f2433 = true;
        return this;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ht m6648() {
        return this.f2434;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6649() {
        return this.f2433;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Set<Object> m6650() {
        return this.f2435;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hy m6651() {
        return this.f2431;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6647(T t10) {
        this.f2432.add(t10);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6646(hv hvVar) {
        this.f2430.add(hvVar);
    }
}
