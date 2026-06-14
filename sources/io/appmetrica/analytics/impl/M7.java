package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class M7 implements ServiceComponentsInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f76119a = CollectionsKt.listOf((Object[]) new String[]{"io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint"});

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@NotNull Context context) {
        Zc zc2 = C5468ua.H.f78370s;
        List list = this.f76119a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5538x5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C5538x5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C5538x5[] c5538x5Arr = (C5538x5[]) array;
        Yc[] ycArr = (Yc[]) Arrays.copyOf(c5538x5Arr, c5538x5Arr.length);
        synchronized (zc2) {
            CollectionsKt.addAll(zc2.f76745a, ycArr);
        }
        C5468ua.H.f78370s.a(new Ze(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
