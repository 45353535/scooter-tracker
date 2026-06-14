package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class L9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37272b;

    public L9(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37271a = obj;
        this.f37272b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.access$resetInternal(this);
    }
}
