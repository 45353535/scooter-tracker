package yads;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class bs1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cs1 f109087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f109088c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs1(cs1 cs1Var, Map map) {
        super(1);
        this.f109087b = cs1Var;
        this.f109088c = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #1 {Exception -> 0x003d, blocks: (B:3:0x0010, B:13:0x002a, B:23:0x003a, B:21:0x0036, B:22:0x0039, B:6:0x0017, B:8:0x001b, B:12:0x0026, B:19:0x0034), top: B:30:0x0010, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r9) {
        /*
            r8 = this;
            yads.km2 r9 = (yads.km2) r9
            yads.cs1 r0 = r8.f109087b
            java.util.Map r1 = r8.f109088c
            yads.j01 r1 = r0.b(r9, r1)
            yads.k01 r0 = r0.f109556c
            r0.getClass()
            r2 = 0
            java.io.InputStream r0 = r1.f112211d     // Catch: java.lang.Exception -> L3d
            r3 = 0
            if (r0 == 0) goto L17
        L15:
            r4 = r0
            goto L24
        L17:
            byte[] r0 = r1.f112212e     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L23
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> L3d
            byte[] r4 = r1.f112212e     // Catch: java.lang.Exception -> L3d
            r0.<init>(r4)     // Catch: java.lang.Exception -> L3d
            goto L15
        L23:
            r4 = r3
        L24:
            if (r4 == 0) goto L3a
            byte[] r0 = uf.b.c(r4)     // Catch: java.lang.Throwable -> L32
            uf.c.a(r4, r3)     // Catch: java.lang.Exception -> L3d
            if (r0 != 0) goto L30
            goto L3a
        L30:
            r4 = r0
            goto L40
        L32:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            uf.c.a(r4, r3)     // Catch: java.lang.Exception -> L3d
            throw r0     // Catch: java.lang.Exception -> L3d
        L3a:
            byte[] r0 = new byte[r2]     // Catch: java.lang.Exception -> L3d
            goto L30
        L3d:
            byte[] r0 = new byte[r2]
            goto L30
        L40:
            yads.j01 r0 = new yads.j01
            int r3 = r1.f112208a
            java.util.List r1 = r1.f112209b
            java.util.List r1 = j$.util.DesugarCollections.unmodifiableList(r1)
            r0.<init>(r3, r1, r4)
            yads.r62 r2 = new yads.r62
            java.util.List r6 = j$.util.DesugarCollections.unmodifiableList(r1)
            java.util.Map r5 = yads.r62.a(r6)
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            long r3 = java.lang.System.currentTimeMillis()
            yads.qm2.a(r3, r9, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bs1.invoke(java.lang.Object):java.lang.Object");
    }
}
