package com.ironsource;

import com.ironsource.C4456nf;
import com.ironsource.D0;
import com.ironsource.InterfaceC4582v6;
import com.ironsource.Wa;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4441n0 extends C4553tb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final IronSource.a f44436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4456nf.b f44437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final B5 f44438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final I8 f44439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f44440f;

    /* JADX INFO: renamed from: com.ironsource.n0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f44441a = new a();

        private a() {
        }

        @NotNull
        public static final C4441n0 a(@NotNull IronSource.a adFormat, @NotNull D0.b level) {
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(level, "level");
            return new C4441n0(adFormat, level);
        }
    }

    public C4441n0(@NotNull IronSource.a adFormat, @NotNull D0.b level) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f44439e = Ib.f41088s.d().e();
        this.f44440f = TimeUnit.HOURS.toMillis(1L);
        this.f44436b = adFormat;
        this.f44438d = new B5(adFormat, level, null, null, 12, null);
        C4456nf.b bVarB = C4456nf.b(adFormat);
        Intrinsics.checkNotNullExpressionValue(bVarB, "createLogFactory(adFormat)");
        this.f44437c = bVarB;
    }

    public static /* synthetic */ String a(C4441n0 c4441n0, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c4441n0.a(str, str2);
    }

    @NotNull
    public final String b(@Nullable String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    @NotNull
    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    @NotNull
    protected final IronSource.a d() {
        return this.f44436b;
    }

    @NotNull
    public final B5 e() {
        return this.f44438d;
    }

    public final int f() {
        return Ib.f41088s.d().s().a(this.f44436b);
    }

    public final boolean g() {
        return Ib.f41088s.d().e().c();
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String strA = this.f44437c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    @NotNull
    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b bVarD = com.ironsource.lifecycle.b.d();
        Intrinsics.checkNotNullExpressionValue(bVarD, "getInstance()");
        return bVarD;
    }

    @NotNull
    public final C4283dd c(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Xa xaA = this.f44439e.a();
        if (xaA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C4283dd c4283ddC = xaA.c(LevelPlay.AdFormat.NATIVE_AD, placementName);
        if (c4283ddC != null) {
            return c4283ddC;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final Wa.a d(@NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Xa xaA = this.f44439e.a();
        if (xaA != null) {
            return xaA.a(adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final C4283dd a(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Xa xaA = this.f44439e.a();
        if (xaA != null) {
            C4283dd c4283ddC = xaA.c(LevelPlay.AdFormat.BANNER, placementName);
            if (c4283ddC != null) {
                return c4283ddC;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    public final InterfaceC4582v6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Xa xaA = this.f44439e.a();
        if (xaA != null) {
            return xaA.b(adFormat, adUnitId);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Xa xaA = this.f44439e.a();
        return xaA != null ? xaA.b(adFormat) : this.f44440f;
    }

    public C4441n0(@NotNull C4441n0 adTools, @NotNull D0.b level) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f44439e = Ib.f41088s.d().e();
        this.f44440f = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = adTools.f44436b;
        this.f44436b = aVar;
        this.f44437c = adTools.f44437c;
        this.f44438d = new B5(aVar, level, adTools.f44438d.c(), null, 8, null);
    }

    @Nullable
    public final C4283dd a(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        Xa xaA;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        if (str == null || (xaA = this.f44439e.a()) == null) {
            return null;
        }
        return xaA.c(adFormat, str);
    }

    public final void a(@NotNull Map<String, Object> data, @NotNull ISBannerSize size) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.l.a(data, size);
    }

    @NotNull
    public final ISBannerSize a(@NotNull LevelPlayAdSize adSize) {
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new C4388k0().b(adSize);
    }
}
