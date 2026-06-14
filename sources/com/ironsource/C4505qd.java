package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4505qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final V0 f44725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<C4588vc> f44726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC4576v0 f44727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSource.a f44728d;

    /* JADX INFO: renamed from: com.ironsource.qd$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44729a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f44729a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.qd$b */
    public static final class b extends AbstractRunnableC4232ae {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NetworkSettings f44731c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AdapterBaseInterface f44732d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AdData f44733e;

        b(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
            this.f44731c = networkSettings;
            this.f44732d = adapterBaseInterface;
            this.f44733e = adData;
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a() {
            C4505qd c4505qd = C4505qd.this;
            NetworkSettings networkSettings = this.f44731c;
            AdapterBaseInterface networkAdapter = this.f44732d;
            Intrinsics.checkNotNullExpressionValue(networkAdapter, "networkAdapter");
            c4505qd.a(networkSettings, networkAdapter, this.f44733e);
        }

        @Override // com.ironsource.AbstractRunnableC4232ae
        public void a(@NotNull Throwable t10) {
            Intrinsics.checkNotNullParameter(t10, "t");
            C4505qd.this.f44725a.e().h().g("initProvider - exception while calling networkAdapter.init with " + this.f44731c.getProviderName() + " - " + t10);
        }
    }

    public C4505qd(@NotNull V0 adUnitTools, @NotNull LevelPlay.AdFormat adFormat, @NotNull List<C4588vc> providers, @NotNull AbstractC4576v0 adUnitData) {
        Intrinsics.checkNotNullParameter(adUnitTools, "adUnitTools");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f44725a = adUnitTools;
        this.f44726b = providers;
        this.f44727c = adUnitData;
        this.f44728d = a(adFormat);
    }

    public final void a() {
        IronLog.INTERNAL.verbose(C4441n0.a(this.f44725a, (String) null, (String) null, 3, (Object) null));
        UUID uuidRandomUUID = UUID.randomUUID();
        Iterator<C4588vc> it = this.f44726b.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettingsF = it.next().f();
            AdapterBaseInterface adapterBaseInterfaceB = com.ironsource.mediationsdk.c.b().b(networkSettingsF, this.f44728d, uuidRandomUUID);
            if (a(networkSettingsF, adapterBaseInterfaceB)) {
                C4473of.a(C4473of.f44574a, new b(networkSettingsF, adapterBaseInterfaceB, this.f44727c.a(networkSettingsF)), 0L, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface, AdData adData) {
        a("Start initializing provider %s on thread %s", networkSettings);
        adapterBaseInterface.init(adData, ContextProvider.getInstance().getApplicationContext(), null);
        a("Done initializing provider %s on thread %s", networkSettings);
    }

    private final void a(String str, NetworkSettings networkSettings) {
        IronLog ironLog = IronLog.INTERNAL;
        V0 v02 = this.f44725a;
        kotlin.jvm.internal.a1 a1Var = kotlin.jvm.internal.a1.f93282a;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{networkSettings.getProviderInstanceName(), Thread.currentThread().getName()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        ironLog.verbose(C4441n0.a(v02, str2, (String) null, 2, (Object) null));
    }

    private final boolean a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        if (adapterBaseInterface == null) {
            return false;
        }
        V0 v02 = this.f44725a;
        IronSource.a aVar = this.f44728d;
        String providerInstanceName = networkSettings.getProviderInstanceName();
        Intrinsics.checkNotNullExpressionValue(providerInstanceName, "providerSettings.providerInstanceName");
        return !v02.a(adapterBaseInterface, aVar, providerInstanceName) && (networkSettings.shouldEarlyInit() || networkSettings.isIronSource() || networkSettings.isBidder(this.f44728d));
    }

    private final IronSource.a a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f44729a[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 == 4) {
            return IronSource.a.NATIVE_AD;
        }
        throw new lf.m();
    }
}
