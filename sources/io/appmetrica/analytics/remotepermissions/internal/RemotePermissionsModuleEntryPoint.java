package io.appmetrica.analytics.remotepermissions.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.remotepermissions.impl.a;
import io.appmetrica.analytics.remotepermissions.impl.b;
import io.appmetrica.analytics.remotepermissions.impl.d;
import io.appmetrica.analytics.remotepermissions.impl.e;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0004B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016J \u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lio/appmetrica/analytics/remotepermissions/internal/RemotePermissionsModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "Lio/appmetrica/analytics/remotepermissions/impl/a;", "Lio/appmetrica/analytics/modulesapi/internal/common/AskForPermissionStrategyModuleProvider;", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigUpdateListener;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "config", "", "onRemoteConfigUpdated", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "initialConfig", "initServiceSide", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/coreapi/internal/permission/PermissionStrategy;", "getAskForPermissionStrategy", "()Lio/appmetrica/analytics/coreapi/internal/permission/PermissionStrategy;", "askForPermissionStrategy", "<init>", "()V", "remote-permissions_release"}, k = 1, mv = {1, 6, 0})
public final class RemotePermissionsModuleEntryPoint extends ModuleServiceEntryPoint<a> implements AskForPermissionStrategyModuleProvider, RemoteConfigUpdateListener<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f78940a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f78941b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RemotePermissionsModuleEntryPoint f78942c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f78943d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String identifier = "rp";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1 f78945f = new RemoteConfigExtensionConfiguration<a>() { // from class: io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint$remoteConfigExtensionConfiguration$1
        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public Map<String, Integer> getBlocks() {
            return MapsKt.mapOf(TuplesKt.to("permissions", 1));
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public List<String> getFeatures() {
            return CollectionsKt.emptyList();
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public JsonParser<a> getJsonParser() {
            return this.f78946a.f78940a;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public Converter<a, byte[]> getProtobufConverter() {
            return this.f78946a.f78941b;
        }

        @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration
        @NotNull
        public RemoteConfigUpdateListener<a> getRemoteConfigUpdateListener() {
            return this.f78946a.f78942c;
        }
    };

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public PermissionStrategy getAskForPermissionStrategy() {
        return this.f78943d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    @NotNull
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    @NotNull
    public RemoteConfigExtensionConfiguration<a> getRemoteConfigExtensionConfiguration() {
        return this.f78945f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint
    public void initServiceSide(@NotNull ServiceContext serviceContext, @NotNull ModuleRemoteConfig<a> initialConfig) {
        Set setEmptySet;
        e eVar = this.f78943d;
        a featuresConfig = initialConfig.getFeaturesConfig();
        if (featuresConfig == null || (setEmptySet = featuresConfig.f78931a) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        synchronized (eVar) {
            eVar.f78937a = setEmptySet;
        }
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigUpdateListener
    public void onRemoteConfigUpdated(@NotNull ModuleRemoteConfig<a> config) {
        Set setEmptySet;
        e eVar = this.f78943d;
        a featuresConfig = config.getFeaturesConfig();
        if (featuresConfig == null || (setEmptySet = featuresConfig.f78931a) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        synchronized (eVar) {
            eVar.f78937a = setEmptySet;
        }
    }
}
