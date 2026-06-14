package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Pair;
import com.startapp.sdk.jobs.SchedulerService;

/* JADX INFO: loaded from: classes11.dex */
public final class p4 implements k7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f65080a;

    public p4(Context context) {
        this.f65080a = context;
    }

    @Override // com.startapp.sdk.internal.k7
    public final Object a() {
        Context context = this.f65080a;
        Pair pair = new Pair(new eb(context, SchedulerService.class), new bi(context));
        return new db((bg) pair.first, (bg) pair.second);
    }
}
