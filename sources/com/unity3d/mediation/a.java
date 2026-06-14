package com.unity3d.mediation;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;
import lf.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f67888a = new a();

    /* JADX INFO: renamed from: com.unity3d.mediation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0845a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67889a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f67889a = iArr;
        }
    }

    private a() {
    }

    @NotNull
    public static final IronSource.a a(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i10 = C0845a.f67889a[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.BANNER;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new m();
    }
}
