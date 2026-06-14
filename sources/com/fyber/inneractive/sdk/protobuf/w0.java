package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes7.dex */
public final class w0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f23606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4 f23608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23610e;

    public w0(e1 e1Var, int i10, j4 j4Var, boolean z10, boolean z11) {
        this.f23606a = e1Var;
        this.f23607b = i10;
        this.f23608c = j4Var;
        this.f23609d = z10;
        this.f23610e = z11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f23607b - ((w0) obj).f23607b;
    }
}
