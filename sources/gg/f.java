package gg;

import jg.e0;
import jg.h0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f72801a = new l(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f72802b = h0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f72803c = h0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e0 f72804d = new e0("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e0 f72805e = new e0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e0 f72806f = new e0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e0 f72807g = new e0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final e0 f72808h = new e0("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final e0 f72809i = new e0("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e0 f72810j = new e0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final e0 f72811k = new e0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final e0 f72812l = new e0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final e0 f72813m = new e0("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final e0 f72814n = new e0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final e0 f72815o = new e0("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final e0 f72816p = new e0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final e0 f72817q = new e0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final e0 f72818r = new e0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final e0 f72819s = new e0("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f72820b = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final l a(long j10, l lVar) {
            return f.x(j10, lVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).longValue(), (l) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(CancellableContinuation cancellableContinuation, Object obj, Function3 function3) {
        Object objB = cancellableContinuation.B(obj, null, function3);
        if (objB == null) {
            return false;
        }
        cancellableContinuation.u(objB);
        return true;
    }

    static /* synthetic */ boolean C(CancellableContinuation cancellableContinuation, Object obj, Function3 function3, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            function3 = null;
        }
        return B(cancellableContinuation, obj, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l x(long j10, l lVar) {
        return new l(j10, lVar, lVar.y(), 0);
    }

    public static final KFunction y() {
        return a.f72820b;
    }

    public static final e0 z() {
        return f72812l;
    }
}
