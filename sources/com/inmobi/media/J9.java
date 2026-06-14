package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class J9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37119b;

    public J9(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37118a = obj;
        this.f37119b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.a((InMobiUserDataModel) null, this);
    }
}
