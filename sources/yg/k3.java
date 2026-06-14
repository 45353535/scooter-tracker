package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class k3 extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k3 f119017c = new k3();

    private k3() {
        super(vg.a.H(lf.t.f94227c));
    }

    @Override // yg.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((lf.u) obj).t());
    }

    @Override // yg.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((lf.u) obj).t());
    }

    @Override // yg.o2
    public /* bridge */ /* synthetic */ Object r() {
        return lf.u.a(w());
    }

    @Override // yg.o2
    public /* bridge */ /* synthetic */ void u(xg.f fVar, Object obj, int i10) {
        z(fVar, ((lf.u) obj).t(), i10);
    }

    protected int v(int[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return lf.u.n(collectionSize);
    }

    protected int[] w() {
        return lf.u.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, j3 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(lf.t.c(decoder.l(getDescriptor(), i10).v()));
    }

    protected j3 y(int[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new j3(toBuilder, null);
    }

    protected void z(xg.f encoder, int[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.x(getDescriptor(), i11).t(lf.u.l(content, i11));
        }
    }
}
