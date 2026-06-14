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
public final class C9 extends AbstractC4576v0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f40479z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final C4304f0 f40480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f40481u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final C4559u0 f40482v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final E9 f40483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f40484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f40485y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C9 a(@NotNull C4304f0 adProperties, @Nullable Xa xa2, boolean z10) {
            List<C4588vc> listEmptyList;
            Ee eeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4576v0.a aVar = AbstractC4576v0.f45598r;
            S3 s3C = (xa2 == null || (eeD = xa2.d()) == null) ? null : eeD.c();
            E9 e9D = s3C != null ? s3C.d() : null;
            if (e9D == null) {
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
            return new C9(adProperties, z10, new C4559u0(strF, arrayList, c4432maB), e9D);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9(@NotNull C4304f0 adProperties, boolean z10, @NotNull C4559u0 adUnitCommonData, @NotNull E9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C4432ma c4432maE = adUnitCommonData.e();
        C4460o2 c4460o2G = configs.g();
        Intrinsics.checkNotNullExpressionValue(c4460o2G, "configs.interstitialAuctionSettings");
        super(adProperties, z10, strF, listD, c4432maE, c4460o2G, configs.c(), configs.d(), configs.f(), configs.b(), -1, new N0(N0.a.MANUAL, configs.g().j(), configs.g().b(), -1L), configs.h(), configs.k(), configs.m(), configs.l(), false, 65536, null);
        this.f40480t = adProperties;
        this.f40481u = z10;
        this.f40482v = adUnitCommonData;
        this.f40483w = configs;
        this.f40484x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.f40485y = Ya.f42157c;
    }

    @NotNull
    public final C4559u0 A() {
        return this.f40482v;
    }

    @NotNull
    public final E9 B() {
        return this.f40483w;
    }

    @NotNull
    public final C9 a(@NotNull C4304f0 adProperties, boolean z10, @NotNull C4559u0 adUnitCommonData, @NotNull E9 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C9(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public C4304f0 b() {
        return this.f40480t;
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public String c() {
        return this.f40484x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9)) {
            return false;
        }
        C9 c92 = (C9) obj;
        return Intrinsics.areEqual(this.f40480t, c92.f40480t) && this.f40481u == c92.f40481u && Intrinsics.areEqual(this.f40482v, c92.f40482v) && Intrinsics.areEqual(this.f40483w, c92.f40483w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f40480t.hashCode() * 31;
        boolean z10 = this.f40481u;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((iHashCode + r12) * 31) + this.f40482v.hashCode()) * 31) + this.f40483w.hashCode();
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public String j() {
        return this.f40485y;
    }

    @NotNull
    public String toString() {
        return "InterstitialAdUnitData(adProperties=" + this.f40480t + ", isPublisherLoad=" + this.f40481u + ", adUnitCommonData=" + this.f40482v + ", configs=" + this.f40483w + ")";
    }

    @Override // com.ironsource.AbstractC4576v0
    public boolean u() {
        return this.f40481u;
    }

    @NotNull
    public final C4304f0 w() {
        return this.f40480t;
    }

    public final boolean x() {
        return this.f40481u;
    }

    @NotNull
    public final C4559u0 y() {
        return this.f40482v;
    }

    @NotNull
    public final E9 z() {
        return this.f40483w;
    }

    public static /* synthetic */ C9 a(C9 c92, C4304f0 c4304f0, boolean z10, C4559u0 c4559u0, E9 e92, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4304f0 = c92.f40480t;
        }
        if ((i10 & 2) != 0) {
            z10 = c92.f40481u;
        }
        if ((i10 & 4) != 0) {
            c4559u0 = c92.f40482v;
        }
        if ((i10 & 8) != 0) {
            e92 = c92.f40483w;
        }
        return c92.a(c4304f0, z10, c4559u0, e92);
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject interstitialSettings = providerSettings.getInterstitialSettings();
        Intrinsics.checkNotNullExpressionValue(interstitialSettings, "providerSettings.interstitialSettings");
        return interstitialSettings;
    }
}
