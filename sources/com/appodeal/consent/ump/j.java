package com.appodeal.consent.ump;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements ConsentInformation.OnConsentInfoUpdateFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of.e f15579a;

    public j(of.e eVar) {
        this.f15579a = eVar;
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
    public final void onConsentInfoUpdateFailure(FormError umpError) {
        Intrinsics.checkNotNullParameter(umpError, "umpError");
        com.appodeal.consent.logger.a.b("[UMP] OnConsentInfoUpdateFailureListener: " + umpError, null);
        of.e eVar = this.f15579a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(kotlin.d.a(l.a(umpError))));
    }
}
