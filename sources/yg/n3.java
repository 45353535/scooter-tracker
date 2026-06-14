package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class n3 extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n3 f119037c = new n3();

    private n3() {
        super(vg.a.I(lf.v.f94232c));
    }

    @Override // yg.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((lf.w) obj).t());
    }

    @Override // yg.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((lf.w) obj).t());
    }

    @Override // yg.o2
    public /* bridge */ /* synthetic */ Object r() {
        return lf.w.a(w());
    }

    @Override // yg.o2
    public /* bridge */ /* synthetic */ void u(xg.f fVar, Object obj, int i10) {
        z(fVar, ((lf.w) obj).t(), i10);
    }

    protected int v(long[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return lf.w.n(collectionSize);
    }

    protected long[] w() {
        return lf.w.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, m3 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(lf.v.c(decoder.l(getDescriptor(), i10).h()));
    }

    protected m3 y(long[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new m3(toBuilder, null);
    }

    protected void z(xg.f encoder, long[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.x(getDescriptor(), i11).A(lf.w.l(content, i11));
        }
    }
}
