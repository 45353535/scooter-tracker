package gb;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.collection.SieveCacheKt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.FirebaseError;
import io.bidmachine.media3.common.DrmInitData;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import lb.t;
import oa.h;
import oa.l0;
import oa.m0;
import oa.q;
import oa.r;
import oa.s;
import oa.s0;
import oa.t0;
import oa.w;
import oa.x;
import q9.d0;
import q9.o0;
import q9.u;
import q9.v;

/* JADX INFO: loaded from: classes12.dex */
public class e implements r {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final x f72647f0 = new x() { // from class: gb.d
        @Override // oa.x
        public /* synthetic */ x a(t.a aVar) {
            return w.d(this, aVar);
        }

        @Override // oa.x
        public /* synthetic */ x b(int i10) {
            return w.b(this, i10);
        }

        @Override // oa.x
        public final r[] createExtractors() {
            return e.d();
        }

        @Override // oa.x
        public /* synthetic */ x experimentalSetTextTrackTranscodingEnabled(boolean z10) {
            return w.c(this, z10);
        }

        @Override // oa.x
        public /* synthetic */ r[] createExtractors(Uri uri, Map map) {
            return w.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f72648g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final byte[] f72649h0 = o0.u0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final byte[] f72650i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final byte[] f72651j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final UUID f72652k0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Map f72653l0;
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private v F;
    private v G;
    private boolean H;
    private boolean I;
    private int J;
    private long K;
    private long L;
    private int M;
    private int N;
    private int[] O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private long U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gb.c f72654a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f72655a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f72656b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f72657b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f72658c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private byte f72659c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f72660d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f72661d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f72662e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private oa.t f72663e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t.a f72664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d0 f72665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f72666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d0 f72667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f72668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d0 f72669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d0 f72670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f72671m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d0 f72672n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f72673o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final d0 f72674p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ByteBuffer f72675q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f72676r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f72677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f72678t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f72679u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f72680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f72681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f72682x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f72683y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f72684z;

    private final class b implements gb.b {
        private b() {
        }

        @Override // gb.b
        public void a(int i10, int i11, s sVar) throws n9.x {
            e.this.k(i10, i11, sVar);
        }

        @Override // gb.b
        public void endMasterElement(int i10) throws n9.x {
            e.this.n(i10);
        }

        @Override // gb.b
        public void floatElement(int i10, double d10) {
            e.this.q(i10, d10);
        }

        @Override // gb.b
        public int getElementType(int i10) {
            return e.this.t(i10);
        }

        @Override // gb.b
        public void integerElement(int i10, long j10) throws n9.x {
            e.this.w(i10, j10);
        }

        @Override // gb.b
        public boolean isLevel1Element(int i10) {
            return e.this.y(i10);
        }

        @Override // gb.b
        public void startMasterElement(int i10, long j10, long j11) throws n9.x {
            e.this.E(i10, j10, j11);
        }

        @Override // gb.b
        public void stringElement(int i10, String str) throws n9.x {
            e.this.F(i10, str);
        }
    }

    protected static final class c {
        public byte[] P;
        public t0 V;
        public boolean W;
        public s0 Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f72686a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f72687a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f72688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f72689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f72690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f72691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f72692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f72693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f72694h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f72695i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f72696j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public s0.a f72697k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f72698l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public DrmInitData f72699m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f72700n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f72701o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f72702p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f72703q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f72704r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f72705s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f72706t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f72707u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f72708v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f72709w = 0.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f72710x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f72711y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f72712z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = 200;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0;
        public long U = 0;
        public boolean X = true;
        private String Y = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            q9.a.e(this.Z);
        }

        private byte[] g(String str) throws n9.x {
            byte[] bArr = this.f72698l;
            if (bArr != null) {
                return bArr;
            }
            throw n9.x.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f || this.N == -1.0f || this.O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.N + 0.5f));
            byteBufferOrder.putShort((short) (this.O + 0.5f));
            byteBufferOrder.putShort((short) this.D);
            byteBufferOrder.putShort((short) this.E);
            return bArr;
        }

