package com.inmobi.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class Sh implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37732a;

    public Sh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        this.f37732a = gestureDetectorOnGestureListenerC3635ci;
    }

    public final void a(E6 metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f37732a;
        float f10 = metrics.f36776a;
        F6 f62 = metrics.f36777b;
        Object jSONArray = "null";
        String strA = f62 != null ? G6.a(f62) : "null";
        ArrayList arrayList = metrics.f36778c;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(G6.a((F6) it.next()));
            }
            jSONArray = new JSONArray((Collection) arrayList2);
        }
        gestureDetectorOnGestureListenerC3635ci.g("window.mraidview.broadcastEvent('exposureChange', " + f10 + ", " + strA + ", " + jSONArray + ");");
    }
}
