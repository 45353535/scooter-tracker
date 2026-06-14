package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.l;
import io.sentry.m7;
import io.sentry.s5;

/* JADX INFO: loaded from: classes3.dex */
public class i implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f82725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f82726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f82727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f82728e;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return Long.compare(this.f82726c, iVar.f82726c);
    }

    public long c() {
        if (n()) {
            return this.f82728e - this.f82727d;
        }
        return 0L;
    }

    public s5 d() {
        if (n()) {
            return new m7(l.i(e()));
        }
        return null;
    }

    public long e() {
        if (m()) {
            return this.f82726c + c();
        }
        return 0L;
    }

    public double f() {
        return l.j(e());
    }

    public s5 g() {
        if (m()) {
            return new m7(l.i(h()));
        }
        return null;
    }

    public String getDescription() {
        return this.f82725b;
    }

    public long h() {
        return this.f82726c;
    }

    public double i() {
        return l.j(this.f82726c);
    }

    public long j() {
        return this.f82727d;
    }

    public boolean k() {
        return this.f82727d == 0;
    }

    public boolean l() {
        return this.f82728e == 0;
    }

    public boolean m() {
        return this.f82727d != 0;
    }

    public boolean n() {
        return this.f82728e != 0;
    }

    public void o() {
        this.f82725b = null;
        this.f82727d = 0L;
        this.f82728e = 0L;
        this.f82726c = 0L;
    }

    public void p(long j10) {
        this.f82727d = j10;
        this.f82726c = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f82727d);
    }

    public void q(String str, long j10, long j11, long j12) {
        this.f82725b = str;
        this.f82726c = j10;
        this.f82727d = j11;
        this.f82728e = j12;
    }

    public void r() {
        this.f82727d = SystemClock.uptimeMillis();
        this.f82726c = System.currentTimeMillis();
    }

    public void s() {
        this.f82728e = SystemClock.uptimeMillis();
    }
}
