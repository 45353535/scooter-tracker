package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f118980c = new h1();

    private h1() {
        super(vg.a.C(kotlin.jvm.internal.c0.f93287a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] r() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, g1 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.e(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public g1 k(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return new g1(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(xg.f encoder, long[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.v(getDescriptor(), i11, content[i11]);
        }
    }
}
