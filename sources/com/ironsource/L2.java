package com.ironsource;

import com.ironsource.AbstractC4576v0;
import com.ironsource.N0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
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
public final class L2 extends AbstractC4576v0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public static final a f41223z = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final I2 f41224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f41225u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final C4559u0 f41226v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final T2 f41227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f41228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private final String f41229y;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final L2 a(@NotNull I2 adProperties, @Nullable Xa xa2, boolean z10) {
            List<C4588vc> listEmptyList;
            Ee eeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4576v0.a aVar = AbstractC4576v0.f45598r;
            S3 s3C = (xa2 == null || (eeD = xa2.d()) == null) ? null : eeD.c();
            T2 t2C = s3C != null ? s3C.c() : null;
            if (t2C == null) {
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
            return new L2(adProperties, z10, new C4559u0(strF, arrayList, c4432maB), t2C);
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public L2(@NotNull I2 adProperties, boolean z10, @NotNull C4559u0 adUnitCommonData, @NotNull T2 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        String strF = adUnitCommonData.f();
        List<NetworkSettings> listD = adUnitCommonData.d();
        C4432ma c4432maE = adUnitCommonData.e();
        C4460o2 c4460o2D = configs.d();
        Intrinsics.checkNotNullExpressionValue(c4460o2D, "configs.bannerAuctionSettings");
        super(adProperties, z10, strF, listD, c4432maE, c4460o2D, configs.a(), (int) (configs.b() / ((long) 1000)), configs.c(), configs.f(), -1, new N0(N0.a.MANUAL_WITH_AUTOMATIC_RELOAD, configs.d().j(), configs.d().b(), 1000 * ((long) configs.h())), configs.e(), configs.l(), configs.n(), configs.m(), false, 65536, null);
        this.f41224t = adProperties;
        this.f41225u = z10;
        this.f41226v = adUnitCommonData;
        this.f41227w = configs;
        this.f41228x = "BN";
        this.f41229y = Ya.f42158d;
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public I2 b() {
        return this.f41224t;
    }

    @NotNull
    public final C4559u0 B() {
        return this.f41226v;
    }

    @NotNull
    public final T2 C() {
        return this.f41227w;
    }

    @NotNull
    public final L2 a(@NotNull I2 adProperties, boolean z10, @NotNull C4559u0 adUnitCommonData, @NotNull T2 configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new L2(adProperties, z10, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public String c() {
        return this.f41228x;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L2)) {
            return false;
        }
        L2 l22 = (L2) obj;
        return Intrinsics.areEqual(this.f41224t, l22.f41224t) && this.f41225u == l22.f41225u && Intrinsics.areEqual(this.f41226v, l22.f41226v) && Intrinsics.areEqual(this.f41227w, l22.f41227w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.f41224t.hashCode() * 31;
        boolean z10 = this.f41225u;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return ((((iHashCode + r12) * 31) + this.f41226v.hashCode()) * 31) + this.f41227w.hashCode();
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public String j() {
        return this.f41229y;
    }

    @NotNull
    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.f41224t + ", isPublisherLoad=" + this.f41225u + ", adUnitCommonData=" + this.f41226v + ", configs=" + this.f41227w + ")";
    }

    @Override // com.ironsource.AbstractC4576v0
    public boolean u() {
        return this.f41225u;
    }

    @NotNull
    public final I2 w() {
        return this.f41224t;
    }

    public final boolean x() {
        return this.f41225u;
    }

    @NotNull
    public final C4559u0 y() {
        return this.f41226v;
    }

    @NotNull
    public final T2 z() {
        return this.f41227w;
    }

    public static /* synthetic */ L2 a(L2 l22, I2 i22, boolean z10, C4559u0 c4559u0, T2 t22, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i22 = l22.f41224t;
        }
        if ((i10 & 2) != 0) {
            z10 = l22.f41225u;
        }
        if ((i10 & 4) != 0) {
            c4559u0 = l22.f41226v;
        }
        if ((i10 & 8) != 0) {
            t22 = l22.f41227w;
        }
        return l22.a(i22, z10, c4559u0, t22);
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject bannerSettings = providerSettings.getBannerSettings();
        Intrinsics.checkNotNullExpressionValue(bannerSettings, "providerSettings.bannerSettings");
        return bannerSettings;
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public AdData a(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        AdData adDataCreateAdDataForNetworkAdapter = AdData.createAdDataForNetworkAdapter(b(providerSettings), b().a(), r(), new com.ironsource.mediationsdk.q(ContextProvider.getInstance().getApplicationContext(), new C4388k0().b(b().h())));
        Intrinsics.checkNotNullExpressionValue(adDataCreateAdDataForNetworkAdapter, "createAdDataForNetworkAd…ze(adProperties.adSize)))");
        return adDataCreateAdDataForNetworkAdapter;
    }
}
