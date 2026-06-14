package com.ironsource;

import com.ironsource.K7;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4317fd implements K7, K7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final J3 f43111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final P4 f43112b;

    /* JADX INFO: renamed from: com.ironsource.fd$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43113a;

        static {
            int[] iArr = new int[N3.values().length];
            try {
                iArr[N3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43113a = iArr;
        }
    }

    public C4317fd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.K7
    @NotNull
    public synchronized L3 a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String strA = new C4401kd(placementName, adFormat).a();
        L3 l3A = this.f43112b.a(strA);
        if (l3A.d()) {
            return l3A;
        }
        return this.f43111a.a(strA);
    }

    @Override // com.ironsource.K7.a
    public synchronized void b(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        String strA = new C4401kd(placementName, adFormat).a();
        if (!this.f43112b.a(strA).d()) {
            this.f43111a.b(strA);
        }
    }

    public C4317fd(@NotNull J3 cappingService, @NotNull P4 deliveryHandler) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Intrinsics.checkNotNullParameter(deliveryHandler, "deliveryHandler");
        this.f43111a = cappingService;
        this.f43112b = deliveryHandler;
    }

    public /* synthetic */ C4317fd(J3 j32, P4 p42, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new J3(null, null, null, 7, null) : j32, (i10 & 2) != 0 ? new P4() : p42);
    }

    @Override // com.ironsource.K7.a
    @NotNull
    public synchronized Object a(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat, @NotNull N3 cappingType, @NotNull InterfaceC4465o7 cappingConfig) {
        Object objA;
        try {
            Intrinsics.checkNotNullParameter(placementName, "placementName");
            Intrinsics.checkNotNullParameter(adFormat, "adFormat");
            Intrinsics.checkNotNullParameter(cappingType, "cappingType");
            Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
            String strA = new C4401kd(placementName, adFormat).a();
            int i10 = a.f43113a[cappingType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new lf.m();
                }
                objA = this.f43111a.a(strA, cappingType, cappingConfig);
            } else {
                objA = this.f43112b.a(strA, cappingType, cappingConfig);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return objA;
    }
}
