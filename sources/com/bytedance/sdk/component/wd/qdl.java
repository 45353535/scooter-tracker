package com.bytedance.sdk.component.wd;

import android.os.Bundle;
import androidx.collection.SieveCacheKt;
import com.bytedance.sdk.component.ud.qdl.jpc;
import com.bytedance.sdk.component.ud.qdl.qdl.qdl.mzz;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.bytedance.sdk.component.wd.lnr.lnr;
import com.bytedance.sdk.component.wd.ud.mml;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private static mzz qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private rq f16734ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.wd.qdl$qdl, reason: collision with other inner class name */
    public static final class C0242qdl {
        private Bundle mo;
        private Set<String> mzz;
        final List<jpc> mml = new ArrayList();
        int qdl = 10000;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        int f16735ud = 10000;
        int lnr = 10000;

        public C0242qdl lnr(long j10, TimeUnit timeUnit) {
            this.lnr = qdl("timeout", j10, timeUnit);
            return this;
        }

        public C0242qdl qdl(boolean z10) {
            return this;
        }

        public C0242qdl ud(long j10, TimeUnit timeUnit) {
            this.f16735ud = qdl("timeout", j10, timeUnit);
            return this;
        }

        public C0242qdl qdl(long j10, TimeUnit timeUnit) {
            this.qdl = qdl("timeout", j10, timeUnit);
            return this;
        }

        public C0242qdl qdl(jpc jpcVar) {
            this.mml.add(jpcVar);
            return this;
        }

        private static int qdl(String str, long j10, TimeUnit timeUnit) {
            if (j10 < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis > SieveCacheKt.NodeLinkMask) {
                    throw new IllegalArgumentException(str + " too large.");
                }
                if (millis != 0 || j10 <= 0) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(str + " too small.");
            }
            throw new NullPointerException("unit == null");
        }

        public qdl qdl() {
            return new qdl(this);
        }
    }

    public static boolean mzz() {
        mzz mzzVar = qdl;
        if (mzzVar == null) {
            return false;
        }
        return mzzVar.qdl();
    }

    public static void qdl() {
        lnr.qdl(lnr.qdl.DEBUG);
    }

    public com.bytedance.sdk.component.wd.ud.ud lnr() {
        return new com.bytedance.sdk.component.wd.ud.ud(this.f16734ud);
    }

    public com.bytedance.sdk.component.wd.ud.qdl mml() {
        return new com.bytedance.sdk.component.wd.ud.qdl(this.f16734ud);
    }

    public rq mo() {
        return this.f16734ud;
    }

    public mml ud() {
        return new mml(this.f16734ud);
    }

    private qdl(C0242qdl c0242qdl) {
        rq.qdl qdlVar = new rq.qdl();
        long j10 = c0242qdl.qdl;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        rq.qdl qdlVarUd = qdlVar.qdl(j10, timeUnit).lnr(c0242qdl.lnr, timeUnit).ud(c0242qdl.f16735ud, timeUnit);
        List<jpc> list = c0242qdl.mml;
        if (list != null && list.size() > 0) {
            Iterator<jpc> it = c0242qdl.mml.iterator();
            while (it.hasNext()) {
                qdlVarUd.qdl(it.next());
            }
        }
        if (c0242qdl.mo != null) {
            Bundle unused = c0242qdl.mo;
        }
        Set unused2 = c0242qdl.mzz;
        this.f16734ud = qdlVarUd.qdl();
    }

    public static void qdl(mzz mzzVar) {
        qdl = mzzVar;
    }
}
