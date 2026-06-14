package io.bidmachine.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.common.math.LongMath;
import ga.b0;
import ga.c0;
import ga.f0;
import ga.j;
import ga.n0;
import io.bidmachine.media3.exoplayer.dash.a;
import io.bidmachine.media3.exoplayer.dash.d;
import io.bidmachine.media3.exoplayer.dash.f;
import j$.util.DesugarTimeZone;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.k;
import ka.m;
import ka.o;
import ka.p;
import ka.q;
import ka.r;
import la.c;
import lb.t;
import n9.e0;
import n9.r;
import n9.s;
import n9.x;
import q9.o0;
import q9.u;
import s9.g;
import s9.k;
import s9.y;
import z9.l;
import z9.w;
import z9.z;

/* JADX INFO: loaded from: classes12.dex */
public final class DashMediaSource extends ga.a {
    private o A;
    private y B;
    private IOException C;
    private Handler D;
    private r.g E;
    private Uri F;
    private Uri G;
    private y9.c H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long N;
    private int O;
    private r P;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f80665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g.a f80666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0982a f80667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j f80668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f80669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final m f80670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x9.b f80671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final long f80672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f80673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final n0.a f80674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r.a f80675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f80676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f80677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final SparseArray f80678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f80679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f80680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final f.b f80681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final q f80682y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private s9.g f80683z;

    public static final class Factory implements f0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0982a f80684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g.a f80685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private z f80686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private j f80687d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private m f80688e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f80689f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f80690g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private r.a f80691h;

