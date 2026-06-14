package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f119020c = new l0();

    private l0() {
        super(vg.a.A(kotlin.jvm.internal.u.f93332a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, k0 builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.A(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public k0 k(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        return new k0(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(xg.f encoder, float[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.C(getDescriptor(), i11, content[i11]);
        }
    }
}
