package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
final class u implements av {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28741a;

    /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.f28741a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        com.google.android.play.integrity.internal.am.a(this.f28741a, Context.class);
        return new w(this.f28741a, null);
    }
}
