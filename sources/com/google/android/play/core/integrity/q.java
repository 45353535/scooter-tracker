package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28734a;

    /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f28734a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        com.google.android.play.integrity.internal.am.a(this.f28734a, Context.class);
        return new s(this.f28734a, null);
    }
}
