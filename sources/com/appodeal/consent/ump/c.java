package com.appodeal.consent.ump;

import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements UserMessagingPlatform.OnConsentFormLoadFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f15562a;

    public c(kotlinx.coroutines.e eVar) {
        this.f15562a = eVar;
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(FormError umpError) {
        Intrinsics.checkNotNullParameter(umpError, "umpError");
        com.appodeal.consent.logger.a.b("[UMP] UmpConsentForm - OnConsentFormLoadFailureListener: " + umpError, null);
        kotlinx.coroutines.e eVar = this.f15562a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(kotlin.d.a(l.a(umpError))));
    }
}
