package mg;

import jg.e0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function3 f94905a = a.f94911b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e0 f94906b = new e0("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e0 f94907c = new e0("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final e0 f94908d = new e0("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e0 f94909e = new e0("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e0 f94910f = new e0("PARAM_CLAUSE_0");

    static final class a implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f94911b = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l a(int i10) {
        if (i10 == 0) {
            return l.f94912b;
        }
        if (i10 == 1) {
            return l.f94913c;
        }
        if (i10 == 2) {
            return l.f94914d;
        }
        if (i10 == 3) {
            return l.f94915e;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    public static final e0 i() {
        return f94910f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(CancellableContinuation cancellableContinuation, Function3 function3) {
        Object objB = cancellableContinuation.B(Unit.f93236a, null, function3);
        if (objB == null) {
            return false;
        }
        cancellableContinuation.u(objB);
        return true;
    }
}
