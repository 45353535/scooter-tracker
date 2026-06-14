package sg.bigo.ads.ad.interstitial.multi_img;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.p.h;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f101450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f101451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f101453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f101454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    List<a> f101455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f101456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.ad.b.b f101457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashSet<String> f101458i = new HashSet<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f101465b;

        private a(String str) {
            this.f101464a = str;
            this.f101465b = 0;
        }

        /* synthetic */ a(String str, byte b10) {
            this(str);
        }
    }

    private b(@NonNull sg.bigo.ads.ad.b.b bVar, m mVar, d dVar, int i10, c cVar, boolean z10, boolean z11, List<a> list) {
        this.f101457h = bVar;
        this.f101450a = mVar;
        this.f101451b = dVar;
        this.f101453d = cVar;
        this.f101452c = z10;
        this.f101454e = z11;
        this.f101455f = list;
        this.f101456g = i10;
    }

    @Nullable
    public static b b(sg.bigo.ads.ad.b.b bVar, @NonNull m mVar) {
        d dVarA;
        c cVarA;
        int iA;
        if (bVar == null || mVar == null) {
            return null;
        }
        int iA2 = mVar.a("video_play_page.multi_img_load");
        switch (mVar.a("video_play_page.ad_component_layout")) {
            case 13:
            case 18:
                dVarA = d.TILE;
                cVarA = c.FILL_MATCH_SELF;
                iA = 1;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                dVarA = d.a(mVar.a("video_play_page.multi_img"));
                cVarA = c.a(mVar.a("video_play_page.multi_render_way"));
                iA = mVar.a("video_play_page.multi_method");
                break;
            default:
                return null;
        }
        return a(bVar, mVar, iA2, dVarA, cVarA, iA == 1, false);
    }

    public static b c(sg.bigo.ads.ad.b.b bVar, @NonNull m mVar) {
        return a(bVar, mVar, mVar.a("video_play_page.multi_img_load", 1), d.a(mVar.a("video_play_page.multi_img")), c.FILL_MATCH_SELF, true, false);
    }

    @NonNull
    public final List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (!k.a((Collection) this.f101455f)) {
            Iterator<a> it = this.f101455f.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f101464a);
            }
        }
        return arrayList;
    }

    @Nullable
    public static b a(sg.bigo.ads.ad.b.b bVar, m mVar) {
        if (bVar == null || mVar == null) {
            return null;
        }
        switch (mVar.a("endpage.ad_component_layout")) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return a(bVar, mVar, mVar.a("endpage.multi_img_load"), d.a(mVar.a("endpage.multi_img")), c.a(mVar.a("endpage.multi_render_way")), true, true);
            default:
                return null;
        }
    }

    public final void b() {
        if (k.a((Collection) this.f101455f)) {
            return;
        }
        for (final a aVar : this.f101455f) {
            String str = aVar.f101464a;
            if (!sg.bigo.ads.common.p.e.a(this.f101457h.f100335b.f102178e, str)) {
                if (h.a.f102684a.a(str)) {
                    return;
                }
                sg.bigo.ads.ad.b.b bVar = this.f101457h;
                sg.bigo.ads.common.p.e.a(bVar.f100335b.f102178e, str, ((sg.bigo.ads.core.a.a) bVar.f()).al(), new g() { // from class: sg.bigo.ads.ad.interstitial.multi_img.b.2
                    @Override // sg.bigo.ads.common.p.g
                    public final void a(int i10, @NonNull String str2, String str3) {
                        aVar.f101465b = 2;
                    }

                    @Override // sg.bigo.ads.common.p.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.common.p.f fVar) {
                        aVar.f101465b = 1;
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c A[PHI: r3
  0x000c: PHI (r3v11 java.util.ArrayList) = (r3v3 java.util.ArrayList), (r3v3 java.util.ArrayList), (r3v0 java.util.ArrayList) binds: [B:40:0x00af, B:42:0x00b3, B:4:0x0009] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static sg.bigo.ads.ad.interstitial.multi_img.b a(@androidx.annotation.NonNull sg.bigo.ads.ad.b.b r15, @androidx.annotation.NonNull sg.bigo.ads.api.a.m r16, int r17, sg.bigo.ads.ad.interstitial.multi_img.d r18, sg.bigo.ads.ad.interstitial.multi_img.c r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.b.a(sg.bigo.ads.ad.b.b, sg.bigo.ads.api.a.m, int, sg.bigo.ads.ad.interstitial.multi_img.d, sg.bigo.ads.ad.interstitial.multi_img.c, boolean, boolean):sg.bigo.ads.ad.interstitial.multi_img.b");
    }

    public final void a(final int i10, final int i11) {
        String str = i10 + "_" + i11;
        if (this.f101458i.contains(str)) {
            return;
        }
        this.f101458i.add(str);
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.b.1
            /* JADX WARN: Type inference failed for: r5v0, types: [sg.bigo.ads.api.core.b] */
            @Override // java.lang.Runnable
            public final void run() {
                int i12;
                int i13;
                int i14;
                String[] strArrE;
                int length = 0;
                if (k.a((Collection) b.this.f101455f)) {
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                } else {
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    for (a aVar : b.this.f101455f) {
                        String str2 = aVar.f101464a;
                        if (!sg.bigo.ads.common.p.e.a(b.this.f101457h.f100335b.f102178e, str2)) {
                            if (!h.a.f102684a.a(str2)) {
                                int i18 = aVar.f101465b;
                                if (i18 != 1) {
                                    if (i18 == 2) {
                                        i17++;
                                    }
                                }
                            }
                            i15++;
                        }
                        i16++;
                    }
                    i12 = i15;
                    i13 = i16;
                    i14 = i17;
                }
                ?? F = b.this.f101457h.f();
                int i19 = i10;
                int i20 = i11;
                b.d popPage = b.this.f101457h.getPopPage();
                if (popPage != null && (strArrE = popPage.e()) != null) {
                    length = strArrE.length;
                }
                sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) F, i19, i20, length, i12, i13, i14);
            }
        });
    }

    public final void a(String str, int i10) {
        if (k.a((Collection) this.f101455f) || q.a((CharSequence) str)) {
            return;
        }
        for (a aVar : this.f101455f) {
            if (str.equalsIgnoreCase(aVar.f101464a)) {
                aVar.f101465b = i10;
                return;
            }
        }
    }
}
