package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class ru3 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ su3 f115613a = su3.f115957d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        su3 su3Var;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            su3 su3Var2 = this.f115613a;
            z10 = true;
            su3Var2.a(true, su3Var2.f115960c);
            su3Var = this.f115613a;
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            su3 su3Var3 = this.f115613a;
            z10 = false;
            su3Var3.a(false, su3Var3.f115960c);
            su3Var = this.f115613a;
        }
        su3Var.f115959b = z10;
    }
}
