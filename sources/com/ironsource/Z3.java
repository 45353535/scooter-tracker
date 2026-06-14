package com.ironsource;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Boolean f42226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4634y7 f42227b = Ib.f41088s.d().i();

    @Nullable
    public final Boolean a() {
        return this.f42226a;
    }

    @NotNull
    public final InterfaceC4634y7 b() {
        return this.f42227b;
    }

    public final void a(boolean z10) {
        this.f42226a = Boolean.valueOf(z10);
    }

    public final void a(@NotNull ConcurrentHashMap<String, AbstractAdapter> adapters, @NotNull ConcurrentHashMap<String, AdapterBaseWrapper> networkAdapters) {
        Unit unit;
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(networkAdapters, "networkAdapters");
        for (AbstractAdapter adapter : adapters.values()) {
            Intrinsics.checkNotNullExpressionValue(adapter, "adapter");
            a(adapter, (NetworkSettings) null);
        }
        for (AdapterBaseWrapper adapterBaseWrapper : networkAdapters.values()) {
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (adapterBaseInterface != null) {
                a(adapterBaseInterface, adapterBaseWrapper.getSettings());
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                IronLog.INTERNAL.error("adapter is null");
            }
        }
    }

    public final void a(@NotNull AdapterBaseInterface adapter, @Nullable NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean boolA = a(networkSettings);
            if (boolA == null || !(adapter instanceof AdapterConsentInterface)) {
                return;
            }
            ((AdapterConsentInterface) adapter).setConsent(boolA.booleanValue());
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String providerName = networkSettings != null ? networkSettings.getProviderName() : null;
            String str = "error while setting consent of " + providerName + ": " + th2.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    public final void a(@NotNull AbstractAdapter adapter, @Nullable NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            Boolean boolA = a(networkSettings);
            if (boolA != null) {
                adapter.setNewConsent(boolA.booleanValue());
            }
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str = "error while setting consent of " + adapter.getProviderName() + ": " + th2.getLocalizedMessage();
            a(str);
            IronLog.INTERNAL.error(str);
        }
    }

    private final Boolean a(NetworkSettings networkSettings) {
        if (networkSettings != null && !networkSettings.isCustomNetwork()) {
            if (networkSettings.getApplicationSettings().has(C4222a4.f42291a)) {
                return Boolean.valueOf(networkSettings.getApplicationSettings().optBoolean(C4222a4.f42291a));
            }
            return this.f42226a;
        }
        return this.f42226a;
    }

    private final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            G9.i().a(new C4649z5(A5.TROUBLESHOOTING_CONSENT_INTERNAL_ERROR, jSONObject));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public final void a(int i10) {
        JSONObject jSONObjectB = IronSourceUtils.b(false);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, i10 + ";" + this.f42227b.F(ContextProvider.getInstance().getApplicationContext()));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(lf.c.b(e10));
        }
        Ib.f41088s.d().q().a(new C4649z5(A5.CONSENT_TCF_CODE, jSONObjectB));
    }

    public final void a(int i10, @NotNull ConcurrentHashMap<String, NetworkSettings> providerSettings) {
        JSONObject applicationSettings;
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        String strF = this.f42227b.F(ContextProvider.getInstance().getApplicationContext());
        IronLog ironLog = IronLog.API;
        ironLog.general("TCF Additional Consent: " + strF);
        ironLog.general("CMP ID: " + i10);
        ironLog.general("Network Consent Reporting:");
        ironLog.general("----------------------------");
        Collection<NetworkSettings> collectionValues = providerSettings.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "providerSettings.values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (networkSettings.getProviderDefaultInstance() != null && !Intrinsics.areEqual(networkSettings.getProviderDefaultInstance(), IronSourceConstants.SUPERSONIC_CONFIG_NAME) && (applicationSettings = networkSettings.getApplicationSettings()) != null && applicationSettings.has(C4222a4.f42291a)) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<NetworkSettings> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((NetworkSettings) obj2).getProviderDefaultInstance())) {
                arrayList2.add(obj2);
            }
        }
        for (NetworkSettings networkSettings2 : arrayList2) {
            IronLog ironLog2 = IronLog.API;
            String providerDefaultInstance = networkSettings2.getProviderDefaultInstance();
            JSONObject applicationSettings2 = networkSettings2.getApplicationSettings();
            ironLog2.general(providerDefaultInstance + ": " + (applicationSettings2 != null ? Boolean.valueOf(applicationSettings2.optBoolean(C4222a4.f42291a)) : null));
        }
    }
}
