package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.ironsource.Fb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final c[] f51362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Map<com.mbridge.msdk.thrid.okio.f, Integer> f51363b;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f51364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f51365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f51366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f51367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        c[] f51368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f51369f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f51370g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f51371h;

        a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f51367d;
            int i11 = this.f51371h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    b(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f51368e, (Object) null);
            this.f51369f = this.f51368e.length - 1;
            this.f51370g = 0;
            this.f51371h = 0;
        }

        private boolean d(int i10) {
            return i10 >= 0 && i10 <= d.f51362a.length - 1;
        }

        private void e(int i10) throws IOException {
            if (d(i10)) {
                this.f51364a.add(d.f51362a[i10]);
                return;
            }
            int iA = a(i10 - d.f51362a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f51368e;
                if (iA < cVarArr.length) {
                    this.f51364a.add(cVarArr[iA]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10) throws IOException {
            this.f51364a.add(new c(c(i10), e()));
        }

        private void h() throws IOException {
            this.f51364a.add(new c(d.a(e()), e()));
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.f51364a);
            this.f51364a.clear();
            return arrayList;
        }

        void f() throws IOException {
            while (!this.f51365b.f()) {
                byte b10 = this.f51365b.readByte();
                int i10 = b10 & 255;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((b10 & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                    e(a(i10, 127) - 1);
                } else if (i10 == 64) {
                    g();
                } else if ((b10 & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                    f(a(i10, 63) - 1);
                } else if ((b10 & 32) == 32) {
                    int iA = a(i10, 31);
                    this.f51367d = iA;
                    if (iA < 0 || iA > this.f51366c) {
                        throw new IOException("Invalid dynamic table size update " + this.f51367d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    h();
                } else {
                    g(a(i10, 15) - 1);
                }
            }
        }

        a(int i10, int i11, s sVar) {
            this.f51364a = new ArrayList();
            this.f51368e = new c[8];
            this.f51369f = 7;
            this.f51370g = 0;
            this.f51371h = 0;
            this.f51366c = i10;
            this.f51367d = i11;
            this.f51365b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        private int d() throws IOException {
            return this.f51365b.readByte() & 255;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i10) throws IOException {
            if (d(i10)) {
                return d.f51362a[i10].f51359a;
            }
            int iA = a(i10 - d.f51362a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f51368e;
                if (iA < cVarArr.length) {
                    return cVarArr[iA].f51359a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private int a(int i10) {
            return this.f51369f + 1 + i10;
        }

        private void g() throws IOException {
            a(-1, new c(d.a(e()), e()));
        }

        private void a(int i10, c cVar) {
            this.f51364a.add(cVar);
            int i11 = cVar.f51361c;
            if (i10 != -1) {
                i11 -= this.f51368e[a(i10)].f51361c;
            }
            int i12 = this.f51367d;
            if (i11 > i12) {
                b();
                return;
            }
            int iB = b((this.f51371h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f51370g + 1;
                c[] cVarArr = this.f51368e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f51369f = this.f51368e.length - 1;
                    this.f51368e = cVarArr2;
                }
                int i14 = this.f51369f;
                this.f51369f = i14 - 1;
                this.f51368e[i14] = cVar;
                this.f51370g++;
            } else {
                this.f51368e[i10 + a(i10) + iB] = cVar;
            }
            this.f51371h += i11;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f51368e.length;
                while (true) {
                    length--;
                    i11 = this.f51369f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f51368e[length].f51361c;
                    i10 -= i13;
                    this.f51371h -= i13;
                    this.f51370g--;
                    i12++;
                }
                c[] cVarArr = this.f51368e;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f51370g);
                this.f51369f += i12;
            }
            return i12;
        }

        com.mbridge.msdk.thrid.okio.f e() throws IOException {
            int iD = d();
            boolean z10 = (iD & 128) == 128;
            int iA = a(iD, 127);
            if (z10) {
                return com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.f51365b.c(iA)));
            }
            return this.f51365b.b(iA);
        }

        private void f(int i10) throws IOException {
            a(-1, new c(c(i10), e()));
        }

        int a(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) == 0) {
                    return i11 + (iD << i13);
                }
                i11 += (iD & 127) << i13;
                i13 += 7;
            }
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f51372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f51373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f51375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f51377f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        c[] f51378g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f51379h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f51380i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f51381j;

        b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f51378g.length;
                while (true) {
                    length--;
                    i11 = this.f51379h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f51378g[length].f51361c;
                    i10 -= i13;
                    this.f51381j -= i13;
                    this.f51380i--;
                    i12++;
                }
                c[] cVarArr = this.f51378g;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f51380i);
                c[] cVarArr2 = this.f51378g;
                int i15 = this.f51379h + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f51379h += i12;
            }
            return i12;
        }

        private void b() {
            Arrays.fill(this.f51378g, (Object) null);
            this.f51379h = this.f51378g.length - 1;
            this.f51380i = 0;
            this.f51381j = 0;
        }

        b(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar) {
            this.f51374c = Integer.MAX_VALUE;
            this.f51378g = new c[8];
            this.f51379h = 7;
            this.f51380i = 0;
            this.f51381j = 0;
            this.f51376e = i10;
            this.f51377f = i10;
            this.f51373b = z10;
            this.f51372a = cVar;
        }

        void b(int i10) {
            this.f51376e = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f51377f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f51374c = Math.min(this.f51374c, iMin);
            }
            this.f51375d = true;
            this.f51377f = iMin;
            a();
        }

        private void a(c cVar) {
            int i10 = cVar.f51361c;
            int i11 = this.f51377f;
            if (i10 > i11) {
                b();
                return;
            }
            a((this.f51381j + i10) - i11);
            int i12 = this.f51380i + 1;
            c[] cVarArr = this.f51378g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f51379h = this.f51378g.length - 1;
                this.f51378g = cVarArr2;
            }
            int i13 = this.f51379h;
            this.f51379h = i13 - 1;
            this.f51378g[i13] = cVar;
            this.f51380i++;
            this.f51381j += i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void a(java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.c> r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.d.b.a(java.util.List):void");
        }

        void a(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f51372a.writeByte(i10 | i12);
                return;
            }
            this.f51372a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f51372a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f51372a.writeByte(i13);
        }

        void a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
            if (this.f51373b && k.b().a(fVar) < fVar.j()) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                k.b().a(fVar, cVar);
                com.mbridge.msdk.thrid.okio.f fVarO = cVar.o();
                a(fVarO.j(), 127, 128);
                this.f51372a.a(fVarO);
                return;
            }
            a(fVar.j(), 127, 0);
            this.f51372a.a(fVar);
        }

        private void a() {
            int i10 = this.f51377f;
            int i11 = this.f51381j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    a(i11 - i10);
                }
            }
        }
    }

    static {
        c cVar = new c(c.f51358i, "");
        com.mbridge.msdk.thrid.okio.f fVar = c.f51355f;
        c cVar2 = new c(fVar, "GET");
        c cVar3 = new c(fVar, "POST");
        com.mbridge.msdk.thrid.okio.f fVar2 = c.f51356g;
        c cVar4 = new c(fVar2, "/");
        c cVar5 = new c(fVar2, "/index.html");
        com.mbridge.msdk.thrid.okio.f fVar3 = c.f51357h;
        c cVar6 = new c(fVar3, "http");
        c cVar7 = new c(fVar3, "https");
        com.mbridge.msdk.thrid.okio.f fVar4 = c.f51354e;
        f51362a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c(POBCoreNativeConstants.NATIVE_LINK, ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c(SessionDescription.ATTR_RANGE, ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c(Fb.f40907a, ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f51363b = a();
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f51362a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f51362a;
            if (i10 >= cVarArr.length) {
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f51359a)) {
                linkedHashMap.put(cVarArr[i10].f51359a, Integer.valueOf(i10));
            }
            i10++;
        }
    }

    static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int iJ = fVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            byte bA = fVar.a(i10);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.m());
            }
        }
        return fVar;
    }
}
