package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class a72 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b72 f108592a;

    public a72(b72 b72Var) {
        this.f108592a = b72Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int iB = b72.b(context);
        if (w83.f117341a < 31 || iB != 5) {
            this.f108592a.a(iB);
        } else {
            y62.a(context, this.f108592a);
        }
    }
}
