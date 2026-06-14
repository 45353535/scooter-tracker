package com.bytedance.sdk.component.jpc;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes6.dex */
public class wd<V> extends FutureTask<V> implements Comparable<wd<V>> {
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16510ud;

    public wd(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.qdl = i10 == -1 ? 5 : i10;
        this.f16510ud = i11;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public int compareTo(wd wdVar) {
        if (qdl() < wdVar.qdl()) {
            return 1;
        }
        return qdl() > wdVar.qdl() ? -1 : 0;
    }

    public int qdl() {
        return this.qdl;
    }
}
