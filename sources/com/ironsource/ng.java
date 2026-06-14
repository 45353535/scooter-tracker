package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ng {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f44479d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V0 f44480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f44481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Sc f44482c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ng a(@NotNull V0 adTools, @NotNull AbstractC4576v0 adUnitData) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.t() ? new C4477p2(adTools, adUnitData) : new Bc(adTools, adUnitData);
        }

        private a() {
        }
    }

    public static final class b implements Sc {
        b() {
        }

        @Override // com.ironsource.Sc
        public /* synthetic */ void a(AbstractC4643z abstractC4643z, String str, C4432ma c4432ma) {
            bj.a(this, abstractC4643z, str, c4432ma);
        }

        @Override // com.ironsource.Sc
        public /* synthetic */ void a(List list, AbstractC4643z abstractC4643z) {
            bj.b(this, list, abstractC4643z);
        }
    }

    public ng(@NotNull V0 adTools, @NotNull AbstractC4576v0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f44480a = adTools;
        this.f44481b = adUnitData;
        this.f44482c = new b();
    }

    @NotNull
    public Sc a() {
        return this.f44482c;
    }

    public abstract void a(@NotNull C c10, @NotNull og ogVar);

    @NotNull
    public final pg a(@NotNull List<? extends C4424m2> waterfallItems, @NotNull Map<String, G> adInstancePayloads, @NotNull C4373j2 auctionData, @NotNull C adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44480a, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4424m2 c4424m2 = waterfallItems.get(i10);
            AbstractC4643z abstractC4643zA = a(c4424m2, auctionData, adInstanceFactory, adInstancePayloads.get(c4424m2.c()));
            if (abstractC4643zA != null && abstractC4643zA.g() != null) {
                arrayList.add(abstractC4643zA);
            }
        }
        pg pgVar = new pg(arrayList);
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44480a, "updateWaterfall() - next waterfall is " + pgVar + ".toWaterfallString()", (String) null, 2, (Object) null));
        return pgVar;
    }

    private final AbstractC4643z a(C4424m2 c4424m2, C4373j2 c4373j2, C c10, G g10) {
        AbstractC4576v0 abstractC4576v0 = this.f44481b;
        String strC = c4424m2.c();
        Intrinsics.checkNotNullExpressionValue(strC, "item.instanceName");
        NetworkSettings networkSettingsA = abstractC4576v0.a(strC);
        if (networkSettingsA == null) {
            String strC2 = c4424m2.c();
            Intrinsics.checkNotNullExpressionValue(strC2, "item.instanceName");
            a("Could not find matching provider settings for auction response item", strC2);
            return null;
        }
        if (g10 == null) {
            String strC3 = c4424m2.c();
            Intrinsics.checkNotNullExpressionValue(strC3, "item.instanceName");
            a("Could not find matching adInstancePayload for auction response item", strC3);
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(networkSettingsA, this.f44481b.b().a(), this.f44481b.b().b());
        int iF = this.f44480a.f();
        AbstractC4576v0 abstractC4576v02 = this.f44481b;
        return c10.a(new A(abstractC4576v02, networkSettingsA, c4373j2, new C4237b1(networkSettingsA, abstractC4576v02.b(networkSettingsA), this.f44481b.b().a()), c4424m2, iF), g10);
    }

    private final void a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C4441n0.a(this.f44480a, str3, (String) null, 2, (Object) null));
        this.f44480a.e().h().i(str3);
    }
}
