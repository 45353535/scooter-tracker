package com.appodeal.consent.ump;

import android.app.Activity;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.OnConsentFormDismissedListener;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f15567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f15568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ OnConsentFormDismissedListener f15569t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Activity activity, OnConsentFormDismissedListener onConsentFormDismissedListener, Continuation continuation) {
        super(2, continuation);
        this.f15567r = gVar;
        this.f15568s = activity;
        this.f15569t = onConsentFormDismissedListener;
    }

    public static final void c(OnConsentFormDismissedListener onConsentFormDismissedListener, FormError formError) {
        com.appodeal.consent.logger.a.b("[UMP] UmpConsentForm - onConsentFormDismissed: " + formError, null);
        if (onConsentFormDismissedListener != null) {
            onConsentFormDismissedListener.onConsentFormDismissed(formError != null ? l.a(formError) : null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f15567r, this.f15568s, this.f15569t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        ConsentForm consentForm = this.f15567r.f15572c;
        Activity activity = this.f15568s;
        if (activity.isFinishing() || activity.isDestroyed()) {
            activity = null;
        }
        if (activity == null) {
            String str = "Consent form cannot be shown: " + this.f15568s + " is not alive";
            ConsentManagerError.ActivityIsDestroyedError activityIsDestroyedError = new ConsentManagerError.ActivityIsDestroyedError(str);
            com.appodeal.consent.logger.a.b("[UMP] UmpConsentForm - " + str, activityIsDestroyedError);
            OnConsentFormDismissedListener onConsentFormDismissedListener = this.f15569t;
            if (onConsentFormDismissedListener != null) {
                onConsentFormDismissedListener.onConsentFormDismissed(activityIsDestroyedError);
            }
        } else if (consentForm == null) {
            com.appodeal.consent.logger.a.b("[UMP] UmpConsentForm - Consent form cannot be shown: umpConsentForm is null", null);
            OnConsentFormDismissedListener onConsentFormDismissedListener2 = this.f15569t;
            if (onConsentFormDismissedListener2 != null) {
                onConsentFormDismissedListener2.onConsentFormDismissed(new ConsentManagerError.FormNotReadyError("umpConsentForm is null"));
            }
        } else {
            com.appodeal.consent.logger.a.b("[UMP] UmpConsentForm - show", null);
            Activity activity2 = this.f15568s;
            final OnConsentFormDismissedListener onConsentFormDismissedListener3 = this.f15569t;
            consentForm.show(activity2, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.appodeal.consent.ump.e
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    f.c(onConsentFormDismissedListener3, formError);
                }
            });
        }
        return Unit.f93236a;
    }
}
