package com.appodeal.ads;

import android.app.Activity;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.SdkInternalEvent;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.network.NetworkStatus;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zd {
    public static Event e(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.ACTIVITY_ERROR);
    }

    public static Event g(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.NOT_INITIALIZED);
    }

    public static Event h(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.DISABLED);
    }

    public static Event i(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.DISABLED);
    }

    public static Event j(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.ACTIVITY_ERROR);
    }

    public static Event k(l0 l0Var) {
        return new SdkInternalEvent.SdkRender(l0Var.f13566f, SdkInternalEvent.Result.CONNECTION_ERROR);
    }

    public void a(Activity activity, de deVar, l0 l0Var, md mdVar) {
        l0Var.m(LogConstants.EVENT_SHOW_FAILED, mdVar.f13664a);
    }

    public void b(l0 l0Var) {
        l0Var.m(LogConstants.EVENT_AD_DESTROY, null);
        c(null, l0Var);
        i2 i2Var = l0Var.f13567g;
        i2Var.x(l0Var.A());
        i2Var.x(l0Var.f13582v);
        l0Var.f13582v = null;
    }

    public abstract boolean c(Activity activity, l0 l0Var);

    public abstract boolean d(Activity activity, de deVar, l0 l0Var);

    public boolean f(Activity activity, de deVar, final l0 l0Var) {
        if (activity == null) {
            a(null, deVar, l0Var, md.f13663g);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.nd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zd.e(l0Var);
                }
            });
            return false;
        }
        if (!l0Var.f13570j) {
            a(activity, deVar, l0Var, md.f13658b);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.od
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zd.g(l0Var);
                }
            });
            return false;
        }
        l0Var.f13573m = deVar.f13256a;
        if (l0Var.f13569i) {
            a(activity, deVar, l0Var, md.f13661e);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.pd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zd.h(l0Var);
                }
            });
            return false;
        }
        if (com.appodeal.ads.segments.s0.g().f14484b.e(l0Var.f13566f)) {
            a(activity, deVar, l0Var, md.f13662f);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.qd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zd.i(l0Var);
                }
            });
            return false;
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            a(activity, deVar, l0Var, md.f13660d);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.sd
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return zd.j(l0Var);
                }
            });
            return false;
        }
        if (NetworkStatus.INSTANCE.isConnected()) {
            return d(activity, deVar, l0Var);
        }
        a(activity, deVar, l0Var, md.f13659c);
        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.rd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return zd.k(l0Var);
            }
        });
        return false;
    }
}
