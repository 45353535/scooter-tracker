package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4495q3 implements InterfaceC4271d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final S3 f44678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final C4589vd f44679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final IronSource.a f44680c;

    /* JADX INFO: renamed from: com.ironsource.q3$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44681a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44681a = iArr;
        }
    }

    public C4495q3(@NotNull S3 adFormatConfigurations, @Nullable C4589vd c4589vd, @NotNull IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormatConfigurations, "adFormatConfigurations");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f44678a = adFormatConfigurations;
        this.f44679b = c4589vd;
        this.f44680c = adFormat;
    }

    @Override // com.ironsource.InterfaceC4271d1
    @Nullable
    public InterfaceC4397k9 a(@NotNull InterfaceC4521rd providerName) {
        NetworkSettings networkSettingsB;
        Rd rdF;
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        C4589vd c4589vd = this.f44679b;
        if (c4589vd == null || (networkSettingsB = c4589vd.b(providerName.value())) == null) {
            return null;
        }
        int i10 = a.f44681a[this.f44680c.ordinal()];
        if (i10 == 1) {
            T2 t2C = this.f44678a.c();
            if (t2C != null) {
                return new Y2(new C4237b1(networkSettingsB, networkSettingsB.getBannerSettings(), this.f44680c), t2C);
            }
            return null;
        }
        if (i10 != 2) {
            if (i10 == 3 && (rdF = this.f44678a.f()) != null) {
                return new Ed(new C4237b1(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.f44680c), rdF);
            }
            return null;
        }
        E9 e9D = this.f44678a.d();
        if (e9D != null) {
            return new H9(new C4237b1(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.f44680c), e9D);
        }
        return null;
    }
}
