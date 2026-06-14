package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5351ph extends U5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f77983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f77984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f77986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f77987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f77988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f77989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC5276mh f77990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC5326oh f77991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f77992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f77993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f77994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f77995p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f77996q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f77997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f77998s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f77999t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f78000u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f78001v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f78002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f78003x = new HashSet();

    public C5351ph(C5058e5 c5058e5) {
        this.f77991l = c5058e5;
    }

    public final void a(int i10) {
        this.f77997r = i10;
    }

    public final void b(List<String> list) {
        this.f77996q = list;
    }

    public final String c() {
        return this.f77992m;
    }

    public final void d(boolean z10) {
        this.f77983d = z10;
    }

    public final void e(boolean z10) {
        this.f77987h = z10;
    }

    public final void f(boolean z10) {
        this.f77993n = z10;
    }

    public final boolean g() {
        return this.f78000u;
    }

    @NonNull
    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f77995p, "");
    }

    public final boolean i() {
        return this.f77990k.a(this.f77989j);
    }

    public final int j() {
        return this.f77986g;
    }

    public final long k() {
        return this.f78001v;
    }

    public final int l() {
        return this.f77988i;
    }

    public final long m() {
        return this.f77998s;
    }

    public final long n() {
        return this.f77999t;
    }

    public final List<String> o() {
        return this.f77996q;
    }

    public final int p() {
        return this.f77985f;
    }

    public final boolean q() {
        return this.f77994o;
    }

    public final boolean r() {
        return this.f77984e;
    }

    public final boolean s() {
        return this.f77983d;
    }

    public final boolean t() {
        return this.f77993n;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f77983d + ", mFirstActivationAsUpdate=" + this.f77984e + ", mSessionTimeout=" + this.f77985f + ", mDispatchPeriod=" + this.f77986g + ", mLogEnabled=" + this.f77987h + ", mMaxReportsCount=" + this.f77988i + ", dataSendingEnabledFromArguments=" + this.f77989j + ", dataSendingStrategy=" + this.f77990k + ", mPreloadInfoSendingStrategy=" + this.f77991l + ", mApiKey='" + this.f77992m + "', mPermissionsCollectingEnabled=" + this.f77993n + ", mFeaturesCollectingEnabled=" + this.f77994o + ", mClidsFromStartupResponse='" + this.f77995p + "', mReportHosts=" + this.f77996q + ", mAttributionId=" + this.f77997r + ", mPermissionsCollectingIntervalSeconds=" + this.f77998s + ", mPermissionsForceSendIntervalSeconds=" + this.f77999t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f78000u + ", mMaxReportsInDbCount=" + this.f78001v + ", mCertificates=" + this.f78002w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !no.a((Collection) this.f77996q) && this.f78000u;
    }

    public final boolean v() {
        return ((C5058e5) this.f77991l).B();
    }

    public final void a(long j10) {
        this.f78001v = j10;
    }

    public final void b(long j10) {
        this.f77998s = j10;
    }

    public final void c(long j10) {
        this.f77999t = j10;
    }

    public final void d(int i10) {
        this.f77985f = i10;
    }

    @NonNull
    public final Set<String> e() {
        return this.f78003x;
    }

    @Nullable
    public final List<String> f() {
        return this.f78002w;
    }

    public final void a(@NonNull List<String> list) {
        this.f78002w = list;
    }

    public final void b(boolean z10) {
        this.f77994o = z10;
    }

    public final void c(boolean z10) {
        this.f77984e = z10;
    }

    public final int d() {
        return this.f77997r;
    }

    public final void a(@Nullable Boolean bool, @NonNull InterfaceC5276mh interfaceC5276mh) {
        this.f77989j = bool;
        this.f77990k = interfaceC5276mh;
    }

    public final void b(int i10) {
        this.f77986g = i10;
    }

    public final void c(int i10) {
        this.f77988i = i10;
    }

    public final void a(boolean z10) {
        this.f78000u = z10;
    }

    public final void a(@NonNull Set<String> set) {
        this.f78003x = set;
    }
}
