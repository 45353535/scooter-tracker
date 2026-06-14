package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class pz2 implements tk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f114819c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f114820d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rk f114821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public rk f114822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rk f114823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public rk f114824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f114825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public oz2 f114826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f114827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f114828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f114829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f114830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f114831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f114832p;

    public pz2() {
        rk rkVar = rk.f115468e;
        this.f114821e = rkVar;
        this.f114822f = rkVar;
        this.f114823g = rkVar;
        this.f114824h = rkVar;
        ByteBuffer byteBuffer = tk.f116269a;
        this.f114827k = byteBuffer;
        this.f114828l = byteBuffer.asShortBuffer();
        this.f114829m = byteBuffer;
        this.f114818b = -1;
    }

    @Override // yads.tk
    public final rk a(rk rkVar) throws sk {
        if (rkVar.f115471c != 2) {
            throw new sk(rkVar);
        }
        int i10 = this.f114818b;
        if (i10 == -1) {
            i10 = rkVar.f115469a;
        }
        this.f114821e = rkVar;
        rk rkVar2 = new rk(i10, rkVar.f115470b, 2);
        this.f114822f = rkVar2;
        this.f114825i = true;
        return rkVar2;
    }

    @Override // yads.tk
    public final void b() {
        int i10;
        oz2 oz2Var = this.f114826j;
        if (oz2Var != null) {
            int i11 = oz2Var.f114466k;
            float f10 = oz2Var.f114458c;
            float f11 = oz2Var.f114459d;
            int i12 = oz2Var.f114468m + ((int) ((((i11 / (f10 / f11)) + oz2Var.f114470o) / (oz2Var.f114460e * f11)) + 0.5f));
            oz2Var.f114465j = oz2Var.b(oz2Var.f114465j, i11, (oz2Var.f114463h * 2) + i11);
            int i13 = 0;
            while (true) {
                i10 = oz2Var.f114463h * 2;
                int i14 = oz2Var.f114457b;
                if (i13 >= i10 * i14) {
                    break;
                }
                oz2Var.f114465j[(i14 * i11) + i13] = 0;
                i13++;
            }
            oz2Var.f114466k = i10 + oz2Var.f114466k;
            oz2Var.a();
            if (oz2Var.f114468m > i12) {
                oz2Var.f114468m = i12;
            }
            oz2Var.f114466k = 0;
            oz2Var.f114473r = 0;
            oz2Var.f114470o = 0;
        }
        this.f114832p = true;
    }

    @Override // yads.tk
    public final boolean c() {
        if (!this.f114832p) {
            return false;
        }
        oz2 oz2Var = this.f114826j;
        return oz2Var == null || (oz2Var.f114468m * oz2Var.f114457b) * 2 == 0;
    }

    @Override // yads.tk
    public final void d() {
        this.f114819c = 1.0f;
        this.f114820d = 1.0f;
        rk rkVar = rk.f115468e;
        this.f114821e = rkVar;
        this.f114822f = rkVar;
        this.f114823g = rkVar;
        this.f114824h = rkVar;
        ByteBuffer byteBuffer = tk.f116269a;
        this.f114827k = byteBuffer;
        this.f114828l = byteBuffer.asShortBuffer();
        this.f114829m = byteBuffer;
        this.f114818b = -1;
        this.f114825i = false;
        this.f114826j = null;
        this.f114830n = 0L;
        this.f114831o = 0L;
        this.f114832p = false;
    }

    @Override // yads.tk
    public final void flush() {
        if (isActive()) {
            rk rkVar = this.f114821e;
            this.f114823g = rkVar;
            rk rkVar2 = this.f114822f;
            this.f114824h = rkVar2;
            if (this.f114825i) {
                this.f114826j = new oz2(rkVar.f115469a, rkVar.f115470b, this.f114819c, this.f114820d, rkVar2.f115469a);
            } else {
                oz2 oz2Var = this.f114826j;
                if (oz2Var != null) {
                    oz2Var.f114466k = 0;
                    oz2Var.f114468m = 0;
                    oz2Var.f114470o = 0;
                    oz2Var.f114471p = 0;
                    oz2Var.f114472q = 0;
                    oz2Var.f114473r = 0;
                    oz2Var.f114474s = 0;
                    oz2Var.f114475t = 0;
                    oz2Var.f114476u = 0;
                    oz2Var.f114477v = 0;
                }
            }
        }
        this.f114829m = tk.f116269a;
        this.f114830n = 0L;
        this.f114831o = 0L;
        this.f114832p = false;
    }

    @Override // yads.tk
    public final boolean isActive() {
        if (this.f114822f.f115469a != -1) {
            return Math.abs(this.f114819c - 1.0f) >= 1.0E-4f || Math.abs(this.f114820d - 1.0f) >= 1.0E-4f || this.f114822f.f115469a != this.f114821e.f115469a;
        }
        return false;
    }

    @Override // yads.tk
    public final ByteBuffer a() {
        int i10;
        oz2 oz2Var = this.f114826j;
        if (oz2Var != null && (i10 = oz2Var.f114468m * oz2Var.f114457b * 2) > 0) {
            if (this.f114827k.capacity() < i10) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                this.f114827k = byteBufferOrder;
                this.f114828l = byteBufferOrder.asShortBuffer();
            } else {
                this.f114827k.clear();
                this.f114828l.clear();
            }
            ShortBuffer shortBuffer = this.f114828l;
            int iMin = Math.min(shortBuffer.remaining() / oz2Var.f114457b, oz2Var.f114468m);
            shortBuffer.put(oz2Var.f114467l, 0, oz2Var.f114457b * iMin);
            int i11 = oz2Var.f114468m - iMin;
            oz2Var.f114468m = i11;
            short[] sArr = oz2Var.f114467l;
            int i12 = oz2Var.f114457b;
            System.arraycopy(sArr, iMin * i12, sArr, 0, i11 * i12);
            this.f114831o += (long) i10;
            this.f114827k.limit(i10);
            this.f114829m = this.f114827k;
        }
        ByteBuffer byteBuffer = this.f114829m;
        this.f114829m = tk.f116269a;
        return byteBuffer;
    }

    @Override // yads.tk
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            oz2 oz2Var = this.f114826j;
            oz2Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f114830n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = oz2Var.f114457b;
            int i11 = iRemaining2 / i10;
            short[] sArrB = oz2Var.b(oz2Var.f114465j, oz2Var.f114466k, i11);
            oz2Var.f114465j = sArrB;
            shortBufferAsShortBuffer.get(sArrB, oz2Var.f114466k * oz2Var.f114457b, ((i10 * i11) * 2) / 2);
            oz2Var.f114466k += i11;
            oz2Var.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }
}
