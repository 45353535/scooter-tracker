package io.appmetrica.analytics.screenshot.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.screenshot.impl.C5614h;
import io.appmetrica.analytics.screenshot.impl.C5618l;
import io.appmetrica.analytics.screenshot.impl.C5619m;
import io.appmetrica.analytics.screenshot.impl.C5628w;
import io.appmetrica.analytics.screenshot.impl.C5629x;
import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.I;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.V;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/appmetrica/analytics/screenshot/internal/ScreenshotClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "Lio/appmetrica/analytics/screenshot/impl/D;", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "", "initClientSide", "onActivated", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "getServiceConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/client/ServiceConfigExtensionConfiguration;", "serviceConfigExtensionConfiguration", "<init>", "()V", "screenshot_release"}, k = 1, mv = {1, 6, 0})
public final class ScreenshotClientModuleEntryPoint extends ModuleClientEntryPoint<D> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C5618l f79053a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f79056d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5614h f79054b = new C5614h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$configUpdateListener$1 f79055c = new ServiceConfigUpdateListener<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$configUpdateListener$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener
        public void onServiceConfigUpdated(@NotNull ModuleServiceConfig<D> config) {
            C5618l c5618l;
            ScreenshotClientModuleEntryPoint screenshotClientModuleEntryPoint = this.f79059a;
            synchronized (screenshotClientModuleEntryPoint) {
                try {
                    D featuresConfig = config.getFeaturesConfig();
                    V v10 = null;
                    if (featuresConfig != null) {
                        boolean zB = featuresConfig.b();
                        F fA = featuresConfig.a();
                        c5618l = new C5618l(zB, fA != null ? new C5619m(fA) : null);
                    } else {
                        c5618l = null;
                    }
                    screenshotClientModuleEntryPoint.f79053a = c5618l;
                    if (screenshotClientModuleEntryPoint.f79056d != null) {
                        V v11 = screenshotClientModuleEntryPoint.f79056d;
                        if (v11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("screenshotCaptorsController");
                        } else {
                            v10 = v11;
                        }
                        v10.a(screenshotClientModuleEntryPoint.f79053a);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String identifier = "screenshot";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1 f79058f = new ServiceConfigExtensionConfiguration<D>() { // from class: io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint$serviceConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        @NotNull
        public BundleToServiceConfigConverter<D> getBundleConverter() {
            return this.f79060a.f79054b;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration
        @NotNull
        public ServiceConfigUpdateListener<D> getServiceConfigUpdateListener() {
            return this.f79060a.f79055c;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    @NotNull
    public ServiceConfigExtensionConfiguration<D> getServiceConfigExtensionConfiguration() {
        return this.f79058f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(@NotNull ClientContext clientContext) {
        synchronized (this) {
            try {
                C5629x c5629x = new C5629x(clientContext);
                this.f79056d = new V(AndroidUtils.isApiAchieved(34) ? new C5628w(clientContext, c5629x) : new I(clientContext, c5629x));
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void onActivated() {
        synchronized (this) {
            try {
                V v10 = this.f79056d;
                if (v10 != null) {
                    C5618l c5618l = this.f79053a;
                    Iterator it = v10.f78982a.iterator();
                    while (it.hasNext()) {
                        ((T) it.next()).a();
                    }
                    v10.a(c5618l);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
