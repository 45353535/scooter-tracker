package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4289e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f42953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f42954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f42955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final StringBuilder f42956d;

    public C4289e2(@NotNull AbstractC4576v0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f42953a = adUnitData;
        this.f42954b = new HashMap();
        this.f42955c = new ArrayList();
        this.f42956d = new StringBuilder();
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.f42954b;
    }

    @NotNull
    public final List<String> b() {
        return this.f42955c;
    }

    @NotNull
    public final StringBuilder c() {
        return this.f42956d;
    }

    public final boolean d() {
        return (this.f42954b.isEmpty() && this.f42955c.isEmpty()) ? false : true;
    }

    public final void a(@NotNull NetworkSettings providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        List<String> list = this.f42955c;
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        list.add(providerInstanceName);
        StringBuilder sb2 = this.f42956d;
        sb2.append(providerSettings.getInstanceType(this.f42953a.b().a()));
        sb2.append(providerSettings.getProviderInstanceName());
        sb2.append(StringUtils.COMMA);
    }

    public final void a(@NotNull NetworkSettings providerSettings, @NotNull Map<String, ? extends Object> biddingData) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        String providerInstanceName = providerSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        a(providerInstanceName, providerSettings.getInstanceType(this.f42953a.b().a()), biddingData);
    }

    public final void a(@NotNull A3 biddingResponse) {
        Intrinsics.checkNotNullParameter(biddingResponse, "biddingResponse");
        String strC = biddingResponse.c();
        Intrinsics.checkNotNullExpressionValue(strC, "biddingResponse.instanceName");
        int iD = biddingResponse.d();
        Map<String, Object> mapA = biddingResponse.a();
        Intrinsics.checkNotNullExpressionValue(mapA, "biddingResponse.biddingData");
        a(strC, iD, mapA);
    }

    private final void a(String str, int i10, Map<String, ? extends Object> map) {
        this.f42954b.put(str, map);
        StringBuilder sb2 = this.f42956d;
        sb2.append(i10);
        sb2.append(str);
        sb2.append(StringUtils.COMMA);
    }
}
