package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import ba.f;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import ha.n;
import io.bidmachine.media3.exoplayer.l1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import ja.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ka.g;
import n9.f0;
import q9.l0;
import q9.o0;
import s9.k;
import s9.y;
import u9.m0;
import v9.c2;

/* JADX INFO: loaded from: classes12.dex */
class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final aa.e f80946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s9.g f80947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s9.g f80948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final aa.j f80949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri[] f80950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.media3.common.a[] f80951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ba.k f80952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final f0 f80953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f80954i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c2 f80956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f80957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f80958m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IOException f80960o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Uri f80961p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f80962q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private r f80963r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f80965t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f80966u = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.bidmachine.media3.exoplayer.hls.b f80955j = new io.bidmachine.media3.exoplayer.hls.b(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f80959n = o0.f98842f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f80964s = -9223372036854775807L;

    private static final class a extends ha.k {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private byte[] f80967l;

        public a(s9.g gVar, s9.k kVar, io.bidmachine.media3.common.a aVar, int i10, Object obj, byte[] bArr) {
            super(gVar, kVar, 3, aVar, i10, obj, bArr);
        }

        @Override // ha.k
        protected void e(byte[] bArr, int i10) {
            this.f80967l = Arrays.copyOf(bArr, i10);
        }

        public byte[] h() {
            return this.f80967l;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ha.e f80968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f80969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f80970c;

        public b() {
            a();
        }

        public void a() {
            this.f80968a = null;
            this.f80969b = false;
            this.f80970c = null;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.media3.exoplayer.hls.c$c, reason: collision with other inner class name */
    static final class C0983c extends ha.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f80971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f80972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f80973g;

        public C0983c(String str, long j10, List list) {
            super(0L, list.size() - 1);
            this.f80973g = str;
            this.f80972f = j10;
            this.f80971e = list;
        }

        @Override // ha.n
        public long getChunkEndTimeUs() {
            a();
            f.g gVar = (f.g) this.f80971e.get((int) b());
            return this.f80972f + gVar.f6052f + gVar.f6050d;
        }

        @Override // ha.n
        public long getChunkStartTimeUs() {
            a();
            return this.f80972f + ((f.g) this.f80971e.get((int) b())).f6052f;
        }
    }

    private static final class d extends ja.c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f80974i;

        public d(f0 f0Var, int[] iArr) {
            super(f0Var, iArr);
            this.f80974i = a(f0Var.a(iArr[0]));
        }

        @Override // ja.r
        public void b(long j10, long j11, long j12, List list, n[] nVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (isTrackExcluded(this.f80974i, jElapsedRealtime)) {
                for (int i10 = this.f85579b - 1; i10 >= 0; i10--) {
                    if (!isTrackExcluded(i10, jElapsedRealtime)) {
                        this.f80974i = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // ja.r
        public int getSelectedIndex() {
            return this.f80974i;
        }

        @Override // ja.r
        public Object getSelectionData() {
            return null;
        }

        @Override // ja.r
        public int getSelectionReason() {
            return 0;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f.g f80975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f80976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f80977c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f80978d;

        public e(f.g gVar, long j10, int i10) {
            this.f80975a = gVar;
            this.f80976b = j10;
            this.f80977c = i10;
            this.f80978d = (gVar instanceof f.d) && ((f.d) gVar).f6042n;
        }
    }

    public c(aa.e eVar, ba.k kVar, Uri[] uriArr, io.bidmachine.media3.common.a[] aVarArr, aa.d dVar, y yVar, aa.j jVar, long j10, List list, c2 c2Var, ka.f fVar) {
        this.f80946a = eVar;
        this.f80952g = kVar;
        this.f80950e = uriArr;
        this.f80951f = aVarArr;
        this.f80949d = jVar;
        this.f80957l = j10;
        this.f80954i = list;
        this.f80956k = c2Var;
        s9.g gVarCreateDataSource = dVar.createDataSource(1);
        this.f80947b = gVarCreateDataSource;
        if (yVar != null) {
            gVarCreateDataSource.a(yVar);
        }
        this.f80948c = dVar.createDataSource(3);
        this.f80953h = new f0(aVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((aVarArr[i10].f80552f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f80963r = new d(this.f80953h, Ints.toArray(arrayList));
    }

    private void b() {
        this.f80952g.deactivatePlaylistForPlayback(this.f80950e[this.f80963r.getSelectedIndexInTrackGroup()]);
    }

    private static Uri e(ba.f fVar, f.g gVar) {
        String str;
        if (gVar == null || (str = gVar.f6054h) == null) {
            return null;
        }
        return l0.f(fVar.f6085a, str);
    }

    private Pair g(io.bidmachine.media3.exoplayer.hls.e eVar, boolean z10, ba.f fVar, long j10, long j11) {
        if (eVar != null && !z10) {
            if (!eVar.f()) {
                return new Pair(Long.valueOf(eVar.f73058j), Integer.valueOf(eVar.f80985o));
            }
            Long lValueOf = Long.valueOf(eVar.f80985o == -1 ? eVar.e() : eVar.f73058j);
            int i10 = eVar.f80985o;
            return new Pair(lValueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = fVar.f6020u + j10;
        if (eVar != null && !this.f80962q) {
            j11 = eVar.f73010g;
        }
        if (!fVar.f6014o && j11 >= j12) {
            return new Pair(Long.valueOf(fVar.f6010k + ((long) fVar.f6017r.size())), -1);
        }
        long j13 = j11 - j10;
        int i11 = 0;
        int iE = o0.e(fVar.f6017r, Long.valueOf(j13), true, !this.f80952g.isLive() || eVar == null);
        long j14 = ((long) iE) + fVar.f6010k;
        if (iE >= 0) {
            f.C0130f c0130f = (f.C0130f) fVar.f6017r.get(iE);
            List list = j13 < c0130f.f6052f + c0130f.f6050d ? c0130f.f6047n : fVar.f6018s;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                f.d dVar = (f.d) list.get(i11);
                if (j13 >= dVar.f6052f + dVar.f6050d) {
                    i11++;
                } else if (dVar.f6041m) {
                    j14 += list == fVar.f6018s ? 1L : 0L;
                    i = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i));
    }

    private static e h(ba.f fVar, long j10, int i10) {
        int i11 = (int) (j10 - fVar.f6010k);
        if (i11 == fVar.f6017r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < fVar.f6018s.size()) {
                return new e((f.g) fVar.f6018s.get(i10), j10, i10);
            }
            return null;
        }
        f.C0130f c0130f = (f.C0130f) fVar.f6017r.get(i11);
        if (i10 == -1) {
            return new e(c0130f, j10, -1);
        }
        if (i10 < c0130f.f6047n.size()) {
            return new e((f.g) c0130f.f6047n.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < fVar.f6017r.size()) {
            return new e((f.g) fVar.f6017r.get(i12), j10 + 1, -1);
        }
        if (fVar.f6018s.isEmpty()) {
            return null;
        }
        return new e((f.g) fVar.f6018s.get(0), j10 + 1, 0);
    }

    static List j(ba.f fVar, long j10, int i10) {
        int i11 = (int) (j10 - fVar.f6010k);
        if (i11 < 0 || fVar.f6017r.size() < i11) {
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < fVar.f6017r.size()) {
            if (i10 != -1) {
                f.C0130f c0130f = (f.C0130f) fVar.f6017r.get(i11);
                if (i10 == 0) {
                    arrayList.add(c0130f);
                } else if (i10 < c0130f.f6047n.size()) {
                    List list = c0130f.f6047n;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List list2 = fVar.f6017r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (fVar.f6013n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < fVar.f6018s.size()) {
                List list3 = fVar.f6018s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private ha.e n(Uri uri, int i10, boolean z10, g.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f80955j.c(uri);
        if (bArrC != null) {
            this.f80955j.b(uri, bArrC);
            return null;
        }
        return new a(this.f80948c, new k.b().i(uri).b(1).a(), this.f80951f[i10], this.f80963r.getSelectionReason(), this.f80963r.getSelectionData(), this.f80959n);
    }

    private long u(long j10) {
        long j11 = this.f80964s;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void y(ba.f fVar) {
        this.f80964s = fVar.f6014o ? -9223372036854775807L : fVar.d() - this.f80952g.getInitialStartTimeUs();
    }

    public n[] a(io.bidmachine.media3.exoplayer.hls.e eVar, long j10) {
        int iB = eVar == null ? -1 : this.f80953h.b(eVar.f73007d);
        int length = this.f80963r.length();
        n[] nVarArr = new n[length];
        for (int i10 = 0; i10 < length; i10++) {
            int indexInTrackGroup = this.f80963r.getIndexInTrackGroup(i10);
            Uri uri = this.f80950e[indexInTrackGroup];
            if (this.f80952g.isSnapshotValid(uri)) {
                ba.f playlistSnapshot = this.f80952g.getPlaylistSnapshot(uri, false);
                q9.a.e(playlistSnapshot);
                long initialStartTimeUs = playlistSnapshot.f6007h - this.f80952g.getInitialStartTimeUs();
                Pair pairG = g(eVar, indexInTrackGroup != iB, playlistSnapshot, initialStartTimeUs, j10);
                nVarArr[i10] = new C0983c(playlistSnapshot.f6085a, initialStartTimeUs, j(playlistSnapshot, ((Long) pairG.first).longValue(), ((Integer) pairG.second).intValue()));
            } else {
                nVarArr[i10] = n.f73059a;
            }
        }
        return nVarArr;
    }

    public long c(long j10, m0 m0Var) {
        int selectedIndex = this.f80963r.getSelectedIndex();
        Uri[] uriArr = this.f80950e;
        ba.f playlistSnapshot = (selectedIndex >= uriArr.length || selectedIndex == -1) ? null : this.f80952g.getPlaylistSnapshot(uriArr[this.f80963r.getSelectedIndexInTrackGroup()], true);
        if (playlistSnapshot == null || playlistSnapshot.f6017r.isEmpty()) {
            return j10;
        }
        long initialStartTimeUs = playlistSnapshot.f6007h - this.f80952g.getInitialStartTimeUs();
        long j11 = j10 - initialStartTimeUs;
        int iE = o0.e(playlistSnapshot.f6017r, Long.valueOf(j11), true, true);
        long j12 = ((f.C0130f) playlistSnapshot.f6017r.get(iE)).f6052f;
        return m0Var.a(j11, j12, (!playlistSnapshot.f6087c || iE == playlistSnapshot.f6017r.size() - 1) ? j12 : ((f.C0130f) playlistSnapshot.f6017r.get(iE + 1)).f6052f) + initialStartTimeUs;
    }

    public int d(io.bidmachine.media3.exoplayer.hls.e eVar) {
        if (eVar.f80985o == -1) {
            return 1;
        }
        ba.f fVar = (ba.f) q9.a.e(this.f80952g.getPlaylistSnapshot(this.f80950e[this.f80953h.b(eVar.f73007d)], false));
        int i10 = (int) (eVar.f73058j - fVar.f6010k);
        if (i10 < 0) {
            return 1;
        }
        List list = i10 < fVar.f6017r.size() ? ((f.C0130f) fVar.f6017r.get(i10)).f6047n : fVar.f6018s;
        if (eVar.f80985o >= list.size()) {
            return 2;
        }
        f.d dVar = (f.d) list.get(eVar.f80985o);
        if (dVar.f6042n) {
            return 0;
        }
        return Objects.equals(Uri.parse(l0.e(fVar.f6085a, dVar.f6048b)), eVar.f73005b.f99819a) ? 1 : 2;
    }

    public void f(l1 l1Var, long j10, List list, boolean z10, b bVar) {
        int i10;
        io.bidmachine.media3.exoplayer.hls.e eVar = list.isEmpty() ? null : (io.bidmachine.media3.exoplayer.hls.e) Iterables.getLast(list);
        int iB = eVar == null ? -1 : this.f80953h.b(eVar.f73007d);
        long j11 = l1Var.f81195a;
        long jMax = j10 - j11;
        long jU = u(j11);
        if (eVar != null && !this.f80962q) {
            long jB = eVar.b();
            jMax = Math.max(0L, jMax - jB);
            if (jU != -9223372036854775807L) {
                jU = Math.max(0L, jU - jB);
            }
        }
        this.f80963r.b(j11, jMax, jU, list, a(eVar, j10));
        int selectedIndexInTrackGroup = this.f80963r.getSelectedIndexInTrackGroup();
        boolean z11 = iB != selectedIndexInTrackGroup;
        Uri uri = this.f80950e[selectedIndexInTrackGroup];
        if (!this.f80952g.isSnapshotValid(uri)) {
            bVar.f80970c = uri;
            this.f80965t &= uri.equals(this.f80961p);
            this.f80961p = uri;
            return;
        }
        ba.f playlistSnapshot = this.f80952g.getPlaylistSnapshot(uri, true);
        q9.a.e(playlistSnapshot);
        this.f80962q = playlistSnapshot.f6087c;
        y(playlistSnapshot);
        long initialStartTimeUs = playlistSnapshot.f6007h - this.f80952g.getInitialStartTimeUs();
        Pair pairG = g(eVar, z11, playlistSnapshot, initialStartTimeUs, j10);
        long jLongValue = ((Long) pairG.first).longValue();
        int iIntValue = ((Integer) pairG.second).intValue();
        int i11 = iB;
        if (jLongValue >= playlistSnapshot.f6010k || eVar == null || !z11) {
            i10 = i11;
        } else {
            uri = this.f80950e[i11];
            playlistSnapshot = this.f80952g.getPlaylistSnapshot(uri, true);
            q9.a.e(playlistSnapshot);
            initialStartTimeUs = playlistSnapshot.f6007h - this.f80952g.getInitialStartTimeUs();
            Pair pairG2 = g(eVar, false, playlistSnapshot, initialStartTimeUs, j10);
            jLongValue = ((Long) pairG2.first).longValue();
            iIntValue = ((Integer) pairG2.second).intValue();
            selectedIndexInTrackGroup = i11;
            i10 = selectedIndexInTrackGroup;
        }
        int i12 = iIntValue;
        ba.f fVar = playlistSnapshot;
        Uri uri2 = uri;
        long j12 = initialStartTimeUs;
        if (selectedIndexInTrackGroup != i10 && i10 != -1) {
            this.f80952g.deactivatePlaylistForPlayback(this.f80950e[i10]);
        }
        if (jLongValue < fVar.f6010k) {
            this.f80960o = new ga.b();
            return;
        }
        e eVarH = h(fVar, jLongValue, i12);
        if (eVarH == null) {
            if (!fVar.f6014o) {
                bVar.f80970c = uri2;
                this.f80965t &= uri2.equals(this.f80961p);
                this.f80961p = uri2;
                return;
            } else {
                if (z10 || fVar.f6017r.isEmpty()) {
                    bVar.f80969b = true;
                    return;
                }
                eVarH = new e((f.g) Iterables.getLast(fVar.f6017r), (fVar.f6010k + ((long) fVar.f6017r.size())) - 1, -1);
            }
        }
        e eVar2 = eVarH;
        this.f80965t = false;
        this.f80961p = null;
        this.f80966u = SystemClock.elapsedRealtime();
        Uri uriE = e(fVar, eVar2.f80975a.f6049c);
        ha.e eVarN = n(uriE, selectedIndexInTrackGroup, true, null);
        bVar.f80968a = eVarN;
        if (eVarN != null) {
            return;
        }
        Uri uriE2 = e(fVar, eVar2.f80975a);
        ha.e eVarN2 = n(uriE2, selectedIndexInTrackGroup, false, null);
        bVar.f80968a = eVarN2;
        if (eVarN2 != null) {
            return;
        }
        boolean zU = io.bidmachine.media3.exoplayer.hls.e.u(eVar, uri2, fVar, eVar2, j12);
        if (zU && eVar2.f80978d) {
            return;
        }
        bVar.f80968a = io.bidmachine.media3.exoplayer.hls.e.h(this.f80946a, this.f80947b, this.f80951f[selectedIndexInTrackGroup], j12, fVar, eVar2, uri2, this.f80954i, this.f80963r.getSelectionReason(), this.f80963r.getSelectionData(), this.f80958m, this.f80949d, this.f80957l, eVar, this.f80955j.a(uriE2), this.f80955j.a(uriE), zU, this.f80956k, null);
    }

    public int i(long j10, List list) {
        return (this.f80960o != null || this.f80963r.length() < 2) ? list.size() : this.f80963r.evaluateQueueSize(j10, list);
    }

    public f0 k() {
        return this.f80953h;
    }

    public r l() {
        return this.f80963r;
    }

    public boolean m() {
        return this.f80962q;
    }

    public boolean o(ha.e eVar, long j10) {
        r rVar = this.f80963r;
        return rVar.excludeTrack(rVar.indexOf(this.f80953h.b(eVar.f73007d)), j10);
    }

    public void p() throws IOException {
        IOException iOException = this.f80960o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f80961p;
        if (uri == null || !this.f80965t) {
            return;
        }
        this.f80952g.maybeThrowPlaylistRefreshError(uri);
    }

    public boolean q(Uri uri) {
        return o0.s(this.f80950e, uri);
    }

    public void r(ha.e eVar) {
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            this.f80959n = aVar.f();
            this.f80955j.b(aVar.f73005b.f99819a, (byte[]) q9.a.e(aVar.h()));
        }
    }

    public boolean s(Uri uri, long j10) {
        int iIndexOf;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f80950e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iIndexOf = this.f80963r.indexOf(i10)) == -1) {
            return true;
        }
        this.f80965t |= uri.equals(this.f80961p);
        return j10 == -9223372036854775807L || (this.f80963r.excludeTrack(iIndexOf, j10) && this.f80952g.excludeMediaPlaylist(uri, j10));
    }

    public void t() {
        b();
        this.f80960o = null;
    }

    public void v(boolean z10) {
        this.f80958m = z10;
    }

    public void w(r rVar) {
        b();
        this.f80963r = rVar;
    }

    public boolean x(long j10, ha.e eVar, List list) {
        if (this.f80960o != null) {
            return false;
        }
        return this.f80963r.c(j10, eVar, list);
    }
}
