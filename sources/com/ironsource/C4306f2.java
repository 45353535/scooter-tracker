package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4306f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f43078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f43079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private String f43081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private Map<String, ? extends Object> f43082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private com.ironsource.mediationsdk.h f43083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f43084g;

    public C4306f2(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f43078a = name;
        this.f43079b = z10;
        this.f43081d = "";
        this.f43082e = MapsKt.emptyMap();
        this.f43084g = new HashMap();
    }

    @NotNull
    public final String a() {
        return this.f43078a;
    }

    public final boolean b() {
        return this.f43079b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return this.f43084g;
    }

    @Nullable
    public final com.ironsource.mediationsdk.h d() {
        return this.f43083f;
    }

    public final boolean e() {
        return this.f43079b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4306f2)) {
            return false;
        }
        C4306f2 c4306f2 = (C4306f2) obj;
        return Intrinsics.areEqual(this.f43078a, c4306f2.f43078a) && this.f43079b == c4306f2.f43079b;
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.f43082e;
    }

    @NotNull
    public final String g() {
        return this.f43078a;
    }

    @NotNull
    public final String h() {
        return this.f43081d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f43078a.hashCode() * 31;
        boolean z10 = this.f43079b;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean i() {
        return this.f43080c;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f43078a + ", bidder=" + this.f43079b + ")";
    }

    @NotNull
    public final C4306f2 a(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C4306f2(name, z10);
    }

    public final void b(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f43082e = map;
    }

    public static /* synthetic */ C4306f2 a(C4306f2 c4306f2, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c4306f2.f43078a;
        }
        if ((i10 & 2) != 0) {
            z10 = c4306f2.f43079b;
        }
        return c4306f2.a(str, z10);
    }

    public final void a(boolean z10) {
        this.f43080c = z10;
    }

    public final void a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f43081d = str;
    }

    public final void a(@Nullable com.ironsource.mediationsdk.h hVar) {
        this.f43083f = hVar;
    }

    public final void a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f43084g = map;
    }
}
