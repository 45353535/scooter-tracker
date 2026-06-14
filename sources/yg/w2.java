package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w2 f119092c = new w2();

    private w2() {
        super(vg.a.D(kotlin.jvm.internal.y0.f93336a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, v2 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.F(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public v2 k(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return new v2(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(xg.f encoder, short[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.u(getDescriptor(), i11, content[i11]);
        }
    }
}
