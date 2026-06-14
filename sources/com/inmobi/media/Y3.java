package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3774i4 f38021a = new C3774i4(new C3823k4(), new C3798j4(A9.f36557c));

    public static void a(String type, InterfaceC4022s4 listener) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C3774i4 c3774i4 = f38021a;
        c3774i4.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        LinkedHashMap linkedHashMap = c3774i4.f38739a.f38855c;
        Object concurrentLinkedQueue = linkedHashMap.get(type);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            linkedHashMap.put(type, concurrentLinkedQueue);
        }
        ((ConcurrentLinkedQueue) concurrentLinkedQueue).add(new WeakReference(listener));
    }
}