        private static Pair k(d0 d0Var) throws n9.x {
            try {
                d0Var.X(16);
                long jX = d0Var.x();
                if (jX == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (jX == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (jX != 826496599) {
                    u.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] bArrE = d0Var.e();
                for (int iF = d0Var.f() + 20; iF < bArrE.length - 4; iF++) {
                    if (bArrE[iF] == 0 && bArrE[iF + 1] == 0 && bArrE[iF + 2] == 1 && bArrE[iF + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrE, iF, bArrE.length)));
                    }
                }
                throw n9.x.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw n9.x.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(d0 d0Var) throws n9.x {
            try {
                int iZ = d0Var.z();
                if (iZ == 1) {
                    return true;
                }
                if (iZ == 65534) {
                    d0Var.W(24);
                    if (d0Var.A() == e.f72652k0.getMostSignificantBits()) {
                        if (d0Var.A() == e.f72652k0.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw n9.x.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List m(byte[] bArr) throws n9.x {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw n9.x.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw n9.x.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw n9.x.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw n9.x.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw n9.x.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            return "A_OPUS".equals(this.f72689c) ? z10 : this.f72693g > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:219:0x044d  */
        /* JADX WARN: Removed duplicated region for block: B:224:0x0466  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0468  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x0475  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x0487  */
        /* JADX WARN: Removed duplicated region for block: B:276:0x055b  */
        /* JADX WARN: Removed duplicated region for block: B:296:0x05b2  */
        /* JADX WARN: Removed duplicated region for block: B:301:0x05cd  */
        /* JADX WARN: Removed duplicated region for block: B:302:0x05d0  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(oa.t r19, int r20) throws n9.x {
            /*
                Method dump skipped, instruction units count: 1748
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: gb.e.c.i(oa.t, int):void");
        }

        public void j() {
            t0 t0Var = this.V;
            if (t0Var != null) {
                t0Var.a(this.Z, this.f72697k);
            }
        }

        public void n() {
            t0 t0Var = this.V;
            if (t0Var != null) {
                t0Var.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f72653l0 = DesugarCollections.unmodifiableMap(map);
    }

    public e(t.a aVar, int i10) {
        this(new gb.a(), i10, aVar);
    }

    private void A(s sVar, int i10) {
        if (this.f72667i.g() >= i10) {
            return;
        }
        if (this.f72667i.b() < i10) {
            d0 d0Var = this.f72667i;
            d0Var.c(Math.max(d0Var.b() * 2, i10));
        }
        sVar.readFully(this.f72667i.e(), this.f72667i.g(), i10 - this.f72667i.g());
        this.f72667i.V(i10);
    }

    private void B() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f72655a0 = false;
        this.f72657b0 = 0;
        this.f72659c0 = (byte) 0;
        this.f72661d0 = false;
        this.f72670l.S(0);
    }

    private long C(long j10) throws n9.x {
        long j11 = this.f72678t;
        if (j11 != -9223372036854775807L) {
            return o0.c1(j10, j11, 1000L);
        }
        throw n9.x.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void D(String str, long j10, byte[] bArr) {
        byte[] bArrR;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                bArrR = r(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrR = r(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrR = r(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrR, 0, bArr, i10, bArrR.length);
    }

    private int G(s sVar, c cVar, int i10, boolean z10) throws n9.x {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f72689c)) {
            H(sVar, f72648g0, i10);
            return p();
        }
        if ("S_TEXT/ASS".equals(cVar.f72689c)) {
            H(sVar, f72650i0, i10);
            return p();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f72689c)) {
            H(sVar, f72651j0, i10);
            return p();
        }
        s0 s0Var = cVar.Z;
        if (!this.Y) {
            if (cVar.f72695i) {
                this.R &= -1073741825;
                if (!this.Z) {
                    sVar.readFully(this.f72667i.e(), 0, 1);
                    this.V++;
                    if ((this.f72667i.e()[0] & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                        throw n9.x.a("Extension bit is set in signal byte", null);
                    }
                    this.f72659c0 = this.f72667i.e()[0];
                    this.Z = true;
                }
                byte b10 = this.f72659c0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.f72661d0) {
                        sVar.readFully(this.f72672n.e(), 0, 8);
                        this.V += 8;
                        this.f72661d0 = true;
                        this.f72667i.e()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f72667i.W(0);
                        s0Var.a(this.f72667i, 1, 1);
                        this.W++;
                        this.f72672n.W(0);
                        s0Var.a(this.f72672n, 8, 1);
                        this.W += 8;
                    }
                    if (z11) {
                        if (!this.f72655a0) {
                            sVar.readFully(this.f72667i.e(), 0, 1);
                            this.V++;
                            this.f72667i.W(0);
                            this.f72657b0 = this.f72667i.H();
                            this.f72655a0 = true;
                        }
                        int i12 = this.f72657b0 * 4;
                        this.f72667i.S(i12);
                        sVar.readFully(this.f72667i.e(), 0, i12);
                        this.V += i12;
                        short s10 = (short) ((this.f72657b0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f72675q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f72675q = ByteBuffer.allocate(i13);
                        }
                        this.f72675q.position(0);
                        this.f72675q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f72657b0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iL = this.f72667i.L();
                            if (i14 % 2 == 0) {
                                this.f72675q.putShort((short) (iL - i15));
                            } else {
                                this.f72675q.putInt(iL - i15);
                            }
                            i14++;
                            i15 = iL;
                        }
                        int i16 = (i10 - this.V) - i15;
                        if (i11 % 2 == 1) {
                            this.f72675q.putInt(i16);
                        } else {
                            this.f72675q.putShort((short) i16);
                            this.f72675q.putInt(0);
                        }
                        this.f72673o.U(this.f72675q.array(), i13);
                        s0Var.a(this.f72673o, i13, 1);
                        this.W += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f72696j;
                if (bArr != null) {
                    this.f72670l.U(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.R |= 268435456;
                this.f72674p.S(0);
                int iG = (this.f72670l.g() + i10) - this.V;
                this.f72667i.S(4);
                this.f72667i.e()[0] = (byte) ((iG >> 24) & 255);
                this.f72667i.e()[1] = (byte) ((iG >> 16) & 255);
                this.f72667i.e()[2] = (byte) ((iG >> 8) & 255);
                this.f72667i.e()[3] = (byte) (iG & 255);
                s0Var.a(this.f72667i, 4, 2);
                this.W += 4;
            }
            this.Y = true;
        }
        int iG2 = i10 + this.f72670l.g();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f72689c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f72689c)) {
            if (cVar.V != null) {
                q9.a.g(this.f72670l.g() == 0);
                cVar.V.d(sVar);
            }
            while (true) {
                int i17 = this.V;
                if (i17 >= iG2) {
                    break;
                }
                int I = I(sVar, s0Var, iG2 - i17);
                this.V += I;
                this.W += I;
            }
        } else {
            byte[] bArrE = this.f72666h.e();
            bArrE[0] = 0;
            bArrE[1] = 0;
            bArrE[2] = 0;
            int i18 = cVar.f72687a0;
            int i19 = 4 - i18;
            while (this.V < iG2) {
                int i20 = this.X;
                if (i20 == 0) {
                    J(sVar, bArrE, i19, i18);
                    this.V += i18;
                    this.f72666h.W(0);
                    this.X = this.f72666h.L();
                    this.f72665g.W(0);
                    s0Var.c(this.f72665g, 4);
                    this.W += 4;
                } else {
                    int I2 = I(sVar, s0Var, i20);
                    this.V += I2;
                    this.W += I2;
                    this.X -= I2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f72689c)) {
            this.f72668j.W(0);
            s0Var.c(this.f72668j, 4);
            this.W += 4;
        }
        return p();
    }

    private void H(s sVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f72671m.b() < length) {
            this.f72671m.T(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f72671m.e(), 0, bArr.length);
        }
        sVar.readFully(this.f72671m.e(), bArr.length, i10);
        this.f72671m.W(0);
        this.f72671m.V(length);
    }

    private int I(s sVar, s0 s0Var, int i10) {
        int iA = this.f72670l.a();
        if (iA <= 0) {
            return s0Var.b(sVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        s0Var.c(this.f72670l, iMin);
        return iMin;
    }

    private void J(s sVar, byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f72670l.a());
        sVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f72670l.l(bArr, i10, iMin);
        }
    }

    public static /* synthetic */ r[] d() {
        return new r[]{new e(t.a.f94119a, 2)};
    }

    private void h(int i10) throws n9.x {
        if (this.F == null || this.G == null) {
            throw n9.x.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void i(int i10) throws n9.x {
        if (this.f72682x != null) {
            return;
        }
        throw n9.x.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void j() {
        q9.a.i(this.f72663e0);
    }

    private m0 l(v vVar, v vVar2) {
        int i10;
        if (this.f72677s == -1 || this.f72680v == -9223372036854775807L || vVar == null || vVar.d() == 0 || vVar2 == null || vVar2.d() != vVar.d()) {
            return new m0.b(this.f72680v);
        }
        int iD = vVar.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            jArrCopyOf3[i12] = vVar.c(i12);
            jArrCopyOf[i12] = this.f72677s + vVar2.c(i12);
        }
        while (true) {
            i10 = iD - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArrCopyOf3[i14] > this.f72680v) {
            i14--;
        }
        iArrCopyOf[i14] = (int) ((this.f72677s + this.f72676r) - jArrCopyOf[i14]);
        jArrCopyOf2[i14] = this.f72680v - jArrCopyOf3[i14];
        if (i14 < i10) {
            u.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
        }
        return new h(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m(gb.e.c r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.e.m(gb.e$c, long, int, int, int):void");
    }

    private static int[] o(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int p() {
        int i10 = this.W;
        B();
        return i10;
    }

    private static byte[] r(long j10, String str, long j11) {
        q9.a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return o0.u0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean x(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b10 = 0;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b10 = 1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b10 = 2;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b10 = 3;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b10 = 4;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b10 = 5;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b10 = 6;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b10 = 7;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b10 = 8;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b10 = 9;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b10 = 10;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b10 = Ascii.VT;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b10 = Ascii.FF;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b10 = 13;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b10 = Ascii.SO;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b10 = Ascii.SI;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b10 = Ascii.DLE;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b10 = 17;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b10 = Ascii.DC2;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b10 = 19;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b10 = Ascii.DC4;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b10 = Ascii.NAK;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b10 = Ascii.SYN;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b10 = Ascii.ETB;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b10 = Ascii.CAN;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b10 = Ascii.EM;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b10 = Ascii.SUB;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b10 = Ascii.ESC;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b10 = Ascii.FS;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b10 = Ascii.GS;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b10 = Ascii.RS;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b10 = Ascii.US;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b10 = 32;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    private boolean z(l0 l0Var, long j10) {
        if (this.B) {
            this.D = j10;
            l0Var.f96583a = this.C;
            this.B = false;
            return true;
        }
        if (this.f72683y) {
            long j11 = this.D;
            if (j11 != -1) {
                l0Var.f96583a = j11;
                this.D = -1L;
                return true;
            }
        }
        return false;
    }

    protected void E(int i10, long j10, long j11) throws n9.x {
        j();
        if (i10 == 160) {
            this.T = false;
            this.U = 0L;
            return;
        }
        if (i10 == 174) {
            c cVar = new c();
            this.f72682x = cVar;
            cVar.f72686a = this.f72681w;
            return;
        }
        if (i10 == 187) {
            this.H = false;
            return;
        }
        if (i10 == 19899) {
            this.f72684z = -1;
            this.A = -1L;
            return;
        }
        if (i10 == 20533) {
            s(i10).f72695i = true;
            return;
        }
        if (i10 == 21968) {
            s(i10).f72712z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f72677s;
            if (j12 != -1 && j12 != j10) {
                throw n9.x.a("Multiple Segment elements not supported", null);
            }
            this.f72677s = j10;
            this.f72676r = j11;
            return;
        }
        if (i10 == 475249515) {
            this.F = new v();
            this.G = new v();
        } else if (i10 == 524531317 && !this.f72683y) {
            if (this.f72660d && this.C != -1) {
                this.B = true;
            } else {
                this.f72663e0.e(new m0.b(this.f72680v));
                this.f72683y = true;
            }
        }
    }

    protected void F(int i10, String str) throws n9.x {
        if (i10 == 134) {
            s(i10).f72689c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                s(i10).f72688b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                s(i10).Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f72681w = Objects.equals(str, "webm");
            return;
        }
        throw n9.x.a("DocType " + str + " not supported", null);
    }

    @Override // oa.r
    public final int a(s sVar, l0 l0Var) {
        this.I = false;
        boolean zA = true;
        while (zA && !this.I) {
            zA = this.f72654a.a(sVar);
            if (zA && z(l0Var, sVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f72658c.size(); i10++) {
            c cVar = (c) this.f72658c.valueAt(i10);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    @Override // oa.r
    public final void b(oa.t tVar) {
        if (this.f72662e) {
            tVar = new lb.u(tVar, this.f72664f);
        }
        this.f72663e0 = tVar;
    }

    @Override // oa.r
    public final boolean c(s sVar) {
        return new f().b(sVar);
    }

    @Override // oa.r
    public /* synthetic */ List getSniffFailureDetails() {
        return q.a(this);
    }

    @Override // oa.r
    public /* synthetic */ r getUnderlyingImplementation() {
        return q.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void k(int i10, int i11, s sVar) throws n9.x {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        s sVar2 = sVar;
        int i20 = 0;
        int i21 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.J != 2) {
                    return;
                }
                v((c) this.f72658c.get(this.P), this.S, sVar2, i11);
                return;
            }
            if (i10 == 16877) {
                u(s(i10), sVar2, i11);
                return;
            }
            if (i10 == 16981) {
                i(i10);
                byte[] bArr = new byte[i11];
                this.f72682x.f72696j = bArr;
                sVar2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                sVar2.readFully(bArr2, 0, i11);
                s(i10).f72697k = new s0.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f72669k.e(), (byte) 0);
                sVar2.readFully(this.f72669k.e(), 4 - i11, i11);
                this.f72669k.W(0);
                this.f72684z = (int) this.f72669k.J();
                return;
            }
            if (i10 == 25506) {
                i(i10);
                byte[] bArr3 = new byte[i11];
                this.f72682x.f72698l = bArr3;
                sVar2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw n9.x.a("Unexpected id: " + i10, null);
            }
            i(i10);
            byte[] bArr4 = new byte[i11];
            this.f72682x.f72710x = bArr4;
            sVar2.readFully(bArr4, 0, i11);
            return;
        }
        int i22 = 8;
        if (this.J == 0) {
            this.P = (int) this.f72656b.d(sVar2, false, true, 8);
            this.Q = this.f72656b.b();
            this.L = -9223372036854775807L;
            this.J = 1;
            this.f72667i.S(0);
        }
        c cVar = (c) this.f72658c.get(this.P);
        if (cVar == null) {
            sVar2.skipFully(i11 - this.Q);
            this.J = 0;
            return;
        }
        cVar.f();
        if (this.J == 1) {
            A(sVar2, 3);
            int i23 = (this.f72667i.e()[2] & 6) >> 1;
            if (i23 == 0) {
                this.N = 1;
                int[] iArrO = o(this.O, 1);
                this.O = iArrO;
                iArrO[0] = (i11 - this.Q) - 3;
            } else {
                A(sVar2, 4);
                int i24 = (this.f72667i.e()[3] & 255) + 1;
                this.N = i24;
                int[] iArrO2 = o(this.O, i24);
                this.O = iArrO2;
                if (i23 == 2) {
                    int i25 = (i11 - this.Q) - 4;
                    int i26 = this.N;
                    Arrays.fill(iArrO2, 0, i26, i25 / i26);
                } else {
                    if (i23 != 1) {
                        if (i23 != 3) {
                            throw n9.x.a("Unexpected lacing value: " + i23, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = this.N;
                            i12 = i21;
                            if (i27 >= i30 - 1) {
                                i13 = i20;
                                this.O[i30 - 1] = ((i11 - this.Q) - i29) - i28;
                                break;
                            }
                            this.O[i27] = i20;
                            int i31 = i29 + 1;
                            A(sVar2, i31);
                            if (this.f72667i.e()[i29] == 0) {
                                throw n9.x.a("No valid varint length mask found", null);
                            }
                            int i32 = i20;
                            while (true) {
                                if (i32 >= i22) {
                                    i14 = i20;
                                    i15 = i22;
                                    i16 = i27;
                                    j10 = 0;
                                    break;
                                }
                                i15 = i22;
                                int i33 = i12 << (7 - i32);
                                i14 = i20;
                                if ((this.f72667i.e()[i29] & i33) != 0) {
                                    i31 += i32;
                                    A(sVar2, i31);
                                    int i34 = i29 + 1;
                                    j10 = this.f72667i.e()[i29] & 255 & (~i33);
                                    while (true) {
                                        int i35 = i34;
                                        if (i35 >= i31) {
                                            break;
                                        }
                                        i34 = i35 + 1;
                                        j10 = (j10 << i15) | ((long) (this.f72667i.e()[i35] & 255));
                                        i27 = i27;
                                    }
                                    i16 = i27;
                                    if (i16 > 0) {
                                        j10 -= (1 << ((i32 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i32++;
                                    sVar2 = sVar;
                                    i20 = i14;
                                    i22 = i15;
                                }
                            }
                            i29 = i31;
                            if (j10 < SieveCacheKt.NodeMetaAndPreviousMask || j10 > SieveCacheKt.NodeLinkMask) {
                                break;
                            }
                            int i36 = (int) j10;
                            int[] iArr = this.O;
                            if (i16 != 0) {
                                i36 += iArr[i16 - 1];
                            }
                            iArr[i16] = i36;
                            i28 += i36;
                            i27 = i16 + 1;
                            sVar2 = sVar;
                            i21 = i12;
                            i20 = i14;
                            i22 = i15;
                        }
                        throw n9.x.a("EBML lacing sample size out of range.", null);
                    }
                    int i37 = 0;
                    int i38 = 0;
                    int i39 = 4;
                    while (true) {
                        i17 = this.N;
                        if (i37 >= i17 - 1) {
                            break;
                        }
                        this.O[i37] = 0;
                        while (true) {
                            i18 = i39 + 1;
                            A(sVar2, i18);
                            int i40 = this.f72667i.e()[i39] & 255;
                            int[] iArr2 = this.O;
                            i19 = iArr2[i37] + i40;
                            iArr2[i37] = i19;
                            if (i40 != 255) {
                                break;
                            } else {
                                i39 = i18;
                            }
                        }
                        i38 += i19;
                        i37++;
                        i39 = i18;
                    }
                    this.O[i17 - 1] = ((i11 - this.Q) - i39) - i38;
                }
            }
            i13 = 0;
            i12 = 1;
            this.K = this.E + C((this.f72667i.e()[i13] << 8) | (this.f72667i.e()[i12] & 255));
            this.R = (cVar.f72691e == 2 || (i10 == 163 && (this.f72667i.e()[2] & 128) == 128)) ? i12 : i13;
            this.J = 2;
            this.M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i41 = this.M;
                if (i41 >= this.N) {
                    this.J = 0;
                    return;
                }
                int iG = G(sVar, cVar, this.O[i41], false);
                c cVar2 = cVar;
                m(cVar2, this.K + ((long) ((this.M * cVar.f72692f) / 1000)), this.R, iG, 0);
                this.M++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i42 = this.M;
                if (i42 >= this.N) {
                    return;
                }
                int[] iArr3 = this.O;
                boolean z10 = i12;
                iArr3[i42] = G(sVar, cVar, iArr3[i42], z10);
                this.M += z10 ? 1 : 0;
            }
        }
    }

    protected void n(int i10) throws n9.x {
        j();
        if (i10 == 160) {
            if (this.J != 2) {
                return;
            }
            c cVar = (c) this.f72658c.get(this.P);
            cVar.f();
            if (this.U > 0 && "A_OPUS".equals(cVar.f72689c)) {
                this.f72674p.T(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.U).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.N; i12++) {
                i11 += this.O[i12];
            }
            int i13 = 0;
            while (i13 < this.N) {
                long j10 = this.K + ((long) ((cVar.f72692f * i13) / 1000));
                int i14 = this.R;
                if (i13 == 0 && !this.T) {
                    i14 |= 1;
                }
                int i15 = this.O[i13];
                int i16 = i11 - i15;
                m(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.J = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) q9.a.i(this.f72682x);
            String str = cVar2.f72689c;
            if (str == null) {
                throw n9.x.a("CodecId is missing in TrackEntry element", null);
            }
            if (x(str)) {
                cVar2.i(this.f72663e0, cVar2.f72690d);
                this.f72658c.put(cVar2.f72690d, cVar2);
            }
            this.f72682x = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f72684z;
            if (i17 != -1) {
                long j11 = this.A;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.C = j11;
                        return;
                    }
                    return;
                }
            }
            throw n9.x.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            i(i10);
            c cVar3 = this.f72682x;
            if (cVar3.f72695i) {
                if (cVar3.f72697k == null) {
                    throw n9.x.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f72699m = new DrmInitData(new DrmInitData.SchemeData(n9.f.f95287a, "video/webm", this.f72682x.f72697k.f96643b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            i(i10);
            c cVar4 = this.f72682x;
            if (cVar4.f72695i && cVar4.f72696j != null) {
                throw n9.x.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f72678t == -9223372036854775807L) {
                this.f72678t = 1000000L;
            }
            long j12 = this.f72679u;
            if (j12 != -9223372036854775807L) {
                this.f72680v = C(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f72658c.size() == 0) {
                throw n9.x.a("No valid tracks were found", null);
            }
            this.f72663e0.endTracks();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f72683y) {
                this.f72663e0.e(l(this.F, this.G));
                this.f72683y = true;
            }
            this.F = null;
            this.G = null;
        }
    }

    protected void q(int i10, double d10) {
        if (i10 == 181) {
            s(i10).S = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f72679u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                s(i10).F = (float) d10;
                break;
            case 21970:
                s(i10).G = (float) d10;
                break;
            case 21971:
                s(i10).H = (float) d10;
                break;
            case 21972:
                s(i10).I = (float) d10;
                break;
            case 21973:
                s(i10).J = (float) d10;
                break;
            case 21974:
                s(i10).K = (float) d10;
                break;
            case 21975:
                s(i10).L = (float) d10;
                break;
            case 21976:
                s(i10).M = (float) d10;
                break;
            case 21977:
                s(i10).N = (float) d10;
                break;
            case 21978:
                s(i10).O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        s(i10).f72707u = (float) d10;
                        break;
                    case 30324:
                        s(i10).f72708v = (float) d10;
                        break;
                    case 30325:
                        s(i10).f72709w = (float) d10;
                        break;
                }
                break;
        }
    }

    protected c s(int i10) throws n9.x {
        i(i10);
        return this.f72682x;
    }

    @Override // oa.r
    public void seek(long j10, long j11) {
        this.E = -9223372036854775807L;
        this.J = 0;
        this.f72654a.reset();
        this.f72656b.e();
        B();
        for (int i10 = 0; i10 < this.f72658c.size(); i10++) {
            ((c) this.f72658c.valueAt(i10)).n();
        }
    }

    protected int t(int i10) {
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case 136:
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void u(c cVar, s sVar, int i10) {
        if (cVar.f72694h != 1685485123 && cVar.f72694h != 1685480259) {
            sVar.skipFully(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.P = bArr;
        sVar.readFully(bArr, 0, i10);
    }

    protected void v(c cVar, int i10, s sVar, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f72689c)) {
            sVar.skipFully(i11);
        } else {
            this.f72674p.S(i11);
            sVar.readFully(this.f72674p.e(), 0, i11);
        }
    }

    protected void w(int i10, long j10) throws n9.x {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw n9.x.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw n9.x.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                s(i10).f72691e = (int) j10;
                return;
            case 136:
                s(i10).X = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                this.L = C(j10);
                return;
            case 159:
                s(i10).Q = (int) j10;
                return;
            case 176:
                s(i10).f72700n = (int) j10;
                return;
            case 179:
                h(i10);
                this.F.a(C(j10));
                return;
            case 186:
                s(i10).f72701o = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                s(i10).f72690d = (int) j10;
                return;
            case 231:
                this.E = C(j10);
                return;
            case 238:
                this.S = (int) j10;
                return;
            case 241:
                if (this.H) {
                    return;
                }
                h(i10);
                this.G.a(j10);
                this.H = true;
                return;
            case 251:
                this.T = true;
                return;
            case 16871:
                s(i10).f72694h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw n9.x.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw n9.x.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw n9.x.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw n9.x.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw n9.x.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.A = j10 + this.f72677s;
                return;
            case 21432:
                int i11 = (int) j10;
                i(i10);
                if (i11 == 0) {
                    this.f72682x.f72711y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f72682x.f72711y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f72682x.f72711y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f72682x.f72711y = 3;
                    return;
                }
            case 21680:
                s(i10).f72703q = (int) j10;
                return;
            case 21682:
                s(i10).f72705s = (int) j10;
                return;
            case 21690:
                s(i10).f72704r = (int) j10;
                return;
            case 21930:
                s(i10).W = j10 == 1;
                return;
            case 21938:
                i(i10);
                c cVar = this.f72682x;
                cVar.f72712z = true;
                cVar.f72702p = (int) j10;
                return;
            case 21998:
                s(i10).f72693g = (int) j10;
                return;
            case 22186:
                s(i10).T = j10;
                return;
            case 22203:
                s(i10).U = j10;
                return;
            case 25188:
                s(i10).R = (int) j10;
                return;
            case 30114:
                this.U = j10;
                return;
            case 30321:
                i(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f72682x.f72706t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f72682x.f72706t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f72682x.f72706t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f72682x.f72706t = 3;
                    return;
                }
            case 2352003:
                s(i10).f72692f = (int) j10;
                return;
            case 2807729:
                this.f72678t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        i(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f72682x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f72682x.C = 1;
                            return;
                        }
                    case 21946:
                        i(i10);
                        int iK = n9.g.k((int) j10);
                        if (iK != -1) {
                            this.f72682x.B = iK;
                            return;
                        }
                        return;
                    case 21947:
                        i(i10);
                        this.f72682x.f72712z = true;
                        int iJ = n9.g.j((int) j10);
                        if (iJ != -1) {
                            this.f72682x.A = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        s(i10).D = (int) j10;
                        return;
                    case 21949:
                        s(i10).E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    protected boolean y(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    e(gb.c cVar, int i10, t.a aVar) {
        this.f72677s = -1L;
        this.f72678t = -9223372036854775807L;
        this.f72679u = -9223372036854775807L;
        this.f72680v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f72654a = cVar;
        cVar.b(new b());
        this.f72664f = aVar;
        this.f72660d = (i10 & 1) == 0;
        this.f72662e = (i10 & 2) == 0;
        this.f72656b = new g();
        this.f72658c = new SparseArray();
        this.f72667i = new d0(4);
        this.f72668j = new d0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f72669k = new d0(4);
        this.f72665g = new d0(r9.f.f99242a);
        this.f72666h = new d0(4);
        this.f72670l = new d0();
        this.f72671m = new d0();
        this.f72672n = new d0(8);
        this.f72673o = new d0();
        this.f72674p = new d0();
        this.O = new int[1];
    }

    @Override // oa.r
    public final void release() {
    }
}
