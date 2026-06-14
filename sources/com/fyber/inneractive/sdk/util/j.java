package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f23874a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f23875b;

    public j(int i10, i iVar) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f23874a.offer(iVar.a());
        }
        this.f23875b = iVar;
    }
}
