package com.appodeal.consent.form;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.OnConsentFormDismissedListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static void b(Context context, WebView webView, OnConsentFormDismissedListener onConsentFormDismissedListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        ConsentActivity.f15408e.set(true);
        ConsentActivity.f15405b = new WeakReference(webView);
        ConsentActivity.f15407d = onConsentFormDismissedListener;
        Intent intent = new Intent(context, (Class<?>) ConsentActivity.class);
        intent.addFlags(276824064);
        context.startActivity(intent);
    }

    public static void c(ConsentManagerError consentManagerError) {
        Activity activity;
        WeakReference weakReference = ConsentActivity.f15406c;
        if (weakReference != null && (activity = (Activity) weakReference.get()) != null) {
            activity.finishAndRemoveTask();
        }
        WeakReference weakReference2 = ConsentActivity.f15406c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        ConsentActivity.f15406c = null;
        WeakReference weakReference3 = ConsentActivity.f15405b;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        ConsentActivity.f15405b = null;
        OnConsentFormDismissedListener onConsentFormDismissedListener = ConsentActivity.f15407d;
        if (onConsentFormDismissedListener != null) {
            onConsentFormDismissedListener.onConsentFormDismissed(consentManagerError);
        }
        ConsentActivity.f15407d = null;
        ConsentActivity.f15408e.set(false);
    }

    public static boolean d() {
        return ConsentActivity.f15408e.get();
    }
}
