package com.bytedance.sdk.component.mo.qdl.ud.lnr;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.mo.qdl.jpc;
import com.bytedance.sdk.component.mo.qdl.mzz;
import com.bytedance.sdk.component.mo.qdl.qdl.mml;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends HandlerThread implements Handler.Callback {
    private static int exc = 200;
    private static int yt = 10;
    private final int aaj;
    private final AtomicInteger bjy;
    private volatile Handler exu;
    private final AtomicInteger fs;
    private long jl;
    private volatile long jpc;
    private final AtomicInteger jtx;
    private final int jyq;
    private final Object lnr;
    private com.bytedance.sdk.component.mo.qdl.ud.lnr mml;
    private volatile int mo;
    private final PriorityBlockingQueue<com.bytedance.sdk.component.mo.qdl.mml.qdl> mzz;
    private final int oth;
    protected mml qdl;
    private final List<com.bytedance.sdk.component.mo.qdl.mml.qdl> rdp;
    private final long rq;
    private final long to;
    private final AtomicInteger tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private volatile boolean f16551ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private volatile long f16552wd;

    public lnr(PriorityBlockingQueue<com.bytedance.sdk.component.mo.qdl.mml.qdl> priorityBlockingQueue) {
        super("csj_log");
        this.f16551ud = true;
        this.lnr = new Object();
        this.f16552wd = 0L;
        this.jpc = 0L;
        this.tvp = new AtomicInteger(0);
        this.to = 5000L;
        this.rq = 5000000000L;
        this.fs = new AtomicInteger(0);
        this.rdp = new ArrayList();
        this.bjy = new AtomicInteger(0);
        this.jtx = new AtomicInteger(0);
        this.jl = 60000L;
        this.aaj = 1;
        this.jyq = 2;
        this.oth = 3;
        this.mzz = priorityBlockingQueue;
        this.qdl = new com.bytedance.sdk.component.mo.qdl.qdl.ud();
        if (com.bytedance.sdk.component.mo.qdl.ud.ud()) {
            return;
        }
        long jRdp = jpc.wd().jtx().rdp();
        if (jRdp > 0) {
            this.jl = jRdp;
        }
    }

    private boolean jpc() {
        if (com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.f16559ud) {
            return this.mo == 4 || this.mo == 7 || this.mo == 6 || this.mo == 5 || this.mo == 2;
        }
        return false;
    }

    private void lnr() {
        mml();
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.fco(), 1);
        lnr(1);
    }

    private void mml() {
        if (!isAlive()) {
            com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.mml();
        } else {
            if (qdl()) {
                return;
            }
            lnr(6);
        }
    }

    private void mo() {
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.oth(), 1);
        qdl(false);
        com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.lnr();
    }

    private void mzz() {
        while (qdl()) {
            try {
                com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl qdlVar = com.bytedance.sdk.component.mo.qdl.ud.mml.mml;
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.jpc(), 1);
                com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVarPoll = this.mzz.poll(this.jl, TimeUnit.MILLISECONDS);
                int size = this.mzz.size();
                if (qdlVarPoll instanceof com.bytedance.sdk.component.mo.qdl.mml.ud) {
                    qdl(qdlVarPoll, size);
                } else if (qdlVarPoll == null) {
                    int iIncrementAndGet = this.tvp.incrementAndGet();
                    com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.om(), 1);
                    if (mml(iIncrementAndGet)) {
                        mo();
                        return;
                    } else if (iIncrementAndGet < 4) {
                        this.mo = 1;
                        ud((com.bytedance.sdk.component.mo.qdl.mml.qdl) null);
                    }
                } else {
                    qdl(qdlVarPoll);
                    ud(qdlVarPoll);
                }
            } catch (Throwable th2) {
                th2.getMessage();
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.gy(), 1);
            }
        }
    }

    private void to() {
        long jNanoTime;
        com.bytedance.sdk.component.mo.qdl.ud.mml mmlVar;
        if (this.exu.hasMessages(11)) {
            tvp();
        } else {
            mzz(1);
        }
        com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl qdlVar = com.bytedance.sdk.component.mo.qdl.ud.mml.mml;
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.ud(), 1);
        if (this.mo == 2) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.wd(), 1);
            synchronized (this.lnr) {
                try {
                    try {
                        long jNanoTime2 = System.nanoTime();
                        this.lnr.wait(5000L);
                        jNanoTime = System.nanoTime() - jNanoTime2;
                        mmlVar = com.bytedance.sdk.component.mo.qdl.ud.mml.qdl;
                        if (!mmlVar.f16559ud) {
                            boolean z10 = mmlVar.lnr;
                        }
                    } catch (InterruptedException e10) {
                        e10.getMessage();
                    }
                    if (jNanoTime < 5000000000L && 5000000000L - jNanoTime >= 50000000) {
                        if (!mmlVar.f16559ud && !mmlVar.lnr) {
                            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.mrf(), 1);
                            lnr(2);
                            return;
                        }
                        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.rq(), 1);
                        return;
                    }
                    com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.to(), 1);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void tvp() {
        try {
            if (this.mzz.size() == 0 && this.exu.hasMessages(11) && qdl()) {
                qdl(false);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void wd() {
        if (this.mzz.size() >= 100) {
            for (int i10 = 0; i10 < 100; i10++) {
                com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVarPoll = this.mzz.poll();
                if (!(qdlVarPoll instanceof com.bytedance.sdk.component.mo.qdl.mml.ud) && qdlVarPoll != null) {
                    qdl(qdlVarPoll);
                }
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
        } catch (Throwable th2) {
            th2.getMessage();
        }
        if (i10 == 1) {
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.tvp(), 1);
            ud();
            qdl(true);
            mzz();
        } else {
            if (i10 != 2 && i10 != 3) {
                if (i10 == 11) {
                    ArrayList arrayList = new ArrayList(this.rdp);
                    this.rdp.clear();
                    qdl((List<com.bytedance.sdk.component.mo.qdl.mml.qdl>) arrayList, false, "timeout_dispatch");
                    to();
                }
                return true;
            }
            lnr();
        }
        return true;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        this.exu = new Handler(getLooper(), this);
        com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.qdl(this.exu);
        this.exu.sendEmptyMessage(1);
    }

    public static void ud(int i10) {
        exc = i10;
    }

    private void ud() {
        long jYt = jpc.wd().yt();
        if (jYt <= 0) {
            return;
        }
        this.qdl.qdl(Integer.MAX_VALUE, jYt);
    }

    public static void qdl(int i10) {
        yt = i10;
    }

    public void lnr(int i10) {
        try {
            boolean zQdl = qdl(i10, com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.f16559ud);
            if (i10 != 6 && !zQdl) {
                return;
            }
            com.bytedance.sdk.component.mo.qdl.mml.ud udVar = new com.bytedance.sdk.component.mo.qdl.mml.ud();
            udVar.ud(i10);
            this.mzz.add(udVar);
            mzz(3);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    private boolean mml(int i10) {
        if (i10 < 4 || this.fs.get() != 0) {
            return false;
        }
        com.bytedance.sdk.component.mo.qdl.ud.mml mmlVar = com.bytedance.sdk.component.mo.qdl.ud.mml.qdl;
        return (mmlVar.f16559ud || mmlVar.lnr) ? false : true;
    }

    private void ud(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        List<com.bytedance.sdk.component.mo.qdl.mml.qdl> listQdl;
        if (com.bytedance.sdk.component.mo.qdl.lnr.qdl.ud() && jpc.wd().qdl()) {
            return;
        }
        int i10 = 0;
        if (jpc()) {
            com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl(this.mo);
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.fs(), 1);
            if (this.mzz.size() != 0) {
                return;
            }
            if (!this.exu.hasMessages(2)) {
                com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.f16559ud = false;
                this.jpc = 0L;
                this.f16552wd = 0L;
                this.bjy.set(0);
                this.jtx.set(0);
            } else {
                qdl(false);
                return;
            }
        }
        do {
            boolean zQdl = qdl(this.mo, com.bytedance.sdk.component.mo.qdl.ud.mml.qdl.f16559ud);
            com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl(zQdl, this.mo, qdlVar);
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.exu(), 1);
            if (zQdl && (listQdl = this.qdl.qdl(this.mo, -1, null)) != null) {
                listQdl.size();
                qdl(listQdl);
            } else {
                tvp();
            }
            i10++;
            if (!zQdl) {
                return;
            }
        } while (i10 <= 6);
    }

    public void qdl(boolean z10) {
        this.f16551ud = z10;
    }

    public boolean qdl() {
        return this.f16551ud;
    }

    public boolean qdl(int i10, boolean z10) {
        mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx == null || !mzzVarJtx.qdl(jpc.wd().mo())) {
            return false;
        }
        return this.qdl.qdl(i10, z10);
    }

    public void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, boolean z10) {
        if (qdlVar == null) {
            return;
        }
        qdlVar.mml();
        if (z10) {
            if (this.exu != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(qdlVar);
                qdl((List<com.bytedance.sdk.component.mo.qdl.mml.qdl>) arrayList, true, "ignore_result_dispatch");
                return;
            }
            return;
        }
        this.mzz.add(qdlVar);
        mzz(2);
    }

    private void mzz(int i10) {
        if (!qdl()) {
            if (this.exu == null) {
                return;
            }
            com.bytedance.sdk.component.mo.qdl.ud.qdl.qdl qdlVar = com.bytedance.sdk.component.mo.qdl.ud.mml.mml;
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.lnr(), 1);
            if (this.exu.hasMessages(1)) {
                return;
            }
            if (i10 == 1) {
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.mo(), 1);
            } else if (i10 == 2) {
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.mml(), 1);
            } else if (i10 == 3) {
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(qdlVar.mzz(), 1);
            }
            this.exu.sendEmptyMessage(1);
            return;
        }
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.qdl(), 1);
    }

    private void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar, int i10) {
        this.tvp.set(0);
        if (i10 == 0) {
            this.mo = ((com.bytedance.sdk.component.mo.qdl.mml.ud) qdlVar).rq();
            if (this.mo != 6) {
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.wc(), 1);
                ud(qdlVar);
                return;
            }
            return;
        }
        com.bytedance.sdk.component.mo.qdl.mml.ud udVar = (com.bytedance.sdk.component.mo.qdl.mml.ud) qdlVar;
        if (udVar.rq() == 1) {
            this.mo = 1;
            ud(qdlVar);
        } else if (udVar.rq() == 2) {
            wd();
            this.mo = 2;
            ud(qdlVar);
        }
    }

    private void ud(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        this.rdp.addAll(list);
        this.rdp.size();
        mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx != null && mzzVarJtx.fs() != null) {
            yt = mzzVarJtx.fs().ud();
        }
        if (this.rdp.size() >= yt) {
            if (this.exu.hasMessages(11)) {
                this.exu.removeMessages(11);
            }
            ArrayList arrayList = new ArrayList(this.rdp);
            this.rdp.clear();
            qdl((List<com.bytedance.sdk.component.mo.qdl.mml.qdl>) arrayList, false, "max_size_dispatch");
            to();
            return;
        }
        if (this.mzz.size() == 0) {
            qdl(false);
            if (this.exu.hasMessages(11)) {
                this.exu.removeMessages(11);
            }
            if (this.exu.hasMessages(1)) {
                this.exu.removeMessages(1);
            }
            long jQdl = exc;
            if (mzzVarJtx != null && mzzVarJtx.fs() != null) {
                jQdl = mzzVarJtx.fs().qdl();
            }
            this.exu.sendEmptyMessageDelayed(11, jQdl);
            return;
        }
        this.rdp.size();
    }

    private void qdl(com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar) {
        this.tvp.set(0);
        com.bytedance.sdk.component.mo.qdl.ud.mml mmlVar = com.bytedance.sdk.component.mo.qdl.ud.mml.qdl;
        if (mmlVar.f16559ud) {
            this.mo = 5;
        } else if (mmlVar.lnr) {
            this.mo = 7;
        } else {
            this.mo = 4;
        }
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.xi(), 1);
        this.qdl.qdl(qdlVar, this.mo);
        com.bytedance.sdk.component.mo.qdl.lnr.qdl.wd(qdlVar);
    }

    private void qdl(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, String str) {
        qdl(str);
        qdl(list, false, str);
        to();
    }

    private void qdl(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        if (list.size() != 0) {
            com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl(list, this.mzz.size());
            if (list.size() <= 1 && !com.bytedance.sdk.component.mo.qdl.lnr.qdl.lnr()) {
                com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar = list.get(0);
                if (qdlVar != null) {
                    if (qdlVar.mzz() == 1) {
                        qdl(list, "highPriority");
                        return;
                    }
                    if (qdlVar.mml() == 0 && qdlVar.mzz() == 2) {
                        if (qdlVar.ud() == 3) {
                            qdl(list, "version_v3");
                            return;
                        } else {
                            ud(list);
                            return;
                        }
                    }
                    if (qdlVar.mml() == 1) {
                        qdl(list, Constants.STATS);
                        return;
                    } else if (qdlVar.mml() == 3) {
                        qdl(list, "adType_v3");
                        return;
                    } else {
                        if (qdlVar.mml() == 2) {
                            qdl(list, "other");
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            qdl(list, "batchRead");
            return;
        }
        tvp();
    }

    private void ud(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, final boolean z10, final long j10) {
        this.fs.incrementAndGet();
        com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.dk(), 1);
        try {
            HashMap map = new HashMap();
            Iterator<com.bytedance.sdk.component.mo.qdl.mml.qdl> it = list.iterator();
            while (it.hasNext()) {
                com.bytedance.sdk.component.mo.qdl.mml.qdl next = it.next();
                int i10 = next == null ? 0 : next.to();
                if (map.get(Integer.valueOf(i10)) == null) {
                    map.put(Integer.valueOf(i10), new ArrayList());
                }
                ((List) map.get(Integer.valueOf(i10))).add(next);
            }
            for (Integer num : map.keySet()) {
                if (num.intValue() != 0 && jpc.wd().lnr() != null && jpc.wd().lnr().get(num) != null) {
                    jpc.wd().lnr().get(num).qdl(list, new com.bytedance.sdk.component.mo.qdl.ud.ud() { // from class: com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr.3
                        @Override // com.bytedance.sdk.component.mo.qdl.ud.ud
                        public void qdl(List<qdl> list2) {
                            try {
                                lnr.this.fs.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    qdl qdlVar = list2.get(i11);
                                    if (qdlVar != null) {
                                        lnr.this.qdl(z10, qdlVar.qdl(), qdlVar.ud(), j10);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                } else {
                    this.mml.qdl(list, new com.bytedance.sdk.component.mo.qdl.ud.ud() { // from class: com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr.2
                        @Override // com.bytedance.sdk.component.mo.qdl.ud.ud
                        public void qdl(List<qdl> list2) {
                            try {
                                lnr.this.fs.decrementAndGet();
                                if (list2 == null || list2.size() == 0) {
                                    return;
                                }
                                int size = list2.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    qdl qdlVar = list2.get(i11);
                                    if (qdlVar != null) {
                                        lnr.this.qdl(z10, qdlVar.qdl(), qdlVar.ud(), j10);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.gy(), 1);
            this.fs.decrementAndGet();
        }
    }

    private void qdl(String str) {
        if (this.exu.hasMessages(11)) {
            this.exu.removeMessages(11);
        }
        if (this.rdp.size() != 0) {
            ArrayList arrayList = new ArrayList(this.rdp);
            this.rdp.clear();
            qdl((List<com.bytedance.sdk.component.mo.qdl.mml.qdl>) arrayList, false, "before_".concat(String.valueOf(str)));
            to();
            arrayList.size();
        }
    }

    private void qdl(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, boolean z10, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl(list, this.mo, str);
        com.bytedance.sdk.component.mo.qdl.ud.lnr lnrVarJpc = jpc.wd().jpc();
        this.mml = lnrVarJpc;
        if (lnrVarJpc != null) {
            ud(list, z10, jCurrentTimeMillis);
        } else {
            qdl(list, z10, jCurrentTimeMillis);
        }
    }

    private void qdl(final List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, final boolean z10, final long j10) {
        mzz mzzVarJtx = jpc.wd().jtx();
        if (mzzVarJtx != null) {
            Executor executorMzz = mzzVarJtx.mzz();
            if (list.get(0).mzz() == 1) {
                executorMzz = mzzVarJtx.mml();
            }
            if (executorMzz == null) {
                return;
            }
            this.fs.incrementAndGet();
            executorMzz.execute(new com.bytedance.sdk.component.mo.qdl.mzz.mzz("csj_log_upload") { // from class: com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr.1
                @Override // java.lang.Runnable
                public void run() {
                    lnr lnrVar = lnr.this;
                    lnrVar.qdl((List<com.bytedance.sdk.component.mo.qdl.mml.qdl>) list, z10, j10, lnrVar.mo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, boolean z10, long j10, int i10) {
        lnr lnrVar;
        Throwable th2;
        ud udVarQdl;
        ud udVar;
        try {
            com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar = list.get(0);
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.dk(), 1);
            try {
                if (qdlVar.mml() == 0) {
                    udVarQdl = jpc.mzz().qdl(list);
                    qdl(udVarQdl, list);
                    if (udVarQdl != null) {
                        com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl(list, udVarQdl.mml);
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONArray jSONArray = new JSONArray();
                        Iterator<com.bytedance.sdk.component.mo.qdl.mml.qdl> it = list.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next().wd());
                        }
                        jSONObject.put("stats_list", jSONArray);
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                    udVarQdl = jpc.mzz().qdl(jSONObject);
                }
                udVar = udVarQdl;
                this.fs.decrementAndGet();
                lnrVar = this;
            } catch (Throwable th3) {
                th2 = th3;
                lnrVar = this;
                th2.getMessage();
                com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.gy(), 1);
                lnrVar.fs.decrementAndGet();
            }
        } catch (Throwable th4) {
            th = th4;
            lnrVar = this;
        }
        try {
            lnrVar.qdl(z10, udVar, list, j10);
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            th2.getMessage();
            com.bytedance.sdk.component.mo.qdl.lnr.ud.qdl(com.bytedance.sdk.component.mo.qdl.ud.mml.mml.gy(), 1);
            lnrVar.fs.decrementAndGet();
        }
    }

    private void qdl(ud udVar, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list) {
        if (udVar == null || !udVar.qdl) {
            return;
        }
        List<Object> listQdl = com.bytedance.sdk.component.mo.qdl.ud.qdl();
        if (list == null || listQdl == null || listQdl.size() == 0) {
            return;
        }
        for (com.bytedance.sdk.component.mo.qdl.mml.qdl qdlVar : list) {
            if (qdlVar.mzz() == 1) {
                com.bytedance.sdk.component.mo.qdl.lnr.qdl.qdl(qdlVar);
                com.bytedance.sdk.component.mo.qdl.lnr.qdl.mzz(qdlVar);
                Iterator<Object> it = listQdl.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qdl(boolean z10, ud udVar, List<com.bytedance.sdk.component.mo.qdl.mml.qdl> list, long j10) {
        if (z10 || udVar == null) {
            return;
        }
        int i10 = udVar.f16557ud;
        int i11 = -2;
        if (udVar.mzz) {
            i10 = -1;
        } else if (i10 < 0) {
            i10 = -2;
        }
        if (i10 == 510 || i10 == 511) {
            i10 = -2;
        }
        if (udVar.qdl || ((i10 < 500 || i10 >= 509) && i10 <= 513)) {
            i11 = i10;
        }
        if (list != null) {
            list.size();
            this.fs.get();
        }
        qdl(i11, list, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:5:0x0005, B:8:0x000b, B:55:0x00e4, B:57:0x00e8, B:58:0x00ed, B:18:0x0030, B:20:0x003e, B:24:0x0043, B:26:0x0050, B:28:0x0052, B:30:0x0060, B:31:0x0065, B:32:0x006a, B:34:0x0070, B:36:0x0074, B:38:0x0080, B:39:0x0085, B:41:0x008d, B:42:0x0092, B:43:0x00af, B:45:0x00bd, B:47:0x00bf, B:49:0x00cc, B:51:0x00ce, B:53:0x00dc, B:54:0x00e1, B:61:0x00f4), top: B:65:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qdl(int r6, java.util.List<com.bytedance.sdk.component.mo.qdl.mml.qdl> r7, long r8) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.mo.qdl.ud.lnr.lnr.qdl(int, java.util.List, long):void");
    }

    public void qdl(int i10, long j10) {
        if (this.exu == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        if (i10 == 2) {
            this.exu.sendMessageDelayed(messageObtain, ((long) (((this.bjy.incrementAndGet() - 1) % 4) + 1)) * j10);
        } else if (i10 == 3) {
            this.exu.sendMessageDelayed(messageObtain, ((long) (((this.jtx.incrementAndGet() - 1) % 4) + 1)) * j10);
        }
    }
}
