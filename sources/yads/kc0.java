package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class kc0 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mc0 f112676a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc0(mc0 mc0Var, Looper looper) {
        super(looper);
        this.f112676a = mc0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            this.f112676a.a(obj, obj2);
            return;
        }
        mc0 mc0Var = this.f112676a;
        if (obj == mc0Var.f113424x) {
            if (mc0Var.f113415o == 2 || mc0Var.f()) {
                mc0Var.f113424x = null;
                if (obj2 instanceof Exception) {
                    ((rc0) mc0Var.f113403c).a((Exception) obj2, false);
                    return;
                }
                try {
                    mc0Var.f113402b.c((byte[]) obj2);
                    rc0 rc0Var = (rc0) mc0Var.f113403c;
                    rc0Var.f115401b = null;
                    y31 y31VarA = y31.a((Collection) rc0Var.f115400a);
                    rc0Var.f115400a.clear();
                    v31 v31VarListIterator = y31VarA.listIterator(0);
                    while (v31VarListIterator.hasNext()) {
                        mc0 mc0Var2 = (mc0) v31VarListIterator.next();
                        if (mc0Var2.g()) {
                            mc0Var2.a(true);
                        }
                    }
                } catch (Exception e10) {
                    ((rc0) mc0Var.f113403c).a(e10, true);
                }
            }
        }
    }
}
