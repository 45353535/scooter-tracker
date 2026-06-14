package ua;

import n9.x;
import oa.s0;
import q9.d0;

/* JADX INFO: loaded from: classes12.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final s0 f105357a;

    public static final class a extends x {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected e(s0 s0Var) {
        this.f105357a = s0Var;
    }

    public final boolean a(d0 d0Var, long j10) {
        return b(d0Var) && c(d0Var, j10);
    }

    protected abstract boolean b(d0 d0Var);

    protected abstract boolean c(d0 d0Var, long j10);
}
