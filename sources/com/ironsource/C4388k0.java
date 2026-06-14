package com.ironsource;

import android.content.Context;
import com.ironsource.C4456nf;
import com.ironsource.D0;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4388k0 extends C4553tb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final B5 f43432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4456nf.b f43433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final I8 f43434d;

    public C4388k0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.f43432b = new B5(aVar, D0.b.MEDIATION, null, null, 12, null);
        C4456nf.b bVarB = C4456nf.b(aVar);
        Intrinsics.checkNotNullExpressionValue(bVarB, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f43433c = bVarB;
        this.f43434d = Ib.f41088s.d().e();
    }

    public static /* synthetic */ String a(C4388k0 c4388k0, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c4388k0.a(str, str2);
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        return Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f44062b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize(com.ironsource.mediationsdk.l.f44063c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize(com.ironsource.mediationsdk.l.f44065e, 0, 0) : Intrinsics.areEqual(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize("BANNER", levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    @NotNull
    public final List<LevelPlayAdSize> b() {
        Xa xaA = this.f43434d.a();
        if (xaA != null) {
            return xaA.h();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final boolean d() {
        return Ib.f41088s.d().e().c();
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String strA = this.f43433c.a(str, str2);
        Intrinsics.checkNotNullExpressionValue(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final int a(int i10) {
        return com.ironsource.mediationsdk.l.a(i10);
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeB = b(fallbackAdSize$mediationsdk_release);
        iSBannerSizeB.setAdaptive(true);
        com.ironsource.mediationsdk.o.f44146a.a(iSBannerSizeB, new V7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return iSBannerSizeB;
    }

    @Nullable
    public final Integer b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Float fC = c();
        if (fC != null) {
            return Integer.valueOf(zf.a.d(fC.floatValue() * C4241b5.f42712a.a(context)));
        }
        return null;
    }

    @NotNull
    public final ISBannerSize b(@NotNull LevelPlayAdSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        boolean zIsAdaptive = size.isAdaptive();
        if (zIsAdaptive) {
            return a(size);
        }
        if (zIsAdaptive) {
            throw new lf.m();
        }
        return c(size);
    }

    private final Float c() {
        Xa xaA = this.f43434d.a();
        Float fValueOf = xaA != null ? Float.valueOf(xaA.i()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.f43432b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }
}
