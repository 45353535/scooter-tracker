package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23161a;

    public y(String str) {
        this.f23161a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f23161a);
    }
}
