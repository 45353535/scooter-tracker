package ca;

import android.graphics.Bitmap;
import ca.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import n9.w;
import n9.x;
import q9.o0;
import t9.h;
import u9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements ca.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f6619o;

    /* JADX INFO: renamed from: ca.a$a, reason: collision with other inner class name */
    class C0147a extends e {
        C0147a() {
        }

        @Override // t9.g
        public void l() {
            a.this.o(this);
        }
    }

    public interface b {
        Bitmap decode(byte[] bArr, int i10);
    }

    public static final class c implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f6621b = new b() { // from class: ca.b
            @Override // ca.a.b
            public final Bitmap decode(byte[] bArr, int i10) {
                return a.w(bArr, i10);
            }
        };

        @Override // ca.c.a
        public int a(io.bidmachine.media3.common.a aVar) {
            String str = aVar.f80561o;
            return (str == null || !w.q(str)) ? j0.a(0) : o0.E0(aVar.f80561o) ? j0.a(4) : j0.a(1);
        }

        @Override // ca.c.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a createImageDecoder() {
            return new a(this.f6621b, null);
        }
    }

    /* synthetic */ a(b bVar, C0147a c0147a) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap w(byte[] bArr, int i10) throws d {
        try {
            return s9.c.a(bArr, i10, null, -1);
        } catch (x e10) {
            throw new d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new d(e11);
        }
    }

    @Override // t9.h
    protected t9.f d() {
        return new t9.f(1);
    }

    @Override // t9.h, t9.d, ca.c
    public /* bridge */ /* synthetic */ e dequeueOutputBuffer() {
        return (e) super.dequeueOutputBuffer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public e e() {
        return new C0147a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.h
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public d f(Throwable th2) {
        return new d("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t9.h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public d g(t9.f fVar, e eVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) q9.a.e(fVar.f104988e);
            q9.a.g(byteBuffer.hasArray());
            q9.a.a(byteBuffer.arrayOffset() == 0);
            eVar.f6623f = this.f6619o.decode(byteBuffer.array(), byteBuffer.remaining());
            eVar.f104996c = fVar.f104990g;
            return null;
        } catch (d e10) {
            return e10;
        }
    }

    private a(b bVar) {
        super(new t9.f[1], new e[1]);
        this.f6619o = bVar;
    }
}
