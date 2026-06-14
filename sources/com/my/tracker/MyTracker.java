package com.my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.c1;
import com.my.tracker.obfuscated.c3;
import com.my.tracker.obfuscated.x2;
import com.my.tracker.obfuscated.y2;
import com.my.tracker.plugins.MyTrackerPluginConfig;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTracker {

    @NonNull
    public static final String VERSION = "3.5.0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f61197a = DesugarCollections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c1 f61198b;

    public interface AttributionListener {
        void onReceiveAttribution(@NonNull MyTrackerAttribution myTrackerAttribution);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y2 f61199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final MyTrackerConfig f61200b;

        static {
            y2 y2VarY = y2.y();
            f61199a = y2VarY;
            f61200b = MyTrackerConfig.a(y2VarY);
        }
    }

    private static void a(int i10, boolean z10) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i10, z10);
        }
    }

    @AnyThread
    public static void applyPlugin(@NonNull MyTrackerPluginConfig myTrackerPluginConfig) {
        f61197a.add(myTrackerPluginConfig);
    }

    @AnyThread
    public static void flush() {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a();
        }
    }

    @NonNull
    @WorkerThread
    public static String getInstanceId(@NonNull Context context) {
        return c3.a(context);
    }

    @NonNull
    @AnyThread
    public static MyTrackerConfig getTrackerConfig() {
        return a.f61200b;
    }

    @NonNull
    @AnyThread
    public static MyTrackerParams getTrackerParams() {
        return a.f61199a.m();
    }

    @Nullable
    @AnyThread
    public static String handleDeeplink(@Nullable Intent intent) {
        c1 c1Var = f61198b;
        if (c1Var != null) {
            return c1Var.a(intent);
        }
        x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    @AnyThread
    public static void incrementEventTimeSpent(int i10) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i10);
        }
    }

    @AnyThread
    public static void initTracker(@NonNull String str, @NonNull Application application) {
        if (TextUtils.isEmpty(str)) {
            x2.b("MyTracker initialization failed: id can't be empty");
            return;
        }
        if (f61198b != null) {
            x2.c("MyTracker has already been initialized");
            return;
        }
        synchronized (MyTracker.class) {
            try {
                if (f61198b != null) {
                    x2.c("MyTracker has already been initialized");
                    return;
                }
                y2 y2Var = a.f61199a;
                ArrayList arrayList = new ArrayList(f61197a);
                c1 c1VarA = c1.a(str, y2Var, application);
                c1VarA.a(arrayList);
                f61198b = c1VarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @AnyThread
    public static boolean isDebugMode() {
        return x2.a();
    }

    @AnyThread
    public static void onActivityResult(int i10, @Nullable Intent intent) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i10, intent);
        }
    }

    @AnyThread
    public static void onPurchasesUpdated(int i10, @Nullable List<Object> list) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i10, list);
        }
    }

    @AnyThread
    public static void setAttributionListener(@Nullable AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    @AnyThread
    public static void setDebugMode(boolean z10) {
        x2.a(z10);
    }

    @AnyThread
    public static void startAnytimeTimeSpent(int i10) {
        a(i10, true);
    }

    @AnyThread
    public static void startForegroundTimeSpent(int i10) {
        a(i10, false);
    }

    @AnyThread
    public static void stopAnytimeTimeSpent(int i10) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.b(i10, true);
        }
    }

    @AnyThread
    public static void stopForegroundTimeSpent(int i10) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.b(i10, false);
        }
    }

    @AnyThread
    public static void trackAdEvent(@NonNull AdEvent adEvent) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(adEvent);
        }
    }

    @AnyThread
    public static void trackAppGalleryPurchaseEvent(@NonNull Object obj, @NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable Map<String, String> map) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(obj, str, str2, str3, map);
        }
    }

    @AnyThread
    public static void trackEvent(@NonNull String str, @Nullable Map<String, String> map) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(str, map);
        }
    }

    @AnyThread
    public static void trackInviteEvent(@Nullable Map<String, String> map) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(map);
        }
    }

    @AnyThread
    public static void trackLaunchManually(@NonNull Activity activity) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(activity);
        }
    }

    @AnyThread
    public static void trackLevelEvent(@Nullable Map<String, String> map) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.b(map);
        }
    }

    @AnyThread
    public static void trackLoginEvent(@NonNull String str, @Nullable String str2, @Nullable Map<String, String> map) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(str, str2, map);
        }
    }

    @AnyThread
    public static void trackMiniAppEvent(@NonNull MiniAppEvent miniAppEvent) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(miniAppEvent);
        }
    }

    @AnyThread
    public static void trackPurchaseEvent(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull String str, @Nullable Map<String, String> map) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(jSONObject, jSONObject2, str, map);
        }
    }

    @AnyThread
    public static void trackRegistrationEvent(@NonNull String str, @Nullable String str2, @Nullable Map<String, String> map) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.b(str, str2, map);
        }
    }

    @AnyThread
    public static void setAttributionListener(@Nullable AttributionListener attributionListener, @Nullable Handler handler) {
        a.f61199a.a(attributionListener, handler);
    }

    @AnyThread
    public static void trackEvent(@NonNull String str) {
        trackEvent(str, null);
    }

    @AnyThread
    public static void trackInviteEvent() {
        trackInviteEvent(null);
    }

    @AnyThread
    public static void trackLevelEvent() {
        trackLevelEvent(null);
    }

    @AnyThread
    public static void trackLoginEvent(@NonNull String str, @Nullable String str2) {
        trackLoginEvent(str, str2, null);
    }

    @AnyThread
    public static void trackPurchaseEvent(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull String str) {
        trackPurchaseEvent(jSONObject, jSONObject2, str, null);
    }

    @AnyThread
    public static void trackRegistrationEvent(@NonNull String str, @Nullable String str2) {
        trackRegistrationEvent(str, str2, null);
    }

    @AnyThread
    public static void trackLevelEvent(int i10, @Nullable Map<String, String> map) {
        c1 c1Var = f61198b;
        if (c1Var == null) {
            x2.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            c1Var.a(i10, map);
        }
    }
}
