package com.my.target;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;
import com.google.common.net.HttpHeaders;

/* JADX INFO: loaded from: classes11.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f60499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f60500b;

    public p1(Intent intent, Bundle bundle) {
        this.f60499a = intent;
        this.f60500b = bundle;
    }

    public static p1 a() {
        return new a().a();
    }

    public void a(Context context, String str) {
        this.f60499a.setDataAndNormalize(Uri.parse(str));
        if (Build.VERSION.SDK_INT >= 30 && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                context = context.getApplicationContext();
            }
        }
        if (!(context instanceof Activity)) {
            this.f60499a.addFlags(268435456);
        }
        ContextCompat.startActivity(context, this.f60499a, this.f60500b);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f60501a = new Intent("android.intent.action.VIEW");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60502b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f60503c = true;

        /* JADX INFO: renamed from: com.my.target.p1$a$a, reason: collision with other inner class name */
        public static final class C0783a {
            @DoNotInline
            public static ActivityOptions a() {
                return ActivityOptions.makeBasic();
            }
        }

        public static final class b {
            @Nullable
            @DoNotInline
            public static String a() {
                LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
                if (adjustedDefault.isEmpty()) {
                    return null;
                }
                return adjustedDefault.get(0).toLanguageTag();
            }
        }

        public static final class c {
            @DoNotInline
            public static void a(ActivityOptions activityOptions) {
                activityOptions.setShareIdentityEnabled(false);
            }
        }

        public p1 a() {
            Bundle bundle;
            if (!this.f60501a.hasExtra(CustomTabsIntent.EXTRA_SESSION)) {
                c();
            }
            this.f60501a.putExtra(CustomTabsIntent.EXTRA_ENABLE_INSTANT_APPS, true);
            this.f60501a.putExtra(CustomTabsIntent.EXTRA_SHARE_STATE, 0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                b();
            }
            if (i10 >= 34) {
                ActivityOptions activityOptionsA = C0783a.a();
                a(activityOptionsA);
                bundle = activityOptionsA.toBundle();
            } else {
                bundle = null;
            }
            return new p1(this.f60501a, bundle);
        }

        public final void b() {
            String strA = b.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundleExtra = this.f60501a.getBundleExtra("com.android.browser.headers");
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (bundleExtra.containsKey(HttpHeaders.ACCEPT_LANGUAGE)) {
                return;
            }
            bundleExtra.putString(HttpHeaders.ACCEPT_LANGUAGE, strA);
            this.f60501a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public final void c() {
            Bundle bundle = new Bundle();
            bundle.putBinder(CustomTabsIntent.EXTRA_SESSION, null);
            this.f60501a.putExtras(bundle);
        }

        public final void a(ActivityOptions activityOptions) {
            c.a(activityOptions);
        }
    }
}
