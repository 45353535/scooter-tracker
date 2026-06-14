package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {
    public static final int A = z.a("seig");
    public static final byte[] B = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.v f22191f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f22198m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.util.n f22200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f22201p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22202q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f22205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f22210y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f22211z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22192g = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22187b = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(com.fyber.inneractive.sdk.player.exoplayer2.util.l.f23126a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22188c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22189d = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f22190e = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f22193h = new byte[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Stack f22194i = new Stack();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedList f22195j = new LinkedList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f22186a = new SparseArray();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f22203r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f22204s = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22196k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22199n = 0;

    public m(com.fyber.inneractive.sdk.player.exoplayer2.util.v vVar) {
        this.f22191f = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        return r.a(bVar, true);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f22210y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        int size = this.f22186a.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l) this.f22186a.valueAt(i10)).a();
        }
        this.f22195j.clear();
        this.f22202q = 0;
        this.f22194i.clear();
        this.f22196k = 0;
        this.f22199n = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r2 = r27.f22205t;
        r3 = r2.f22179a;
        r4 = r3.f22279h;
        r9 = r2.f22183e;
        r27.f22206u = r4[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r3.f22283l == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        r4 = r3.f22287p;
        r10 = r3.f22272a.f22173a;
        r11 = r3.f22285n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r11 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r11 = r2.f22181c.f22266h[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a4, code lost:
    
        r10 = r11.f22270a;
        r3 = r3.f22284m[r9];
        r9 = r27.f22190e;
        r11 = r9.f23134a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r3 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        r11[0] = (byte) (r12 | r10);
        r9.e(0);
        r2 = r2.f22180b;
        r2.a(1, r27.f22190e);
        r2.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r3 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
    
        r3 = r4.o();
        r4.e(r4.f23135b - 2);
        r3 = (r3 * 6) + 2;
        r2.a(r3, r4);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        r27.f22207v = r10;
        r27.f22206u += r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e5, code lost:
    
        r27.f22207v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        if (r27.f22205t.f22181c.f22265g != 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        r27.f22206u -= 8;
        r28.a(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        r27.f22196k = 4;
        r27.f22208w = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r2 = r27.f22205t;
        r3 = r2.f22179a;
        r4 = r2.f22181c;
        r9 = r2.f22180b;
        r2 = r2.f22183e;
        r5 = r4.f22269k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        if (r5 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
    
        r12 = r27.f22188c.f23134a;
        r12[0] = 0;
        r12[1] = 0;
        r12[r29] = 0;
        r13 = r5 + 1;
        r5 = 4 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
    
        if (r27.f22207v >= r27.f22206u) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        r14 = r27.f22208w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r14 != 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        r28.b(r12, r5, r13, r7);
        r27.f22188c.e(r7 ? 1 : 0);
        r27.f22208w = r27.f22188c.m() - r6;
        r27.f22187b.e(r7 ? 1 : 0);
        r9.a(r8, r27.f22187b);
        r9.a(r6, r27.f22188c);
        r27.f22209x = r7;
        r27.f22207v += 5;
        r27.f22206u += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0154, code lost:
    
        if (r27.f22209x == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0156, code lost:
    
        r27.f22189d.c(r14);
        r28.b(r27.f22189d.f23134a, r7 ? 1 : 0, r27.f22208w, r7);
        r9.a(r27.f22208w, r27.f22189d);
        r14 = r27.f22208w;
        r15 = r27.f22189d;
        r18 = r8;
        r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.l.a(r15.f23136c, r15.f23134a);
        r27.f22189d.e("video/hevc".equals(r4.f22264f.f22793f) ? 1 : 0);
        r27.f22189d.d(r8);
        r21 = r6;
        com.fyber.inneractive.sdk.player.exoplayer2.text.cea.a.a((r3.f22281j[r2] + ((long) r3.f22280i[r2])) * 1000, r27.f22189d, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a4, code lost:
    
        r21 = r6;
        r18 = r8;
        r14 = r9.a(r28, r14, r7 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01af, code lost:
    
        r27.f22207v += r14;
        r27.f22208w -= r14;
        r8 = r18;
        r6 = r21;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c0, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c5, code lost:
    
        r19 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01c9, code lost:
    
        r5 = r27.f22207v;
        r6 = r27.f22206u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01cd, code lost:
    
        if (r5 >= r6) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cf, code lost:
    
        r27.f22207v += r9.a(r28, r6 - r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01db, code lost:
    
        r5 = (r3.f22281j[r2] + ((long) r3.f22280i[r2])) * r19;
        r1 = r3.f22283l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01e9, code lost:
    
        if (r1 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01eb, code lost:
    
        r7 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ee, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ef, code lost:
    
        r12 = r7 | (r3.f22282k[r2] ? 1 : 0);
        r2 = r3.f22272a.f22173a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01f9, code lost:
    
        if (r1 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fb, code lost:
    
        r1 = r3.f22285n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01fd, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ff, code lost:
    
        r1 = r1.f22271b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0201, code lost:
    
        r15 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0203, code lost:
    
        r1 = r4.f22266h[r2].f22271b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x020a, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x020b, code lost:
    
        r1 = r27.f22191f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020d, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020f, code lost:
    
        r5 = r1.a(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0213, code lost:
    
        r9.a(r5, r12, r27.f22206u, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0220, code lost:
    
        if (r27.f22195j.isEmpty() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0222, code lost:
    
        r1 = r27.f22205t;
        r1.f22183e++;
        r2 = r1.f22184f + 1;
        r1.f22184f = r2;
        r3 = r3.f22278g;
        r4 = r1.f22185g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0236, code lost:
    
        if (r2 != r3[r4]) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0238, code lost:
    
        r1.f22185g = r4 + 1;
        r5 = 0;
        r1.f22184f = 0;
        r27.f22205t = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0244, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0246, code lost:
    
        r27.f22196k = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0248, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0249, code lost:
    
        r27.f22202q -= ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k) r27.f22195j.removeFirst()).f22178b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025a, code lost:
    
        throw null;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r28, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r29) throws java.lang.InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 1367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r52) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        /*
            Method dump skipped, instruction units count: 1705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m.a(long):void");
    }

    public static void a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, int i10, u uVar) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        nVar.e(i10 + 8);
        int iB = nVar.b();
        int i11 = c.f22093b;
        if ((iB & 1) == 0) {
            boolean z10 = (iB & 2) != 0;
            int iM = nVar.m();
            if (iM == uVar.f22276e) {
                Arrays.fill(uVar.f22284m, 0, iM, z10);
                int i12 = nVar.f23136c - nVar.f23135b;
                com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = uVar.f22287p;
                if (nVar2 == null || nVar2.f23136c < i12) {
                    uVar.f22287p = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(i12);
                }
                uVar.f22286o = i12;
                uVar.f22283l = true;
                uVar.f22288q = true;
                nVar.a(uVar.f22287p.f23134a, 0, i12);
                uVar.f22287p.e(0);
                uVar.f22288q = false;
                return;
            }
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Length mismatch: ", iM, ", ");
            sbA.append(uVar.f22276e);
            throw new com.fyber.inneractive.sdk.player.exoplayer2.r(sbA.toString());
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.d a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f22143a == c.V) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.P0.f23134a;
                UUID uuidA = q.a(bArr);
                if (uuidA == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c(uuidA, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new com.fyber.inneractive.sdk.player.exoplayer2.drm.d(false, (com.fyber.inneractive.sdk.player.exoplayer2.drm.c[]) arrayList2.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.drm.c[arrayList2.size()]));
    }
}
