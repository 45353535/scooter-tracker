package io.appmetrica.analytics.impl;

import android.util.Pair;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5182j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mc f77452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f77453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f77454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5504vl f77455d;

    public C5182j0(String str, long j10, C5504vl c5504vl) {
        this.f77453b = j10;
        try {
            this.f77452a = new Mc(str);
        } catch (Throwable unused) {
            this.f77452a = new Mc();
        }
        this.f77455d = c5504vl;
    }

    public final synchronized void a(Pair pair) {
        if (this.f77455d.b(this.f77452a, (String) pair.first, (String) pair.second)) {
            this.f77454c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f77452a.size() + ". Is changed " + this.f77454c + ". Current revision " + this.f77453b;
    }

    public final synchronized C5157i0 a() {
        try {
            if (this.f77454c) {
                this.f77453b++;
                this.f77454c = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return new C5157i0(AbstractC5295nb.b(this.f77452a), this.f77453b);
    }
}
