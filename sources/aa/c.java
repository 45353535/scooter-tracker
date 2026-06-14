package aa;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import io.bidmachine.media3.common.a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import lb.t;
import n9.m;
import n9.v;
import n9.w;
import oa.r;
import oa.s;
import q9.j0;
import v9.c2;
import vb.k0;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f4148f = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t.a f4150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f4153e;

    public c() {
        this(0, true);
    }

    private static void e(int i10, List list) {
        if (Ints.indexOf(f4148f, i10) == -1 || list.contains(Integer.valueOf(i10))) {
            return;
        }
        list.add(Integer.valueOf(i10));
    }

    private r g(int i10, io.bidmachine.media3.common.a aVar, List list, j0 j0Var) {
        if (i10 == 0) {
            return new vb.b();
        }
        if (i10 == 1) {
            return new vb.e();
        }
        if (i10 == 2) {
            return new vb.h();
        }
        if (i10 == 7) {
            return new hb.f(0, 0L);
        }
        if (i10 == 8) {
            return h(this.f4150b, this.f4151c, j0Var, aVar, list, this.f4152d);
        }
        if (i10 == 11) {
            return i(this.f4149a, this.f4153e, aVar, list, j0Var, this.f4150b, this.f4151c);
        }
        if (i10 != 13) {
            return null;
        }
        return new k(aVar.f80550d, j0Var, this.f4150b, this.f4151c);
    }

    private static ib.h h(t.a aVar, boolean z10, j0 j0Var, io.bidmachine.media3.common.a aVar2, List list, int i10) {
        int i11 = l(aVar2) ? 4 : 0;
        if (!z10) {
            aVar = t.a.f94119a;
            i11 |= 32;
        }
        t.a aVar3 = aVar;
        int iH = i11 | ib.h.h(i10);
        if (list == null) {
            list = ImmutableList.of();
        }
        return new ib.h(aVar3, iH, j0Var, null, list, null);
    }

    private static k0 i(int i10, boolean z10, io.bidmachine.media3.common.a aVar, List list, j0 j0Var, t.a aVar2, boolean z11) {
        int i11;
        int i12 = i10 | 16;
        if (list != null) {
            i12 = i10 | 48;
        } else {
            list = z10 ? Collections.singletonList(new a.b().u0("application/cea-608").N()) : Collections.EMPTY_LIST;
        }
        String str = aVar.f80557k;
        if (!TextUtils.isEmpty(str)) {
            if (!w.b(str, "audio/mp4a-latm")) {
                i12 |= 2;
            }
            if (!w.b(str, "video/avc")) {
                i12 |= 4;
            }
        }
        if (z11) {
            i11 = 0;
        } else {
            aVar2 = t.a.f94119a;
            i11 = 1;
        }
        return new k0(2, i11, aVar2, j0Var, new vb.j(i12, list), 112800);
    }

    private static boolean l(io.bidmachine.media3.common.a aVar) {
        v vVar = aVar.f80558l;
        if (vVar == null) {
            return false;
        }
        for (int i10 = 0; i10 < vVar.e(); i10++) {
            if (vVar.d(i10) instanceof h) {
                return !((h) r2).f4157c.isEmpty();
            }
        }
        return false;
    }

    private static boolean n(r rVar, s sVar) {
        try {
            boolean zC = rVar.c(sVar);
            sVar.resetPeekPosition();
            return zC;
        } catch (EOFException unused) {
            sVar.resetPeekPosition();
            return false;
        } catch (Throwable th2) {
            sVar.resetPeekPosition();
            throw th2;
        }
    }

    @Override // aa.e
    public io.bidmachine.media3.common.a c(io.bidmachine.media3.common.a aVar) {
        String str;
        if (!this.f4151c || !this.f4150b.a(aVar)) {
            return aVar;
        }
        a.b bVarW = aVar.b().u0(MimeTypes.APPLICATION_MEDIA3_CUES).W(this.f4150b.b(aVar));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aVar.f80561o);
        if (aVar.f80557k != null) {
            str = " " + aVar.f80557k;
        } else {
            str = "";
        }
        sb2.append(str);
        return bVarW.S(sb2.toString()).y0(Long.MAX_VALUE).N();
    }

    @Override // aa.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a d(Uri uri, io.bidmachine.media3.common.a aVar, List list, j0 j0Var, Map map, s sVar, c2 c2Var) {
        int iA = m.a(aVar.f80561o);
        int iB = m.b(map);
        int iC = m.c(uri);
        int[] iArr = f4148f;
        ArrayList arrayList = new ArrayList(iArr.length);
        e(iA, arrayList);
        e(iB, arrayList);
        e(iC, arrayList);
        for (int i10 : iArr) {
            e(i10, arrayList);
        }
        sVar.resetPeekPosition();
        r rVar = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            r rVar2 = (r) q9.a.e(g(iIntValue, aVar, list, j0Var));
            if (n(rVar2, sVar)) {
                return new a(rVar2, aVar, j0Var, this.f4150b, this.f4151c);
            }
            if (rVar == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                rVar = rVar2;
            }
        }
        return new a((r) q9.a.e(rVar), aVar, j0Var, this.f4150b, this.f4151c);
    }

    @Override // aa.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public c experimentalParseSubtitlesDuringExtraction(boolean z10) {
        this.f4151c = z10;
        return this;
    }

    @Override // aa.e
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b(int i10) {
        this.f4152d = i10;
        return this;
    }

    @Override // aa.e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c a(t.a aVar) {
        this.f4150b = aVar;
        return this;
    }

    public c(int i10, boolean z10) {
        this.f4149a = i10;
        this.f4153e = z10;
        this.f4150b = new lb.h();
    }
}
