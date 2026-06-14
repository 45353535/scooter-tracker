package gb;

import androidx.collection.SieveCacheKt;
import java.util.ArrayDeque;
import n9.x;
import oa.s;

/* JADX INFO: loaded from: classes12.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f72638a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f72639b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f72640c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gb.b f72641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f72642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f72643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f72644g;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f72645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f72646b;

        private b(int i10, long j10) {
            this.f72645a = i10;
            this.f72646b = j10;
        }
    }

    private long c(s sVar) {
        sVar.resetPeekPosition();
        while (true) {
            sVar.peekFully(this.f72638a, 0, 4);
            int iC = g.c(this.f72638a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f72638a, iC, false);
                if (this.f72641d.isLevel1Element(iA)) {
                    sVar.skipFully(iC);
                    return iA;
                }
            }
            sVar.skipFully(1);
        }
    }

    private double d(s sVar, int i10) {
        return i10 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(sVar, i10));
    }

    private long e(s sVar, int i10) {
        sVar.readFully(this.f72638a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f72638a[i11] & 255));
        }
        return j10;
    }

    private static String f(s sVar, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        sVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // gb.c
    public boolean a(s sVar) throws x {
        q9.a.i(this.f72641d);
        while (true) {
            b bVar = (b) this.f72639b.peek();
            if (bVar != null && sVar.getPosition() >= bVar.f72646b) {
                this.f72641d.endMasterElement(((b) this.f72639b.pop()).f72645a);
                return true;
            }
            if (this.f72642e == 0) {
                long jD = this.f72640c.d(sVar, true, false, 4);
                if (jD == -2) {
                    jD = c(sVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f72643f = (int) jD;
                this.f72642e = 1;
            }
            if (this.f72642e == 1) {
                this.f72644g = this.f72640c.d(sVar, false, true, 8);
                this.f72642e = 2;
            }
            int elementType = this.f72641d.getElementType(this.f72643f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = sVar.getPosition();
                    this.f72639b.push(new b(this.f72643f, this.f72644g + position));
                    this.f72641d.startMasterElement(this.f72643f, position, this.f72644g);
                    this.f72642e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f72644g;
                    if (j10 <= 8) {
                        this.f72641d.integerElement(this.f72643f, e(sVar, (int) j10));
                        this.f72642e = 0;
                        return true;
                    }
                    throw x.a("Invalid integer size: " + this.f72644g, null);
                }
                if (elementType == 3) {
                    long j11 = this.f72644g;
                    if (j11 <= SieveCacheKt.NodeLinkMask) {
                        this.f72641d.stringElement(this.f72643f, f(sVar, (int) j11));
                        this.f72642e = 0;
                        return true;
                    }
                    throw x.a("String element size: " + this.f72644g, null);
                }
                if (elementType == 4) {
                    this.f72641d.a(this.f72643f, (int) this.f72644g, sVar);
                    this.f72642e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw x.a("Invalid element type " + elementType, null);
                }
                long j12 = this.f72644g;
                if (j12 == 4 || j12 == 8) {
                    this.f72641d.floatElement(this.f72643f, d(sVar, (int) j12));
                    this.f72642e = 0;
                    return true;
                }
                throw x.a("Invalid float size: " + this.f72644g, null);
            }
            sVar.skipFully((int) this.f72644g);
            this.f72642e = 0;
        }
    }

    @Override // gb.c
    public void b(gb.b bVar) {
        this.f72641d = bVar;
    }

    @Override // gb.c
    public void reset() {
        this.f72642e = 0;
        this.f72639b.clear();
        this.f72640c.e();
    }
}
