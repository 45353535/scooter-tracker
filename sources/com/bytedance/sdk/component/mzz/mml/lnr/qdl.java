package com.bytedance.sdk.component.mzz.mml.lnr;

import com.bytedance.sdk.component.mzz.exc;
import com.bytedance.sdk.component.mzz.jtx;
import com.bytedance.sdk.component.mzz.rq;
import com.ironsource.C4240b4;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class qdl<T> {
    private lnr qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private exc f16620ud;

    public qdl(lnr lnrVar, exc excVar) {
        this.qdl = lnrVar;
        this.f16620ud = excVar;
    }

    public void qdl(rq<T> rqVar) {
        try {
            exc excVar = this.f16620ud;
            if (excVar != null) {
                excVar.qdl("success", this.qdl);
            }
            String strAaj = this.qdl.aaj();
            Map<String, List<lnr>> mapTvp = this.qdl.yt().tvp();
            List<lnr> list = mapTvp.get(strAaj);
            if (list == null) {
                jtx jtxVarJpc = this.qdl.jpc();
                if (jtxVarJpc != null) {
                    jtxVarJpc.toString();
                    this.qdl.to();
                    jtxVarJpc.qdl(rqVar);
                }
            } else {
                synchronized (list) {
                    try {
                        list.size();
                        for (lnr lnrVar : list) {
                            jtx jtxVarJpc2 = lnrVar.jpc();
                            if (jtxVarJpc2 != null) {
                                jtxVarJpc2.toString();
                                lnrVar.to();
                                jtxVarJpc2.qdl(rqVar);
                            }
                        }
                        list.clear();
                        mapTvp.remove(strAaj);
                    } finally {
                    }
                }
            }
            exc excVar2 = this.f16620ud;
            if (excVar2 != null) {
                excVar2.ud("success", this.qdl);
            }
        } catch (Throwable unused) {
        }
    }

    public void qdl(int i10, String str, Throwable th2) {
        try {
            exc excVar = this.f16620ud;
            if (excVar != null) {
                excVar.qdl(C4240b4.i.f42652t, this.qdl);
            }
            String strAaj = this.qdl.aaj();
            Map<String, List<lnr>> mapTvp = this.qdl.yt().tvp();
            List<lnr> list = mapTvp.get(strAaj);
            if (list == null) {
                jtx jtxVarJpc = this.qdl.jpc();
                if (jtxVarJpc != null) {
                    jtxVarJpc.qdl(i10, str, th2);
                }
            } else {
                synchronized (list) {
                    try {
                        Iterator<lnr> it = list.iterator();
                        while (it.hasNext()) {
                            jtx jtxVarJpc2 = it.next().jpc();
                            if (jtxVarJpc2 != null) {
                                jtxVarJpc2.toString();
                                jtxVarJpc2.qdl(i10, str, th2);
                            }
                        }
                        list.clear();
                        mapTvp.remove(strAaj);
                    } finally {
                    }
                }
            }
            exc excVar2 = this.f16620ud;
            if (excVar2 != null) {
                excVar2.ud(C4240b4.i.f42652t, this.qdl);
            }
        } catch (Throwable unused) {
        }
    }
}
