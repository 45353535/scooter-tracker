package com.facebook.ads.redexgen.core;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MD extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C3144ir A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MD(C3144ir c3144ir, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c3144ir;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A05();
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th2) {
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            AbstractC2499Vl.A00(th3, this);
        }
    }
}
