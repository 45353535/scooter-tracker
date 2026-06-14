package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4347h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f43252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC4380j9 f43253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final JSONObject f43254d;

    public C4347h9(@NotNull String url, @NotNull String storePackage, @NotNull EnumC4380j9 strategy, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f43251a = url;
        this.f43252b = storePackage;
        this.f43253c = strategy;
        this.f43254d = jSONObject;
    }

    @NotNull
    public final String a() {
        return this.f43251a;
    }

    @NotNull
    public final String b() {
        return this.f43252b;
    }

    @NotNull
    public final EnumC4380j9 c() {
        return this.f43253c;
    }

    @Nullable
    public final JSONObject d() {
        return this.f43254d;
    }

    @Nullable
    public final JSONObject e() {
        return this.f43254d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4347h9)) {
            return false;
        }
        C4347h9 c4347h9 = (C4347h9) obj;
        return Intrinsics.areEqual(this.f43251a, c4347h9.f43251a) && Intrinsics.areEqual(this.f43252b, c4347h9.f43252b) && this.f43253c == c4347h9.f43253c && Intrinsics.areEqual(this.f43254d, c4347h9.f43254d);
    }

    @NotNull
    public final String f() {
        return this.f43252b;
    }

    @NotNull
    public final EnumC4380j9 g() {
        return this.f43253c;
    }

    @NotNull
    public final String h() {
        return this.f43251a;
    }

    public int hashCode() {
        int iHashCode = ((((this.f43251a.hashCode() * 31) + this.f43252b.hashCode()) * 31) + this.f43253c.hashCode()) * 31;
        JSONObject jSONObject = this.f43254d;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    @NotNull
    public String toString() {
        return "InlineStoreRequest(url=" + this.f43251a + ", storePackage=" + this.f43252b + ", strategy=" + this.f43253c + ", extras=" + this.f43254d + ")";
    }

    @NotNull
    public final C4347h9 a(@NotNull String url, @NotNull String storePackage, @NotNull EnumC4380j9 strategy, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(storePackage, "storePackage");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return new C4347h9(url, storePackage, strategy, jSONObject);
    }

    public static /* synthetic */ C4347h9 a(C4347h9 c4347h9, String str, String str2, EnumC4380j9 enumC4380j9, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4347h9.f43251a;
        }
        if ((i10 & 2) != 0) {
            str2 = c4347h9.f43252b;
        }
        if ((i10 & 4) != 0) {
            enumC4380j9 = c4347h9.f43253c;
        }
        if ((i10 & 8) != 0) {
            jSONObject = c4347h9.f43254d;
        }
        return c4347h9.a(str, str2, enumC4380j9, jSONObject);
    }

    public /* synthetic */ C4347h9(String str, String str2, EnumC4380j9 enumC4380j9, JSONObject jSONObject, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? EnumC4380j9.APP_ACTIVITY : enumC4380j9, (i10 & 8) != 0 ? null : jSONObject);
    }
}
