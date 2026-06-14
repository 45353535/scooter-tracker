package gg;

import com.google.common.util.concurrent.h0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jg.b0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f72828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f72829g;

    public l(long j10, l lVar, e eVar, int i10) {
        super(j10, lVar, i10);
        this.f72828f = eVar;
        this.f72829g = new AtomicReferenceArray(f.f72802b * 2);
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f72829g;
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().m1((this.f85864d * ((long) f.f72802b)) + ((long) i10));
        }
        t();
    }

    public final Object D(int i10) {
        Object objA = A(i10);
        w(i10);
        return objA;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    @Override // jg.b0
    public int r() {
        return f.f72802b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r4 = y().f72786c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        jg.x.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // jg.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(int r4, java.lang.Throwable r5, kotlin.coroutines.CoroutineContext r6) {
        /*
            r3 = this;
            int r5 = gg.f.f72802b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.A(r4)
        Le:
            java.lang.Object r1 = r3.B(r4)
            boolean r2 = r1 instanceof eg.a2
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof gg.z
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            jg.e0 r2 = gg.f.j()
            if (r1 == r2) goto L62
            jg.e0 r2 = gg.f.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            jg.e0 r2 = gg.f.p()
            if (r1 == r2) goto Le
            jg.e0 r2 = gg.f.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            jg.e0 r4 = gg.f.f()
            if (r1 == r4) goto L99
            jg.e0 r4 = gg.f.f72804d
            if (r1 != r4) goto L40
            goto L99
        L40:
            jg.e0 r4 = gg.f.z()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.w(r4)
            if (r0 == 0) goto L99
            gg.e r4 = r3.y()
            kotlin.jvm.functions.Function1 r4 = r4.f72786c
            if (r4 == 0) goto L99
            jg.x.a(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            jg.e0 r2 = gg.f.j()
            goto L7e
        L7a:
            jg.e0 r2 = gg.f.i()
        L7e:
            boolean r1 = r3.v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.w(r4)
            r1 = r0 ^ 1
            r3.C(r4, r1)
            if (r0 == 0) goto L99
            gg.e r4 = r3.y()
            kotlin.jvm.functions.Function1 r4 = r4.f72786c
            if (r4 == 0) goto L99
            jg.x.a(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.l.s(int, java.lang.Throwable, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return h0.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f72828f;
        Intrinsics.checkNotNull(eVar);
        return eVar;
    }
}
