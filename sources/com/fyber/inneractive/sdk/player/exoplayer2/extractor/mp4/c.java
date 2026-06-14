package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.adjust.sdk.Constants;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final int A0;
    public static final int B0;
    public static final int C0;
    public static final int D0;
    public static final int E0;
    public static final int F0;
    public static final int G0;
    public static final int H0;
    public static final int I0;
    public static final int J0;
    public static final int K0;
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final int O0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f22114l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f22116m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f22118n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f22120o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f22122p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f22124q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f22126r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f22128s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f22130t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f22132u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f22134v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f22136w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f22138x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f22140y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f22142z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f22093b = z.a("ftyp");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f22095c = z.a("avc1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f22097d = z.a("avc3");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f22099e = z.a("hvc1");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f22101f = z.a("hev1");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f22103g = z.a("s263");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f22105h = z.a("d263");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f22107i = z.a("mdat");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f22109j = z.a("mp4a");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f22111k = z.a(".mp3");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f22113l = z.a("wave");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f22115m = z.a("lpcm");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f22117n = z.a("sowt");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f22119o = z.a("ac-3");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f22121p = z.a("dac3");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f22123q = z.a("ec-3");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f22125r = z.a("dec3");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f22127s = z.a("dtsc");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f22129t = z.a("dtsh");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f22131u = z.a("dtsl");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f22133v = z.a("dtse");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f22135w = z.a("ddts");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f22137x = z.a("tfdt");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f22139y = z.a("tfhd");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f22141z = z.a("trex");
    public static final int A = z.a("trun");
    public static final int B = z.a("sidx");
    public static final int C = z.a("moov");
    public static final int D = z.a("mvhd");
    public static final int E = z.a("trak");
    public static final int F = z.a("mdia");
    public static final int G = z.a("minf");
    public static final int H = z.a("stbl");
    public static final int I = z.a("avcC");
    public static final int J = z.a("hvcC");
    public static final int K = z.a("esds");
    public static final int L = z.a("moof");
    public static final int M = z.a("traf");
    public static final int N = z.a("mvex");
    public static final int O = z.a("mehd");
    public static final int P = z.a("tkhd");
    public static final int Q = z.a("edts");
    public static final int R = z.a("elst");
    public static final int S = z.a("mdhd");
    public static final int T = z.a("hdlr");
    public static final int U = z.a("stsd");
    public static final int V = z.a("pssh");
    public static final int W = z.a("sinf");
    public static final int X = z.a("schm");
    public static final int Y = z.a("schi");
    public static final int Z = z.a("tenc");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f22092a0 = z.a("encv");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f22094b0 = z.a("enca");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f22096c0 = z.a("frma");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f22098d0 = z.a("saiz");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f22100e0 = z.a("saio");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f22102f0 = z.a("sbgp");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f22104g0 = z.a("sgpd");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f22106h0 = z.a(CommonUrlParts.UUID);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f22108i0 = z.a("senc");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f22110j0 = z.a("pasp");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f22112k0 = z.a("TTML");

    static {
        z.a("vmhd");
        f22114l0 = z.a("mp4v");
        f22116m0 = z.a("stts");
        f22118n0 = z.a("stss");
        f22120o0 = z.a("ctts");
        f22122p0 = z.a("stsc");
        f22124q0 = z.a("stsz");
        f22126r0 = z.a("stz2");
        f22128s0 = z.a("stco");
        f22130t0 = z.a("co64");
        f22132u0 = z.a("tx3g");
        f22134v0 = z.a("wvtt");
        f22136w0 = z.a("stpp");
        f22138x0 = z.a("c608");
        f22140y0 = z.a("samr");
        f22142z0 = z.a("sawb");
        A0 = z.a("udta");
        B0 = z.a(Constants.REFERRER_API_META);
        C0 = z.a("ilst");
        D0 = z.a("mean");
        E0 = z.a("name");
        F0 = z.a("data");
        G0 = z.a("emsg");
        H0 = z.a("st3d");
        I0 = z.a("sv3d");
        J0 = z.a("proj");
        K0 = z.a("vp08");
        L0 = z.a("vp09");
        M0 = z.a("vpcC");
        N0 = z.a("camm");
        O0 = z.a("alac");
    }

    public c(int i10) {
        this.f22143a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f22143a);
    }
}
