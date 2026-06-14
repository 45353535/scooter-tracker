package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f42149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private V f42150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f42152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f42153f;

    public Y8(@NotNull String appKey, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f42148a = appKey;
        this.f42149b = userId;
    }

    @NotNull
    public final String a() {
        return this.f42148a;
    }

    @NotNull
    public final String b() {
        return this.f42149b;
    }

    public final boolean c() {
        return this.f42151d;
    }

    @NotNull
    public final String d() {
        return this.f42148a;
    }

    @Nullable
    public final V e() {
        return this.f42150c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y8)) {
            return false;
        }
        Y8 y82 = (Y8) obj;
        return Intrinsics.areEqual(this.f42148a, y82.f42148a) && Intrinsics.areEqual(this.f42149b, y82.f42149b);
    }

    @Nullable
    public final String f() {
        return this.f42153f;
    }

    @Nullable
    public final String g() {
        return this.f42152e;
    }

    @NotNull
    public final String h() {
        return this.f42149b;
    }

    public int hashCode() {
        return (this.f42148a.hashCode() * 31) + this.f42149b.hashCode();
    }

    @NotNull
    public String toString() {
        return "InitConfig(appKey=" + this.f42148a + ", userId=" + this.f42149b + ")";
    }

    @NotNull
    public final Y8 a(@NotNull String appKey, @NotNull String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new Y8(appKey, userId);
    }

    public final void b(@Nullable String str) {
        this.f42152e = str;
    }

    public static /* synthetic */ Y8 a(Y8 y82, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = y82.f42148a;
        }
        if ((i10 & 2) != 0) {
            str2 = y82.f42149b;
        }
        return y82.a(str, str2);
    }

    public final void a(@Nullable V v10) {
        this.f42150c = v10;
    }

    public final void a(boolean z10) {
        this.f42151d = z10;
    }

    public final void a(@Nullable String str) {
        this.f42153f = str;
    }

    public final <T> T a(@NotNull Hb<Y8, T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
