package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Nb {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final a f41452m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f41453n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private G1 f41455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f41457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f41458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList<Yb> f41459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Yb f41460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41461h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private C4460o2 f41462i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f41463j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f41464k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f41465l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public Nb(int i10, long j10, boolean z10, @NotNull G1 events, @NotNull C4460o2 auctionSettings, int i11, long j11, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        this.f41454a = z13;
        this.f41459f = new ArrayList<>();
        this.f41456c = i10;
        this.f41457d = j10;
        this.f41458e = z10;
        this.f41455b = events;
        this.f41461h = i11;
        this.f41462i = auctionSettings;
        this.f41463j = j11;
        this.f41464k = z11;
        this.f41465l = z12;
    }

    public final void a(@NotNull G1 g12) {
        Intrinsics.checkNotNullParameter(g12, "<set-?>");
        this.f41455b = g12;
    }

    public final int b() {
        return this.f41456c;
    }

    public final long c() {
        return this.f41457d;
    }

    @NotNull
    public final C4460o2 d() {
        return this.f41462i;
    }

    @Nullable
    public final Yb e() {
        for (Yb yb2 : this.f41459f) {
            if (yb2.d()) {
                return yb2;
            }
        }
        return this.f41460g;
    }

    public final int f() {
        return this.f41461h;
    }

    @NotNull
    public final G1 g() {
        return this.f41455b;
    }

    public final long h() {
        return this.f41463j;
    }

    public final boolean i() {
        return this.f41464k;
    }

    public final boolean j() {
        return this.f41454a;
    }

    public final boolean k() {
        return this.f41465l;
    }

    @NotNull
    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f41456c + ", bidderExclusive=" + this.f41458e + "}";
    }

    public final void a(int i10) {
        this.f41456c = i10;
    }

    public final void b(int i10) {
        this.f41461h = i10;
    }

    public final void c(boolean z10) {
        this.f41465l = z10;
    }

    public final void a(long j10) {
        this.f41457d = j10;
    }

    public final void b(long j10) {
        this.f41463j = j10;
    }

    public final boolean a() {
        return this.f41458e;
    }

    public final void b(boolean z10) {
        this.f41464k = z10;
    }

    public final void a(boolean z10) {
        this.f41458e = z10;
    }

    public final void a(@NotNull C4460o2 c4460o2) {
        Intrinsics.checkNotNullParameter(c4460o2, "<set-?>");
        this.f41462i = c4460o2;
    }

    public final void a(@Nullable Yb yb2) {
        if (yb2 != null) {
            this.f41459f.add(yb2);
            if (this.f41460g == null) {
                this.f41460g = yb2;
            } else if (yb2.b() == 0) {
                this.f41460g = yb2;
            }
        }
    }

    @Nullable
    public final Yb a(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        for (Yb yb2 : this.f41459f) {
            if (Intrinsics.areEqual(yb2.c(), placementName)) {
                return yb2;
            }
        }
        return null;
    }
}
