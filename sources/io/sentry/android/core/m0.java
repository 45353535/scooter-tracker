package io.sentry.android.core;

import io.sentry.n0;
import io.sentry.v7;

/* JADX INFO: loaded from: classes3.dex */
final class m0 implements io.sentry.transport.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f82666a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82667a;

        static {
            int[] iArr = new int[n0.a.values().length];
            f82667a = iArr;
            try {
                iArr[n0.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82667a[n0.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82667a[n0.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    m0(v7 v7Var) {
        this.f82666a = v7Var;
    }

    boolean a(n0.a aVar) {
        int i10 = a.f82667a[aVar.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // io.sentry.transport.s
    public boolean isConnected() {
        return a(this.f82666a.getConnectionStatusProvider().A());
    }
}
