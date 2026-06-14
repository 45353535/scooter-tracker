package vh;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f106832h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f106833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f106834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f106836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f106837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g0 f106838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0 f106839g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g0() {
        this.f106833a = new byte[8192];
        this.f106837e = true;
        this.f106836d = false;
    }

    public final void a() {
        int i10;
        g0 g0Var = this.f106839g;
        if (g0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(g0Var);
        if (g0Var.f106837e) {
            int i11 = this.f106835c - this.f106834b;
            g0 g0Var2 = this.f106839g;
            Intrinsics.checkNotNull(g0Var2);
            int i12 = 8192 - g0Var2.f106835c;
            g0 g0Var3 = this.f106839g;
            Intrinsics.checkNotNull(g0Var3);
            if (g0Var3.f106836d) {
                i10 = 0;
            } else {
                g0 g0Var4 = this.f106839g;
                Intrinsics.checkNotNull(g0Var4);
                i10 = g0Var4.f106834b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            g0 g0Var5 = this.f106839g;
            Intrinsics.checkNotNull(g0Var5);
            f(g0Var5, i11);
            b();
            h0.b(this);
        }
    }

    public final g0 b() {
        g0 g0Var = this.f106838f;
        if (g0Var == this) {
            g0Var = null;
        }
        g0 g0Var2 = this.f106839g;
        Intrinsics.checkNotNull(g0Var2);
        g0Var2.f106838f = this.f106838f;
        g0 g0Var3 = this.f106838f;
        Intrinsics.checkNotNull(g0Var3);
        g0Var3.f106839g = this.f106839g;
        this.f106838f = null;
        this.f106839g = null;
        return g0Var;
    }

    public final g0 c(g0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f106839g = this;
        segment.f106838f = this.f106838f;
        g0 g0Var = this.f106838f;
        Intrinsics.checkNotNull(g0Var);
        g0Var.f106839g = segment;
        this.f106838f = segment;
        return segment;
    }

    public final g0 d() {
        this.f106836d = true;
        return new g0(this.f106833a, this.f106834b, this.f106835c, true, false);
    }

    public final g0 e(int i10) {
        g0 g0VarC;
        if (i10 <= 0 || i10 > this.f106835c - this.f106834b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            g0VarC = d();
        } else {
            g0VarC = h0.c();
            byte[] bArr = this.f106833a;
            byte[] bArr2 = g0VarC.f106833a;
            int i11 = this.f106834b;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i11, i11 + i10, 2, (Object) null);
        }
        g0VarC.f106835c = g0VarC.f106834b + i10;
        this.f106834b += i10;
        g0 g0Var = this.f106839g;
        Intrinsics.checkNotNull(g0Var);
        g0Var.c(g0VarC);
        return g0VarC;
    }

    public final void f(g0 sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f106837e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f106835c;
        if (i11 + i10 > 8192) {
            if (sink.f106836d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f106834b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f106833a;
            ArraysKt.copyInto$default(bArr, bArr, 0, i12, i11, 2, (Object) null);
            sink.f106835c -= sink.f106834b;
            sink.f106834b = 0;
        }
        byte[] bArr2 = this.f106833a;
        byte[] bArr3 = sink.f106833a;
        int i13 = sink.f106835c;
        int i14 = this.f106834b;
        ArraysKt.copyInto(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f106835c += i10;
        this.f106834b += i10;
    }

    public g0(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f106833a = data;
        this.f106834b = i10;
        this.f106835c = i11;
        this.f106836d = z10;
        this.f106837e = z11;
    }
}
