package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3978q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f39363a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f39364b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3928o9 f39365c = new C3928o9();

    public static void a(Jb finishListener) {
        Intrinsics.checkNotNullParameter(finishListener, "finishListener");
        if (!f39364b.getAndSet(true)) {
            AbstractC3790il.a(new C3953p9(null));
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = f39363a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference.get() == null) {
                    f39363a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
    }
}
