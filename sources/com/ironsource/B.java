package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class B implements C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V0 f40412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final A f40413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final BaseAdAdapter<?, ?> f40414c;

    public B(@NotNull V0 adTools, @NotNull A instanceData, @Nullable BaseAdAdapter<?, ?> baseAdAdapter) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        this.f40412a = adTools;
        this.f40413b = instanceData;
        this.f40414c = baseAdAdapter;
    }

    @Override // com.ironsource.C0
    @NotNull
    public Map<String, Object> a(@NotNull A0 event) {
        String adapterVersion;
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f40414c;
            String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            Intrinsics.checkNotNullExpressionValue(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f40414c;
            if (baseAdAdapter2 != null) {
                AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                Intrinsics.checkNotNull(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            Intrinsics.checkNotNull(networkSDKVersion);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(C4441n0.a(this.f40412a, "could not get adapter version for event data " + this.f40413b.w(), (String) null, 2, (Object) null));
        }
        String strI = this.f40413b.j().i();
        Intrinsics.checkNotNullExpressionValue(strI, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strI);
        String strA = this.f40413b.j().a();
        Intrinsics.checkNotNullExpressionValue(strA, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(IronSourceConstants.EVENTS_PROVIDER, strA);
        map.put("instanceType", Integer.valueOf(this.f40413b.s()));
        String serverData = this.f40413b.n().k();
        V0 v02 = this.f40412a;
        Intrinsics.checkNotNullExpressionValue(serverData, "serverData");
        String strE = v02.e(serverData);
        if (!TextUtils.isEmpty(strE)) {
            map.put("dynamicDemandSource", strE);
        }
        map.put("sessionDepth", Integer.valueOf(this.f40413b.v()));
        if (!TextUtils.isEmpty(this.f40413b.u().getCustomNetwork())) {
            String customNetwork = this.f40413b.u().getCustomNetwork();
            Intrinsics.checkNotNullExpressionValue(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}
