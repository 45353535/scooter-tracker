package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class h3 extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h3 f118982c = new h3();

    private h3() {
        super(vg.a.G(lf.r.f94222c));
    }

    @Override // yg.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((lf.s) obj).t());
    }

    @Override // yg.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((lf.s) obj).t());
    }

    @Override // yg.o2
    public /* bridge */ /* synthetic */ Object r() {
        return lf.s.a(w());
    }

    @Override // yg.o2
    public /* bridge */ /* synthetic */ void u(xg.f fVar, Object obj, int i10) {
        z(fVar, ((lf.s) obj).t(), i10);
    }

    protected int v(byte[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return lf.s.n(collectionSize);
    }

    protected byte[] w() {
        return lf.s.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, g3 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(lf.r.c(decoder.l(getDescriptor(), i10).H()));
    }

    protected g3 y(byte[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new g3(toBuilder, null);
    }

    protected void z(xg.f encoder, byte[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.x(getDescriptor(), i11).e(lf.s.l(content, i11));
        }
    }
}
