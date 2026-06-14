package pg;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f98335h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f98336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f98337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f98339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f98340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m f98341f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m f98342g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ m a() {
            return new m(null);
        }

        public final /* synthetic */ m b(byte[] data, int i10, int i11, n nVar, boolean z10) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new m(data, i10, i11, nVar, z10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final m a() {
        int i10;
        m mVar = this.f98342g;
        if (mVar == null) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(mVar);
        if (mVar.f98340e) {
            int i11 = this.f98338c - this.f98337b;
            m mVar2 = this.f98342g;
            Intrinsics.checkNotNull(mVar2);
            int i12 = 8192 - mVar2.f98338c;
            m mVar3 = this.f98342g;
            Intrinsics.checkNotNull(mVar3);
            if (mVar3.i()) {
                i10 = 0;
            } else {
                m mVar4 = this.f98342g;
                Intrinsics.checkNotNull(mVar4);
                i10 = mVar4.f98337b;
            }
            if (i11 <= i12 + i10) {
                m mVar5 = this.f98342g;
                Intrinsics.checkNotNull(mVar5);
                y(mVar5, i11);
                if (l() != null) {
                    throw new IllegalStateException("Check failed.");
                }
                p.d(this);
                return mVar5;
            }
        }
        return this;
    }

    public final /* synthetic */ byte[] b(boolean z10) {
        return this.f98336a;
    }

    public final n c() {
        return this.f98339d;
    }

    public final /* synthetic */ int d() {
        return this.f98338c;
    }

    public final /* synthetic */ m e() {
        return this.f98341f;
    }

    public final /* synthetic */ int f() {
        return this.f98337b;
    }

    public final /* synthetic */ m g() {
        return this.f98342g;
    }

    public final int h() {
        return this.f98336a.length - this.f98338c;
    }

    public final boolean i() {
        n nVar = this.f98339d;
        if (nVar != null) {
            return nVar.b();
        }
        return false;
    }

    public final int j() {
        return this.f98338c - this.f98337b;
    }

    public final byte k(int i10) {
        return this.f98336a[this.f98337b + i10];
    }

    public final m l() {
        m mVar = this.f98341f;
        m mVar2 = this.f98342g;
        if (mVar2 != null) {
            Intrinsics.checkNotNull(mVar2);
            mVar2.f98341f = this.f98341f;
        }
        m mVar3 = this.f98341f;
        if (mVar3 != null) {
            Intrinsics.checkNotNull(mVar3);
            mVar3.f98342g = this.f98342g;
        }
        this.f98341f = null;
        this.f98342g = null;
        return mVar;
    }

    public final m m(m segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f98342g = this;
        segment.f98341f = this.f98341f;
        m mVar = this.f98341f;
        if (mVar != null) {
            Intrinsics.checkNotNull(mVar);
            mVar.f98342g = segment;
        }
        this.f98341f = segment;
        return segment;
    }

    public final byte n() {
        byte[] bArr = this.f98336a;
        int i10 = this.f98337b;
        this.f98337b = i10 + 1;
        return bArr[i10];
    }

    public final void o(byte[] dst, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i12 = i11 - i10;
        byte[] bArr = this.f98336a;
        int i13 = this.f98337b;
        ArraysKt.copyInto(bArr, dst, i10, i13, i13 + i12);
        this.f98337b += i12;
    }

    public final /* synthetic */ void p(int i10) {
        this.f98338c = i10;
    }

    public final /* synthetic */ void q(m mVar) {
        this.f98341f = mVar;
    }

    public final /* synthetic */ void r(int i10) {
        this.f98337b = i10;
    }

    public final /* synthetic */ void s(m mVar) {
        this.f98342g = mVar;
    }

    public final m t() {
        n nVarH = this.f98339d;
        if (nVarH == null) {
            nVarH = p.h();
            this.f98339d = nVarH;
        }
        n nVar = nVarH;
        byte[] bArr = this.f98336a;
        int i10 = this.f98337b;
        int i11 = this.f98338c;
        nVar.a();
        Unit unit = Unit.f93236a;
        return new m(bArr, i10, i11, nVar, false);
    }

    public final m u(int i10) {
        m mVarF;
        if (i10 <= 0 || i10 > this.f98338c - this.f98337b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            mVarF = t();
        } else {
            mVarF = p.f();
            byte[] bArr = this.f98336a;
            byte[] bArr2 = mVarF.f98336a;
            int i11 = this.f98337b;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i11, i11 + i10, 2, (Object) null);
        }
        mVarF.f98338c = mVarF.f98337b + i10;
        this.f98337b += i10;
        m mVar = this.f98342g;
        if (mVar != null) {
            Intrinsics.checkNotNull(mVar);
            mVar.m(mVarF);
            return mVarF;
        }
        mVarF.f98341f = this;
        this.f98342g = mVarF;
        return mVarF;
    }

    public final void v(byte[] src, int i10, int i11) {
        Intrinsics.checkNotNullParameter(src, "src");
        ArraysKt.copyInto(src, this.f98336a, this.f98338c, i10, i11);
        this.f98338c += i11 - i10;
    }

    public final /* synthetic */ void w(byte[] data, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public final void x(byte b10) {
        byte[] bArr = this.f98336a;
        int i10 = this.f98338c;
        this.f98338c = i10 + 1;
        bArr[i10] = b10;
    }

    public final void y(m sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f98340e) {
            throw new IllegalStateException("only owner can write");
        }
        if (sink.f98338c + i10 > 8192) {
            if (sink.i()) {
                throw new IllegalArgumentException();
            }
            int i11 = sink.f98338c;
            int i12 = sink.f98337b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f98336a;
            ArraysKt.copyInto$default(bArr, bArr, 0, i12, i11, 2, (Object) null);
            sink.f98338c -= sink.f98337b;
            sink.f98337b = 0;
        }
        byte[] bArr2 = this.f98336a;
        byte[] bArr3 = sink.f98336a;
        int i13 = sink.f98338c;
        int i14 = this.f98337b;
        ArraysKt.copyInto(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f98338c += i10;
        this.f98337b += i10;
    }

    public /* synthetic */ m(byte[] bArr, int i10, int i11, n nVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, i10, i11, nVar, z10);
    }

    private m() {
        this.f98336a = new byte[8192];
        this.f98340e = true;
        this.f98339d = null;
    }

    private m(byte[] bArr, int i10, int i11, n nVar, boolean z10) {
        this.f98336a = bArr;
        this.f98337b = i10;
        this.f98338c = i11;
        this.f98339d = nVar;
        this.f98340e = z10;
    }
}
