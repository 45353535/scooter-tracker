package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes9.dex */
public final class Z6 extends kotlin.coroutines.jvm.internal.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InMobiUserDataModel f38097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Mutex f38098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38100d;

    public Z6(kotlin.coroutines.jvm.internal.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f38099c = obj;
        this.f38100d |= Integer.MIN_VALUE;
        return C3572a7.a(null, this);
    }
}
