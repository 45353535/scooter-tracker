package com.ironsource.mediationsdk;

import com.ironsource.C4246ba;
import com.ironsource.C4306f2;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f44039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList<C4306f2> f44040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f44042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f44044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private List<String> f44045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f44046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private h f44047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private C4246ba f44048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private String f44049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private ISBannerSize f44050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f44051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f44052n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f44053o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private String f44054p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private String f44055q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    private Boolean f44056r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Double f44057s;

    public i(@NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f44039a = adUnit;
        this.f44040b = new ArrayList<>();
        this.f44042d = "";
        this.f44044f = new HashMap();
        this.f44045g = new ArrayList();
        this.f44046h = -1;
        this.f44049k = "";
    }

    public static /* synthetic */ void i() {
    }

    public static /* synthetic */ void m() {
    }

    @NotNull
    public final IronSource.a a() {
        return this.f44039a;
    }

    public final void b(boolean z10) {
        this.f44043e = z10;
    }

    @NotNull
    public final IronSource.a c() {
        return this.f44039a;
    }

    public final void d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f44049k = str;
    }

    @Nullable
    public final h e() {
        return this.f44047i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f44039a == ((i) obj).f44039a;
    }

    @Nullable
    public final ISBannerSize f() {
        return this.f44050l;
    }

    @Nullable
    public final Double g() {
        return this.f44057s;
    }

    @NotNull
    public final Map<String, Object> h() {
        return this.f44044f;
    }

    public int hashCode() {
        return this.f44039a.hashCode();
    }

    @NotNull
    public final String j() {
        return this.f44042d;
    }

    @NotNull
    public final ArrayList<C4306f2> k() {
        return this.f44040b;
    }

    @NotNull
    public final List<String> l() {
        return this.f44045g;
    }

    @Nullable
    public final C4246ba n() {
        return this.f44048j;
    }

    public final int o() {
        return this.f44046h;
    }

    public final boolean p() {
        return this.f44052n;
    }

    public final boolean q() {
        return this.f44053o;
    }

    @NotNull
    public final String r() {
        return this.f44049k;
    }

    public final boolean s() {
        return this.f44051m;
    }

    public final boolean t() {
        return this.f44043e;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestParams(adUnit=" + this.f44039a + ")";
    }

    @Nullable
    public final Boolean u() {
        return this.f44056r;
    }

    public final boolean v() {
        return this.f44041c;
    }

    @NotNull
    public final i a(@NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new i(adUnit);
    }

    public final void b(@Nullable String str) {
        this.f44054p = str;
    }

    public final void c(boolean z10) {
        this.f44041c = z10;
    }

    public final void d(boolean z10) {
        this.f44052n = z10;
    }

    public final void e(boolean z10) {
        this.f44053o = z10;
    }

    public static /* synthetic */ i a(i iVar, IronSource.a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = iVar.f44039a;
        }
        return iVar.a(aVar);
    }

    @Nullable
    public final String b() {
        return this.f44055q;
    }

    public final void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f44042d = str;
    }

    @Nullable
    public final String d() {
        return this.f44054p;
    }

    public final void a(@NotNull C4306f2 instanceInfo) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        this.f44040b.add(instanceInfo);
    }

    public final void a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f44044f = map;
    }

    public final void a(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f44045g = list;
    }

    public final void a(int i10) {
        this.f44046h = i10;
    }

    public final void a(@Nullable h hVar) {
        this.f44047i = hVar;
    }

    public final void a(@Nullable C4246ba c4246ba) {
        this.f44048j = c4246ba;
    }

    public final void a(@Nullable ISBannerSize iSBannerSize) {
        this.f44050l = iSBannerSize;
    }

    public final void a(boolean z10) {
        this.f44051m = z10;
    }

    public final void a(@Nullable String str) {
        this.f44055q = str;
    }

    public final void a(@Nullable Boolean bool) {
        this.f44056r = bool;
    }

    public final void a(@Nullable Double d10) {
        this.f44057s = d10;
    }
}
