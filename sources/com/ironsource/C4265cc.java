package com.ironsource;

import com.ironsource.AbstractC4576v0;
import com.ironsource.N0;
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

/* JADX INFO: renamed from: com.ironsource.cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4265cc extends AbstractC4576v0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public static final a f42815y = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final C4304f0 f42816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final C4559u0 f42817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Nb f42818v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final String f42819w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    private final String f42820x;

    /* JADX INFO: renamed from: com.ironsource.cc$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C4265cc a(@NotNull C4304f0 adProperties, @Nullable Xa xa2) {
            List<C4588vc> listEmptyList;
            Ee eeD;
            Intrinsics.checkNotNullParameter(adProperties, "adProperties");
            AbstractC4576v0.a aVar = AbstractC4576v0.f45598r;
            S3 s3C = (xa2 == null || (eeD = xa2.d()) == null) ? null : eeD.c();
            Nb nbE = s3C != null ? s3C.e() : null;
            if (nbE == null) {
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
            return new C4265cc(adProperties, new C4559u0(strF, arrayList, c4432maB), nbE);
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4265cc(@NotNull C4304f0 adProperties, @NotNull C4559u0 adUnitCommonData, @NotNull Nb configs) {
        super(adProperties, true, adUnitCommonData.f(), adUnitCommonData.d(), adUnitCommonData.e(), configs.d(), configs.b(), (int) (configs.c() / ((long) 1000)), configs.a(), configs.f(), -1, new N0(N0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 65536, null);
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f42816t = adProperties;
        this.f42817u = adUnitCommonData;
        this.f42818v = configs;
        this.f42819w = "NA";
        this.f42820x = Ya.f42159e;
    }

    @NotNull
    public final Nb A() {
        return this.f42818v;
    }

    @NotNull
    public final C4265cc a(@NotNull C4304f0 adProperties, @NotNull C4559u0 adUnitCommonData, @NotNull Nb configs) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitCommonData, "adUnitCommonData");
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new C4265cc(adProperties, adUnitCommonData, configs);
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public C4304f0 b() {
        return this.f42816t;
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public String c() {
        return this.f42819w;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4265cc)) {
            return false;
        }
        C4265cc c4265cc = (C4265cc) obj;
        return Intrinsics.areEqual(this.f42816t, c4265cc.f42816t) && Intrinsics.areEqual(this.f42817u, c4265cc.f42817u) && Intrinsics.areEqual(this.f42818v, c4265cc.f42818v);
    }

    public int hashCode() {
        return (((this.f42816t.hashCode() * 31) + this.f42817u.hashCode()) * 31) + this.f42818v.hashCode();
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public String j() {
        return this.f42820x;
    }

    @NotNull
    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.f42816t + ", adUnitCommonData=" + this.f42817u + ", configs=" + this.f42818v + ")";
    }

    @NotNull
    public final C4304f0 w() {
        return this.f42816t;
    }

    @NotNull
    public final C4559u0 x() {
        return this.f42817u;
    }

    @NotNull
    public final Nb y() {
        return this.f42818v;
    }

    @NotNull
    public final C4559u0 z() {
        return this.f42817u;
    }

    public static /* synthetic */ C4265cc a(C4265cc c4265cc, C4304f0 c4304f0, C4559u0 c4559u0, Nb nb2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c4304f0 = c4265cc.f42816t;
        }
        if ((i10 & 2) != 0) {
            c4559u0 = c4265cc.f42817u;
        }
        if ((i10 & 4) != 0) {
            nb2 = c4265cc.f42818v;
        }
        return c4265cc.a(c4304f0, c4559u0, nb2);
    }

    @Override // com.ironsource.AbstractC4576v0
    @NotNull
    public JSONObject b(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        Intrinsics.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }
}
