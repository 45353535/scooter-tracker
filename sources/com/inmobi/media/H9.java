package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class H9 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f36998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f36999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f37000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37001d;

    public H9(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f37000c = obj;
        this.f37001d |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(null, this);
    }
}
