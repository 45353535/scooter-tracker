package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f65130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f65131b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f65132c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f65133d = false;

    public q2(x2 x2Var) {
        this.f65130a = x2Var;
    }

    public abstract boolean a();

    public abstract long b();

    public void c() {
        this.f65132c = null;
        this.f65133d = false;
        x2 x2Var = this.f65130a;
        x2Var.getClass();
        MetaData metaDataE = MetaData.E();
        if (metaDataE.f0() && x2Var.f65522w < metaDataE.Y()) {
            x2Var.f65522w++;
            x2Var.a(null, null, true, false, null);
        } else {
            m mVar = x2Var.f65525z;
            if (mVar != null) {
                mVar.a(x2Var);
            }
        }
    }

    public final void d() {
        if (this.f65133d) {
            return;
        }
        if (this.f65132c == null) {
            this.f65132c = Long.valueOf(System.currentTimeMillis());
        }
        if (a()) {
            if (this.f65131b == null) {
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    looperMyLooper = Looper.getMainLooper();
                }
                this.f65131b = new Handler(looperMyLooper);
            }
            long jB = b();
            if (jB >= 0) {
                this.f65133d = true;
                this.f65131b.postDelayed(new p2(this), jB);
            }
        }
    }

    public final void e() {
        Handler handler = this.f65131b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f65132c = null;
        this.f65133d = false;
    }
}
