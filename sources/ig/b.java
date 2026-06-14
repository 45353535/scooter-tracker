package ig;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d[] f74749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f74750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f74751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b0 f74752e;

    protected final d f() {
        d dVarI;
        b0 b0Var;
        synchronized (this) {
            try {
                d[] dVarArrJ = this.f74749b;
                if (dVarArrJ == null) {
                    dVarArrJ = j(2);
                    this.f74749b = dVarArrJ;
                } else if (this.f74750c >= dVarArrJ.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrJ, dVarArrJ.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f74749b = (d[]) objArrCopyOf;
                    dVarArrJ = (d[]) objArrCopyOf;
                }
                int i10 = this.f74751d;
                do {
                    dVarI = dVarArrJ[i10];
                    if (dVarI == null) {
                        dVarI = i();
                        dVarArrJ[i10] = dVarI;
                    }
                    i10++;
                    if (i10 >= dVarArrJ.length) {
                        i10 = 0;
                    }
                    Intrinsics.checkNotNull(dVarI, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarI.a(this));
                this.f74751d = i10;
                this.f74750c++;
                b0Var = this.f74752e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b0Var != null) {
            b0Var.Z(1);
        }
        return dVarI;
    }

    public final StateFlow h() {
        b0 b0Var;
        synchronized (this) {
            b0Var = this.f74752e;
            if (b0Var == null) {
                b0Var = new b0(this.f74750c);
                this.f74752e = b0Var;
            }
        }
        return b0Var;
    }

    protected abstract d i();

    protected abstract d[] j(int i10);

    protected final void k(d dVar) {
        b0 b0Var;
        int i10;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i11 = this.f74750c - 1;
                this.f74750c = i11;
                b0Var = this.f74752e;
                if (i11 == 0) {
                    this.f74751d = 0;
                }
                Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrB = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                Result.Companion companion = Result.f93230c;
                continuation.resumeWith(Result.b(Unit.f93236a));
            }
        }
        if (b0Var != null) {
            b0Var.Z(-1);
        }
    }

    protected final int l() {
        return this.f74750c;
    }

    protected final d[] m() {
        return this.f74749b;
    }
}