        public Factory(g.a aVar) {
            this(new d.a(aVar), aVar);
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public DashMediaSource e(n9.r rVar) {
            q9.a.e(rVar.f95455b);
            r.a dVar = this.f80691h;
            if (dVar == null) {
                dVar = new y9.d();
            }
            List list = rVar.f95455b.f95550d;
            return new DashMediaSource(rVar, null, this.f80685b, !list.isEmpty() ? new fa.b(dVar, list) : dVar, this.f80684a, this.f80687d, null, this.f80686c.a(rVar), this.f80688e, this.f80689f, this.f80690g, null);
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.f80684a.experimentalParseSubtitlesDuringExtraction(z10);
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory b(int i10) {
            this.f80684a.b(i10);
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory d(z zVar) {
            this.f80686c = (z) q9.a.f(zVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory c(m mVar) {
            this.f80688e = (m) q9.a.f(mVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // ga.f0.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Factory a(t.a aVar) {
            this.f80684a.a((t.a) q9.a.e(aVar));
            return this;
        }

        public Factory(a.InterfaceC0982a interfaceC0982a, g.a aVar) {
            this.f80684a = (a.InterfaceC0982a) q9.a.e(interfaceC0982a);
            this.f80685b = aVar;
            this.f80686c = new l();
            this.f80688e = new k();
            this.f80689f = 30000L;
            this.f80690g = 5000000L;
            this.f80687d = new ga.k();
            experimentalParseSubtitlesDuringExtraction(true);
        }
    }

    class a implements c.b {
        a() {
        }

        @Override // la.c.b
        public void onInitializationFailed(IOException iOException) {
            DashMediaSource.this.T(iOException);
        }

        @Override // la.c.b
        public void onInitialized() {
            DashMediaSource.this.U(la.c.i());
        }
    }

    private static final class b extends e0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final long f80693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f80694f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final long f80695g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f80696h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final long f80697i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final long f80698j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final long f80699k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final y9.c f80700l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final n9.r f80701m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final r.g f80702n;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, y9.c cVar, n9.r rVar, r.g gVar) {
            q9.a.g(cVar.f108408d == (gVar != null));
            this.f80693e = j10;
            this.f80694f = j11;
            this.f80695g = j12;
            this.f80696h = i10;
            this.f80697i = j13;
            this.f80698j = j14;
            this.f80699k = j15;
            this.f80700l = cVar;
            this.f80701m = rVar;
            this.f80702n = gVar;
        }

        private long s(long j10) {
            x9.f fVarB;
            long j11 = this.f80699k;
            if (!t(this.f80700l)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f80698j) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f80697i + j11;
            long jF = this.f80700l.f(0);
            int i10 = 0;
            while (i10 < this.f80700l.d() - 1 && j12 >= jF) {
                j12 -= jF;
                i10++;
                jF = this.f80700l.f(i10);
            }
            y9.g gVarC = this.f80700l.c(i10);
            int iA = gVarC.a(2);
            return (iA == -1 || (fVarB = ((y9.j) ((y9.a) gVarC.f108443c.get(iA)).f108397c.get(0)).b()) == null || fVarB.getSegmentCount(jF) == 0) ? j11 : (j11 + fVarB.getTimeUs(fVarB.getSegmentNum(j12, jF))) - j12;
        }

        private static boolean t(y9.c cVar) {
            return cVar.f108408d && cVar.f108409e != -9223372036854775807L && cVar.f108406b == -9223372036854775807L;
        }

        @Override // n9.e0
        public int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f80696h) >= 0 && iIntValue < i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // n9.e0
        public e0.b g(int i10, e0.b bVar, boolean z10) {
            q9.a.c(i10, 0, i());
            return bVar.s(z10 ? this.f80700l.c(i10).f108441a : null, z10 ? Integer.valueOf(this.f80696h + i10) : null, 0, this.f80700l.f(i10), o0.P0(this.f80700l.c(i10).f108442b - this.f80700l.c(0).f108442b) - this.f80697i);
        }

        @Override // n9.e0
        public int i() {
            return this.f80700l.d();
        }

        @Override // n9.e0
        public Object m(int i10) {
            q9.a.c(i10, 0, i());
            return Integer.valueOf(this.f80696h + i10);
        }

        @Override // n9.e0
        public e0.c o(int i10, e0.c cVar, long j10) {
            q9.a.c(i10, 0, 1);
            long jS = s(j10);
            Object obj = e0.c.f95261q;
            n9.r rVar = this.f80701m;
            y9.c cVar2 = this.f80700l;
            return cVar.g(obj, rVar, cVar2, this.f80693e, this.f80694f, this.f80695g, true, t(cVar2), this.f80702n, jS, this.f80698j, 0, i() - 1, this.f80697i);
        }

        @Override // n9.e0
        public int p() {
            return 1;
        }
    }

    private final class c implements f.b {
        private c() {
        }

        @Override // io.bidmachine.media3.exoplayer.dash.f.b
        public void onDashManifestPublishTimeExpired(long j10) {
            DashMediaSource.this.L(j10);
        }

        @Override // io.bidmachine.media3.exoplayer.dash.f.b
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.M();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    static final class d implements r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Pattern f80704a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        @Override // ka.r.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = f80704a.matcher(line);
                if (!matcher.matches()) {
                    throw x.c("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j11 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j10 * (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw x.c(null, e10);
            }
        }
    }

    private final class e implements o.b {
        private e() {
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void h(ka.r rVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.N(rVar, j10, j11);
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void f(ka.r rVar, long j10, long j11) {
            DashMediaSource.this.O(rVar, j10, j11);
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public o.c g(ka.r rVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.P(rVar, j10, j11, iOException, i10);
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void i(ka.r rVar, long j10, long j11, int i10) {
            DashMediaSource.this.Q(rVar, j10, j11, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    final class f implements q {
        f() {
        }

        private void a() throws IOException {
            if (DashMediaSource.this.C != null) {
                throw DashMediaSource.this.C;
            }
        }

        @Override // ka.q
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.A.maybeThrowError();
            a();
        }
    }

    private final class g implements o.b {
        private g() {
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void h(ka.r rVar, long j10, long j11, boolean z10) {
            DashMediaSource.this.N(rVar, j10, j11);
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void f(ka.r rVar, long j10, long j11) {
            DashMediaSource.this.R(rVar, j10, j11);
        }

        @Override // ka.o.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public o.c g(ka.r rVar, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.S(rVar, j10, j11, iOException);
        }

        @Override // ka.o.b
        public /* synthetic */ void i(o.e eVar, long j10, long j11, int i10) {
            p.a(this, eVar, j10, j11, i10);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    private static final class h implements r.a {
        private h() {
        }

        @Override // ka.r.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long parse(Uri uri, InputStream inputStream) {
            return Long.valueOf(o0.X0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        s.a("media3.exoplayer.dash");
    }

    /* synthetic */ DashMediaSource(n9.r rVar, y9.c cVar, g.a aVar, r.a aVar2, a.InterfaceC0982a interfaceC0982a, j jVar, ka.f fVar, w wVar, m mVar, long j10, long j11, a aVar3) {
        this(rVar, cVar, aVar, aVar2, interfaceC0982a, jVar, fVar, wVar, mVar, j10, j11);
    }

    private static long E(y9.g gVar, long j10, long j11) {
        long jP0 = o0.P0(gVar.f108442b);
        boolean zI = I(gVar);
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar.f108443c.size(); i10++) {
            y9.a aVar = (y9.a) gVar.f108443c.get(i10);
            List list = aVar.f108397c;
            int i11 = aVar.f108396b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zI || !z10) && !list.isEmpty()) {
                x9.f fVarB = ((y9.j) list.get(0)).b();
                if (fVarB == null) {
                    return jP0 + j10;
                }
                long availableSegmentCount = fVarB.getAvailableSegmentCount(j10, j11);
                if (availableSegmentCount == 0) {
                    return jP0;
                }
                long firstAvailableSegmentNum = (fVarB.getFirstAvailableSegmentNum(j10, j11) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, fVarB.getDurationUs(firstAvailableSegmentNum, j10) + fVarB.getTimeUs(firstAvailableSegmentNum) + jP0);
            }
        }
        return jMin;
    }

    private static long F(y9.g gVar, long j10, long j11) {
        long jP0 = o0.P0(gVar.f108442b);
        boolean zI = I(gVar);
        long jMax = jP0;
        for (int i10 = 0; i10 < gVar.f108443c.size(); i10++) {
            y9.a aVar = (y9.a) gVar.f108443c.get(i10);
            List list = aVar.f108397c;
            int i11 = aVar.f108396b;
            boolean z10 = (i11 == 1 || i11 == 2) ? false : true;
            if ((!zI || !z10) && !list.isEmpty()) {
                x9.f fVarB = ((y9.j) list.get(0)).b();
                if (fVarB == null || fVarB.getAvailableSegmentCount(j10, j11) == 0) {
                    return jP0;
                }
                jMax = Math.max(jMax, fVarB.getTimeUs(fVarB.getFirstAvailableSegmentNum(j10, j11)) + jP0);
            }
        }
        return jMax;
    }

    private static long G(y9.c cVar, long j10) {
        x9.f fVarB;
        int iD = cVar.d() - 1;
        y9.g gVarC = cVar.c(iD);
        long jP0 = o0.P0(gVarC.f108442b);
        long jF = cVar.f(iD);
        long jP02 = o0.P0(j10);
        long jP03 = o0.P0(cVar.f108405a);
        long jP04 = o0.P0(cVar.f108409e);
        if (jP04 == -9223372036854775807L || jP04 >= 5000000) {
            jP04 = 5000000;
        }
        for (int i10 = 0; i10 < gVarC.f108443c.size(); i10++) {
            List list = ((y9.a) gVarC.f108443c.get(i10)).f108397c;
            if (!list.isEmpty() && (fVarB = ((y9.j) list.get(0)).b()) != null) {
                long nextSegmentAvailableTimeUs = ((jP03 + jP0) + fVarB.getNextSegmentAvailableTimeUs(jF, jP02)) - jP02;
                if (nextSegmentAvailableTimeUs > 0 && (nextSegmentAvailableTimeUs < jP04 - SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US || (nextSegmentAvailableTimeUs > jP04 && nextSegmentAvailableTimeUs < jP04 + SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US))) {
                    jP04 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return LongMath.divide(jP04, 1000L, RoundingMode.CEILING);
    }

    private long H() {
        return Math.min((this.M - 1) * 1000, 5000);
    }

    private static boolean I(y9.g gVar) {
        for (int i10 = 0; i10 < gVar.f108443c.size(); i10++) {
            int i11 = ((y9.a) gVar.f108443c.get(i10)).f108396b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean J(y9.g gVar) {
        for (int i10 = 0; i10 < gVar.f108443c.size(); i10++) {
            x9.f fVarB = ((y9.j) ((y9.a) gVar.f108443c.get(i10)).f108397c.get(0)).b();
            if (fVarB == null || fVarB.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    private void K() {
        la.c.l(this.A, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(IOException iOException) {
        u.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        V(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(long j10) {
        this.L = j10;
        V(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(boolean z10) {
        long j10;
        long j11;
        long j12;
        for (int i10 = 0; i10 < this.f80678u.size(); i10++) {
            int iKeyAt = this.f80678u.keyAt(i10);
            if (iKeyAt >= this.O) {
                ((io.bidmachine.media3.exoplayer.dash.c) this.f80678u.valueAt(i10)).E(this.H, iKeyAt - this.O);
            }
        }
        y9.g gVarC = this.H.c(0);
        int iD = this.H.d() - 1;
        y9.g gVarC2 = this.H.c(iD);
        long jF = this.H.f(iD);
        long jP0 = o0.P0(o0.h0(this.L));
        long jF2 = F(gVarC, this.H.f(0), jP0);
        long jE = E(gVarC2, jF, jP0);
        boolean z11 = this.H.f108408d && !J(gVarC2);
        if (z11) {
            long j13 = this.H.f108410f;
            if (j13 != -9223372036854775807L) {
                jF2 = Math.max(jF2, jE - o0.P0(j13));
            }
        }
        long j14 = jE - jF2;
        y9.c cVar = this.H;
        if (cVar.f108408d) {
            q9.a.g(cVar.f108405a != -9223372036854775807L);
            long jP02 = (jP0 - o0.P0(this.H.f108405a)) - jF2;
            c0(jP02, j14);
            long jQ1 = this.H.f108405a + o0.q1(jF2);
            long jP03 = jP02 - o0.P0(this.E.f95529a);
            j10 = 0;
            long jMin = Math.min(this.f80673p, j14 / 2);
            j11 = jQ1;
            j12 = jP03 < jMin ? jMin : jP03;
        } else {
            j10 = 0;
            j11 = -9223372036854775807L;
            j12 = 0;
        }
        long jP04 = jF2 - o0.P0(gVarC.f108442b);
        y9.c cVar2 = this.H;
        w(new b(cVar2.f108405a, j11, this.L, this.O, jP04, j14, j12, cVar2, getMediaItem(), this.H.f108408d ? this.E : null));
        if (this.f80665h) {
            return;
        }
        this.D.removeCallbacks(this.f80680w);
        if (z11) {
            this.D.postDelayed(this.f80680w, G(this.H, o0.h0(this.L)));
        }
        if (this.I) {
            b0();
            return;
        }
        if (z10) {
            y9.c cVar3 = this.H;
            if (cVar3.f108408d) {
                long j15 = cVar3.f108409e;
                if (j15 != -9223372036854775807L) {
                    if (j15 == j10) {
                        j15 = 5000;
                    }
                    Z(Math.max(j10, (this.J + j15) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void W(y9.o oVar) {
        String str = oVar.f108495a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            X(oVar);
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            Y(oVar, new d());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            Y(oVar, new h(null));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            K();
        } else {
            T(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void X(y9.o oVar) {
        try {
            U(o0.X0(oVar.f108496b) - this.K);
        } catch (x e10) {
            T(e10);
        }
    }

    private void Y(y9.o oVar, r.a aVar) {
        a0(new ka.r(this.f80683z, Uri.parse(oVar.f108496b), 5, aVar), new g(this, null), 1);
    }

    private void Z(long j10) {
        this.D.postDelayed(this.f80679v, j10);
    }

    private void a0(ka.r rVar, o.b bVar, int i10) {
        this.A.m(rVar, bVar, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        Uri uri;
        this.D.removeCallbacks(this.f80679v);
        if (this.A.h()) {
            return;
        }
        if (this.A.i()) {
            this.I = true;
            return;
        }
        synchronized (this.f80677t) {
            uri = this.F;
        }
        this.I = false;
        a0(new ka.r(this.f80683z, new k.b().i(uri).b(1).a(), 4, this.f80675r), this.f80676s, this.f80670m.getMinimumLoadableRetryCount(4));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c0(long r19, long r21) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.dash.DashMediaSource.c0(long, long):void");
    }

    void L(long j10) {
        long j11 = this.N;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.N = j10;
        }
    }

    void M() {
        this.D.removeCallbacks(this.f80680w);
        b0();
    }

    void N(ka.r rVar, long j10, long j11) {
        ga.y yVar = new ga.y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
        this.f80670m.onLoadTaskConcluded(rVar.f93133a);
        this.f80674q.l(yVar, rVar.f93135c);
    }

    void O(ka.r rVar, long j10, long j11) {
        ga.y yVar = new ga.y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
        this.f80670m.onLoadTaskConcluded(rVar.f93133a);
        this.f80674q.o(yVar, rVar.f93135c);
        y9.c cVar = (y9.c) rVar.c();
        y9.c cVar2 = this.H;
        int iD = cVar2 == null ? 0 : cVar2.d();
        long j12 = cVar.c(0).f108442b;
        int i10 = 0;
        while (i10 < iD && this.H.c(i10).f108442b < j12) {
            i10++;
        }
        if (cVar.f108408d) {
            if (iD - i10 > cVar.d()) {
                u.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j13 = this.N;
                if (j13 == -9223372036854775807L || cVar.f108412h * 1000 > j13) {
                    this.M = 0;
                } else {
                    u.h("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f108412h + ", " + this.N);
                }
            }
            int i11 = this.M;
            this.M = i11 + 1;
            if (i11 < this.f80670m.getMinimumLoadableRetryCount(rVar.f93135c)) {
                Z(H());
                return;
            } else {
                this.C = new x9.c();
                return;
            }
        }
        this.H = cVar;
        this.I = cVar.f108408d & this.I;
        this.J = j10 - j11;
        this.K = j10;
        this.O += i10;
        synchronized (this.f80677t) {
            try {
                if (rVar.f93134b.f99819a == this.F) {
                    Uri uriD = this.H.f108415k;
                    if (uriD == null) {
                        uriD = rVar.d();
                    }
                    this.F = uriD;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        y9.c cVar3 = this.H;
        if (!cVar3.f108408d || this.L != -9223372036854775807L) {
            V(true);
            return;
        }
        y9.o oVar = cVar3.f108413i;
        if (oVar != null) {
            W(oVar);
        } else {
            K();
        }
    }

    o.c P(ka.r rVar, long j10, long j11, IOException iOException, int i10) {
        ga.y yVar = new ga.y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
        long jB = this.f80670m.b(new m.c(yVar, new b0(rVar.f93135c), iOException, i10));
        o.c cVarG = jB == -9223372036854775807L ? o.f93116g : o.g(false, jB);
        boolean zC = cVarG.c();
        this.f80674q.s(yVar, rVar.f93135c, iOException, !zC);
        if (!zC) {
            this.f80670m.onLoadTaskConcluded(rVar.f93133a);
        }
        return cVarG;
    }

    void Q(ka.r rVar, long j10, long j11, int i10) {
        this.f80674q.u(i10 == 0 ? new ga.y(rVar.f93133a, rVar.f93134b, j10) : new ga.y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a()), rVar.f93135c, i10);
    }

    void R(ka.r rVar, long j10, long j11) {
        ga.y yVar = new ga.y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a());
        this.f80670m.onLoadTaskConcluded(rVar.f93133a);
        this.f80674q.o(yVar, rVar.f93135c);
        U(((Long) rVar.c()).longValue() - j10);
    }

    o.c S(ka.r rVar, long j10, long j11, IOException iOException) {
        this.f80674q.s(new ga.y(rVar.f93133a, rVar.f93134b, rVar.d(), rVar.b(), j10, j11, rVar.a()), rVar.f93135c, iOException, true);
        this.f80670m.onLoadTaskConcluded(rVar.f93133a);
        T(iOException);
        return o.f93115f;
    }

    @Override // ga.f0
    public void c(c0 c0Var) {
        io.bidmachine.media3.exoplayer.dash.c cVar = (io.bidmachine.media3.exoplayer.dash.c) c0Var;
        cVar.A();
        this.f80678u.remove(cVar.f80714b);
    }

    @Override // ga.f0
    public c0 e(f0.b bVar, ka.b bVar2, long j10) {
        int iIntValue = ((Integer) bVar.f72270a).intValue() - this.O;
        n0.a aVarQ = q(bVar);
        io.bidmachine.media3.exoplayer.dash.c cVar = new io.bidmachine.media3.exoplayer.dash.c(this.O + iIntValue, this.H, this.f80671n, iIntValue, this.f80667j, this.B, null, this.f80669l, o(bVar), this.f80670m, aVarQ, this.L, this.f80682y, bVar2, this.f80668k, this.f80681x, t());
        this.f80678u.put(cVar.f80714b, cVar);
        return cVar;
    }

    @Override // ga.f0
    public synchronized n9.r getMediaItem() {
        return this.P;
    }

    @Override // ga.a, ga.f0
    public synchronized void h(n9.r rVar) {
        this.P = rVar;
    }

    @Override // ga.f0
    public void maybeThrowSourceInfoRefreshError() {
        this.f80682y.maybeThrowError();
    }

    @Override // ga.a
    protected void v(y yVar) {
        this.B = yVar;
        this.f80669l.c(Looper.myLooper(), t());
        this.f80669l.prepare();
        if (this.f80665h) {
            V(false);
            return;
        }
        this.f80683z = this.f80666i.createDataSource();
        this.A = new o("DashMediaSource");
        this.D = o0.A();
        b0();
    }

    @Override // ga.a
    protected void x() {
        this.I = false;
        this.f80683z = null;
        o oVar = this.A;
        if (oVar != null) {
            oVar.k();
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.f80678u.clear();
        this.f80671n.i();
        this.f80669l.release();
    }

    private DashMediaSource(n9.r rVar, y9.c cVar, g.a aVar, r.a aVar2, a.InterfaceC0982a interfaceC0982a, j jVar, ka.f fVar, w wVar, m mVar, long j10, long j11) {
        this.P = rVar;
        this.E = rVar.f95457d;
        this.F = ((r.h) q9.a.e(rVar.f95455b)).f95547a;
        this.G = rVar.f95455b.f95547a;
        this.H = cVar;
        this.f80666i = aVar;
        this.f80675r = aVar2;
        this.f80667j = interfaceC0982a;
        this.f80669l = wVar;
        this.f80670m = mVar;
        this.f80672o = j10;
        this.f80673p = j11;
        this.f80668k = jVar;
        this.f80671n = new x9.b();
        boolean z10 = cVar != null;
        this.f80665h = z10;
        a aVar3 = null;
        this.f80674q = q(null);
        this.f80677t = new Object();
        this.f80678u = new SparseArray();
        this.f80681x = new c(this, aVar3);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        if (!z10) {
            this.f80676s = new e(this, aVar3);
            this.f80682y = new f();
            this.f80679v = new Runnable() { // from class: x9.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108160b.b0();
                }
            };
            this.f80680w = new Runnable() { // from class: x9.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108161b.V(false);
                }
            };
            return;
        }
        q9.a.g(true ^ cVar.f108408d);
        this.f80676s = null;
        this.f80679v = null;
        this.f80680w = null;
        this.f80682y = new q.a();
    }
}
