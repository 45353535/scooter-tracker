package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class J7 implements ClientComponentsInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f75988a = CollectionsKt.listOf((Object[]) new String[]{"io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint"});

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C5186j4.l().f77465a.b()) {
            Zc zc2 = C5186j4.l().f77477m;
            List list = this.f75988a;
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
        }
    }
}
