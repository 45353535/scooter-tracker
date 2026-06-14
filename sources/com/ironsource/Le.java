package com.ironsource;

import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
class Le implements M8, M8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f41293c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, Integer> f41294a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4263ca f41295b = new C4263ca();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41296a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f41296a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41296a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41296a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41296a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    Le() {
        for (IronSource.a aVar : IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    private void a(@NotNull IronSource.a aVar, int i10) {
        this.f41294a.put(aVar, Integer.valueOf(i10));
        int i11 = a.f41296a[aVar.ordinal()];
        if (i11 == 1) {
            this.f41295b.d(i10);
            return;
        }
        if (i11 == 2) {
            this.f41295b.b(i10);
        } else if (i11 == 3) {
            this.f41295b.a(i10);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f41295b.c(i10);
        }
    }

    @Override // com.ironsource.M8.a
    public synchronized void b(IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.f41294a.get(aVar).intValue() + 1);
    }

    @Override // com.ironsource.M8
    public synchronized int a(IronSource.a aVar) {
        int iIntValue = -1;
        if (aVar == null) {
            return -1;
        }
        Integer num = this.f41294a.get(aVar);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.M8
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
