package yads;

import android.media.MediaDrmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class uj0 implements km0 {
    @Override // yads.km0
    public final void a(nc0 nc0Var) {
    }

    @Override // yads.km0
    public final int b() {
        return 1;
    }

    @Override // yads.km0
    public final byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // yads.km0
    public final w10 d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // yads.km0
    public final void release() {
    }

    @Override // yads.km0
    public /* synthetic */ void a(byte[] bArr, wc2 wc2Var) {
        jh.a(this, bArr, wc2Var);
    }

    @Override // yads.km0
    public final void b(byte[] bArr) {
    }

    @Override // yads.km0
    public final void c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // yads.km0
    public final gm0 a(byte[] bArr, List list, int i10, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // yads.km0
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // yads.km0
    public final jm0 a() {
        throw new IllegalStateException();
    }

    @Override // yads.km0
    public final Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // yads.km0
    public final boolean a(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // yads.km0
    public final void a(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }
}
