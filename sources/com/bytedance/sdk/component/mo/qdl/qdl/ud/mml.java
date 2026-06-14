package com.bytedance.sdk.component.mo.qdl.qdl.ud;

import com.bytedance.sdk.component.mo.qdl.mml.qdl;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mml<T extends com.bytedance.sdk.component.mo.qdl.mml.qdl> {
    private Queue<String> lnr;
    private String mml;
    private com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private Queue<T> f16550ud = new ConcurrentLinkedQueue();

    public mml(com.bytedance.sdk.component.mo.qdl.mml.ud.qdl qdlVar, Queue<String> queue, String str) {
        this.qdl = qdlVar;
        this.lnr = queue;
        this.mml = str;
    }

    public void qdl(T t10) {
        Queue<T> queue = this.f16550ud;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public synchronized boolean ud(int i10, int i11) {
        int size = this.f16550ud.size();
        int iQdl = this.qdl.qdl();
        return (i10 == 2 || i10 == 1) ? com.bytedance.sdk.component.mo.qdl.lnr.qdl.lnr() ? size > 0 : size >= iQdl : size >= iQdl;
    }

    public synchronized List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int i10, int i11) {
        if (!ud(i10, i11)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.qdl.qdl());
        do {
            T tPoll = this.f16550ud.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.qdl.ud());
        return arrayList;
    }

    public synchronized void qdl(int i10, List<T> list) {
        if (i10 != -1 && i10 != 200 && i10 != 509) {
            this.f16550ud.addAll(list);
        } else {
            this.f16550ud.size();
        }
    }
}
