package ve;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 implements io.ktor.utils.io.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f106678b = new i1();

    private i1() {
    }

    @Override // io.ktor.utils.io.c0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1 n0(byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return w0.d(StringsKt.F(value));
    }

    @Override // io.ktor.utils.io.c0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] z(f1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return StringsKt.I(value.getUrlString());
    }
}
