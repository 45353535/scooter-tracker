package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class in2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ln2 f112064a;

    public in2(ln2 ln2Var) {
        this.f112064a = ln2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        this.f112064a.a();
    }
}
