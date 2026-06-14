package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class q3 extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q3 f119051c = new q3();

    private q3() {
        super(vg.a.J(lf.y.f94238c));
    }

    @Override // yg.a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((lf.z) obj).t());
    }

    @Override // yg.a
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((lf.z) obj).t());
    }

    @Override // yg.o2
    public /* bridge */ /* synthetic */ Object r() {
        return lf.z.a(w());
    }

    @Override // yg.o2
    public /* bridge */ /* synthetic */ void u(xg.f fVar, Object obj, int i10) {
        z(fVar, ((lf.z) obj).t(), i10);
    }

    protected int v(short[] collectionSize) {
        Intrinsics.checkNotNullParameter(collectionSize, "$this$collectionSize");
        return lf.z.n(collectionSize);
    }

    protected short[] w() {
        return lf.z.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, p3 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(lf.y.c(decoder.l(getDescriptor(), i10).m()));
    }

    protected p3 y(short[] toBuilder) {
        Intrinsics.checkNotNullParameter(toBuilder, "$this$toBuilder");
        return new p3(toBuilder, null);
    }

    protected void z(xg.f encoder, short[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.x(getDescriptor(), i11).l(lf.z.l(content, i11));
        }
    }
}
