package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.source.y;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f21821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f21822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f21823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] f21824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k f21825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f21826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f21827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f21829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.source.g f21830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a f21831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f21832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f21833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f21834n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f21835o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b f21836p;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.k kVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a[] aVarArr, b bVar, o oVar, List list) {
        this.f21825e = kVar;
        this.f21824d = aVarArr;
        this.f21823c = oVar;
        this.f21827g = list;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            oVarArr[i10] = aVarArr[i10].f21913b;
            iArr[i10] = i10;
        }
        this.f21821a = bVar.f21811a.a();
        this.f21822b = bVar.f21811a.a();
        y yVar = new y(oVarArr);
        this.f21826f = yVar;
        this.f21836p = new e(yVar, iArr);
    }

    public final void a(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(str.toLowerCase(Locale.getDefault()).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f21832l = uri;
        this.f21833m = bArr;
        this.f21834n = str;
        this.f21835o = bArr2;
    }
}
