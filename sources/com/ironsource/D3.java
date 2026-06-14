package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class D3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f40536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f40537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f40538c;

    public D3(@NotNull String cachedAppKey, @NotNull String cachedUserId, @NotNull String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.f40536a = cachedAppKey;
        this.f40537b = cachedUserId;
        this.f40538c = cachedSettings;
    }

    @NotNull
    public final String a() {
        return this.f40536a;
    }

    @NotNull
    public final String b() {
        return this.f40537b;
    }

    @NotNull
    public final String c() {
        return this.f40538c;
    }

    @NotNull
    public final String d() {
        return this.f40536a;
    }

    @NotNull
    public final String e() {
        return this.f40538c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D3)) {
            return false;
        }
        D3 d32 = (D3) obj;
        return Intrinsics.areEqual(this.f40536a, d32.f40536a) && Intrinsics.areEqual(this.f40537b, d32.f40537b) && Intrinsics.areEqual(this.f40538c, d32.f40538c);
    }

    @NotNull
    public final String f() {
        return this.f40537b;
    }

    public int hashCode() {
        return (((this.f40536a.hashCode() * 31) + this.f40537b.hashCode()) * 31) + this.f40538c.hashCode();
    }

    @NotNull
    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f40536a + ", cachedUserId=" + this.f40537b + ", cachedSettings=" + this.f40538c + ")";
    }

    @NotNull
    public final D3 a(@NotNull String cachedAppKey, @NotNull String cachedUserId, @NotNull String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new D3(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f40538c = str;
    }

    public final void c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f40537b = str;
    }

    public static /* synthetic */ D3 a(D3 d32, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = d32.f40536a;
        }
        if ((i10 & 2) != 0) {
            str2 = d32.f40537b;
        }
        if ((i10 & 4) != 0) {
            str3 = d32.f40538c;
        }
        return d32.a(str, str2, str3);
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f40536a = str;
    }
}
