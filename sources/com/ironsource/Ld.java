package com.ironsource;

import com.ironsource.AbstractC4576v0;
import com.ironsource.N0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Ld extends AbstractC4576v0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f41286z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final C4304f0 f41287t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f41288u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final C4559u0 f41289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final Rd f41290w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f41291x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f41292y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Ld a(@NotNull C4304f0 adProperties, @Nullable Xa xa2, boolean z10) {
            List<C4588vc> listEmptyList;
            Ee eeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4576v0.a aVar = AbstractC4576v0.f45598r;
            S3 s3C = (xa2 == null || (eeD = xa2.d()) == null) ? null : eeD.c();
            Rd rdF = s3C != null ? s3C.f() : null;
            if (rdF == null) {
                throw new IllegalStateException("Error getting " + adProperties.a() + " configurations");
            }
            if (xa2 == null || (listEmptyList = xa2.d(adProperties.e(), adProperties.c())) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            String strF = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            Iterator<T> it = listEmptyList.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4588vc) it.next()).f());
            }
            C4432ma c4432maB = C4432ma.b();
            Intrinsics.checkNotNullExpressionValue(c4432maB, "getInstance()");
            return new Ld(adProperties, z10, new C4559u0(strF, arrayList, c4432maB), rdF);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Ld(@NotNull C4304f0 adProperties, boolean z10, @NotNull C4559u0 adUnitCommonData, @NotNull Rd configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C4432ma c4432maE = adUnitCommonData.e();
        C4460o2 c4460o2K = configs.k();
        Intrinsics.checkNotNullExpressionValue(c4460o2K, "configs.rewardedVideoAuctionSettings");
        super(adProperties, z10, strF, listD, c4432maE, c4460o2K, configs.g(), configs.h(), configs.j(), configs.b(), configs.c(), new N0(N0.a.MANUAL, configs.k().j(), configs.k().b(), -1L), configs.l(), configs.f(), configs.o(), configs.n(), false, 65536, null);
        this.f41287t = adProperties;
        this.f41288u = z10;
        this.f41289v = adUnitCommonData;
        this.f41290w = configs;
        this.f41291x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.f41292y = Ya.f42156b;
    }

    @NotNull
    public final C4559u0 A() {
        return this.f41289v;
    }

    @NotNull
    public final Rd B() {
        return this.f41290w;
    }

    @NotNull
    public final Ld a(@NotNull C4304f0 adProperties, boolean z10, @NotNull C4559u0 adUnitCommonData, @NotNull Rd configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new Ld(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public C4304f0 b() {
        return this.f41287t;
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public String c() {
        return this.f41291x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ld)) {
            return false;
        }
        Ld ld2 = (Ld) obj;
        return Intrinsics.areEqual(this.f41287t, ld2.f41287t) && this.f41288u == ld2.f41288u && Intrinsics.areEqual(this.f41289v, ld2.f41289v) && Intrinsics.areEqual(this.f41290w, ld2.f41290w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f41287t.hashCode() * 31;
        boolean z10 = this.f41288u;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((iHashCode + r12) * 31) + this.f41289v.hashCode()) * 31) + this.f41290w.hashCode();
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public String j() {
        return this.f41292y;
    }

    @NotNull
    public String toString() {
        return "RewardedAdUnitData(adProperties=" + this.f41287t + ", isPublisherLoad=" + this.f41288u + ", adUnitCommonData=" + this.f41289v + ", configs=" + this.f41290w + ")";
    }

    @Override // com.ironsource.AbstractC4576v0
    public boolean u() {
        return this.f41288u;
    }

    @NotNull
    public final C4304f0 w() {
        return this.f41287t;
    }

    public final boolean x() {
        return this.f41288u;
    }

    @NotNull
    public final C4559u0 y() {
        return this.f41289v;
    }

    @NotNull
    public final Rd z() {
        return this.f41290w;
    }

    public static /* synthetic */ Ld a(Ld ld2, C4304f0 c4304f0, boolean z10, C4559u0 c4559u0, Rd rd2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4304f0 = ld2.f41287t;
        }
        if ((i10 & 2) != 0) {
            z10 = ld2.f41288u;
        }
        if ((i10 & 4) != 0) {
            c4559u0 = ld2.f41289v;
        }
        if ((i10 & 8) != 0) {
            rd2 = ld2.f41290w;
        }
        return ld2.a(c4304f0, z10, c4559u0, rd2);
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject rewardedVideoSettings = providerSettings.getRewardedVideoSettings();
        Intrinsics.checkNotNullExpressionValue(rewardedVideoSettings, "providerSettings.rewardedVideoSettings");
        return rewardedVideoSettings;
    }
}
