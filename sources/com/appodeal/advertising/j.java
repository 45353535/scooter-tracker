package com.appodeal.advertising;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f15340a;

    public j(kotlinx.coroutines.e eVar) {
        this.f15340a = eVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (this.f15340a.isActive()) {
            Log.e("AppSetIdInfoManager", "AppSetId wasn't received. Exception", exc);
            kotlinx.coroutines.e eVar = this.f15340a;
            Result.Companion companion = Result.f93230c;
            Intrinsics.checkNotNull(exc);
            eVar.resumeWith(Result.b(kotlin.d.a(exc)));
        }
    }
}
