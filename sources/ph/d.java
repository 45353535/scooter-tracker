package ph;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.ironsource.Fb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.l0;
import vh.x;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f98381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c[] f98382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f98383c;

    static {
        d dVar = new d();
        f98381a = dVar;
        c cVar = new c(c.f98377j, "");
        vh.h hVar = c.f98374g;
        c cVar2 = new c(hVar, "GET");
        c cVar3 = new c(hVar, "POST");
        vh.h hVar2 = c.f98375h;
        c cVar4 = new c(hVar2, "/");
        c cVar5 = new c(hVar2, "/index.html");
        vh.h hVar3 = c.f98376i;
        c cVar6 = new c(hVar3, "http");
        c cVar7 = new c(hVar3, "https");
        vh.h hVar4 = c.f98373f;
        f98382b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(hVar4, "200"), new c(hVar4, "204"), new c(hVar4, "206"), new c(hVar4, "304"), new c(hVar4, "400"), new c(hVar4, "404"), new c(hVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c(POBCoreNativeConstants.NATIVE_LINK, ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c(SessionDescription.ATTR_RANGE, ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c(Fb.f40907a, ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f98383c = dVar.d();
    }

    private d() {
    }

    private final Map d() {
        c[] cVarArr = f98382b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(cVarArr.length);
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            c[] cVarArr2 = f98382b;
            if (!linkedHashMap.containsKey(cVarArr2[i10].f98378a)) {
                linkedHashMap.put(cVarArr2[i10].f98378a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        return mapUnmodifiableMap;
    }

    public final vh.h a(vh.h name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int iK = name.K();
        for (int i10 = 0; i10 < iK; i10++) {
            byte bL = name.l(i10);
            if (65 <= bL && bL < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.S());
            }
        }
        return name;
    }

    public final Map b() {
        return f98383c;
    }

    public final c[] c() {
        return f98382b;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f98384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f98385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f98386c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final vh.g f98387d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c[] f98388e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f98389f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f98390g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f98391h;

        public a(l0 source, int i10, int i11) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f98384a = i10;
            this.f98385b = i11;
            this.f98386c = new ArrayList();
            this.f98387d = x.d(source);
            this.f98388e = new c[8];
            this.f98389f = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f98385b;
            int i11 = this.f98391h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            ArraysKt.fill$default(this.f98388e, (Object) null, 0, 0, 6, (Object) null);
            this.f98389f = this.f98388e.length - 1;
            this.f98390g = 0;
            this.f98391h = 0;
        }

        private final int c(int i10) {
            return this.f98389f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f98388e.length;
                while (true) {
                    length--;
                    i11 = this.f98389f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f98388e[length];
                    Intrinsics.checkNotNull(cVar);
                    int i13 = cVar.f98380c;
                    i10 -= i13;
                    this.f98391h -= i13;
                    this.f98390g--;
                    i12++;
                }
                c[] cVarArr = this.f98388e;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f98390g);
                this.f98389f += i12;
            }
            return i12;
        }

        private final vh.h f(int i10) throws IOException {
            if (h(i10)) {
                return d.f98381a.c()[i10].f98378a;
            }
            int iC = c(i10 - d.f98381a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f98388e;
                if (iC < cVarArr.length) {
                    c cVar = cVarArr[iC];
                    Intrinsics.checkNotNull(cVar);
                    return cVar.f98378a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, c cVar) {
            this.f98386c.add(cVar);
            int i11 = cVar.f98380c;
            if (i10 != -1) {
                c cVar2 = this.f98388e[c(i10)];
                Intrinsics.checkNotNull(cVar2);
                i11 -= cVar2.f98380c;
            }
            int i12 = this.f98385b;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f98391h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f98390g + 1;
                c[] cVarArr = this.f98388e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f98389f = this.f98388e.length - 1;
                    this.f98388e = cVarArr2;
                }
                int i14 = this.f98389f;
                this.f98389f = i14 - 1;
                this.f98388e[i14] = cVar;
                this.f98390g++;
            } else {
                this.f98388e[i10 + c(i10) + iD] = cVar;
            }
            this.f98391h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f98381a.c().length - 1;
        }

        private final int i() {
            return ih.d.d(this.f98387d.readByte(), 255);
        }

        private final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f98386c.add(d.f98381a.c()[i10]);
                return;
            }
            int iC = c(i10 - d.f98381a.c().length);
            if (iC >= 0) {
                c[] cVarArr = this.f98388e;
                if (iC < cVarArr.length) {
                    List list = this.f98386c;
                    c cVar = cVarArr[iC];
                    Intrinsics.checkNotNull(cVar);
                    list.add(cVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new c(f(i10), j()));
        }

        private final void o() {
            g(-1, new c(d.f98381a.a(j()), j()));
        }

        private final void p(int i10) throws IOException {
            this.f98386c.add(new c(f(i10), j()));
        }

        private final void q() throws IOException {
            this.f98386c.add(new c(d.f98381a.a(j()), j()));
        }

        public final List e() {
            List list = CollectionsKt.toList(this.f98386c);
            this.f98386c.clear();
            return list;
        }

        public final vh.h j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.f98387d.readByteString(jM);
            }
            vh.e eVar = new vh.e();
            k.f98536a.b(this.f98387d, jM, eVar);
            return eVar.readByteString();
        }

        public final void k() throws IOException {
            while (!this.f98387d.exhausted()) {
                int iD = ih.d.d(this.f98387d.readByte(), 255);
                if (iD == 128) {
                    throw new IOException("index == 0");
                }
                if ((iD & 128) == 128) {
                    l(m(iD, 127) - 1);
                } else if (iD == 64) {
                    o();
                } else if ((iD & 64) == 64) {
                    n(m(iD, 63) - 1);
                } else if ((iD & 32) == 32) {
                    int iM = m(iD, 31);
                    this.f98385b = iM;
                    if (iM < 0 || iM > this.f98384a) {
                        throw new IOException("Invalid dynamic table size update " + this.f98385b);
                    }
                    a();
                } else if (iD == 16 || iD == 0) {
                    q();
                } else {
                    p(m(iD, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public /* synthetic */ a(l0 l0Var, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(l0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f98392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f98393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vh.e f98394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f98395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f98396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f98397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f98398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f98399h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f98400i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f98401j;

        public b(int i10, boolean z10, vh.e out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f98392a = i10;
            this.f98393b = z10;
            this.f98394c = out;
            this.f98395d = Integer.MAX_VALUE;
            this.f98397f = i10;
            this.f98398g = new c[8];
            this.f98399h = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f98397f;
            int i11 = this.f98401j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            ArraysKt.fill$default(this.f98398g, (Object) null, 0, 0, 6, (Object) null);
            this.f98399h = this.f98398g.length - 1;
            this.f98400i = 0;
            this.f98401j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f98398g.length;
                while (true) {
                    length--;
                    i11 = this.f98399h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    c cVar = this.f98398g[length];
                    Intrinsics.checkNotNull(cVar);
                    i10 -= cVar.f98380c;
                    int i13 = this.f98401j;
                    c cVar2 = this.f98398g[length];
                    Intrinsics.checkNotNull(cVar2);
                    this.f98401j = i13 - cVar2.f98380c;
                    this.f98400i--;
                    i12++;
                }
                c[] cVarArr = this.f98398g;
                System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f98400i);
                c[] cVarArr2 = this.f98398g;
                int i14 = this.f98399h;
                Arrays.fill(cVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f98399h += i12;
            }
            return i12;
        }

        private final void d(c cVar) {
            int i10 = cVar.f98380c;
            int i11 = this.f98397f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f98401j + i10) - i11);
            int i12 = this.f98400i + 1;
            c[] cVarArr = this.f98398g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f98399h = this.f98398g.length - 1;
                this.f98398g = cVarArr2;
            }
            int i13 = this.f98399h;
            this.f98399h = i13 - 1;
            this.f98398g[i13] = cVar;
            this.f98400i++;
            this.f98401j += i10;
        }

        public final void e(int i10) {
            this.f98392a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f98397f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f98395d = Math.min(this.f98395d, iMin);
            }
            this.f98396e = true;
            this.f98397f = iMin;
            a();
        }

        public final void f(vh.h data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f98393b) {
                k kVar = k.f98536a;
                if (kVar.d(data) < data.K()) {
                    vh.e eVar = new vh.e();
                    kVar.c(data, eVar);
                    vh.h byteString = eVar.readByteString();
                    h(byteString.K(), 127, 128);
                    this.f98394c.r(byteString);
                    return;
                }
            }
            h(data.K(), 127, 0);
            this.f98394c.r(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List r13) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ph.d.b.g(java.util.List):void");
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f98394c.writeByte(i10 | i12);
                return;
            }
            this.f98394c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f98394c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f98394c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, vh.e eVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }
}
