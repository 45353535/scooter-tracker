package aa;

import android.text.TextUtils;
import io.bidmachine.media3.common.a;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lb.t;
import lb.u;
import n9.x;
import oa.l0;
import oa.m0;
import oa.q;
import oa.r;
import oa.s;
import oa.s0;
import q9.d0;
import q9.j0;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f4165i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f4166j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j0 f4168b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t.a f4170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private oa.t f4172f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f4174h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f4169c = new d0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f4173g = new byte[1024];

    public k(String str, j0 j0Var, t.a aVar, boolean z10) {
        this.f4167a = str;
        this.f4168b = j0Var;
        this.f4170d = aVar;
        this.f4171e = z10;
    }

    private s0 d(long j10) {
        s0 s0VarTrack = this.f4172f.track(0, 3);
        s0VarTrack.f(new a.b().u0("text/vtt").j0(this.f4167a).y0(j10).N());
        this.f4172f.endTracks();
        return s0VarTrack;
    }

    private void e() throws x {
        d0 d0Var = new d0(this.f4173g);
        ub.h.e(d0Var);
        long jH = 0;
        long jD = 0;
        for (String strS = d0Var.s(); !TextUtils.isEmpty(strS); strS = d0Var.s()) {
            if (strS.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f4165i.matcher(strS);
                if (!matcher.find()) {
                    throw x.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strS, null);
                }
                Matcher matcher2 = f4166j.matcher(strS);
                if (!matcher2.find()) {
                    throw x.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strS, null);
                }
                jD = ub.h.d((String) q9.a.e(matcher.group(1)));
                jH = j0.h(Long.parseLong((String) q9.a.e(matcher2.group(1))));
            }
        }
        Matcher matcherA = ub.h.a(d0Var);
        if (matcherA == null) {
            d(0L);
            return;
        }
        long jD2 = ub.h.d((String) q9.a.e(matcherA.group(1)));
        long jB = this.f4168b.b(j0.l((jH + jD2) - jD));
        s0 s0VarD = d(jB - jD2);
        this.f4169c.U(this.f4173g, this.f4174h);
        s0VarD.c(this.f4169c, this.f4174h);
        s0VarD.e(jB, 1, this.f4174h, 0, null);
    }

    @Override // oa.r
    public int a(s sVar, l0 l0Var) throws x {
        q9.a.e(this.f4172f);
        int length = (int) sVar.getLength();
        int i10 = this.f4174h;
        byte[] bArr = this.f4173g;
        if (i10 == bArr.length) {
            this.f4173g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f4173g;
        int i11 = this.f4174h;
        int i12 = sVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f4174h + i12;
            this.f4174h = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        e();
        return -1;
    }

    @Override // oa.r
    public void b(oa.t tVar) {
        if (this.f4171e) {
            tVar = new u(tVar, this.f4170d);
        }
        this.f4172f = tVar;
        tVar.e(new m0.b(-9223372036854775807L));
    }

    @Override // oa.r
    public boolean c(s sVar) {
        sVar.peekFully(this.f4173g, 0, 6, false);
        this.f4169c.U(this.f4173g, 6);
        if (ub.h.b(this.f4169c)) {
            return true;
        }
        sVar.peekFully(this.f4173g, 6, 3, false);
        this.f4169c.U(this.f4173g, 9);
        return ub.h.b(this.f4169c);
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // oa.r
    public void release() {
    }
}
