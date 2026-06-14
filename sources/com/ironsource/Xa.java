package com.ironsource;

import com.ironsource.C4524s;
import com.ironsource.C4538sd;
import com.ironsource.InterfaceC4582v6;
import com.ironsource.S2;
import com.ironsource.Wa;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class Xa extends C4284de {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42060a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f42060a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xa(@NotNull C4284de sdkConfig) {
        super(sdkConfig);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    public final boolean a(@NotNull String adUnitId, @NotNull LevelPlay.AdFormat adFormat) {
        Map<String, C4538sd.b> mapA;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C4538sd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(adUnitId)) ? false : true;
    }

    @NotNull
    public final InterfaceC4582v6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new InterfaceC4582v6.a(a(adFormat, adUnitId));
    }

    @NotNull
    public final List<C4588vc> c(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, C4538sd.b> mapA;
        Set<String> setKeySet;
        List<C4588vc> listDistinct;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C4538sd.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (setKeySet = mapA.keySet()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List listFlatten = CollectionsKt.flatten(arrayList);
            if (listFlatten != null && (listDistinct = CollectionsKt.distinct(listFlatten)) != null) {
                return listDistinct;
            }
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final List<C4588vc> d(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Map<String, C4538sd.b> mapA;
        C4538sd.b bVar;
        List<String> listA;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        C4538sd.a aVar = g().d().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (bVar = mapA.get(adUnitId)) == null || (listA = bVar.a()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            C4588vc c4588vc = g().e().a().get((String) it.next());
            if (c4588vc != null) {
                arrayList.add(c4588vc);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<LevelPlayAdSize> h() {
        List<String> listA = g().a().c().b().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float i() {
        return g().a().c().b().b();
    }

    public final boolean j() {
        com.ironsource.mediationsdk.adquality.a aVarA = d().c().a();
        return aVarA != null && aVarA.b();
    }

    public final boolean k() {
        return g().a().b().d();
    }

    @NotNull
    public final C4334gd b(@NotNull C4553tb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C4334gd(tools, g().a().a());
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        C4524s.d dVarB;
        Long lD;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C4524s c4524s = g().a().a().get(adFormat);
        long jLongValue = (c4524s == null || (dVarB = c4524s.b()) == null || (lD = dVarB.d()) == null) ? 60L : lD.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    @NotNull
    public final Wa.a a(@NotNull String adUnitId) {
        long jD;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        S2 s2C = g().a().c();
        S2.b bVar = s2C.a().get(adUnitId);
        int iC = bVar != null ? bVar.c() : s2C.b().c();
        boolean zE = bVar != null ? bVar.e() : s2C.b().e();
        if (bVar != null) {
            jD = bVar.d();
        } else {
            jD = s2C.b().d();
        }
        return new Wa.a(zE, iC, jD);
    }

    @NotNull
    public final List<String> a(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, C4538sd.b> mapA;
        Set<String> setKeySet;
        List<String> list;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C4538sd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null || (list = CollectionsKt.toList(setKeySet)) == null) ? CollectionsKt.emptyList() : list;
    }

    @Nullable
    public final C4283dd c(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        C4283dd c4283ddA;
        J9 j9A;
        String str2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i10 = a.f42060a[adFormat.ordinal()];
        if (i10 == 1) {
            Rd rdF = d().c().f();
            if (rdF == null || (c4283ddA = rdF.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(c4283ddA, "getRewardedVideoPlacement(placementName)");
            return new C4283dd(c4283ddA.b(), c4283ddA.c(), c4283ddA.d(), c4283ddA.f(), c4283ddA.e(), c4283ddA.a());
        }
        if (i10 == 2) {
            E9 e9D = d().c().d();
            if (e9D == null || (j9A = e9D.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(j9A, "getInterstitialPlacement(placementName)");
            return new C4283dd(j9A);
        }
        if (i10 == 3) {
            T2 t2C = d().c().c();
            if (t2C != null) {
                C4324g3 c4324g3A = t2C.a(str);
                if (c4324g3A == null) {
                    c4324g3A = t2C.i();
                    str2 = "config.defaultBannerPlacement";
                } else {
                    str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
                }
                Intrinsics.checkNotNullExpressionValue(c4324g3A, str2);
                return new C4283dd(c4324g3A);
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        if (i10 == 4) {
            Nb nbE = d().c().e();
            if (nbE != null && str != null) {
                Yb ybA = nbE.a(str);
                if (ybA == null) {
                    ybA = nbE.e();
                }
                if (ybA != null) {
                    return new C4283dd(ybA);
                }
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        throw new lf.m();
    }

    @NotNull
    public final C4542t0 a(@NotNull C4553tb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C4542t0(tools, g().a().a());
    }

    private final InterfaceC4582v6.c a(LevelPlay.AdFormat adFormat, String str) {
        C4524s.d dVarB;
        C4488pd c4488pdG;
        Map<String, C4524s.d> mapA;
        C4524s.d dVar;
        C4488pd c4488pdG2;
        boolean z10 = adFormat == LevelPlay.AdFormat.REWARDED;
        C4524s c4524s = g().a().a().get(adFormat);
        InterfaceC4582v6.c cVarA = null;
        InterfaceC4582v6.c cVarA2 = (c4524s == null || (mapA = c4524s.a()) == null || (dVar = mapA.get(str)) == null || (c4488pdG2 = dVar.g()) == null) ? null : c4488pdG2.a();
        if (c4524s != null && (dVarB = c4524s.b()) != null && (c4488pdG = dVarB.g()) != null) {
            cVarA = c4488pdG.a();
        }
        if (cVarA2 == null) {
            cVarA2 = cVarA;
        }
        if (cVarA2 != null) {
            return cVarA2;
        }
        if (z10) {
            return InterfaceC4582v6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC4582v6.c.SINGLE;
    }

    @NotNull
    public final Bd c(@NotNull C4553tb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        C4524s c4524s = g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Bd(tools, c4524s != null ? c4524s.a() : null, c4524s != null ? c4524s.c() : null);
    }
}
