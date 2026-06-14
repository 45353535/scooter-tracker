package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f21904g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f21905h = Pattern.compile("MPEGTS:(\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f21907b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f21909d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21911f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f21908c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f21910e = new byte[1024];

    public p(String str, v vVar) {
        this.f21906a = str;
        this.f21907b = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f21909d = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, r, EOFException {
        int iMin;
        Matcher matcher;
        String strC;
        int i10 = (int) bVar.f21740b;
        int i11 = this.f21911f;
        byte[] bArr = this.f21910e;
        if (i11 == bArr.length) {
            this.f21910e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f21910e;
        int i12 = this.f21911f;
        int length = bArr2.length - i12;
        int i13 = bVar.f21744f;
        if (i13 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i13, length);
            System.arraycopy(bVar.f21742d, 0, bArr2, i12, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            iMin = bVar.a(bArr2, i12, length, 0, true);
        }
        if (iMin != -1) {
            bVar.f21741c += (long) iMin;
        }
        if (iMin != -1) {
            int i14 = this.f21911f + iMin;
            this.f21911f = i14;
            if (i10 == -1 || i14 != i10) {
                return 0;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.f21910e);
        try {
            Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f22923a;
            String strC2 = nVar.c();
            if (strC2 == null || !com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f22924b.matcher(strC2).matches()) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.text.a("Expected WEBVTT. Got " + strC2);
            }
            long j10 = 0;
            long j11 = 0;
            while (true) {
                String strC3 = nVar.c();
                if (TextUtils.isEmpty(strC3)) {
                    while (true) {
                        String strC4 = nVar.c();
                        if (strC4 == null) {
                            matcher = null;
                            break;
                        }
                        if (com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f22923a.matcher(strC4).matches()) {
                            do {
                                strC = nVar.c();
                                if (strC != null) {
                                }
                            } while (!strC.isEmpty());
                        } else {
                            matcher = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.a.f22922a.matcher(strC4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        this.f21909d.a(0, 3).a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "text/vtt", 0, this.f21906a, -1, null, 0L, Collections.EMPTY_LIST));
                        this.f21909d.b();
                    } else {
                        long jA = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher.group(1));
                        long jA2 = this.f21907b.a((j11 + jA) - j10);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = this.f21909d.a(0, 3);
                        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "text/vtt", 0, this.f21906a, -1, null, jA2 - jA, Collections.EMPTY_LIST));
                        this.f21909d.b();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f21908c;
                        byte[] bArr3 = this.f21910e;
                        int i15 = this.f21911f;
                        nVar2.f23134a = bArr3;
                        nVar2.f23136c = i15;
                        nVar2.f23135b = 0;
                        gVarA.a(i15, nVar2);
                        gVarA.a(jA2, 1, this.f21911f, 0, (byte[]) null);
                    }
                    return -1;
                }
                if (strC3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f21904g.matcher(strC3);
                    if (matcher2.find()) {
                        Matcher matcher3 = f21905h.matcher(strC3);
                        if (matcher3.find()) {
                            long jA3 = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher2.group(1));
                            j11 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                            j10 = jA3;
                        } else {
                            throw new r("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strC3));
                        }
                    } else {
                        throw new r("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strC3));
                    }
                }
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.text.a e10) {
            throw new r(e10);
        }
    }
}
