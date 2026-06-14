package com.inmobi.media;

import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class Lb {
    public static ArrayList a() {
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f37360a;
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = Mb.f37360a.iterator();
            while (it.hasNext()) {
                Gh gh2 = (Gh) ((WeakReference) it.next()).get();
                if (gh2 != null) {
                    arrayList.add(gh2);
                }
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = Mb.f37360a;
        arrayList.toString();
        return arrayList;
    }

    public static void b(Gh logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f37360a;
        Objects.toString(logger);
        Mb.f37360a.add(new WeakReference(logger));
    }

    public static boolean a(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f37360a;
        try {
            Iterator it = Mb.f37360a.iterator();
            while (it.hasNext()) {
                Gh gh2 = (Gh) ((WeakReference) it.next()).get();
                if (Intrinsics.areEqual(gh2 != null ? gh2.f36951j : null, fileName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
            return false;
        }
    }

    public static void a(Gh gh2) {
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f37360a;
        Objects.toString(gh2);
        if (gh2 == null) {
            return;
        }
        try {
            Iterator it = Mb.f37360a.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null || Intrinsics.areEqual(weakReference.get(), gh2)) {
                    Mb.f37360a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }
}
