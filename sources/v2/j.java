package v2;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.s;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f105705b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile j f105706c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f105707a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            j jVarA = j.a();
            if (jVarA != null) {
                return jVarA;
            }
            synchronized (this) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!s.D()) {
                    return null;
                }
                j jVarA2 = j.a();
                if (jVarA2 == null) {
                    jVarA2 = new j(defaultConstructorMarker);
                    j.b(jVarA2);
                }
                return jVarA2;
            }
        }

        private a() {
        }
    }

    static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f105708f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return s.m().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            j jVarA = j.f105705b.a();
            if (jVarA != null) {
                jVarA.g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            j jVarA = j.f105705b.a();
            if (jVarA != null) {
                jVarA.g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ j a() {
        if (e3.a.d(j.class)) {
            return null;
        }
        try {
            return f105706c;
        } catch (Throwable th2) {
            e3.a.b(th2, j.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(j jVar) {
        if (e3.a.d(j.class)) {
            return;
        }
        try {
            f105706c = jVar;
        } catch (Throwable th2) {
            e3.a.b(th2, j.class);
        }
    }

    private final SharedPreferences f() {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Object value = this.f105707a.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final String c(Intent intent) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString("campaign_ids");
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final String d(Uri uri) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString("campaign_ids");
            } catch (Exception unused) {
                Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                return null;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final String e(String key) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            return f().getString(key, null);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public final void g(Activity activity) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "activity.intent");
            h(data, intent);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void h(Uri uri, Intent intent) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String strD = d(uri);
            if (strD == null) {
                strD = c(intent);
            }
            if (strD != null) {
                f().edit().putString("campaign_ids", strD).apply();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    public final void i(Application application) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(application, "application");
            application.registerActivityLifecycleCallbacks(new c());
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private j() {
        this.f105707a = lf.i.a(b.f105708f);
    }
}
