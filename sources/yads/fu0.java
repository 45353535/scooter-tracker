package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class fu0 implements xo0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ap0 f110921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z43 f110922f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fr1 f110924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public nu0 f110925i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f110926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f110927k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public eu0 f110928l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f110929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f110930n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f110917a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w92 f110918b = new w92(0, new byte[32768]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f110919c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gu0 f110920d = new gu0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f110923g = 0;

    static {
        new cp0() { // from class: yads.u6
            @Override // yads.cp0
            public final xo0[] a() {
                return fu0.a();
            }

            @Override // yads.cp0
            public /* synthetic */ xo0[] a(Uri uri, Map map) {
                return f5.a(this, uri, map);
            }
        };
    }

    @Override // yads.xo0
    public final void a(ap0 ap0Var) {
        this.f110921e = ap0Var;
        this.f110922f = ap0Var.a(0, 1);
        ap0Var.a();
    }

    @Override // yads.xo0
    public final void release() {
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02c4  */
    @Override // yads.xo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.yo0 r29, yads.be2 r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.fu0.a(yads.yo0, yads.be2):int");
    }

    @Override // yads.xo0
    public final void a(long j10, long j11) {
        if (j10 == 0) {
            this.f110923g = 0;
        } else {
            eu0 eu0Var = this.f110928l;
            if (eu0Var != null) {
                eu0Var.a(j11);
            }
        }
        this.f110930n = j11 != 0 ? -1L : 0L;
        this.f110929m = 0;
        this.f110918b.c(0);
    }

    @Override // yads.xo0
    public final boolean a(yo0 yo0Var) throws Throwable {
        yc0 yc0Var = (yc0) yo0Var;
        fr1 fr1VarA = new h11().a(yc0Var, f11.f110580b);
        if (fr1VarA != null) {
            int length = fr1VarA.f110835b.length;
        }
        byte[] bArr = new byte[4];
        yc0Var.b(bArr, 0, 4, false);
        return ((((long) bArr[3]) & 255) | ((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8))) == 1716281667;
    }

    public static xo0[] a() {
        return new xo0[]{new fu0()};
    }
}
