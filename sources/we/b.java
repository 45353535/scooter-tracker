package we;

import com.google.android.material.internal.ViewUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;

/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f107912a = new ArrayList();

    static final class a extends j implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f107913r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f107914s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f107915t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f107916u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f107917v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private /* synthetic */ Object f107918w;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = b.this.new a(continuation);
            aVar.f107918w = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0040 -> B:12:0x004a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0054 -> B:21:0x0077). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:20:0x0072). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r9.f107917v
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L28
                if (r1 != r3) goto L20
                int r1 = r9.f107916u
                int r4 = r9.f107915t
                java.lang.Object r5 = r9.f107914s
                int[] r5 = (int[]) r5
                java.lang.Object r6 = r9.f107913r
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r9.f107918w
                kotlin.sequences.j r7 = (kotlin.sequences.j) r7
                kotlin.d.b(r10)
                goto L72
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                kotlin.d.b(r10)
                java.lang.Object r10 = r9.f107918w
                kotlin.sequences.j r10 = (kotlin.sequences.j) r10
                we.b r1 = we.b.this
                java.util.List r1 = we.b.a(r1)
                java.util.Iterator r1 = r1.iterator()
                r4 = r2
            L3a:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L7f
                java.lang.Object r5 = r1.next()
                int[] r5 = (int[]) r5
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r2
            L4a:
                int r7 = r6.length
                if (r1 >= r7) goto L7c
                we.b r7 = we.b.this
                int r7 = r7.c(r5)
                r8 = -1
                if (r7 == r8) goto L77
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.d(r5)
                r9.f107918w = r10
                r9.f107913r = r4
                r9.f107914s = r6
                r9.f107915t = r5
                r9.f107916u = r1
                r9.f107917v = r3
                java.lang.Object r7 = r10.b(r7, r9)
                if (r7 != r0) goto L6d
                return r0
            L6d:
                r7 = r6
                r6 = r4
                r4 = r5
                r5 = r7
                r7 = r10
            L72:
                r10 = r5
                r5 = r4
                r4 = r6
                r6 = r10
                r10 = r7
            L77:
                int r1 = r1 + 6
                int r5 = r5 + 6
                goto L4a
            L7c:
                r1 = r4
                r4 = r5
                goto L3a
            L7f:
                kotlin.Unit r10 = kotlin.Unit.f93236a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: we.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.j jVar, Continuation continuation) {
            return ((a) create(jVar, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public final int b() {
        return this.f107912a.size();
    }

    public final int c(int i10) {
        return ((int[]) this.f107912a.get(i10 / ViewUtils.EDGE_TO_EDGE_FLAGS))[i10 % ViewUtils.EDGE_TO_EDGE_FLAGS];
    }

    public final Sequence d() {
        return k.b(new a(null));
    }

    public final void e(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            this.f107912a.add(d.f107924a.h0());
        }
    }

    public final void f() {
        Iterator it = this.f107912a.iterator();
        while (it.hasNext()) {
            d.f107924a.O((int[]) it.next());
        }
        this.f107912a.clear();
    }

    public final void g(int i10, int i11) {
        ((int[]) this.f107912a.get(i10 / ViewUtils.EDGE_TO_EDGE_FLAGS))[i10 % ViewUtils.EDGE_TO_EDGE_FLAGS] = i11;
    }
}
