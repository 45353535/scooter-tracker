package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class rb2 implements c30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rb2 f115395a = new rb2();

    static {
        new b30() { // from class: yads.rk0
            @Override // yads.b30
            public final c30 a() {
                return new rb2();
            }
        };
    }

    @Override // yads.c30
    public final void a(e63 e63Var) {
    }

    @Override // yads.c30
    public /* synthetic */ Map c() {
        return s4.a(this);
    }

    @Override // yads.c30
    public final void close() {
    }

    @Override // yads.c30
    public final Uri e() {
        return null;
    }

    @Override // yads.c30
    public final long a(h30 h30Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // yads.y20
    public final int c(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
