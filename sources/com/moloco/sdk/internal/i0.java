package com.moloco.sdk.internal;

/* JADX INFO: loaded from: classes10.dex */
public interface i0 {

    public static final class a {
        public static /* synthetic */ boolean a(i0 i0Var, String str, long j10, d0 d0Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 4) != 0) {
                d0Var = null;
            }
            return i0Var.a(str, j10, d0Var);
        }
    }

    boolean a(String str, long j10, d0 d0Var);
}
