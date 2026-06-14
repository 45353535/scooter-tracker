package com.bytedance.sdk.component.jpc;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.bjy;

/* JADX INFO: loaded from: classes6.dex */
class ud implements Comparable, Runnable {
    private long lnr;
    private Thread mml = null;
    private jpc qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private qdl f16508ud;

    public ud(jpc jpcVar, qdl qdlVar) {
        this.lnr = 0L;
        this.qdl = jpcVar;
        this.f16508ud = qdlVar;
        this.lnr = SystemClock.uptimeMillis();
    }

    private void qdl(String str, String str2, long j10) {
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof ud) {
            return this.qdl.compareTo(((ud) obj).qdl());
        }
        return 0;
    }

    public boolean equals(Object obj) {
        jpc jpcVar;
        return (obj instanceof ud) && (jpcVar = this.qdl) != null && jpcVar.equals(((ud) obj).qdl());
    }

    public int hashCode() {
        return this.qdl.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.mml = Thread.currentThread();
        jpc jpcVar = this.qdl;
        if (jpcVar != null) {
            jpcVar.run();
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
        if (this.f16508ud != null) {
            mml.qdl();
        }
        if (bjy.qdl()) {
            qdl qdlVar = this.f16508ud;
            if (qdlVar != null) {
                qdlVar.qdl();
            }
            jpc jpcVar2 = this.qdl;
            if (jpcVar2 != null) {
                jpcVar2.getName();
            }
            String strQdl = this.f16508ud.qdl();
            strQdl.getClass();
            switch (strQdl) {
                case "ad":
                case "init":
                    if (jUptimeMillis2 > 2000) {
                        qdl qdlVar2 = this.f16508ud;
                        String strQdl2 = qdlVar2 != null ? qdlVar2.qdl() : "null";
                        jpc jpcVar3 = this.qdl;
                        qdl(strQdl2, jpcVar3 != null ? jpcVar3.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case "io":
                    if (jUptimeMillis2 > 5000) {
                        qdl qdlVar3 = this.f16508ud;
                        String strQdl3 = qdlVar3 != null ? qdlVar3.qdl() : "null";
                        jpc jpcVar4 = this.qdl;
                        qdl(strQdl3, jpcVar4 != null ? jpcVar4.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case "log":
                    if (jUptimeMillis2 > 3000) {
                        qdl qdlVar4 = this.f16508ud;
                        String strQdl4 = qdlVar4 != null ? qdlVar4.qdl() : "null";
                        jpc jpcVar5 = this.qdl;
                        qdl(strQdl4, jpcVar5 != null ? jpcVar5.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
                case "computation":
                    if (jUptimeMillis2 > 1000) {
                        qdl qdlVar5 = this.f16508ud;
                        String strQdl5 = qdlVar5 != null ? qdlVar5.qdl() : "null";
                        jpc jpcVar6 = this.qdl;
                        qdl(strQdl5, jpcVar6 != null ? jpcVar6.getName() : "null", jUptimeMillis2);
                        break;
                    }
                    break;
            }
        }
    }

    public jpc qdl() {
        return this.qdl;
    }
}
