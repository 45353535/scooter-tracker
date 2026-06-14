package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4442n1 implements InterfaceC4459o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final IronSource.a f44442a;

    /* JADX INFO: renamed from: com.ironsource.n1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44443a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44443a = iArr;
        }
    }

    public C4442n1(@NotNull IronSource.a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f44442a = adFormat;
    }

    @Override // com.ironsource.InterfaceC4459o1
    @NotNull
    public InterfaceC4476p1 a(@NotNull InterfaceC4389k1 eventBaseData) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i10 = a.f44443a[this.f44442a.ordinal()];
        if (i10 == 1) {
            return new D9(eventBaseData);
        }
        if (i10 == 2) {
            return new Qd(eventBaseData);
        }
        if (i10 == 3) {
            return new Q2(eventBaseData);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f44442a);
    }
}
