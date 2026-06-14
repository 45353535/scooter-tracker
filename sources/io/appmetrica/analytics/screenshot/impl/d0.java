package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.screenshot.impl.d0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f79005a;

    public d0(g0 g0Var) {
        this.f79005a = g0Var;
    }

    public static final Boolean a(g0 g0Var, d0 d0Var, C5620n c5620n, ActivityManager activityManager) {
        Object next;
        List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(200);
        if (runningServices == null) {
            runningServices = CollectionsKt.emptyList();
        }
        for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
        }
        Iterator<T> it = runningServices.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) next).process, "com.android.systemui:screenshot")) {
                break;
            }
        }
        if (((ActivityManager.RunningServiceInfo) next) != null) {
            ((C5629x) g0Var.f79010b).a("ServiceScreenshotCaptor");
        }
        return Boolean.valueOf(g0Var.f79011c.postDelayed(d0Var, TimeUnit.SECONDS.toMillis(c5620n.f79036b)));
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C5620n c5620n = this.f79005a.f79013e;
        if (this.f79005a.f79012d || c5620n == null || !c5620n.f79035a) {
            return;
        }
        Context context = this.f79005a.f79009a.getContext();
        final g0 g0Var = this.f79005a;
        SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "running service screenshot captor", "ActivityManager", new FunctionWithThrowable() { // from class: s8.e
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return d0.a(g0Var, this, c5620n, (ActivityManager) obj);
            }
        });
    }
}
