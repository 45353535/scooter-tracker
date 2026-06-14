package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5109g4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O5 f77207c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5083f4 f77205a = new C5083f4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f77206b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f77208d = new CopyOnWriteArrayList();

    public static void a(String str, String str2, Throwable th2) {
        Vj vj = AbstractC5452tj.f78304a;
        Map mapMapOf = MapsKt.mapOf(TuplesKt.to(str, MapsKt.mapOf(TuplesKt.to(str2, lf.c.b(th2)))));
        vj.getClass();
        vj.a(new Uj("client_module_errors", mapMapOf));
    }

    @Nullable
    public final ModuleAdRevenueProcessor b() {
        R5 r52;
        O5 o52 = this.f77207c;
        if (o52 == null || (r52 = ((S3) o52).f76384b) == null) {
            return null;
        }
        return r52.f76335a;
    }

    public final void c() {
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f77206b) {
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "onActivated", th2);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f77208d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f77206b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList2.iterator();
        while (it.hasNext()) {
            AdRevenueCollector adRevenueCollector = ((ModuleClientEntryPoint) it.next()).getAdRevenueCollector();
            if (adRevenueCollector != null) {
                arrayList.add(adRevenueCollector);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AdRevenueCollector) obj).getEnabled()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((AdRevenueCollector) it2.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(arrayList3);
    }

    @NotNull
    public final List<String> a() {
        return this.f77208d;
    }

    public final void a(@NotNull ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f77206b.add(moduleClientEntryPoint);
    }

    public final void a(@NotNull O5 o52) {
        this.f77207c = o52;
        HashSet hashSet = new HashSet();
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f77206b) {
            try {
                moduleClientEntryPoint.initClientSide(o52);
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th2);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f77206b.removeAll(hashSet);
    }

    public final void a(@Nullable Bundle bundle, @NotNull SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.f77206b) {
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C5083f4 c5083f4 = this.f77205a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c5083f4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C5057e4 c5057e4 = bundle2 != null ? new C5057e4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c5057e4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c5057e4);
                    }
                }
            } catch (Throwable th2) {
                a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th2);
            }
        }
    }
}
