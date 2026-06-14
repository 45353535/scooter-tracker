package com.appodeal.consent.form;

import android.app.Activity;
import android.webkit.WebView;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.OnConsentFormDismissedListener;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f15445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f15446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ OnConsentFormDismissedListener f15447t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, Activity activity, OnConsentFormDismissedListener onConsentFormDismissedListener, Continuation continuation) {
        super(2, continuation);
        this.f15445r = rVar;
        this.f15446s = activity;
        this.f15447t = onConsentFormDismissedListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f15445r, this.f15446s, this.f15447t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        WebView webView = this.f15445r.f15453d;
        Activity activity = this.f15446s;
        if (activity.isFinishing() || activity.isDestroyed()) {
            activity = null;
        }
        if (activity == null) {
            String str = "Consent form cannot be shown: " + this.f15446s + " is not alive";
            ConsentManagerError.ActivityIsDestroyedError activityIsDestroyedError = new ConsentManagerError.ActivityIsDestroyedError(str);
            com.appodeal.consent.logger.a.b("[ConsentForm] - " + str, activityIsDestroyedError);
            OnConsentFormDismissedListener onConsentFormDismissedListener = this.f15447t;
            if (onConsentFormDismissedListener != null) {
                onConsentFormDismissedListener.onConsentFormDismissed(activityIsDestroyedError);
            }
        } else if (webView == null) {
            com.appodeal.consent.logger.a.b("[ConsentForm] - Consent form cannot be shown: webView is null", null);
            OnConsentFormDismissedListener onConsentFormDismissedListener2 = this.f15447t;
            if (onConsentFormDismissedListener2 != null) {
                onConsentFormDismissedListener2.onConsentFormDismissed(new ConsentManagerError.FormNotReadyError("WebView is null"));
            }
        } else {
            WeakReference weakReference = ConsentActivity.f15405b;
            if (b.d()) {
                com.appodeal.consent.logger.a.b("[ConsentForm] - Consent form cannot be shown: form is already shown", null);
                OnConsentFormDismissedListener onConsentFormDismissedListener3 = this.f15447t;
                if (onConsentFormDismissedListener3 != null) {
                    onConsentFormDismissedListener3.onConsentFormDismissed(ConsentManagerError.FormAlreadyShown.INSTANCE);
                }
            } else {
                com.appodeal.consent.logger.a.b("[ConsentForm] - show", null);
                this.f15445r.p(webView);
                b.b(this.f15446s, webView, this.f15447t);
            }
        }
        return Unit.f93236a;
    }
}
