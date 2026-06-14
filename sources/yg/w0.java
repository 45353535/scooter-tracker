package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f119090c = new w0();

    private w0() {
        super(vg.a.B(kotlin.jvm.internal.a0.f93281a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, v0 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.f(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public v0 k(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return new v0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(xg.f encoder, int[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.o(getDescriptor(), i11, content[i11]);
        }
    }
}
