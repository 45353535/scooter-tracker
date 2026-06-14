package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class On implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f37508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f37509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f37510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f37511d;

    public On(Sn visibilityTracker, AtomicBoolean isPaused) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(isPaused, "isPaused");
        this.f37508a = isPaused;
        this.f37509b = new ArrayList();
        this.f37510c = new ArrayList();
        this.f37511d = new WeakReference(visibilityTracker);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.On.run():void");
    }
}
