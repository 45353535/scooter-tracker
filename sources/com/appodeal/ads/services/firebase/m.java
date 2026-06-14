package com.appodeal.ads.services.firebase;

import com.appodeal.ads.ext.ResultExtKt;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f14687a;

    public m(kotlinx.coroutines.e eVar) {
        this.f14687a = eVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.f14687a.isActive()) {
            kotlinx.coroutines.e eVar = this.f14687a;
            Result.Companion companion = Result.f93230c;
            eVar.resumeWith(Result.b(Result.a(ResultExtKt.asSuccess(Unit.f93236a))));
        }
    }
}
