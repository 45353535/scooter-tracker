package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import androidx.collection.SieveCacheKt;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements i {
    public static final byte[] Z = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final byte[] f22031a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final UUID f22032b0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g B;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.g C;
    public boolean D;
    public int E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public byte S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public j Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f22033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f22034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f22035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f22037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f22038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f22039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f22040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final n f22041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f22042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n f22043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f22044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f22045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ByteBuffer f22046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f22047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f22048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f22049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f22050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f22051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f22052t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f22053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f22055w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22056x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f22057y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f22058z;

    public e() {
        b bVar = new b();
        this.f22048p = -1L;
        this.f22049q = -9223372036854775807L;
        this.f22050r = -9223372036854775807L;
        this.f22051s = -9223372036854775807L;
        this.f22057y = -1L;
        this.f22058z = -1L;
        this.A = -9223372036854775807L;
        this.f22033a = bVar;
        bVar.f22000d = new c(this);
        this.f22036d = true;
        this.f22034b = new g();
        this.f22035c = new SparseArray();
        this.f22039g = new n(4);
        this.f22040h = new n(ByteBuffer.allocate(4).putInt(-1).array());
        this.f22041i = new n(4);
        this.f22037e = new n(l.f23126a);
        this.f22038f = new n(4);
        this.f22042j = new n();
        this.f22043k = new n();
        this.f22044l = new n(8);
        this.f22045m = new n();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) throws InterruptedException, EOFException {
        f fVar = new f();
        long j10 = bVar.f21740b;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        bVar.a(fVar.f22059a.f23134a, 0, 4, false);
        long jK = fVar.f22059a.k();
        fVar.f22060b = 4;
        while (true) {
            if (jK != 440786851) {
                int i11 = fVar.f22060b + 1;
                fVar.f22060b = i11;
                if (i11 == i10) {
                    break;
                }
                bVar.a(fVar.f22059a.f23134a, 0, 1, false);
                jK = ((jK << 8) & (-256)) | ((long) (fVar.f22059a.f23134a[0] & 255));
            } else {
                long jA = fVar.a(bVar);
                long j12 = fVar.f22060b;
                if (jA != Long.MIN_VALUE && (j10 == -1 || j12 + jA < j10)) {
                    while (true) {
                        long j13 = fVar.f22060b;
                        long j14 = j12 + jA;
                        if (j13 < j14) {
                            if (fVar.a(bVar) == Long.MIN_VALUE) {
                                break;
                            }
                            long jA2 = fVar.a(bVar);
                            if (jA2 < 0 || jA2 > SieveCacheKt.NodeLinkMask) {
                                break;
                            }
                            if (jA2 != 0) {
                                bVar.a((int) jA2, false);
                                fVar.f22060b = (int) (((long) fVar.f22060b) + jA2);
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(j jVar) {
        this.Y = jVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        this.A = -9223372036854775807L;
        this.E = 0;
        b bVar = this.f22033a;
        bVar.f22001e = 0;
        bVar.f21998b.clear();
        g gVar = bVar.f21999c;
        gVar.f22063b = 0;
        gVar.f22064c = 0;
        g gVar2 = this.f22034b;
        gVar2.f22063b = 0;
        gVar2.f22064c = 0;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar = this.f22042j;
        nVar.f23135b = 0;
        nVar.f23136c = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0300, code lost:
    
        r18 = true;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0305, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0bb6, code lost:
    
        if (r18 == false) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0bb8, code lost:
    
        r4 = r39.f21741c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0bbc, code lost:
    
        if (r38.f22056x == false) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0bbe, code lost:
    
        r38.f22058z = r4;
        r40.f22310a = r38.f22057y;
        r38.f22056x = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0bc6, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0bcb, code lost:
    
        if (r38.f22053u == false) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0bcd, code lost:
    
        r4 = r38.f22058z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0bd3, code lost:
    
        if (r4 == (-1)) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0bd5, code lost:
    
        r40.f22310a = r4;
        r38.f22058z = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0bdb, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0bdb, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x08a5  */
    /* JADX WARN: Type inference failed for: r5v143 */
    /* JADX WARN: Type inference failed for: r5v53, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v58 */
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
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r39, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o r40) throws java.lang.InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 3534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e.a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o):int");
    }

    public final void a(d dVar, long j10) {
        byte[] bArrB;
        if ("S_TEXT/UTF8".equals(dVar.f22005a)) {
            byte[] bArr = this.f22043k.f23134a;
            long j11 = this.G;
            if (j11 == -9223372036854775807L) {
                bArrB = f22031a0;
            } else {
                int i10 = (int) (j11 / 3600000000L);
                long j12 = j11 - (((long) i10) * 3600000000L);
                int i11 = (int) (j12 / 60000000);
                long j13 = j12 - ((long) (60000000 * i11));
                int i12 = (int) (j13 / 1000000);
                bArrB = z.b(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - ((long) (1000000 * i12))) / 1000))));
            }
            System.arraycopy(bArrB, 0, bArr, 19, 12);
            r rVar = dVar.O;
            n nVar = this.f22043k;
            rVar.a(nVar.f23136c, nVar);
            this.V += this.f22043k.f23136c;
        }
        dVar.O.a(j10, this.M, this.V, 0, dVar.f22011g);
        this.W = true;
        this.N = 0;
        this.V = 0;
        this.U = 0;
        this.O = false;
        this.P = false;
        this.R = false;
        this.T = 0;
        this.S = (byte) 0;
        this.Q = false;
        n nVar2 = this.f22042j;
        nVar2.f23135b = 0;
        nVar2.f23136c = 0;
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, int i10) throws InterruptedException, EOFException {
        n nVar = this.f22039g;
        if (nVar.f23136c >= i10) {
            return;
        }
        if (nVar.a() < i10) {
            n nVar2 = this.f22039g;
            byte[] bArr = nVar2.f23134a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10));
            int i11 = this.f22039g.f23136c;
            nVar2.f23134a = bArrCopyOf;
            nVar2.f23136c = i11;
            nVar2.f23135b = 0;
        }
        n nVar3 = this.f22039g;
        byte[] bArr2 = nVar3.f23134a;
        int i12 = nVar3.f23136c;
        bVar.b(bArr2, i12, i10 - i12, false);
        this.f22039g.d(i10);
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, d dVar, int i10) throws InterruptedException, com.fyber.inneractive.sdk.player.exoplayer2.r, EOFException {
        int iA;
        int iA2;
        int i11;
        if ("S_TEXT/UTF8".equals(dVar.f22005a)) {
            byte[] bArr = Z;
            int i12 = i10 + 32;
            if (this.f22043k.a() < i12) {
                this.f22043k.f23134a = Arrays.copyOf(bArr, i12 + i10);
            }
            bVar.b(this.f22043k.f23134a, 32, i10, false);
            this.f22043k.e(0);
            this.f22043k.d(i12);
            return;
        }
        r rVar = dVar.O;
        if (!this.O) {
            if (dVar.f22009e) {
                this.M &= -1073741825;
                if (!this.P) {
                    bVar.b(this.f22039g.f23134a, 0, 1, false);
                    this.N++;
                    byte b10 = this.f22039g.f23134a[0];
                    if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) != 128) {
                        this.S = b10;
                        this.P = true;
                    } else {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Extension bit is set in signal byte");
                    }
                }
                byte b11 = this.S;
                if ((b11 & 1) == 1) {
                    boolean z10 = (b11 & 2) == 2;
                    this.M |= 1073741824;
                    if (!this.Q) {
                        bVar.b(this.f22044l.f23134a, 0, 8, false);
                        this.N += 8;
                        this.Q = true;
                        n nVar = this.f22039g;
                        nVar.f23134a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        nVar.e(0);
                        rVar.a(1, this.f22039g);
                        this.V++;
                        this.f22044l.e(0);
                        rVar.a(8, this.f22044l);
                        this.V += 8;
                    }
                    if (z10) {
                        if (!this.R) {
                            bVar.b(this.f22039g.f23134a, 0, 1, false);
                            this.N++;
                            this.f22039g.e(0);
                            this.T = this.f22039g.j();
                            this.R = true;
                        }
                        int i13 = this.T * 4;
                        this.f22039g.c(i13);
                        bVar.b(this.f22039g.f23134a, 0, i13, false);
                        this.N += i13;
                        short s10 = (short) ((this.T / 2) + 1);
                        int i14 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f22046n;
                        if (byteBuffer == null || byteBuffer.capacity() < i14) {
                            this.f22046n = ByteBuffer.allocate(i14);
                        }
                        this.f22046n.position(0);
                        this.f22046n.putShort(s10);
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i11 = this.T;
                            if (i15 >= i11) {
                                break;
                            }
                            int iM = this.f22039g.m();
                            if (i15 % 2 == 0) {
                                this.f22046n.putShort((short) (iM - i16));
                            } else {
                                this.f22046n.putInt(iM - i16);
                            }
                            i15++;
                            i16 = iM;
                        }
                        int i17 = (i10 - this.N) - i16;
                        if (i11 % 2 == 1) {
                            this.f22046n.putInt(i17);
                        } else {
                            this.f22046n.putShort((short) i17);
                            this.f22046n.putInt(0);
                        }
                        n nVar2 = this.f22045m;
                        nVar2.f23134a = this.f22046n.array();
                        nVar2.f23136c = i14;
                        nVar2.f23135b = 0;
                        rVar.a(i14, this.f22045m);
                        this.V += i14;
                    }
                }
            } else {
                byte[] bArr2 = dVar.f22010f;
                if (bArr2 != null) {
                    n nVar3 = this.f22042j;
                    int length = bArr2.length;
                    nVar3.f23134a = bArr2;
                    nVar3.f23136c = length;
                    nVar3.f23135b = 0;
                }
            }
            this.O = true;
        }
        int i18 = i10 + this.f22042j.f23136c;
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f22005a) && !"V_MPEGH/ISO/HEVC".equals(dVar.f22005a)) {
            while (true) {
                int i19 = this.N;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                n nVar4 = this.f22042j;
                int i21 = nVar4.f23136c - nVar4.f23135b;
                if (i21 > 0) {
                    iA2 = Math.min(i20, i21);
                    rVar.a(iA2, this.f22042j);
                } else {
                    iA2 = rVar.a(bVar, i20, false);
                }
                this.N += iA2;
                this.V += iA2;
            }
        } else {
            byte[] bArr3 = this.f22038f.f23134a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i22 = dVar.P;
            int i23 = 4 - i22;
            while (this.N < i18) {
                int i24 = this.U;
                if (i24 == 0) {
                    n nVar5 = this.f22042j;
                    int iMin = Math.min(i22, nVar5.f23136c - nVar5.f23135b);
                    bVar.b(bArr3, i23 + iMin, i22 - iMin, false);
                    if (iMin > 0) {
                        this.f22042j.a(bArr3, i23, iMin);
                    }
                    this.N += i22;
                    this.f22038f.e(0);
                    this.U = this.f22038f.m();
                    this.f22037e.e(0);
                    rVar.a(4, this.f22037e);
                    this.V += 4;
                } else {
                    n nVar6 = this.f22042j;
                    int i25 = nVar6.f23136c - nVar6.f23135b;
                    if (i25 > 0) {
                        iA = Math.min(i24, i25);
                        rVar.a(iA, this.f22042j);
                    } else {
                        iA = rVar.a(bVar, i24, false);
                    }
                    this.N += iA;
                    this.V += iA;
                    this.U = i24 - iA;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f22005a)) {
            this.f22040h.e(0);
            rVar.a(4, this.f22040h);
            this.V += 4;
        }
    }

    public final long a(long j10) throws com.fyber.inneractive.sdk.player.exoplayer2.r {
        long j11 = this.f22049q;
        if (j11 != -9223372036854775807L) {
            return z.a(j10, j11, 1000L);
        }
        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Can't scale timecode prior to timecodeScale being set.");
    }
}
