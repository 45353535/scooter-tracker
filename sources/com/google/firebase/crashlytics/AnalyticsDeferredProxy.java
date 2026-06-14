package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public class AnalyticsDeferredProxy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deferred f31929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile AnalyticsEventLogger f31930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile BreadcrumbSource f31931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f31932d;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    public static /* synthetic */ void a(AnalyticsDeferredProxy analyticsDeferredProxy, Provider provider) {
        analyticsDeferredProxy.getClass();
        Logger.getLogger().d("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        if (e(analyticsConnector, crashlyticsAnalyticsListener) == null) {
            Logger.getLogger().w("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        Logger.getLogger().d("Registered Firebase Analytics listener.");
        BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
        BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
        synchronized (analyticsDeferredProxy) {
            try {
                Iterator it = analyticsDeferredProxy.f31932d.iterator();
                while (it.hasNext()) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler((BreadcrumbHandler) it.next());
                }
                crashlyticsAnalyticsListener.setBreadcrumbEventReceiver(breadcrumbAnalyticsEventReceiver);
                crashlyticsAnalyticsListener.setCrashlyticsOriginEventReceiver(blockingAnalyticsEventLogger);
                analyticsDeferredProxy.f31931c = breadcrumbAnalyticsEventReceiver;
                analyticsDeferredProxy.f31930b = blockingAnalyticsEventLogger;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void c(AnalyticsDeferredProxy analyticsDeferredProxy, BreadcrumbHandler breadcrumbHandler) {
        synchronized (analyticsDeferredProxy) {
            try {
                if (analyticsDeferredProxy.f31931c instanceof DisabledBreadcrumbSource) {
                    analyticsDeferredProxy.f31932d.add(breadcrumbHandler);
                }
                analyticsDeferredProxy.f31931c.registerBreadcrumbHandler(breadcrumbHandler);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d() {
        this.f31929a.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.c
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                AnalyticsDeferredProxy.a(this.f31944a, provider);
            }
        });
    }

    private static AnalyticsConnector.AnalyticsConnectorHandle e(AnalyticsConnector analyticsConnector, CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener != null) {
            return analyticsConnectorHandleRegisterAnalyticsConnectorListener;
        }
        Logger.getLogger().d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        AnalyticsConnector.AnalyticsConnectorHandle analyticsConnectorHandleRegisterAnalyticsConnectorListener2 = analyticsConnector.registerAnalyticsConnectorListener("crash", crashlyticsAnalyticsListener);
        if (analyticsConnectorHandleRegisterAnalyticsConnectorListener2 != null) {
            Logger.getLogger().w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return analyticsConnectorHandleRegisterAnalyticsConnectorListener2;
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new AnalyticsEventLogger() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void logEvent(String str, Bundle bundle) {
                this.f31943a.f31930b.logEvent(str, bundle);
            }
        };
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new BreadcrumbSource() { // from class: com.google.firebase.crashlytics.a
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
                AnalyticsDeferredProxy.c(this.f31942a, breadcrumbHandler);
            }
        };
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @NonNull BreadcrumbSource breadcrumbSource, @NonNull AnalyticsEventLogger analyticsEventLogger) {
        this.f31929a = deferred;
        this.f31931c = breadcrumbSource;
        this.f31932d = new ArrayList();
        this.f31930b = analyticsEventLogger;
        d();
    }
}
