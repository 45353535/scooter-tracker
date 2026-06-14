package com.bytedance.sdk.component.jpc.qdl;

import com.bytedance.sdk.component.jpc.qdl.lnr;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public class mml<T extends lnr> {
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private BlockingQueue<T> f16502ud = new LinkedBlockingQueue();

    private mml(int i10) {
        this.qdl = i10;
    }

    public static mml qdl(int i10) {
        return new mml(i10);
    }

    public T qdl() {
        return this.f16502ud.poll();
    }

    public boolean qdl(T t10) {
        if (t10 == null) {
            return false;
        }
        t10.qdl();
        if (this.f16502ud.size() >= this.qdl) {
            return false;
        }
        return this.f16502ud.offer(t10);
    }
}
