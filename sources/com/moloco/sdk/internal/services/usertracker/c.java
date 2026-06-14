package com.moloco.sdk.internal.services.usertracker;

import com.moloco.sdk.internal.services.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f55724a;

    public c(g0 dataStoreService) {
        Intrinsics.checkNotNullParameter(dataStoreService, "dataStoreService");
        this.f55724a = dataStoreService;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object a(String str, Continuation continuation) {
        Object objC = this.f55724a.c("com.moloco.sdk.mref", str, continuation);
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    @Override // com.moloco.sdk.internal.services.usertracker.b
    public Object b(Continuation continuation) {
        return this.f55724a.b("com.moloco.sdk.mref", continuation);
    }
}
