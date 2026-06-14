package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2384Qx implements View.OnClickListener {
    public static String[] A04 = {"dOcdx", "8bjq9", "S62xmG9bLAzPQTe5DIuTVykAuxzH3OOO", "EFLmmctArUbvil4YjfVv5mcKtZGwqpiw", "pomIX56rypqB03AcIrSNKF", "mejemOmbs1cZK7MlHCtmuskixcqeH5iG", "45z4wnlhvnWTCVb", "bTLTNp7fFtJJ30XE5CJx6is"};
    public final /* synthetic */ Context A00;
    public final /* synthetic */ LinearLayout A01;
    public final /* synthetic */ C2980fx A02;
    public final /* synthetic */ C2363Qc A03;

    public ViewOnClickListenerC2384Qx(C2980fx c2980fx, C2363Qc c2363Qc, Context context, LinearLayout linearLayout) {
        this.A02 = c2980fx;
        this.A03 = c2363Qc;
        this.A00 = context;
        this.A01 = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2499Vl.A02(this)) {
            return;
        }
        try {
            this.A03.A1J();
            if (U7.A2S(this.A00)) {
                this.A01.performAccessibilityAction(128, null);
            }
        } catch (Throwable th2) {
            AbstractC2499Vl.A00(th2, this);
            String[] strArr = A04;
            if (strArr[0].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A04[3] = "4MuYgj3AagdEPQ2lSwdOEm9Gyp8HLE2k";
        }
    }
}
