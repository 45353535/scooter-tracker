package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes9.dex */
final class be extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f28681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ bn f28682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f28682d = bnVar;
        this.f28681c = context;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        this.f28682d.f28707c.trySetResult(Integer.valueOf(com.google.android.play.integrity.internal.ai.a(this.f28681c)));
    }
}
