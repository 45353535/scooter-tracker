package yg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends o2 implements KSerializer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f119048c = new q();

    private q() {
        super(vg.a.y(kotlin.jvm.internal.p.f93319a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.w, yg.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(xg.d decoder, int i10, p builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.r(getDescriptor(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public p k(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new p(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yg.o2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(xg.f encoder, char[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.i(getDescriptor(), i11, content[i11]);
        }
    }
}
