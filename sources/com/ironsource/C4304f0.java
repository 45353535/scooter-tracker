package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4304f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f43067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final UUID f43068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f43069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private C4283dd f43070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final C4642yf f43071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Double f43072f;

    /* JADX INFO: renamed from: com.ironsource.f0$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43073a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f43073a = iArr;
        }
    }

    public C4304f0(@NotNull IronSource.a adFormat, @NotNull UUID adId, @NotNull String adUnitId, @Nullable C4283dd c4283dd, @Nullable C4642yf c4642yf, @Nullable Double d10) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f43067a = adFormat;
        this.f43068b = adId;
        this.f43069c = adUnitId;
        this.f43070d = c4283dd;
        this.f43071e = c4642yf;
        this.f43072f = d10;
    }

    @NotNull
    public final IronSource.a a() {
        return this.f43067a;
    }

    @NotNull
    public final UUID b() {
        return this.f43068b;
    }

    @NotNull
    public final String c() {
        return this.f43069c;
    }

    @Nullable
    public final Double d() {
        return this.f43072f;
    }

    @NotNull
    public final LevelPlay.AdFormat e() {
        int i10 = a.f43073a[this.f43067a.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i10 == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        throw new lf.m();
    }

    @Nullable
    public final C4283dd f() {
        return this.f43070d;
    }

    @Nullable
    public final C4642yf g() {
        return this.f43071e;
    }

    public final void a(@Nullable C4283dd c4283dd) {
        this.f43070d = c4283dd;
    }

    public /* synthetic */ C4304f0(IronSource.a aVar, UUID uuid, String str, C4283dd c4283dd, C4642yf c4642yf, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, (i10 & 8) != 0 ? null : c4283dd, (i10 & 16) != 0 ? null : c4642yf, (i10 & 32) != 0 ? null : d10);
    }
}
