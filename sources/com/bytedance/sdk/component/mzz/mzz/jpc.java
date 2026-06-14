package com.bytedance.sdk.component.mzz.mzz;

import com.bytedance.sdk.component.mzz.jtx;
import com.ironsource.C4240b4;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends qdl {
    private String lnr;
    private Throwable qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16638ud;

    public jpc(int i10, String str, Throwable th2) {
        this.f16638ud = i10;
        this.lnr = str;
        this.qdl = th2;
    }

    private void ud(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        jtx jtxVarJpc = lnrVar.jpc();
        if (jtxVarJpc != null) {
            jtxVarJpc.qdl(this.f16638ud, this.lnr, this.qdl);
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public void qdl(com.bytedance.sdk.component.mzz.lnr.lnr lnrVar) {
        lnrVar.qdl(new com.bytedance.sdk.component.mzz.lnr.qdl(this.f16638ud, this.lnr, this.qdl));
        String strOth = lnrVar.oth();
        Map<String, List<com.bytedance.sdk.component.mzz.lnr.lnr>> mapJpc = lnrVar.jl().jpc();
        List<com.bytedance.sdk.component.mzz.lnr.lnr> list = mapJpc.get(strOth);
        if (list == null) {
            ud(lnrVar);
            return;
        }
        synchronized (list) {
            try {
                Iterator<com.bytedance.sdk.component.mzz.lnr.lnr> it = list.iterator();
                while (it.hasNext()) {
                    ud(it.next());
                }
                list.clear();
                mapJpc.remove(strOth);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bytedance.sdk.component.mzz.mzz.tvp
    public String qdl() {
        return C4240b4.i.f42652t;
    }
}
