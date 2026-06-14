package com.bytedance.sdk.component.mo.qdl.qdl;

import com.bytedance.sdk.component.mo.qdl.jpc;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends qdl {
    private final Queue<String> lnr;
    private final mml qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final lnr f16549ud;

    public ud() {
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.lnr = concurrentLinkedQueue;
        this.qdl = new mo(concurrentLinkedQueue);
        this.f16549ud = new lnr();
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public synchronized void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, int i10) {
        mml mmlVar;
        if (i10 != 5) {
            try {
                if (jpc.wd().jtx().qdl(jpc.wd().mo()) && (mmlVar = this.qdl) != null && qdlVar != null) {
                    mmlVar.qdl(qdlVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        lnr lnrVar = this.f16549ud;
        if (lnrVar != null && qdlVar != null) {
            lnrVar.qdl(qdlVar, i10);
        }
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public synchronized void qdl(int i10, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        try {
            Iterator<com.bytedance.sdk.component.mo.qdl.mml.qdl> it = list.iterator();
            while (it.hasNext()) {
                this.lnr.remove(it.next().lnr());
            }
            mml mmlVar = this.qdl;
            if (mmlVar != null) {
                mmlVar.qdl(i10, list);
            }
            lnr lnrVar = this.f16549ud;
            if (lnrVar != null) {
                lnrVar.qdl(i10, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x000f, B:66:0x014b, B:69:0x0152, B:70:0x0156, B:72:0x015c, B:76:0x016e, B:11:0x0018, B:13:0x002b, B:15:0x0031, B:16:0x003d, B:18:0x0043, B:21:0x0054, B:22:0x005f, B:24:0x0065, B:25:0x006f, B:27:0x0075, B:29:0x0085, B:30:0x008d, B:31:0x0091, B:33:0x0097, B:34:0x00a5, B:35:0x00b0, B:37:0x00b6, B:38:0x00c4, B:39:0x00c9, B:41:0x00d2, B:43:0x00d8, B:44:0x00db, B:46:0x00e3, B:48:0x00e9, B:49:0x00f2, B:51:0x00f8, B:52:0x0106, B:54:0x010f, B:55:0x0113, B:57:0x0119, B:59:0x0125, B:60:0x0129, B:61:0x0134, B:63:0x013a), top: B:81:0x0001 }] */
    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized java.util.List<com.bytedance.sdk.component.mo.qdl.mml.qdl> qdl(int r7, int r8, java.util.List<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.mo.qdl.qdl.ud.qdl(int, int, java.util.List):java.util.List");
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public synchronized boolean qdl(int i10, boolean z10) {
        if (this.qdl.qdl(i10, z10)) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.kdv(), 1);
            return true;
        }
        if ((i10 != 1 && i10 != 2) || !this.f16549ud.qdl(i10, z10)) {
            return false;
        }
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.ekw(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.mo.qdl.qdl.mml
    public void qdl(int i10, long j10) {
        this.f16549ud.qdl(i10, j10);
        this.qdl.qdl(i10, j10);
    }
}
