package com.bytedance.sdk.component.ud.qdl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rq implements Cloneable {
    public TimeUnit lnr;
    public long mml;
    public long mo;
    public TimeUnit mzz;
    public List<jpc> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public long f16703ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public TimeUnit f16704wd;

    public rq(qdl qdlVar) {
        this.f16703ud = qdlVar.f16705ud;
        this.mml = qdlVar.mml;
        this.mo = qdlVar.mo;
        List<jpc> list = qdlVar.qdl;
        this.lnr = qdlVar.lnr;
        this.mzz = qdlVar.mzz;
        this.f16704wd = qdlVar.f16706wd;
        this.qdl = list;
    }

    public abstract mml qdl();

    public abstract ud qdl(fs fsVar);

    public qdl ud() {
        return new qdl(this);
    }

    public static final class qdl {
        public TimeUnit lnr;
        public long mml;
        public long mo;
        public TimeUnit mzz;
        public final List<jpc> qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public long f16705ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        public TimeUnit f16706wd;

        public qdl() {
            this.qdl = new ArrayList();
            this.f16705ud = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.lnr = timeUnit;
            this.mml = 10000L;
            this.mzz = timeUnit;
            this.mo = 10000L;
            this.f16706wd = timeUnit;
        }

        public qdl lnr(long j10, TimeUnit timeUnit) {
            this.mo = j10;
            this.f16706wd = timeUnit;
            return this;
        }

        public qdl qdl(long j10, TimeUnit timeUnit) {
            this.f16705ud = j10;
            this.lnr = timeUnit;
            return this;
        }

        public qdl ud(long j10, TimeUnit timeUnit) {
            this.mml = j10;
            this.mzz = timeUnit;
            return this;
        }

        public qdl qdl(jpc jpcVar) {
            this.qdl.add(jpcVar);
            return this;
        }

        public rq qdl() {
            return com.bytedance.sdk.component.ud.qdl.qdl.qdl.qdl(this);
        }

        public qdl(String str) {
            this.qdl = new ArrayList();
            this.f16705ud = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.lnr = timeUnit;
            this.mml = 10000L;
            this.mzz = timeUnit;
            this.mo = 10000L;
            this.f16706wd = timeUnit;
        }

        public qdl(rq rqVar) {
            this.qdl = new ArrayList();
            this.f16705ud = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.lnr = timeUnit;
            this.mml = 10000L;
            this.mzz = timeUnit;
            this.mo = 10000L;
            this.f16706wd = timeUnit;
            this.f16705ud = rqVar.f16703ud;
            this.lnr = rqVar.lnr;
            this.mml = rqVar.mml;
            this.mzz = rqVar.mzz;
            this.mo = rqVar.mo;
            this.f16706wd = rqVar.f16704wd;
        }
    }
}
