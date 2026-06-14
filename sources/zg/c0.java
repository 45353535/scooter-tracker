package zg;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f119391a;

    public c0(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f119391a = new q(stream, Charsets.UTF_8);
    }

    @Override // zg.a0
    public int a(char[] buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return this.f119391a.d(buffer, i10, i11);
    }

    public final void b() {
        this.f119391a.e();
    }
}
