package r9;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import q9.c0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class g {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f99322a;

        private b(e eVar, d dVar) throws c {
            int i10 = dVar.f99323a;
            q9.a.a(i10 == 6 || i10 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f99324b.remaining())];
            dVar.f99324b.asReadOnlyBuffer().get(bArr);
            c0 c0Var = new c0(bArr);
            g.f(eVar.f99325a);
            if (c0Var.g()) {
                this.f99322a = false;
                return;
            }
            int iH = c0Var.h(2);
            boolean zG = c0Var.g();
            g.f(eVar.f99326b);
            if (!zG) {
                this.f99322a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : c0Var.g();
            c0Var.q();
            g.f(!eVar.f99328d);
            if (c0Var.g()) {
                g.f(!eVar.f99329e);
                c0Var.q();
            }
            g.f(eVar.f99327c);
            if (iH != 3) {
                c0Var.q();
            }
            c0Var.r(eVar.f99330f);
            if (iH != 2 && iH != 0 && !zG2) {
                c0Var.r(3);
            }
            this.f99322a = ((iH == 3 || iH == 0) ? 255 : c0Var.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f99322a;
        }
    }

    private static class c extends Exception {
        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f99324b;

        private d(int i10, ByteBuffer byteBuffer) {
            this.f99323a = i10;
            this.f99324b = byteBuffer;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f99327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f99328d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f99329e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f99330f;

        private e(d dVar) throws c {
            q9.a.a(dVar.f99323a == 1);
            byte[] bArr = new byte[dVar.f99324b.remaining()];
            dVar.f99324b.asReadOnlyBuffer().get(bArr);
            c0 c0Var = new c0(bArr);
            c0Var.r(4);
            boolean zG = c0Var.g();
            this.f99325a = zG;
            g.f(zG);
            if (c0Var.g()) {
                b(c0Var);
                boolean zG2 = c0Var.g();
                this.f99326b = zG2;
                if (zG2) {
                    c0Var.r(47);
                }
            } else {
                this.f99326b = false;
            }
            boolean zG3 = c0Var.g();
            int iH = c0Var.h(5);
            for (int i10 = 0; i10 <= iH; i10++) {
                c0Var.r(12);
                if (c0Var.h(5) > 7) {
                    c0Var.q();
                }
                g.f(this.f99326b);
                if (zG3 && c0Var.g()) {
                    c0Var.r(4);
                }
            }
            int iH2 = c0Var.h(4);
            int iH3 = c0Var.h(4);
            c0Var.r(iH2 + 1);
            c0Var.r(iH3 + 1);
            boolean zG4 = c0Var.g();
            this.f99327c = zG4;
            g.f(zG4);
            c0Var.r(3);
            c0Var.r(4);
            boolean zG5 = c0Var.g();
            if (zG5) {
                c0Var.r(2);
            }
            if (c0Var.g()) {
                this.f99328d = true;
            } else {
                this.f99328d = c0Var.g();
            }
            if (!this.f99328d || c0Var.g()) {
                this.f99329e = true;
            } else {
                this.f99329e = c0Var.g();
            }
            if (zG5) {
                this.f99330f = c0Var.h(3) + 1;
            } else {
                this.f99330f = 0;
            }
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(c0 c0Var) {
            c0Var.r(64);
            if (c0Var.g()) {
                g.d(c0Var);
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & Ascii.DEL) << (i11 * 7);
            if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                return i10;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(c0 c0Var) {
        int i10 = 0;
        while (!c0Var.g()) {
            i10++;
        }
        if (i10 < 32) {
            c0Var.r(i10);
        }
    }

    public static List e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b10 = byteBufferAsReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iC = ((b10 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
            arrayList.add(new d(i10, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z10) throws c {
        if (z10) {
            throw new c();
        }
    }
}
