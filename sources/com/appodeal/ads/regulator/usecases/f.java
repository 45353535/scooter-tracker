package com.appodeal.ads.regulator.usecases;

import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.consent.ConsentInfoUpdateCallback;
import com.appodeal.consent.ConsentManagerError;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements ConsentInfoUpdateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f14400a;

    public f(kotlinx.coroutines.e eVar) {
        this.f14400a = eVar;
    }

    @Override // com.appodeal.consent.ConsentInfoUpdateCallback
    public final void onFailed(ConsentManagerError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        kotlinx.coroutines.e eVar = this.f14400a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(Result.a(ResultExtKt.asFailure(error))));
    }

    @Override // com.appodeal.consent.ConsentInfoUpdateCallback
    public final void onUpdated() {
        kotlinx.coroutines.e eVar = this.f14400a;
        Result.Companion companion = Result.f93230c;
        eVar.resumeWith(Result.b(Result.a(ResultExtKt.asSuccess(Unit.f93236a))));
    }
}
