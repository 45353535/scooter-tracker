package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f15580b;

    public /* synthetic */ a(Function1 function1) {
        this.f15580b = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getMediationNetwork(this.f15580b);
    }
}
