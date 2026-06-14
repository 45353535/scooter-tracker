package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashClientModule;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5321oc extends Q2 implements Pa {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Long f77892s = Long.valueOf(TimeUnit.SECONDS.toMillis(1));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Gn f77893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C5595zc f77894q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C5346pc f77895r;

    public C5321oc(C5595zc c5595zc) {
        super(c5595zc.b(), c5595zc.i(), c5595zc.h(), c5595zc.d(), c5595zc.f(), c5595zc.j(), c5595zc.g(), c5595zc.c(), c5595zc.a(), c5595zc.e());
        this.f77893p = new Gn(new C5119ge("Referral url"));
        this.f77894q = c5595zc;
        this.f77895r = new C5346pc(this);
        l();
    }

    public final void a(AppMetricaConfig appMetricaConfig, C5234l0 c5234l0) {
        if (c5234l0.f77638b) {
            clearAppEnvironment();
        }
        List<String> list = c5234l0.f77637a;
        if (!CollectionUtils.isNullOrEmpty(list)) {
            this.f76279b.f76218b.addAutoCollectedDataSubscribers(list);
        }
        a(appMetricaConfig.appEnvironment);
        b(appMetricaConfig.errorEnvironment);
        Boolean bool = (Boolean) WrapUtils.getOrDefault(appMetricaConfig.nativeCrashReporting, Boolean.TRUE);
        boolean zBooleanValue = bool.booleanValue();
        this.f76280c.info("native crash reporting enabled: %b", bool);
        if (zBooleanValue) {
            Id id2 = this.f77894q.f78619c;
            Context context = this.f76278a;
            id2.f75941d = new F0(this.f76279b.f76218b.getApiKey(), id2.f75938a.f75824a.getAsString("PROCESS_CFG_PACKAGE_NAME"), CounterConfigurationReporterType.MAIN, id2.f75938a.f75824a.getAsInteger("PROCESS_CFG_PROCESS_ID").intValue(), id2.f75938a.f75824a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), this.f76279b.d());
            File nativeCrashDirectory = FileUtils.getNativeCrashDirectory(context);
            F0 f02 = null;
            String absolutePath = nativeCrashDirectory != null ? nativeCrashDirectory.getAbsolutePath() : null;
            if (absolutePath != null) {
                NativeCrashClientModule nativeCrashClientModule = id2.f75939b;
                G0 g02 = id2.f75940c;
                F0 f03 = id2.f75941d;
                if (f03 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("nativeCrashMetadata");
                } else {
                    f02 = f03;
                }
                g02.getClass();
                nativeCrashClientModule.initHandling(context, new NativeCrashClientConfig(absolutePath, G0.a(f02)));
            }
        }
        C5346pc c5346pc = this.f77895r;
        synchronized (c5346pc) {
            try {
                Integer num = appMetricaConfig.anrMonitoringTimeout;
                c5346pc.f77978a = num != null ? num.intValue() : 5;
                Boolean bool2 = appMetricaConfig.anrMonitoring;
                if (bool2 == null) {
                    bool2 = Boolean.FALSE;
                }
                if (bool2.booleanValue()) {
                    c5346pc.f77979b.a(c5346pc.f77978a);
                } else {
                    c5346pc.f77979b.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void b(@Nullable Activity activity) {
        if (this.f77894q.f78625i.a(activity, EnumC5333p.PAUSED)) {
            this.f76280c.info("Pause session", new Object[0]);
            d(activity != null ? activity.getClass().getSimpleName() : null);
            C5286n2 c5286n2 = this.f77894q.f78623g;
            synchronized (c5286n2) {
                for (C5261m2 c5261m2 : c5286n2.f77806a) {
                    if (!c5261m2.f77733d) {
                        c5261m2.f77733d = true;
                        c5261m2.f77731b.executeDelayed(c5261m2.f77734e, c5261m2.f77732c);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c() {
        C5346pc c5346pc = this.f77895r;
        synchronized (c5346pc) {
            c5346pc.f77979b.a(c5346pc.f77978a);
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final List<String> f() {
        return this.f76279b.f76217a.b();
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final String j() {
        return "[MainReporter]";
    }

    @Override // io.appmetrica.analytics.impl.Q2
    public final void k() {
        super.k();
        C5186j4.l().m().c();
    }

    public final void l() {
        Bi bi2 = this.f76285h;
        bi2.f75594c.a(this.f76279b.f76217a);
        C5286n2 c5286n2 = this.f77894q.f78623g;
        C5296nc c5296nc = new C5296nc(this);
        long jLongValue = f77892s.longValue();
        synchronized (c5286n2) {
            c5286n2.a(c5296nc, jLongValue);
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void c(@NonNull String str) {
        this.f77893p.a(str);
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        HashMap map = new HashMap();
        map.put("type", "referral");
        map.put(POBCoreNativeConstants.NATIVE_LINK, str);
        map.put("auto", Boolean.FALSE);
        String strB = AbstractC5295nb.b(map);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(strB, "", 8208, 0, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
        this.f76280c.info("Referral URL received: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull String str, boolean z10) {
        this.f76280c.info("App opened via deeplink: " + WrapUtils.wrapToTag(str), new Object[0]);
        Bi bi2 = this.f76285h;
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        HashMap map = new HashMap();
        map.put("type", "open");
        map.put(POBCoreNativeConstants.NATIVE_LINK, str);
        map.put("auto", Boolean.valueOf(z10));
        String strB = AbstractC5295nb.b(map);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(strB, "", 8208, 0, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull EnumC5283n enumC5283n) {
        if (enumC5283n == EnumC5283n.f77797b) {
            this.f76280c.info("Enable activity auto tracking", new Object[0]);
            return;
        }
        this.f76280c.warning("Could not enable activity auto tracking. " + enumC5283n.f77801a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@Nullable Activity activity) {
        if (this.f77894q.f78625i.a(activity, EnumC5333p.RESUMED)) {
            this.f76280c.info("Resume session", new Object[0]);
            e(activity != null ? activity.getClass().getSimpleName() : null);
            C5286n2 c5286n2 = this.f77894q.f78623g;
            synchronized (c5286n2) {
                for (C5261m2 c5261m2 : c5286n2.f77806a) {
                    if (c5261m2.f77733d) {
                        c5261m2.f77733d = false;
                        c5261m2.f77731b.remove(c5261m2.f77734e);
                        C5321oc c5321oc = c5261m2.f77730a.f77834a;
                        c5321oc.f76285h.f75594c.b(c5321oc.f76279b.f76217a);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(@Nullable Location location) {
        this.f76279b.f76218b.setManualLocation(location);
        this.f76280c.info("Set location: %s", location);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z10) {
        this.f76279b.f76218b.setLocationTracking(z10);
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(boolean z10, boolean z11) {
        this.f76280c.info("Set advIdentifiersTracking to %s", Boolean.valueOf(z10));
        this.f76279b.f76218b.setAdvIdentifiersTracking(z10, z11);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull Io io2) {
        PublicLogger publicLogger = this.f76280c;
        synchronized (io2) {
            io2.f75970b = publicLogger;
        }
        Iterator it = io2.f75969a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(publicLogger);
        }
        io2.f75969a.clear();
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull AnrListener anrListener) {
        this.f77895r.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(@NonNull ExternalAttribution externalAttribution) {
        this.f76280c.info("External attribution received: %s", externalAttribution);
        Bi bi2 = this.f76285h;
        byte[] bytes = externalAttribution.toBytes();
        PublicLogger publicLogger = this.f76280c;
        Set set = D9.f75657a;
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(bytes, "", 42, publicLogger);
        Kh kh2 = this.f76279b;
        bi2.getClass();
        bi2.a(Bi.a(u32, kh2), kh2, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Q2, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(String str, String str2) {
        super.a(str, str2);
        Id id2 = this.f77894q.f78619c;
        String strD = this.f76279b.d();
        F0 f02 = id2.f75941d;
        if (f02 != null) {
            F0 f03 = new F0(f02.f75748a, f02.f75749b, f02.f75750c, f02.f75751d, f02.f75752e, strD);
            id2.f75941d = f03;
            NativeCrashClientModule nativeCrashClientModule = id2.f75939b;
            id2.f75940c.getClass();
            nativeCrashClientModule.updateAppMetricaMetadata(G0.a(f03));
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Oc
    public final void a(@NonNull String str) {
        this.f76280c.info("Add auto collected data subscriber: %s", str);
        this.f76279b.f76218b.addAutoCollectedDataSubscriber(str);
    }
}
