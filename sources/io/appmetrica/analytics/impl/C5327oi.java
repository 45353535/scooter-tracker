package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5327oi implements Za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Gf f77910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bi f77911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f77912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Sl f77913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C5595zc f77914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f77915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Gn f77916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f77917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C5321oc f77918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C5414s6 f77919k;

    public C5327oi(@NotNull Context context, @NotNull Gf gf2, @NotNull Bi bi2, @NotNull Handler handler, @NotNull Sl sl) {
        this.f77909a = context;
        this.f77910b = gf2;
        this.f77911c = bi2;
        this.f77912d = handler;
        this.f77913e = sl;
        this.f77914f = new C5595zc(context, gf2, bi2, sl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f77915g = linkedHashMap;
        this.f77916h = new Gn(new C5377qi(linkedHashMap));
        this.f77917i = CollectionsKt.listOf((Object[]) new String[]{"20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"});
    }

    @Override // io.appmetrica.analytics.impl.Za, io.appmetrica.analytics.impl.InterfaceC4961ab
    public final Za a() {
        return this;
    }

    @NotNull
    public final C5327oi b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C5321oc b(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C5234l0 c5234l0) {
        C5321oc c5321oc;
        try {
            c5321oc = this.f77918j;
            if (c5321oc != null) {
                C5595zc c5595zc = this.f77914f;
                c5595zc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c5595zc.f78622f.f76218b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f77916h.a(appMetricaConfig.apiKey);
                C5595zc c5595zc2 = this.f77914f;
                c5595zc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c5595zc2.f78622f.f76218b.applyFromAnonymousConfig(appMetricaConfig);
                c5321oc = new C5321oc(this.f77914f);
                c5321oc.f76286i = new C5494vb(this.f77912d, c5321oc);
                Sl sl = this.f77913e;
                Kh kh2 = c5321oc.f76279b;
                if (sl != null) {
                    kh2.f76218b.setUuid(sl.g());
                } else {
                    kh2.getClass();
                }
                c5321oc.a(appMetricaConfig, c5234l0);
                c5321oc.k();
                this.f77911c.f75597f.f77027c = new C5302ni(c5321oc);
                this.f77915g.put(appMetricaConfig.apiKey, c5321oc);
                this.f77918j = c5321oc;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c5321oc;
    }

    @Override // io.appmetrica.analytics.impl.Za
    @WorkerThread
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C5321oc a(@NotNull AppMetricaConfig appMetricaConfig, @NotNull PublicLogger publicLogger, @NotNull C5234l0 c5234l0) {
        C5321oc c5321oc;
        try {
            c5321oc = this.f77918j;
            if (c5321oc != null) {
                this.f77914f.a(appMetricaConfig, publicLogger);
                c5321oc.a(appMetricaConfig, c5234l0);
                C5186j4.l().getClass();
                this.f77915g.put(appMetricaConfig.apiKey, c5321oc);
            } else {
                this.f77916h.a(appMetricaConfig.apiKey);
                this.f77914f.a(appMetricaConfig, publicLogger);
                c5321oc = new C5321oc(this.f77914f);
                c5321oc.f76286i = new C5494vb(this.f77912d, c5321oc);
                Sl sl = this.f77913e;
                Kh kh2 = c5321oc.f76279b;
                if (sl != null) {
                    kh2.f76218b.setUuid(sl.g());
                } else {
                    kh2.getClass();
                }
                c5321oc.a(appMetricaConfig, c5234l0);
                c5321oc.k();
                this.f77911c.f75597f.f77027c = new C5302ni(c5321oc);
                this.f77915g.put(appMetricaConfig.apiKey, c5321oc);
                C5186j4.l().getClass();
                this.f77918j = c5321oc;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c5321oc;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized void a(@NotNull ReporterConfig reporterConfig) {
        try {
            if (this.f77915g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NotNull
    public final synchronized Ya b(@NotNull ReporterConfig reporterConfig) {
        Ya ya2;
        try {
            Ya ya3 = (Ya) this.f77915g.get(reporterConfig.apiKey);
            ya2 = ya3;
            if (ya3 == null) {
                if (!this.f77917i.contains(reporterConfig.apiKey)) {
                    this.f77913e.i();
                }
                Context context = this.f77909a;
                Fc fc2 = new Fc(context, this.f77910b, reporterConfig, this.f77911c, new T9(context));
                fc2.f76286i = new C5494vb(this.f77912d, fc2);
                Sl sl = this.f77913e;
                Kh kh2 = fc2.f76279b;
                if (sl != null) {
                    kh2.f76218b.setUuid(sl.g());
                } else {
                    kh2.getClass();
                }
                fc2.k();
                this.f77915g.put(reporterConfig.apiKey, fc2);
                ya2 = fc2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ya2;
    }

    @Override // io.appmetrica.analytics.impl.Za
    @NotNull
    public final synchronized InterfaceC4987bb a(@NotNull AppMetricaConfig appMetricaConfig) {
        C5414s6 c5414s6;
        try {
            c5414s6 = this.f77919k;
            if (c5414s6 != null) {
                c5414s6.a(appMetricaConfig);
            } else {
                C5414s6 c5414s62 = new C5414s6(new C5439t6(this.f77910b, this.f77914f.f78621e, this.f77911c, appMetricaConfig));
                this.f77919k = c5414s62;
                c5414s6 = c5414s62;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c5414s6;
    }
}
