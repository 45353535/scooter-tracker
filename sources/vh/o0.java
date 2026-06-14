package vh;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.c0;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f106885i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c0 f106886j = c0.a.e(c0.f106805c, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c0 f106887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f106888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f106889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f106890h;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o0(c0 zipPath, l fileSystem, Map entries, String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f106887e = zipPath;
        this.f106888f = fileSystem;
        this.f106889g = entries;
        this.f106890h = str;
    }

    private final c0 t(c0 c0Var) {
        return f106886j.m(c0Var, true);
    }

    private final List u(c0 c0Var, boolean z10) throws IOException {
        wh.i iVar = (wh.i) this.f106889g.get(t(c0Var));
        if (iVar != null) {
            return CollectionsKt.toList(iVar.b());
        }
        if (!z10) {
            return null;
        }
        throw new IOException("not a directory: " + c0Var);
    }

    @Override // vh.l
    public j0 b(c0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.l
    public void c(c0 source, c0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.l
    public void g(c0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.l
    public void i(c0 path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.l
    public List k(c0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List listU = u(dir, true);
        Intrinsics.checkNotNull(listU);
        return listU;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x007c, blocks: (B:13:0x0053, B:33:0x0083, B:39:0x008f, B:28:0x0078, B:24:0x0072, B:14:0x005f), top: B:58:0x0053, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007c, blocks: (B:13:0x0053, B:33:0x0083, B:39:0x008f, B:28:0x0078, B:24:0x0072, B:14:0x005f), top: B:58:0x0053, inners: #1, #5 }] */
    @Override // vh.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vh.k m(vh.c0 r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            vh.c0 r14 = r13.t(r14)
            java.util.Map r0 = r13.f106889g
            java.lang.Object r14 = r0.get(r14)
            wh.i r14 = (wh.i) r14
            r1 = 0
            if (r14 != 0) goto L15
            return r1
        L15:
            vh.k r2 = new vh.k
            boolean r0 = r14.h()
            r3 = r0 ^ 1
            boolean r4 = r14.h()
            boolean r0 = r14.h()
            if (r0 == 0) goto L29
            r6 = r1
            goto L32
        L29:
            long r5 = r14.g()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r6 = r0
        L32:
            java.lang.Long r8 = r14.e()
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            long r3 = r14.f()
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L4b
            return r2
        L4b:
            vh.l r0 = r13.f106888f
            vh.c0 r3 = r13.f106887e
            vh.j r3 = r0.n(r3)
            long r4 = r14.f()     // Catch: java.lang.Throwable -> L7c
            vh.l0 r14 = r3.R(r4)     // Catch: java.lang.Throwable -> L7c
            vh.g r14 = vh.x.d(r14)     // Catch: java.lang.Throwable -> L7c
            vh.k r2 = wh.j.h(r14, r2)     // Catch: java.lang.Throwable -> L6e
            if (r14 == 0) goto L6c
            r14.close()     // Catch: java.lang.Throwable -> L69
            goto L6c
        L69:
            r0 = move-exception
            r14 = r0
            goto L81
        L6c:
            r14 = r1
            goto L81
        L6e:
            r0 = move-exception
            r2 = r0
            if (r14 == 0) goto L7f
            r14.close()     // Catch: java.lang.Throwable -> L76
            goto L7f
        L76:
            r0 = move-exception
            r14 = r0
            lf.c.a(r2, r14)     // Catch: java.lang.Throwable -> L7c
            goto L7f
        L7c:
            r0 = move-exception
            r14 = r0
            goto L90
        L7f:
            r14 = r2
            r2 = r1
        L81:
            if (r14 != 0) goto L8f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L9c
            r3.close()     // Catch: java.lang.Throwable -> L8c
            goto L9c
        L8c:
            r0 = move-exception
            r1 = r0
            goto L9c
        L8f:
            throw r14     // Catch: java.lang.Throwable -> L7c
        L90:
            if (r3 == 0) goto L9a
            r3.close()     // Catch: java.lang.Throwable -> L96
            goto L9a
        L96:
            r0 = move-exception
            lf.c.a(r14, r0)
        L9a:
            r2 = r1
            r1 = r14
        L9c:
            if (r1 != 0) goto La2
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            return r2
        La2:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.o0.m(vh.c0):vh.k");
    }

    @Override // vh.l
    public j n(c0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // vh.l
    public j p(c0 file, boolean z10, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // vh.l
    public j0 r(c0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // vh.l
    public l0 s(c0 file) throws Throwable {
        g gVarD;
        Intrinsics.checkNotNullParameter(file, "file");
        wh.i iVar = (wh.i) this.f106889g.get(t(file));
        if (iVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        j jVarN = this.f106888f.n(this.f106887e);
        Throwable th2 = null;
        try {
            gVarD = x.d(jVarN.R(iVar.f()));
            if (jVarN != null) {
                try {
                    jVarN.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
        } catch (Throwable th4) {
            if (jVarN != null) {
                try {
                    jVarN.close();
                } catch (Throwable th5) {
                    lf.c.a(th4, th5);
                }
            }
            gVarD = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(gVarD);
        wh.j.k(gVarD);
        return iVar.d() == 0 ? new wh.g(gVarD, iVar.g(), true) : new wh.g(new s(new wh.g(gVarD, iVar.c(), true), new Inflater(true)), iVar.g(), false);
    }
}
