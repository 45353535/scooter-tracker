package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5244la {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5244la f77693d = new C5244la();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5596zd f77694a = new C5596zd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f77695b = AbstractC5125gk.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f77696c = false;

    public final void a(Context context) {
        C5170id c5170id;
        C5468ua.a(context);
        this.f77695b.onCreate(context);
        this.f77694a.getClass();
        List<String> listA = C5468ua.H.f78370s.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        for (String str : listA) {
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c5170id = new C5170id(str, false);
            } else {
                C5468ua.H.p().a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
                c5170id = new C5170id(str, true);
            }
            arrayList.add(c5170id);
        }
        new C5403rk(C5468ua.H.D().f75642d).a(context);
        C5468ua.H.q().a();
        new C5195jd(C5468ua.H.f78355d.a(), C5468ua.H.z(), "service_modules", new SystemTimeProvider()).a(arrayList);
    }

    public final void b(Context context) {
        if (this.f77696c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f77696c) {
                    a(context);
                    this.f77696c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
