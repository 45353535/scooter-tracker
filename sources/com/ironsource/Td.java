package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: loaded from: classes8.dex */
public class Td extends AbstractC4511r3 {
    private static Td R;
    private String P;
    private final M8 Q = Ib.U().s();

    private Td() {
        this.H = "outcome";
        this.G = 3;
        this.I = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.P = "";
    }

    public static synchronized Td i() {
        try {
            if (R == null) {
                Td td2 = new Td();
                R = td2;
                td2.e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return R;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected int c(C4649z5 c4649z5) {
        return this.Q.a(IronSource.a.REWARDED_VIDEO);
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean d(C4649z5 c4649z5) {
        int iC = c4649z5.c();
        return iC == A5.FIRST_INSTANCE.b() || iC == A5.INIT_COMPLETE.b() || iC == A5.SDK_INIT_FAILED.b() || iC == A5.SDK_INIT_SUCCESS.b() || iC == A5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b() || iC == A5.RV_BUSINESS_INSTANCE_OPENED.b() || iC == A5.RV_INSTANCE_CLOSED.b() || iC == A5.RV_BUSINESS_INSTANCE_REWARDED.b() || iC == A5.RV_AUCTION_FAILED.b() || iC == A5.RV_AUCTION_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC4511r3
    protected String e(int i10) {
        return (i10 == 15 || (i10 >= 300 && i10 < 400)) ? this.P : "";
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void f(C4649z5 c4649z5) {
        if (c4649z5.c() == 15 || (c4649z5.c() >= 300 && c4649z5.c() < 400)) {
            this.P = c4649z5.b().optString("placement");
        }
    }

    @Override // com.ironsource.AbstractC4511r3
    protected boolean j(C4649z5 c4649z5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4511r3
    protected void d() {
        this.J.add(Integer.valueOf(A5.RV_BUSINESS_MEDIATION_LOAD.b()));
        this.J.add(Integer.valueOf(A5.RV_BUSINESS_INSTANCE_LOAD.b()));
        this.J.add(Integer.valueOf(A5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.RV_BUSINESS_MEDIATION_LOAD_SUCCESS.b()));
        this.J.add(Integer.valueOf(A5.RV_INSTANCE_LOAD_FAILED.b()));
        this.J.add(Integer.valueOf(A5.RV_INSTANCE_SHOW_CHANCE.b()));
        this.J.add(Integer.valueOf(A5.RV_INSTANCE_READY_TRUE.b()));
        this.J.add(Integer.valueOf(A5.RV_INSTANCE_READY_FALSE.b()));
        this.J.add(Integer.valueOf(A5.RV_INSTANCE_LOAD_FAILED_REASON.b()));
        this.J.add(Integer.valueOf(A5.RV_INSTANCE_LOAD_NO_FILL.b()));
        this.J.add(Integer.valueOf(A5.RV_MEDIATION_LOAD_ERROR.b()));
    }
}
