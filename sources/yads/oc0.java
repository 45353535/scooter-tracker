package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class oc0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc0 f114276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(tc0 tc0Var, Looper looper) {
        super(looper);
        this.f114276a = tc0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        for (mc0 mc0Var : this.f114276a.f116178m) {
            if (Arrays.equals(mc0Var.f113421u, bArr)) {
                if (message.what == 2 && mc0Var.f113405e == 0 && mc0Var.f113415o == 4) {
                    int i10 = w83.f117341a;
                    mc0Var.a(false);
                    return;
                }
                return;
            }
        }
    }
}
