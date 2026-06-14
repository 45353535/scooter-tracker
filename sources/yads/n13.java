package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class n13 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o13 f113700a;

    public n13(o13 o13Var) {
        this.f113700a = o13Var;
    }

    public static void a(o13 o13Var) {
        int iB = o13.b(o13Var.f114154d, o13Var.f114157g);
        boolean zA = o13.a(o13Var.f114154d, o13Var.f114157g);
        if (o13Var.f114158h == iB && o13Var.f114159i == zA) {
            return;
        }
        o13Var.f114158h = iB;
        o13Var.f114159i = zA;
        ((sm0) o13Var.f114153c).a(zA, iB);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final o13 o13Var = this.f113700a;
        o13Var.f114152b.post(new Runnable() { // from class: yads.gq
            @Override // java.lang.Runnable
            public final void run() {
                n13.a(o13Var);
            }
        });
    }
}
