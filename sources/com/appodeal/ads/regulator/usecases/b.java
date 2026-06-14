package com.appodeal.ads.regulator.usecases;

import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.consent.ConsentForm;
import com.appodeal.consent.OnConsentFormLoadSuccessListener;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements OnConsentFormLoadSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f14395a;

    public b(kotlinx.coroutines.e eVar) {
        this.f14395a = eVar;
    }

    @Override // com.appodeal.consent.OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(ConsentForm form) {
        Intrinsics.checkNotNullParameter(form, "form");
        kotlinx.coroutines.e eVar = this.f14395a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(Result.a(ResultExtKt.asSuccess(form))));
    }
}
