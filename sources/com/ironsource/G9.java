package com.ironsource;

import com.ironsource.AbstractC4511r3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes8.dex */
public class G9 extends AbstractC4511r3 {
    private static G9 R;
    private String P;
    private final M8 Q = Ib.U().s();

    private G9() {
        this.H = "ironbeast";
        this.G = 2;
        this.I = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized G9 i() {
        try {
            if (R == null) {
                G9 g92 = new G9();
                R = g92;
                g92.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return R;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected int c(C4649z5 c4649z5) {
        int iF = f(c4649z5.c());
        return iF == AbstractC4511r3.e.BANNER.b() ? this.Q.a(IronSource.a.BANNER) : iF == AbstractC4511r3.e.NATIVE_AD.b() ? this.Q.a(IronSource.a.NATIVE_AD) : this.Q.a(IronSource.a.INTERSTITIAL);
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean d(C4649z5 c4649z5) {
        int iC = c4649z5.c();
        return iC == A5.IS_CALLBACK_LOAD_SUCCESS.b() || iC == A5.IS_INSTANCE_OPENED.b() || iC == A5.IS_INSTANCE_CLOSED.b() || iC == A5.IS_AUCTION_SUCCESS.b() || iC == A5.IS_AUCTION_FAILED.b() || iC == A5.BN_INSTANCE_SHOW.b() || iC == A5.BN_AUCTION_SUCCESS.b() || iC == A5.BN_AUCTION_FAILED.b() || iC == A5.NT_INSTANCE_LOAD_SUCCESS.b() || iC == A5.NT_INSTANCE_SHOW.b() || iC == A5.NT_AUCTION_SUCCESS.b() || iC == A5.NT_AUCTION_FAILED.b();
    }

    @Override // com.ironsource.AbstractC4511r3
    protected String e(int i10) {
        return this.P;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void f(C4649z5 c4649z5) {
        this.P = c4649z5.b().optString("placement");
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean j(C4649z5 c4649z5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void d() {
        this.J.add(Integer.valueOf(A5.IS_LOAD_CALLED.b()));
        this.J.add(Integer.valueOf(A5.IS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(A5.IS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.IS_CALLBACK_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.IS_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(A5.IS_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(A5.IS_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(A5.IS_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(A5.BN_LOAD.b()));
        this.J.add(Integer.valueOf(A5.BN_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(A5.BN_RELOAD.b()));
        this.J.add(Integer.valueOf(A5.BN_CALLBACK_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(A5.BN_CALLBACK_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_RELOAD.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_RELOAD_ERROR.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.BN_INSTANCE_SHOW.b()));
        this.J.add(Integer.valueOf(A5.NT_LOAD.b()));
        this.J.add(Integer.valueOf(A5.NT_CALLBACK_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(A5.NT_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(A5.NT_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.NT_INSTANCE_LOAD_ERROR.b()));
        this.J.add(Integer.valueOf(A5.NT_INSTANCE_SHOW.b()));
    }
}
