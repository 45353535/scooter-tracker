package com.appodeal.advertising;

import android.util.Log;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f15339b;

    public i(kotlinx.coroutines.e eVar) {
        this.f15339b = eVar;
    }

    public final void a(AppSetIdInfo appSetIdInfo) {
        if (this.f15339b.isActive()) {
            Log.d("AppSetIdInfoManager", "AppSetId: Id: " + appSetIdInfo.getId() + ", isDeveloperScope: " + AppSetIdReceiver.access$isDeveloperScope(AppSetIdReceiver.INSTANCE, appSetIdInfo.getScope()));
            this.f15339b.resumeWith(Result.b(appSetIdInfo));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((AppSetIdInfo) obj);
        return Unit.f93236a;
    }
}
