package lb;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public abstract class j extends t9.h implements l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f94099o;

    class a extends q {
        a() {
        }

        @Override // t9.g
        public void l() {
            j.this.o(this);
        }
    }

    protected j(String str) {
        super(new p[2], new q[2]);
        this.f94099o = str;
        r(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return new p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final q e() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.h
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final m f(Throwable th2) {
        return new m("Unexpected decode error", th2);
    }

    protected abstract k w(byte[] bArr, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final m g(p pVar, q qVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) q9.a.e(pVar.f104988e);
            qVar.m(pVar.f104990g, w(byteBuffer.array(), byteBuffer.limit(), z10), pVar.f94115k);
            qVar.f104998e = false;
            return null;
        } catch (m e10) {
            return e10;
        }
    }

    @Override // lb.l
    public void setPositionUs(long j10) {
    }
}
