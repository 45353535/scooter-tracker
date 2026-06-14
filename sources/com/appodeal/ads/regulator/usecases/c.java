package com.appodeal.ads.regulator.usecases;

import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.OnConsentFormLoadFailureListener;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements OnConsentFormLoadFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f14396a;

    public c(kotlinx.coroutines.e eVar) {
        this.f14396a = eVar;
    }

    @Override // com.appodeal.consent.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(ConsentManagerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        kotlinx.coroutines.e eVar = this.f14396a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(Result.a(ResultExtKt.asFailure(error))));
    }
}
