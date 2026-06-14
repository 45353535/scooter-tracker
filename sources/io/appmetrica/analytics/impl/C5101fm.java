package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5101fm extends U5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f77173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f77174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f77175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f77176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f77177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5586z3 f77178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f77179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f77180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f77181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f77182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f77183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C5375qg f77184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final N7 f77185p;

    public C5101fm() {
        this(C5468ua.k().u(), new N7());
    }

    public final long a(long j10) {
        if (this.f77183n == 0) {
            this.f77183n = j10;
        }
        return this.f77183n;
    }

    @NonNull
    public final C5586z3 c() {
        return this.f77178i;
    }

    @Nullable
    public final Map<String, String> d() {
        return this.f77177h;
    }

    public final String e() {
        return this.f77182m;
    }

    @Nullable
    public final String f() {
        return this.f77175f;
    }

    public final long g() {
        return this.f77183n;
    }

    @Nullable
    public final String h() {
        return this.f77176g;
    }

    @Nullable
    public final List<String> i() {
        return this.f77179j;
    }

    @NonNull
    public final C5375qg j() {
        return this.f77184o;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> k() {
        /*
            r9 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = r9.f77173d
            boolean r1 = io.appmetrica.analytics.impl.no.a(r1)
            if (r1 != 0) goto L12
            java.util.List r1 = r9.f77173d
            r0.addAll(r1)
        L12:
            java.util.List r1 = r9.f77174e
            boolean r1 = io.appmetrica.analytics.impl.no.a(r1)
            if (r1 != 0) goto L1f
            java.util.List r1 = r9.f77174e
            r0.addAll(r1)
        L1f:
            io.appmetrica.analytics.impl.N7 r1 = r9.f77185p
            io.appmetrica.analytics.impl.Xm r1 = r1.f76154a
            java.lang.Object r1 = r1.a()
            java.lang.String[] r1 = (java.lang.String[]) r1
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L55
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r6 = r2
        L34:
            if (r6 >= r5) goto L4a
            r7 = r1[r6]
            if (r7 == 0) goto L41
            boolean r8 = kotlin.text.StringsKt.y0(r7)
            if (r8 != 0) goto L41
            goto L42
        L41:
            r7 = r3
        L42:
            if (r7 == 0) goto L47
            r4.add(r7)
        L47:
            int r6 = r6 + 1
            goto L34
        L4a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L51
            goto L52
        L51:
            r4 = r3
        L52:
            if (r4 == 0) goto L55
            goto L73
        L55:
            java.lang.String[] r1 = io.appmetrica.analytics.BuildConfig.DEFAULT_HOSTS
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
        L5d:
            if (r2 >= r5) goto L73
            r6 = r1[r2]
            if (r6 == 0) goto L6a
            boolean r7 = kotlin.text.StringsKt.y0(r6)
            if (r7 != 0) goto L6a
            goto L6b
        L6a:
            r6 = r3
        L6b:
            if (r6 == 0) goto L70
            r4.add(r6)
        L70:
            int r2 = r2 + 1
            goto L5d
        L73:
            r0.addAll(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5101fm.k():java.util.List");
    }

    public final List<String> l() {
        return this.f77174e;
    }

    public final List<String> m() {
        return this.f77173d;
    }

    @Nullable
    public final boolean n() {
        return this.f77180k;
    }

    public final boolean o() {
        return this.f77181l;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f77173d + ", mStartupHostsFromClient=" + this.f77174e + ", mDistributionReferrer='" + this.f77175f + "', mInstallReferrerSource='" + this.f77176g + "', mClidsFromClient=" + this.f77177h + ", mNewCustomHosts=" + this.f77179j + ", mHasNewCustomHosts=" + this.f77180k + ", mSuccessfulStartup=" + this.f77181l + ", mCountryInit='" + this.f77182m + "', mFirstStartupTime=" + this.f77183n + "} " + super.toString();
    }

    public C5101fm(C5375qg c5375qg, N7 n72) {
        this.f77178i = new C5586z3(null, Y7.f76695c);
        this.f77183n = 0L;
        this.f77184o = c5375qg;
        this.f77185p = n72;
    }

    public final void a(@Nullable List<String> list) {
        this.f77179j = list;
    }

    public final void a(boolean z10) {
        this.f77180k = z10;
    }

    public final void a(String str) {
        this.f77182m = str;
    }
}
