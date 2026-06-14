package com.ironsource.mediationsdk;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.ironsource.A5;
import com.ironsource.C4350hc;
import com.ironsource.C4456nf;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.G9;
import com.ironsource.Z3;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f43795k = "IronSource";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f43796l = "com.ironsource.adapters";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f43797m = "aps";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f43798n = new c();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f43799o = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f43804e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f43807h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Z3 f43808i = new Z3();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C4350hc f43809j = new C4350hc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, AbstractAdapter> f43800a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap<String, AdapterBaseWrapper> f43801b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentHashMap<String, List<String>> f43805f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConcurrentHashMap<IronSource.a, JSONObject> f43806g = new ConcurrentHashMap<>();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43810a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f43810a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43810a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43810a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43810a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static c b() {
        return f43798n;
    }

    public AbstractAdapter a(NetworkSettings networkSettings) {
        return a(b(networkSettings), networkSettings.getProviderTypeForReflection());
    }

    public void b(String str, String str2) {
        this.f43802c = str;
        this.f43803d = str2;
    }

    public void c(String str, List<String> list) {
        synchronized (f43799o) {
            try {
                this.f43805f.put(str, list);
                if (!this.f43800a.isEmpty()) {
                    IronSourceUtils.i("setMetaData key = " + str + ", values = " + list);
                    b(str, list);
                }
                a(str, list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ConcurrentHashMap<String, List<String>> d() {
        return this.f43805f;
    }

    public ConcurrentHashMap<String, AdapterBaseWrapper> e() {
        return this.f43801b;
    }

    public void f() {
        this.f43800a.clear();
        this.f43801b.clear();
    }

    public AbstractAdapter a(NetworkSettings networkSettings, JSONObject jSONObject, boolean z10) {
        String coreSDKVersion;
        String strB = b(networkSettings);
        String providerTypeForReflection = z10 ? "IronSource" : networkSettings.getProviderTypeForReflection();
        synchronized (f43799o) {
            try {
                if (this.f43800a.containsKey(strB)) {
                    return this.f43800a.get(strB);
                }
                AbstractAdapter abstractAdapterA = a(strB, providerTypeForReflection);
                if (abstractAdapterA == null) {
                    b(strB + " adapter was not loaded");
                    return null;
                }
                abstractAdapterA.setProviderNetworkKey(networkSettings.getProviderNetworkKey());
                try {
                    coreSDKVersion = abstractAdapterA.getCoreSDKVersion();
                } catch (Throwable th2) {
                    C4462o4.d().a(th2);
                    String str = "error while retrieving coreSDKVersion " + abstractAdapterA.getProviderName() + ": " + th2.getLocalizedMessage();
                    a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                    IronLog.INTERNAL.error(str);
                    coreSDKVersion = "Unknown";
                }
                c(strB + " was allocated (adapter version: " + abstractAdapterA.getVersion() + ", sdk version: " + coreSDKVersion + ")");
                c(abstractAdapterA);
                this.f43809j.a(abstractAdapterA);
                a(abstractAdapterA);
                this.f43808i.a(abstractAdapterA, networkSettings);
                b(abstractAdapterA);
                a(jSONObject, abstractAdapterA, providerTypeForReflection);
                this.f43800a.put(strB, abstractAdapterA);
                return abstractAdapterA;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void b(boolean z10) {
        synchronized (f43799o) {
            this.f43808i.a(z10);
            this.f43808i.a(this.f43800a, this.f43801b);
        }
    }

    private void b(AdapterBaseInterface adapterBaseInterface) {
        Boolean bool = this.f43804e;
        if (bool == null || !(adapterBaseInterface instanceof AdapterDebugInterface)) {
            return;
        }
        try {
            ((AdapterDebugInterface) adapterBaseInterface).setAdapterDebug(bool.booleanValue());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            String str = "error while setting adapterDebug of " + adapterBaseInterface.getClass().getSimpleName() + ": " + e10.getLocalizedMessage();
            a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
            c(str);
        }
    }

    private void c(final AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return;
        }
        for (final String str : this.f43805f.keySet()) {
            final List<String> list = this.f43805f.get(str);
            if (list != null && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.b(adapterBaseInterface, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    private void c(final AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return;
        }
        for (final String str : this.f43805f.keySet()) {
            final List<String> list = this.f43805f.get(str);
            if (list != null) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.b(abstractAdapter, str, list);
                    }
                }, abstractAdapter.getProviderName());
            }
        }
    }

    private void b(AbstractAdapter abstractAdapter) {
        Boolean bool = this.f43804e;
        if (bool != null) {
            try {
                abstractAdapter.setAdapterDebug(bool);
            } catch (Throwable th2) {
                C4462o4.d().a(th2);
                String str = "error while setting adapterDebug of " + abstractAdapter.getProviderName() + ": " + th2.getLocalizedMessage();
                a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
                c(str);
            }
        }
    }

    private String c(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        return (uuid != null ? uuid.toString() : "") + TokenBuilder.TOKEN_DELIMITER + aVar.toString() + TokenBuilder.TOKEN_DELIMITER + networkSettings.getProviderName();
    }

    private void c(NetworkSettings networkSettings) {
        IronLog.INTERNAL.error("Missing package definition for " + networkSettings.getProviderTypeForReflection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 0);
    }

    public ConcurrentHashMap<String, LevelPlayBaseAdapter> c() {
        ConcurrentHashMap<String, LevelPlayBaseAdapter> concurrentHashMap = new ConcurrentHashMap<>();
        for (String str : this.f43801b.keySet()) {
            AdapterBaseWrapper adapterBaseWrapper = this.f43801b.get(str);
            if (adapterBaseWrapper != null && (adapterBaseWrapper.getAdapterBaseInterface() instanceof LevelPlayBaseAdapter)) {
                concurrentHashMap.put(str, (LevelPlayBaseAdapter) adapterBaseWrapper.getAdapterBaseInterface());
            }
        }
        return concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(JSONObject jSONObject, AbstractAdapter abstractAdapter, String str) {
        if (str.equalsIgnoreCase("IronSource") && this.f43807h.compareAndSet(false, true)) {
            c("SDK5 earlyInit  <" + str + ">");
            try {
                abstractAdapter.earlyInit(this.f43802c, this.f43803d, jSONObject);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                String str2 = "error while calling early init for " + abstractAdapter.getProviderName() + ": " + e10.getLocalizedMessage();
                a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
                IronLog.INTERNAL.error(str2);
            }
        }
    }

    private void b(final String str, final List<String> list) {
        for (final AbstractAdapter abstractAdapter : this.f43800a.values()) {
            a(new Runnable() { // from class: com.ironsource.mediationsdk.a0
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(abstractAdapter, str, list);
                }
            }, abstractAdapter.getProviderName());
        }
    }

    private String b(NetworkSettings networkSettings) {
        if (networkSettings.isMultipleInstances()) {
            return networkSettings.getProviderDefaultInstance();
        }
        return networkSettings.getProviderName();
    }

    public AdapterBaseInterface b(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        String strC;
        String providerTypeForReflection;
        if (networkSettings.isCustomNetwork()) {
            strC = b(networkSettings);
        } else {
            strC = c(networkSettings, aVar, uuid);
        }
        if (this.f43801b.containsKey(strC)) {
            return this.f43801b.get(strC).getAdapterBaseInterface();
        }
        if (networkSettings.isCustomNetwork()) {
            providerTypeForReflection = networkSettings.getCustomNetworkAdapterName(null);
        } else {
            providerTypeForReflection = networkSettings.getProviderTypeForReflection();
        }
        AdapterBaseInterface adapterBaseInterfaceA = a(strC, providerTypeForReflection, networkSettings);
        return (adapterBaseInterfaceA != null || networkSettings.isCustomNetwork()) ? adapterBaseInterfaceA : a(networkSettings, aVar, strC);
    }

    private AbstractAdapter a(String str, String str2) {
        try {
            Class<?> cls = Class.forName(a(str2));
            return (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
        } catch (Exception e10) {
            String str3 = "Error while loading adapter - exception = " + e10.getLocalizedMessage();
            a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            b(str3);
            return null;
        }
    }

    @NotNull
    private static String a(String str) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter";
    }

    @NotNull
    private String a(String str, IronSource.a aVar) {
        return "com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + StringUtils.toLowerCase(a(aVar)) + "." + str + a(aVar) + "Adapter";
    }

    private JSONObject b(NetworkSettings networkSettings, IronSource.a aVar) {
        int i10 = a.f43810a[aVar.ordinal()];
        if (i10 == 1) {
            return networkSettings.getRewardedVideoSettings();
        }
        if (i10 == 2) {
            return networkSettings.getInterstitialSettings();
        }
        if (i10 == 3) {
            return networkSettings.getBannerSettings();
        }
        if (i10 != 4) {
            return null;
        }
        return networkSettings.getNativeAdSettings();
    }

    private String a(IronSource.a aVar) {
        if (aVar == null) {
            return null;
        }
        int i10 = a.f43810a[aVar.ordinal()];
        if (i10 == 1) {
            return "Rewarded";
        }
        if (i10 == 2) {
            return "Interstitial";
        }
        if (i10 == 3) {
            return "Banner";
        }
        if (i10 != 4) {
            return null;
        }
        return "NativeAd";
    }

    public void b(@NotNull x xVar) {
        if (a(xVar)) {
            this.f43809j.a(xVar);
            xVar.a(this.f43800a.values(), this.f43801b.values());
            xVar.b();
            if (StringUtils.toLowerCase(xVar.a()).equals("aps")) {
                a(xVar.allData());
            }
        }
    }

    public void a(boolean z10) {
        synchronized (f43799o) {
            try {
                this.f43804e = Boolean.valueOf(z10);
                Iterator<AbstractAdapter> it = this.f43800a.values().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                Iterator<AdapterBaseWrapper> it2 = this.f43801b.values().iterator();
                while (it2.hasNext()) {
                    b(it2.next().getAdapterBaseInterface());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "AdapterRepository: " + str, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AbstractAdapter abstractAdapter, String str, List list) {
        abstractAdapter.setMetaData(str, list);
        IronSourceUtils.i(abstractAdapter.getProviderName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(final String str, final List<String> list) {
        for (AdapterBaseWrapper adapterBaseWrapper : this.f43801b.values()) {
            final AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
            if (!adapterBaseWrapper.getSettings().isCustomNetwork() && (adapterBaseInterface instanceof AdapterMetaDataInterface)) {
                a(new Runnable() { // from class: com.ironsource.mediationsdk.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a(adapterBaseInterface, str, list);
                    }
                }, adapterBaseInterface.getClass().getSimpleName());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(AdapterBaseInterface adapterBaseInterface, String str, List list) {
        ((AdapterMetaDataInterface) adapterBaseInterface).setMetaData(str, list);
        IronSourceUtils.i(adapterBaseInterface.getClass().getSimpleName() + "Adapter setMetaData key = " + str + ", values = " + list);
    }

    private void a(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            C4462o4.d().a(th2);
            String str2 = "Error while setting meta-data for adapter " + str + ": " + th2.getLocalizedMessage();
            a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
            c(str2);
        }
    }

    private void a(AdapterBaseInterface adapterBaseInterface) {
        if (!(adapterBaseInterface instanceof SetAPSInterface) || this.f43806g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.f43806g.keySet()) {
            try {
                JSONObject jSONObject = this.f43806g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0) {
                    ((SetAPSInterface) adapterBaseInterface).setAPSData(C4456nf.a(aVar), jSONObject);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.f43806g.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(AbstractAdapter abstractAdapter) {
        if (!StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals("aps") || this.f43806g.size() == 0) {
            return;
        }
        for (IronSource.a aVar : this.f43806g.keySet()) {
            try {
                JSONObject jSONObject = this.f43806g.get(aVar);
                if (jSONObject != null && jSONObject.length() > 0 && (abstractAdapter instanceof SetAPSInterface)) {
                    ((SetAPSInterface) abstractAdapter).setAPSData(C4456nf.a(aVar), jSONObject);
                }
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                String str = "error while setting aps data: " + e10.getLocalizedMessage();
                a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                c(str);
            }
        }
        this.f43806g.clear();
    }

    @Nullable
    private w a(NetworkSettings networkSettings, IronSource.a aVar, String str) {
        AbstractAdapter abstractAdapterA = a(networkSettings, b(networkSettings, aVar), false);
        if (abstractAdapterA != null) {
            w wVar = new w(abstractAdapterA);
            this.f43801b.put(str, new AdapterBaseWrapper(wVar, networkSettings));
            return wVar;
        }
        String str2 = "error creating network adapter " + networkSettings.getProviderName();
        a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2);
        IronLog.INTERNAL.error(str2);
        return null;
    }

    private void a(String str, AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        if (!networkSettings.isCustomNetwork()) {
            c(adapterBaseInterface);
            a(adapterBaseInterface);
        }
        this.f43808i.a(adapterBaseInterface, networkSettings);
        b(adapterBaseInterface);
        this.f43809j.a(new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
        this.f43801b.put(str, new AdapterBaseWrapper(adapterBaseInterface, networkSettings));
    }

    private AdapterBaseInterface a(String str, String str2, NetworkSettings networkSettings) {
        String strA;
        if (networkSettings.isCustomNetwork() && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            IronLog.INTERNAL.error("missing package definition for " + str);
            return null;
        }
        if (networkSettings.isCustomNetwork()) {
            strA = networkSettings.getCustomNetworkPackage() + "." + str2;
        } else {
            strA = a(str2);
        }
        try {
            BaseAdapter baseAdapter = (BaseAdapter) Class.forName(strA).newInstance();
            IronLog.INTERNAL.info(strA + " was allocated (adapter version: " + baseAdapter.getAdapterVersion() + ", sdk version: " + baseAdapter.getNetworkSDKVersion() + ")");
            a(str, baseAdapter, networkSettings);
            return baseAdapter;
        } catch (Exception unused) {
            if (networkSettings.isCustomNetwork()) {
                String str3 = "failed to load " + strA;
                IronLog.INTERNAL.error(str3);
                a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str3);
            }
            return null;
        }
    }

    public BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar, UUID uuid) {
        BaseAdAdapter<?, ?> baseAdAdapterA = a(networkSettings, aVar);
        if (baseAdAdapterA != null || networkSettings.isCustomNetwork()) {
            return baseAdAdapterA;
        }
        AbstractAdapter abstractAdapterA = a(networkSettings);
        if (abstractAdapterA != null) {
            return AbstractC4437a.a(abstractAdapterA, networkSettings, aVar, uuid);
        }
        String str = "error creating ad adapter " + networkSettings.getProviderName();
        a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str);
        IronLog.INTERNAL.error(str);
        return null;
    }

    private BaseAdAdapter<?, ?> a(NetworkSettings networkSettings, IronSource.a aVar) {
        boolean zIsCustomNetwork = networkSettings.isCustomNetwork();
        if (zIsCustomNetwork && TextUtils.isEmpty(networkSettings.getCustomNetworkPackage())) {
            c(networkSettings);
            return null;
        }
        String strA = a(networkSettings, aVar, zIsCustomNetwork, a(networkSettings, aVar, zIsCustomNetwork));
        try {
            return a(strA, networkSettings);
        } catch (Exception e10) {
            if (zIsCustomNetwork) {
                a(e10, strA);
            }
            return null;
        }
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z10) {
        if (z10) {
            return networkSettings.getCustomNetworkAdapterName(aVar);
        }
        return networkSettings.getProviderTypeForReflection();
    }

    private String a(NetworkSettings networkSettings, IronSource.a aVar, boolean z10, String str) {
        if (z10) {
            return networkSettings.getCustomNetworkPackage() + "." + str;
        }
        return a(str, aVar);
    }

    private BaseAdAdapter<?, ?> a(String str, NetworkSettings networkSettings) throws Exception {
        return (BaseAdAdapter) Class.forName(str).getConstructor(NetworkSettings.class).newInstance(networkSettings);
    }

    private void a(Exception exc, String str) {
        String str2 = "Failed to load adapter class: " + str;
        IronLog.INTERNAL.error(str2);
        a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, str2 + " - " + exc.getMessage());
    }

    private void a(A5 a52, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("reason", str);
            }
            G9.i().a(new C4649z5(a52, jSONObject));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(@NotNull x xVar) {
        if (xVar.allData().length() == 0) {
            a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network data");
            b("empty network data");
            return false;
        }
        if (!TextUtils.isEmpty(xVar.a())) {
            return true;
        }
        a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "empty network key");
        b("empty network key");
        return false;
    }

    private void a(JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (next.equalsIgnoreCase(IronSource.a.BANNER.toString())) {
                a(LevelPlay.AdFormat.BANNER, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.INTERSTITIAL.toString())) {
                a(LevelPlay.AdFormat.INTERSTITIAL, jSONObjectOptJSONObject);
            } else if (next.equalsIgnoreCase(IronSource.a.REWARDED_VIDEO.toString())) {
                a(LevelPlay.AdFormat.REWARDED, jSONObjectOptJSONObject);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(LevelPlay.AdFormat adFormat, JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!this.f43800a.isEmpty()) {
                    for (AbstractAdapter abstractAdapter : this.f43800a.values()) {
                        if (StringUtils.toLowerCase(abstractAdapter.getProviderName()).equals("aps") && (abstractAdapter instanceof SetAPSInterface)) {
                            ((SetAPSInterface) abstractAdapter).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                    }
                }
                for (AdapterBaseWrapper adapterBaseWrapper : this.f43801b.values()) {
                    if (StringUtils.toLowerCase(adapterBaseWrapper.getSettings().getProviderTypeForReflection()).equals("aps")) {
                        AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper.getAdapterBaseInterface();
                        if (adapterBaseInterface != null) {
                            ((AdapterAPSDataInterface) adapterBaseInterface).setAPSData(adFormat, jSONObject2);
                            return;
                        }
                        return;
                    }
                }
                synchronized (f43799o) {
                    this.f43806g.put(C4456nf.b(adFormat), jSONObject2);
                }
                return;
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                String str = "error while setting APSData: " + e10.getLocalizedMessage();
                a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, str);
                b(str);
                return;
            }
        }
        a(A5.TROUBLESHOOTING_ADAPTER_REPOSITORY_SET_NETWORK_DATA_INTERNAL_ERROR, "APSData is empty");
        b("APSData is empty");
    }

    public ConcurrentHashMap<String, AbstractAdapter> a() {
        return this.f43800a;
    }

    public static boolean a(String str, AdapterBaseWrapper adapterBaseWrapper) {
        return (adapterBaseWrapper == null || adapterBaseWrapper.getSettings().getProviderNetworkKey() == null || !adapterBaseWrapper.getSettings().getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean a(String str, AbstractAdapter abstractAdapter) {
        return (abstractAdapter == null || abstractAdapter.getProviderNetworkKey() == null || !abstractAdapter.getProviderNetworkKey().equalsIgnoreCase(str)) ? false : true;
    }
}
