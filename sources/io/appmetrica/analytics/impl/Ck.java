package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class Ck implements Wc, InterfaceC5331om, AskForPermissionStrategyModuleProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75628a = "rp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f75629b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AskForPermissionStrategyModuleProvider f75630c = new I7();

    public static void a(String str, String str2, Throwable th2) {
        Vj vj = AbstractC5452tj.f78304a;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(str, MapsKt.mapOf(TuplesKt.to(str2, lf.c.b(th2)))));
        vj.getClass();
        vj.a(new Uj("service_module_errors", mapMapOf));
    }

    @Override // io.appmetrica.analytics.impl.Wc
    @NotNull
    public final List<ModuleServicesDatabase> b() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f75629b;
        ArrayList arrayList2 = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                objValueOf = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "db", th2);
                objValueOf = Unit.f93236a;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    @NotNull
    public final Map<String, C5092fd> c() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f75629b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            Pair pair = null;
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    pair = TuplesKt.to(moduleServiceEntryPoint.getIdentifier(), new C5092fd(remoteConfigExtensionConfiguration));
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_controller", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map<String, C5092fd> map = MapsKt.toMap(arrayList);
        a(hashSet);
        return map;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    @NotNull
    public final Map<String, Integer> d() {
        List listEmptyList;
        Map<String, Integer> blocks;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f75629b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration == null || (blocks = remoteConfigExtensionConfiguration.getBlocks()) == null || (listEmptyList = MapsKt.toList(blocks)) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "blocks", th2);
                hashSet.add(moduleServiceEntryPoint);
                listEmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, listEmptyList);
        }
        Map<String, Integer> map = MapsKt.toMap(arrayList);
        a(hashSet);
        return map;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    @NotNull
    public final List<Consumer<Location>> e() {
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f75629b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            Consumer<Location> locationConsumer = null;
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationConsumer = locationServiceExtension.getLocationConsumer();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_consumer", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        a(hashSet);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    @Nullable
    public final ModuleLocationSourcesServiceController f() {
        ModuleLocationSourcesServiceController locationSourcesController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f75629b.iterator();
        do {
            locationSourcesController = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationSourcesController = locationServiceExtension.getLocationSourcesController();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_source_controller", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (locationSourcesController == null);
        a(hashSet);
        return locationSourcesController;
    }

    @Override // io.appmetrica.analytics.impl.Wc
    @Nullable
    public final Toggle g() {
        Toggle locationControllerAppStateToggle;
        HashSet hashSet = new HashSet();
        Iterator it = this.f75629b.iterator();
        do {
            locationControllerAppStateToggle = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                LocationServiceExtension locationServiceExtension = moduleServiceEntryPoint.getLocationServiceExtension();
                if (locationServiceExtension != null) {
                    locationControllerAppStateToggle = locationServiceExtension.getLocationControllerAppStateToggle();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "location_app_state_control_toggle", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        } while (locationControllerAppStateToggle == null);
        a(hashSet);
        return locationControllerAppStateToggle;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f75630c.getAskForPermissionStrategy();
    }

    @Override // io.appmetrica.analytics.impl.Wc
    @NotNull
    public final List<String> h() {
        List<String> listEmptyList;
        HashSet hashSet = new HashSet();
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f75629b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration == null || (listEmptyList = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), AdaptiveRenderingConfig.NATIVE_FEATURES_KEY, th2);
                hashSet.add(moduleServiceEntryPoint);
                listEmptyList = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList, listEmptyList);
        }
        a(hashSet);
        return arrayList;
    }

    @NotNull
    public final Bundle i() {
        Bundle bundle = new Bundle();
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f75629b) {
            Bundle configBundleForClient = null;
            try {
                ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
                if (clientConfigProvider != null) {
                    configBundleForClient = clientConfigProvider.getConfigBundleForClient();
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "config_bundle", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        a(hashSet);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NotNull ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f75629b.add(moduleServiceEntryPoint);
        if (Intrinsics.areEqual(this.f75628a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f75630c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5331om
    public final void a(@NotNull C5204jm c5204jm) {
        HashSet hashSet = new HashSet();
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c5204jm.f77543d, c5204jm.f77540a, c5204jm.f77541b);
        Pg pg2 = new Pg(c5204jm.f77561v, c5204jm.f77560u);
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f75629b) {
            try {
                RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
                if (remoteConfigExtensionConfiguration != null) {
                    remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C5603zk(sdkIdentifiers, pg2, c5204jm.A.get(moduleServiceEntryPoint.getIdentifier())));
                }
            } catch (Throwable th2) {
                hashSet.add(moduleServiceEntryPoint);
                a(moduleServiceEntryPoint.getIdentifier(), "remote_config_updated", th2);
            }
        }
        a(hashSet);
    }

    public final void a(@NotNull ServiceContext serviceContext, @NotNull C5204jm c5204jm) {
        HashSet hashSet = new HashSet();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f75629b) {
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C5603zk(new SdkIdentifiers(c5204jm.f77543d, c5204jm.f77540a, c5204jm.f77541b), new Pg(c5204jm.f77561v, c5204jm.f77560u), c5204jm.A.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    C4989bd c4989bd = C5468ua.H.f78371t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (c4989bd) {
                        c4989bd.f76896a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                a(moduleServiceEntryPoint.getIdentifier(), "init", th2);
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        a(hashSet);
    }

    public final void a(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        this.f75629b.removeAll(hashSet);
    }
}
