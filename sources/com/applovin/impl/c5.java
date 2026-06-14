package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* JADX INFO: loaded from: classes6.dex */
public class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d5 f8496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f8499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxError f8500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f8501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f8502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f8503h;

    public interface a {
        void a(c5 c5Var);
    }

    private c5(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j10, long j11) {
        this(d5Var, str, maxError, j10, j11, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, long j10, long j11) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new c5(d5Var, hVar, str, null, j10, j11);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f8502g;
    }

    public MaxError c() {
        return this.f8500e;
    }

    public String d() {
        return this.f8497b;
    }

    public String e() {
        return this.f8499d;
    }

    public d5 f() {
        return this.f8496a;
    }

    public boolean g() {
        return this.f8503h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f8496a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f8497b);
        sb2.append('\'');
        sb2.append(", mAdapterVersion='");
        sb2.append(this.f8498c);
        sb2.append('\'');
        sb2.append(", mSignalDataLength='");
        String str = this.f8499d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append('\'');
        sb2.append(", mErrorMessage=");
        MaxError maxError = this.f8500e;
        sb2.append(maxError != null ? maxError.getMessage() : "");
        sb2.append('}');
        return sb2.toString();
    }

    private c5(d5 d5Var, String str, MaxError maxError, long j10, long j11, String str2, String str3, boolean z10) {
        this.f8496a = d5Var;
        this.f8499d = str;
        this.f8500e = maxError;
        this.f8501f = j10;
        this.f8502g = j11;
        this.f8497b = str2;
        this.f8498c = str3;
        this.f8503h = z10;
    }

    public static c5 a(d5 d5Var, MaxError maxError) {
        return a(d5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j10, long j11) {
        if (d5Var != null) {
            return new c5(d5Var, hVar, null, maxError, j10, j11);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static c5 a(c5 c5Var) {
        return new c5(c5Var.f(), c5Var.e(), c5Var.c(), c5Var.f8501f, c5Var.f8502g, c5Var.d(), c5Var.a(), true);
    }

    public String a() {
        return this.f8498c;
    }
}
