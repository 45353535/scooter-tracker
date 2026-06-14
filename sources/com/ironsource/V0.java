package com.ironsource;

import com.ironsource.D0;
import com.ironsource.M8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public class V0 extends C4441n0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final C4441n0 f41856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final R0 f41857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private InterfaceC4323g2 f41858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(@NotNull C4441n0 adTools, @NotNull AbstractC4576v0 adUnitData, @NotNull D0.b level) {
        super(adTools, level);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f41856g = adTools;
        R0 r0A = C4456nf.a(adUnitData, adUnitData.e().c());
        Intrinsics.checkNotNullExpressionValue(r0A, "getAdUnitPerformance(\n  …auctionSavedHistoryLimit)");
        this.f41857h = r0A;
    }

    public final void a(@Nullable InterfaceC4323g2 interfaceC4323g2) {
        this.f41858i = interfaceC4323g2;
    }

    public final void c(@NotNull AbstractRunnableC4232ae task) {
        Intrinsics.checkNotNullParameter(task, "task");
        C4473of.a(C4473of.f44574a, task, 0L, 2, null);
    }

    @NotNull
    public final String e(@NotNull String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        String strC = com.ironsource.mediationsdk.d.b().c(serverData);
        Intrinsics.checkNotNullExpressionValue(strC, "getInstance().getDynamic…romServerData(serverData)");
        return strC;
    }

    @NotNull
    public final R0 h() {
        return this.f41857h;
    }

    @Nullable
    public final InterfaceC4323g2 i() {
        return this.f41858i;
    }

    @Nullable
    public final String j() {
        return com.ironsource.mediationsdk.r.m().l();
    }

    @Nullable
    public final C4246ba k() {
        return C4456nf.a();
    }

    @NotNull
    public final M8.a l() {
        return Ib.f41088s.a().h();
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull A instanceData) {
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return com.ironsource.mediationsdk.c.b().a(instanceData.u(), instanceData.h(), instanceData.i().b().b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(@NotNull V0 adUnitTools, @NotNull D0.b level) {
        super(adUnitTools, level);
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f41856g = adUnitTools.f41856g;
        this.f41857h = adUnitTools.f41857h;
        this.f41858i = adUnitTools.f41858i;
    }

    @Nullable
    public final BaseAdAdapter<?, ?> a(@NotNull NetworkSettings providerSettings, @NotNull IronSource.a adFormat, @NotNull UUID adId) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return com.ironsource.mediationsdk.c.b().a(providerSettings, adFormat, adId);
    }

    @NotNull
    public final String a(long j10, @NotNull String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        String strA = IronSourceUtils.a(j10, instanceName);
        Intrinsics.checkNotNullExpressionValue(strA, "getTransId(timeStamp, instanceName)");
        return strA;
    }
}
