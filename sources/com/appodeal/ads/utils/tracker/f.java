package com.appodeal.ads.utils.tracker;

import android.app.Application;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.analytics.models.AppEvent;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.utils.Log;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements a {
    public static void a() {
        Log.log("Warning", "onLowMemory");
        AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.utils.tracker.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.d();
            }
        });
    }

    public static void b(int i10) {
        if (i10 == 10 || i10 == 15) {
            a1 a1Var = a1.f93282a;
            String str = String.format("Level [%s]: %s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), "Critical lack of memory"}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            Log.log("Warning", "onTrimMemory", str);
            AppodealAnalytics.INSTANCE.internalEvent(new Function0() { // from class: com.appodeal.ads.utils.tracker.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.e();
                }
            });
        }
    }

    public static final Event d() {
        return AppEvent.MemoryWarning.INSTANCE;
    }

    public static final Event e() {
        return AppEvent.MemoryWarning.INSTANCE;
    }

    public final void c(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        application.registerComponentCallbacks(new c(this));
    }
}
