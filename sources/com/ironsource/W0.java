package com.ironsource;

import com.ironsource.N6;
import com.ironsource.mediationsdk.IronSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final W0 f41915a = new W0();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41916a;

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
            f41916a = iArr;
        }
    }

    private W0() {
    }

    @NotNull
    public static final N6.a a(@NotNull IronSource.a adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i10 = a.f41916a[adUnit.ordinal()];
        if (i10 == 1) {
            return N6.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return N6.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return N6.a.BANNER;
        }
        if (i10 == 4) {
            return N6.a.NATIVE_AD;
        }
        throw new lf.m();
    }
}
