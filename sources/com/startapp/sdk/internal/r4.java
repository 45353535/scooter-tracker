package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public final class r4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65184a;

    public r4(Context context) {
        this.f65184a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f65184a;
        return new pc(context, new vf(context.getSharedPreferences("StartApp-b36110d5cb803404", 0)), new q4(), new Handler(Looper.getMainLooper()));
    }
}
