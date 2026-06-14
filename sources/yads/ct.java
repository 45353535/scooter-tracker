package yads;

import androidx.compose.material.TextFieldImplKt;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.work.WorkInfo;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ct extends ft {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w92 f109558g = new w92();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v92 f109559h = new v92();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f109560i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f109561j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final at[] f109562k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public at f109563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f109564m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f109565n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public bt f109566o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f109567p;

    public ct(int i10, List list) {
        this.f109561j = i10 == -1 ? 1 : i10;
        if (list != null) {
            tw.a(list);
        }
        this.f109562k = new at[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f109562k[i11] = new at();
        }
        this.f109563l = this.f109562k[0];
    }

    @Override // yads.ft
    public final void a(dt dtVar) {
        ByteBuffer byteBuffer = dtVar.f110670d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        w92 w92Var = this.f109558g;
        int iLimit = byteBuffer.limit();
        w92Var.f117356a = bArrArray;
        w92Var.f117358c = iLimit;
        w92Var.f117357b = 0;
        while (true) {
            w92 w92Var2 = this.f109558g;
            if (w92Var2.f117358c - w92Var2.f117357b < 3) {
                return;
            }
            int iM = w92Var2.m();
            int i10 = iM & 3;
            boolean z10 = (iM & 4) == 4;
            byte bM = (byte) this.f109558g.m();
            byte bM2 = (byte) this.f109558g.m();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        g();
                        int i11 = (bM & 192) >> 6;
                        int i12 = this.f109560i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            for (int i13 = 0; i13 < 8; i13++) {
                                this.f109562k[i13].b();
                            }
                            uf1.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f109560i + " current=" + i11);
                        }
                        this.f109560i = i11;
                        int i14 = bM & Utf8.REPLACEMENT_BYTE;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        bt btVar = new bt(i11, i14);
                        this.f109566o = btVar;
                        byte[] bArr = btVar.f109093c;
                        btVar.f109094d = 1;
                        bArr[0] = bM2;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalArgumentException();
                        }
                        bt btVar2 = this.f109566o;
                        if (btVar2 == null) {
                            uf1.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = btVar2.f109093c;
                            int i15 = btVar2.f109094d;
                            bArr2[i15] = bM;
                            btVar2.f109094d = i15 + 2;
                            bArr2[i15 + 1] = bM2;
                        }
                    }
                    bt btVar3 = this.f109566o;
                    if (btVar3.f109094d == (btVar3.f109092b * 2) - 1) {
                        g();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.ft
    public final gt c() {
        List list = this.f109564m;
        this.f109565n = list;
        list.getClass();
        return new gt(list);
    }

    @Override // yads.ft
    public final boolean f() {
        return this.f109564m != this.f109565n;
    }

    @Override // yads.ft, yads.ba0
    public final void flush() {
        super.flush();
        this.f109564m = null;
        this.f109565n = null;
        this.f109567p = 0;
        this.f109563l = this.f109562k[0];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f109562k[i10].b();
        }
        this.f109566o = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:57:0x0151. Please report as an issue. */
    public final void g() {
        int i10;
        boolean z10;
        int i11;
        int i12;
        char c10;
        bt btVar = this.f109566o;
        if (btVar == null) {
            return;
        }
        int i13 = 2;
        boolean z11 = true;
        if (btVar.f109094d != (btVar.f109092b * 2) - 1) {
            uf1.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f109566o.f109092b * 2) - 1) + ", but current index is " + this.f109566o.f109094d + " (sequence number " + this.f109566o.f109091a + ");");
        }
        v92 v92Var = this.f109559h;
        bt btVar2 = this.f109566o;
        v92Var.a(btVar2.f109094d, btVar2.f109093c);
        boolean z12 = false;
        while (true) {
            if (this.f109559h.b() > 0) {
                int i14 = 3;
                int iA = this.f109559h.a(3);
                int iA2 = this.f109559h.a(5);
                int i15 = 7;
                if (iA == 7) {
                    this.f109559h.c(i13);
                    iA = this.f109559h.a(6);
                    if (iA < 7) {
                        vd1.a("Invalid extended service number: ", iA, "Cea708Decoder");
                    }
                }
                if (iA2 == 0) {
                    if (iA != 0) {
                        uf1.d("Cea708Decoder", "serviceNumber is non-zero (" + iA + ") when blockSize is 0");
                    }
                } else if (iA != this.f109561j) {
                    this.f109559h.d(iA2);
                } else {
                    int iD = (iA2 * 8) + this.f109559h.d();
                    while (this.f109559h.d() < iD) {
                        int iA3 = this.f109559h.a(8);
                        if (iA3 == 16) {
                            i10 = i14;
                            z10 = true;
                            int iA4 = this.f109559h.a(8);
                            if (iA4 <= 31) {
                                i11 = 7;
                                if (iA4 > 7) {
                                    if (iA4 <= 15) {
                                        this.f109559h.c(8);
                                    } else if (iA4 <= 23) {
                                        this.f109559h.c(16);
                                    } else if (iA4 <= 31) {
                                        this.f109559h.c(24);
                                    }
                                }
                            } else {
                                i11 = 7;
                                if (iA4 <= 127) {
                                    if (iA4 == 32) {
                                        this.f109563l.a(' ');
                                    } else if (iA4 == 33) {
                                        this.f109563l.a((char) 160);
                                    } else if (iA4 == 37) {
                                        this.f109563l.a((char) 8230);
                                    } else if (iA4 == 42) {
                                        this.f109563l.a((char) 352);
                                    } else if (iA4 == 44) {
                                        this.f109563l.a((char) 338);
                                    } else if (iA4 == 63) {
                                        this.f109563l.a((char) 376);
                                    } else if (iA4 == 57) {
                                        this.f109563l.a((char) 8482);
                                    } else if (iA4 == 58) {
                                        this.f109563l.a((char) 353);
                                    } else if (iA4 == 60) {
                                        this.f109563l.a((char) 339);
                                    } else if (iA4 != 61) {
                                        switch (iA4) {
                                            case 48:
                                                this.f109563l.a((char) 9608);
                                                break;
                                            case 49:
                                                this.f109563l.a((char) 8216);
                                                break;
                                            case 50:
                                                this.f109563l.a((char) 8217);
                                                break;
                                            case 51:
                                                this.f109563l.a((char) 8220);
                                                break;
                                            case 52:
                                                this.f109563l.a((char) 8221);
                                                break;
                                            case 53:
                                                this.f109563l.a((char) 8226);
                                                break;
                                            default:
                                                switch (iA4) {
                                                    case 118:
                                                        this.f109563l.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f109563l.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f109563l.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f109563l.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f109563l.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f109563l.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f109563l.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f109563l.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f109563l.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f109563l.a((char) 9484);
                                                        break;
                                                    default:
                                                        vd1.a("Invalid G2 character: ", iA4, "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.f109563l.a((char) 8480);
                                    }
                                    i12 = 2;
                                    c10 = 6;
                                    z12 = z10;
                                    i14 = i10;
                                    i13 = i12;
                                    i15 = i11;
                                    z11 = z12;
                                } else {
                                    if (iA4 > 159) {
                                        i12 = 2;
                                        c10 = 6;
                                        if (iA4 <= 255) {
                                            if (iA4 == 160) {
                                                this.f109563l.a((char) 13252);
                                            } else {
                                                vd1.a("Invalid G3 character: ", iA4, "Cea708Decoder");
                                                this.f109563l.a('_');
                                            }
                                            z12 = z10;
                                            i14 = i10;
                                            i13 = i12;
                                            i15 = i11;
                                            z11 = z12;
                                        } else {
                                            vd1.a("Invalid extended command: ", iA4, "Cea708Decoder");
                                        }
                                    } else if (iA4 <= 135) {
                                        this.f109559h.c(32);
                                    } else if (iA4 <= 143) {
                                        this.f109559h.c(40);
                                    } else if (iA4 <= 159) {
                                        i12 = 2;
                                        this.f109559h.c(2);
                                        c10 = 6;
                                        this.f109559h.c(this.f109559h.a(6) * 8);
                                    }
                                    int i16 = i12;
                                    z11 = z10;
                                    i13 = i16;
                                    i14 = i10;
                                    i15 = i11;
                                }
                            }
                            i12 = 2;
                            c10 = 6;
                            int i162 = i12;
                            z11 = z10;
                            i13 = i162;
                            i14 = i10;
                            i15 = i11;
                        } else if (iA3 <= 31) {
                            if (iA3 != 0) {
                                if (iA3 == i14) {
                                    this.f109564m = h();
                                } else if (iA3 != 8) {
                                    switch (iA3) {
                                        case 12:
                                            for (int i17 = 0; i17 < 8; i17++) {
                                                this.f109562k[i17].b();
                                            }
                                            break;
                                        case 13:
                                            this.f109563l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iA3 >= 17 && iA3 <= 23) {
                                                vd1.a("Currently unsupported COMMAND_EXT1 Command: ", iA3, "Cea708Decoder");
                                                this.f109559h.c(8);
                                            } else if (iA3 < 24 || iA3 > 31) {
                                                vd1.a("Invalid C0 command: ", iA3, "Cea708Decoder");
                                            } else {
                                                vd1.a("Currently unsupported COMMAND_P16 Command: ", iA3, "Cea708Decoder");
                                                this.f109559h.c(16);
                                            }
                                            break;
                                    }
                                } else {
                                    at atVar = this.f109563l;
                                    int length = atVar.f108777b.length();
                                    if (length > 0) {
                                        atVar.f108777b.delete(length - 1, length);
                                    }
                                }
                            }
                            i12 = i13;
                            i11 = i15;
                            z10 = true;
                            c10 = 6;
                            i10 = i14;
                            int i1622 = i12;
                            z11 = z10;
                            i13 = i1622;
                            i14 = i10;
                            i15 = i11;
                        } else {
                            if (iA3 > 127) {
                                if (iA3 <= 159) {
                                    switch (iA3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case MRAID_JS_WRITE_FAILED_VALUE:
                                        case OMSDK_DOWNLOAD_JS_ERROR_VALUE:
                                        case OMSDK_JS_WRITE_FAILED_VALUE:
                                        case 134:
                                        case 135:
                                            i10 = i14;
                                            z10 = true;
                                            int i18 = iA3 + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                                            if (this.f109567p != i18) {
                                                this.f109567p = i18;
                                                this.f109563l = this.f109562k[i18];
                                            }
                                            break;
                                        case 136:
                                            i10 = i14;
                                            z10 = true;
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (this.f109559h.e()) {
                                                    at atVar2 = this.f109562k[8 - i19];
                                                    atVar2.f108776a.clear();
                                                    atVar2.f108777b.clear();
                                                    atVar2.f108791p = -1;
                                                    atVar2.f108792q = -1;
                                                    atVar2.f108793r = -1;
                                                    atVar2.f108795t = -1;
                                                    atVar2.f108797v = 0;
                                                }
                                            }
                                            break;
                                        case TPAT_RETRY_FAILED_VALUE:
                                            i10 = i14;
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (this.f109559h.e()) {
                                                    this.f109562k[8 - i20].f108779d = true;
                                                }
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 138:
                                            i10 = i14;
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (this.f109559h.e()) {
                                                    this.f109562k[8 - i21].f108779d = false;
                                                }
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case TsExtractor.TS_STREAM_TYPE_DTS_UHD /* 139 */:
                                            i10 = i14;
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (this.f109559h.e()) {
                                                    this.f109562k[8 - i22].f108779d = !r2.f108779d;
                                                }
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 140:
                                            i10 = i14;
                                            for (int i23 = 1; i23 <= 8; i23++) {
                                                if (this.f109559h.e()) {
                                                    this.f109562k[8 - i23].b();
                                                }
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 141:
                                            i10 = i14;
                                            this.f109559h.c(8);
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 142:
                                            i10 = i14;
                                            i12 = i13;
                                            z10 = true;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 143:
                                            i10 = i14;
                                            for (int i24 = 0; i24 < 8; i24++) {
                                                this.f109562k[i24].b();
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            c10 = 6;
                                            break;
                                        case 144:
                                            if (this.f109563l.f108778c) {
                                                this.f109559h.a(4);
                                                this.f109559h.a(2);
                                                this.f109559h.a(2);
                                                boolean zE = this.f109559h.e();
                                                boolean zE2 = this.f109559h.e();
                                                i10 = 3;
                                                this.f109559h.a(3);
                                                this.f109559h.a(3);
                                                this.f109563l.a(zE, zE2);
                                                z10 = true;
                                                i12 = 2;
                                                i11 = 7;
                                                c10 = 6;
                                            } else {
                                                this.f109559h.c(16);
                                                z10 = true;
                                                i12 = 2;
                                                i11 = 7;
                                                i10 = 3;
                                                c10 = 6;
                                            }
                                            break;
                                        case 145:
                                            if (this.f109563l.f108778c) {
                                                int iA5 = at.a(this.f109559h.a(2), this.f109559h.a(2), this.f109559h.a(2), this.f109559h.a(2));
                                                int iA6 = at.a(this.f109559h.a(2), this.f109559h.a(2), this.f109559h.a(2), this.f109559h.a(2));
                                                this.f109559h.c(2);
                                                at.a(this.f109559h.a(2), this.f109559h.a(2), this.f109559h.a(2), 0);
                                                this.f109563l.a(iA5, iA6);
                                            } else {
                                                this.f109559h.c(24);
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            i10 = 3;
                                            c10 = 6;
                                            break;
                                        case POBCoreNativeConstants.POB_NATIVE_MAIN_IMG_H /* 146 */:
                                            if (this.f109563l.f108778c) {
                                                this.f109559h.c(4);
                                                int iA7 = this.f109559h.a(4);
                                                this.f109559h.c(2);
                                                this.f109559h.a(6);
                                                at atVar3 = this.f109563l;
                                                if (atVar3.f108797v != iA7) {
                                                    atVar3.a('\n');
                                                }
                                                atVar3.f108797v = iA7;
                                            } else {
                                                this.f109559h.c(16);
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            i10 = 3;
                                            c10 = 6;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case TextFieldImplKt.AnimationDuration /* 150 */:
                                        default:
                                            vd1.a("Invalid C1 command: ", iA3, "Cea708Decoder");
                                            break;
                                        case 151:
                                            if (this.f109563l.f108778c) {
                                                int iA8 = at.a(this.f109559h.a(2), this.f109559h.a(2), this.f109559h.a(2), this.f109559h.a(2));
                                                this.f109559h.a(2);
                                                at.a(this.f109559h.a(2), this.f109559h.a(2), this.f109559h.a(2), 0);
                                                this.f109559h.e();
                                                this.f109559h.e();
                                                this.f109559h.a(2);
                                                this.f109559h.a(2);
                                                int iA9 = this.f109559h.a(2);
                                                this.f109559h.c(8);
                                                at atVar4 = this.f109563l;
                                                atVar4.f108790o = iA8;
                                                atVar4.f108787l = iA9;
                                            } else {
                                                this.f109559h.c(32);
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            i10 = 3;
                                            c10 = 6;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case ModuleDescriptor.MODULE_VERSION /* 155 */:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i25 = iA3 - 152;
                                            at atVar5 = this.f109562k[i25];
                                            this.f109559h.c(i13);
                                            boolean zE3 = this.f109559h.e();
                                            boolean zE4 = this.f109559h.e();
                                            this.f109559h.e();
                                            int iA10 = this.f109559h.a(i14);
                                            boolean zE5 = this.f109559h.e();
                                            int iA11 = this.f109559h.a(i15);
                                            int iA12 = this.f109559h.a(8);
                                            int iA13 = this.f109559h.a(4);
                                            int iA14 = this.f109559h.a(4);
                                            this.f109559h.c(i13);
                                            this.f109559h.a(6);
                                            this.f109559h.c(i13);
                                            int iA15 = this.f109559h.a(3);
                                            int iA16 = this.f109559h.a(3);
                                            atVar5.f108778c = true;
                                            atVar5.f108779d = zE3;
                                            atVar5.f108786k = zE4;
                                            atVar5.f108780e = iA10;
                                            atVar5.f108781f = zE5;
                                            atVar5.f108782g = iA11;
                                            atVar5.f108783h = iA12;
                                            atVar5.f108784i = iA13;
                                            int i26 = iA14 + 1;
                                            if (atVar5.f108785j != i26) {
                                                atVar5.f108785j = i26;
                                                while (true) {
                                                    if ((zE4 && atVar5.f108776a.size() >= atVar5.f108785j) || atVar5.f108776a.size() >= 15) {
                                                        atVar5.f108776a.remove(0);
                                                    }
                                                }
                                            }
                                            if (iA15 != 0 && atVar5.f108788m != iA15) {
                                                atVar5.f108788m = iA15;
                                                int i27 = iA15 - 1;
                                                int i28 = at.C[i27];
                                                boolean z13 = at.B[i27];
                                                int i29 = at.f108775z[i27];
                                                int i30 = at.A[i27];
                                                int i31 = at.f108774y[i27];
                                                atVar5.f108790o = i28;
                                                atVar5.f108787l = i31;
                                            }
                                            if (iA16 != 0 && atVar5.f108789n != iA16) {
                                                atVar5.f108789n = iA16;
                                                int i32 = iA16 - 1;
                                                int i33 = at.E[i32];
                                                int i34 = at.D[i32];
                                                atVar5.a(false, false);
                                                atVar5.a(at.f108772w, at.F[i32]);
                                            }
                                            if (this.f109567p != i25) {
                                                this.f109567p = i25;
                                                this.f109563l = this.f109562k[i25];
                                            }
                                            z10 = true;
                                            i12 = 2;
                                            i11 = 7;
                                            i10 = 3;
                                            c10 = 6;
                                            break;
                                    }
                                    z12 = z10;
                                    i14 = i10;
                                    i13 = i12;
                                    i15 = i11;
                                    z11 = z12;
                                } else {
                                    i10 = i14;
                                    z10 = true;
                                    if (iA3 <= 255) {
                                        this.f109563l.a((char) (iA3 & 255));
                                    } else {
                                        vd1.a("Invalid base command: ", iA3, "Cea708Decoder");
                                        i12 = 2;
                                        i11 = 7;
                                        c10 = 6;
                                        int i16222 = i12;
                                        z11 = z10;
                                        i13 = i16222;
                                        i14 = i10;
                                        i15 = i11;
                                    }
                                }
                                i12 = 2;
                                i11 = 7;
                                c10 = 6;
                                z12 = z10;
                                i14 = i10;
                                i13 = i12;
                                i15 = i11;
                                z11 = z12;
                            } else if (iA3 == 127) {
                                this.f109563l.a((char) 9835);
                            } else {
                                this.f109563l.a((char) (iA3 & 255));
                            }
                            i12 = i13;
                            i11 = i15;
                            z10 = true;
                            c10 = 6;
                            i10 = i14;
                            z12 = z10;
                            i14 = i10;
                            i13 = i12;
                            i15 = i11;
                            z11 = z12;
                        }
                    }
                    z11 = z11;
                    i13 = i13;
                }
            }
        }
        if (z12) {
            this.f109564m = h();
        }
        this.f109566o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List h() {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ct.h():java.util.List");
    }
}
