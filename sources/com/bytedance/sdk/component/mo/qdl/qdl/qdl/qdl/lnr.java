package com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.utils.aaj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lnr {
    private static int lnr = 20;
    private boolean jpc;
    private boolean mzz;
    private final Context qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    protected final List<com.bytedance.sdk.component.mo.qdl.mml.qdl> f16544ud = new ArrayList();
    private final List<com.bytedance.sdk.component.mo.qdl.mml.qdl> mml = new ArrayList();
    private boolean mo = false;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private volatile boolean f16545wd = false;
    private final Runnable tvp = new Runnable() { // from class: com.bytedance.sdk.component.mo.qdl.qdl.qdl.qdl.lnr.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (lnr.this) {
                try {
                    lnr.this.f16545wd = false;
                    if (lnr.this.f16544ud.isEmpty()) {
                        lnr.this.mo = false;
                        return;
                    }
                    if (lnr.this.mzz) {
                        Iterator<com.bytedance.sdk.component.mo.qdl.mml.qdl> it = lnr.this.f16544ud.iterator();
                        while (it.hasNext()) {
                            lnr.this.mml.add(it.next());
                        }
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(lnr.this.f16544ud);
                    }
                    lnr.this.f16544ud.clear();
                    lnr.this.mo = false;
                    if (arrayList != null) {
                        lnr.this.mml(arrayList);
                        return;
                    }
                    lnr lnrVar = lnr.this;
                    lnrVar.mml(lnrVar.mml);
                    lnr.this.mml.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    public lnr(Context context) {
        this.jpc = true;
        this.qdl = context;
        try {
            com.bytedance.sdk.component.mo.qdl.mzz mzzVarJtx = jpc.wd().jtx();
            if (mzzVarJtx != null) {
                this.jpc = mzzVarJtx.bjy();
                this.mzz = mzzVarJtx.jtx();
                lnr = mzzVarJtx.yt();
            }
            aaj.qdl("DBInsertMemRepo", "enableOpt:" + this.jpc + ",BATCH_SIZE:" + lnr, Boolean.valueOf(this.mzz));
        } catch (Throwable unused) {
        }
    }

    protected synchronized void lnr(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.mo.qdl.mml.qdl> it = this.f16544ud.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.mo.qdl.mml.qdl next = it.next();
                        if (next != null) {
                            String strLnr = next.lnr();
                            if (!TextUtils.isEmpty(strLnr) && list.contains(strLnr)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    ud();
                    th2.getMessage();
                }
            }
        }
    }

    public void mml(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        com.bytedance.sdk.component.mo.qdl.qdl.qdl.lnr.qdl(mzz(), ud(), list);
    }

    protected long mo() {
        return 10000L;
    }

    public Context mzz() {
        return this.qdl;
    }

    public abstract String ud();

    private void qdl() {
        if (!this.mo) {
            com.bytedance.sdk.component.mo.qdl.wd.qdl.qdl().postDelayed(this.tvp, this.mzz ? mo() : com.bytedance.sdk.component.mo.qdl.wd.qdl.ud());
            this.mo = true;
        }
        if (this.jpc && this.f16544ud.size() >= lnr && !this.f16545wd) {
            com.bytedance.sdk.component.mo.qdl.wd.qdl.qdl().removeCallbacks(this.tvp);
            com.bytedance.sdk.component.mo.qdl.wd.qdl.qdl().post(this.tvp);
            this.mo = true;
            this.f16545wd = true;
        }
    }

    public synchronized void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        if (qdlVar.wd() != null && !TextUtils.isEmpty(qdlVar.lnr())) {
            this.f16544ud.add(qdlVar);
            qdl();
        }
    }
}
