package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.sdk.controller.f;
import j$.util.Objects;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class N {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f41334f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f41335g = "0";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f41336h = "0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f41337i = "0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f41338j = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final L9 f41339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private T7 f41340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f41341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private EnumC4422m0 f41342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f41343e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public N(@NotNull L9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        this.f41339a = adInstance;
        this.f41340b = T7.UnknownProvider;
        this.f41341c = "0";
        this.f41342d = EnumC4422m0.LOAD_REQUEST;
        this.f41343e = new Date().getTime() / 1000.0d;
    }

    @NotNull
    public final L9 a() {
        return this.f41339a;
    }

    @NotNull
    public final IronSource.a b() {
        return this.f41339a.i() ? IronSource.a.BANNER : this.f41339a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    @NotNull
    public final String c() {
        String strE = this.f41339a.e();
        Intrinsics.checkNotNullExpressionValue(strE, "adInstance.id");
        return strE;
    }

    @NotNull
    public final L9 d() {
        return this.f41339a;
    }

    @NotNull
    public final T7 e() {
        return this.f41340b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return Intrinsics.areEqual(c(), n10.c()) && Intrinsics.areEqual(g(), n10.g()) && b() == n10.b() && Intrinsics.areEqual(i(), n10.i()) && this.f41340b == n10.f41340b && Intrinsics.areEqual(this.f41341c, n10.f41341c) && this.f41342d == n10.f41342d;
    }

    @NotNull
    public final EnumC4422m0 f() {
        return this.f41342d;
    }

    @NotNull
    public final String g() {
        String strC = this.f41339a.c();
        return strC == null ? "0" : strC;
    }

    @NotNull
    public final String h() {
        return this.f41341c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.f41340b, this.f41341c, this.f41342d, Double.valueOf(this.f41343e));
    }

    @NotNull
    public final String i() {
        String strG = this.f41339a.g();
        Intrinsics.checkNotNullExpressionValue(strG, "adInstance.name");
        return strG;
    }

    public final double j() {
        return this.f41343e;
    }

    @NotNull
    public String toString() {
        String string = new JSONObject().put(f.b.f45109c, c()).put("advertiserBundleId", this.f41341c).put("adProvider", this.f41340b.ordinal()).put("adStatus", this.f41342d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f41343e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    @NotNull
    public final N a(@NotNull L9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        return new N(adInstance);
    }

    public static /* synthetic */ N a(N n10, L9 l92, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l92 = n10.f41339a;
        }
        return n10.a(l92);
    }

    public final void a(@NotNull T7 t72) {
        Intrinsics.checkNotNullParameter(t72, "<set-?>");
        this.f41340b = t72;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f41341c = str;
    }

    public final void a(@NotNull EnumC4422m0 enumC4422m0) {
        Intrinsics.checkNotNullParameter(enumC4422m0, "<set-?>");
        this.f41342d = enumC4422m0;
    }

    public final void a(double d10) {
        this.f41343e = d10;
    }
}
