package yads;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nd1 {
    public static final zt2 a(gr2 gr2Var) {
        return Build.VERSION.SDK_INT >= 24 ? rf.a(gr2Var) : new cu2(gr2Var);
    }
}
