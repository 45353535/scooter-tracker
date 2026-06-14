package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.ads.Orientation;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.ads.video.VideoUtil$VideoEligibility;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes11.dex */
public final class l8 extends t1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jj f64854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f64855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile CacheKey f64856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f64857t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final lb f64858u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final lb f64859v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lb f64860w;

    public l8(Context context, jj jjVar, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, lb lbVar, lb lbVar2, lb lbVar3, lb lbVar4, lb lbVar5, lb lbVar6, lb lbVar7, lb lbVar8) {
        super(context, jjVar, adPreferences, adEventListener, placement, lbVar4, lbVar5, lbVar6, lbVar7, lbVar8, true);
        this.f64855r = System.currentTimeMillis();
        this.f64854q = jjVar;
        this.f64858u = lbVar;
        this.f64859v = lbVar2;
        this.f64860w = lbVar3;
    }

    @Override // com.startapp.sdk.internal.t1, com.startapp.sdk.adsbase.c
    public final boolean a(Object obj) throws Throwable {
        HashSet hashSet;
        t8 t8Var = (t8) obj;
        String str = t8Var != null ? t8Var.f65300c : null;
        VideoConfig videoConfigF = AdsCommonMetaData.k().F();
        MetaData metaDataE = MetaData.E();
        if (str == null || !str.toLowerCase(Locale.ROOT).contains("json")) {
            String str2 = t8Var != null ? t8Var.f65299b : null;
            if (videoConfigF.r() && metaDataE.f0() && vi.a(str2, "@videoJson@", "@videoJson@") != null) {
                f(false);
            }
            return super.a(obj);
        }
        if (videoConfigF.r() && metaDataE.f0() && ((hashSet = this.f65288m.J0) == null || hashSet.size() <= 0)) {
            f(true);
        }
        try {
            aj ajVar = (aj) JsonParser.fromJson(t8Var.f65299b, aj.class);
            if (ajVar == null || ajVar.getVastTag() == null) {
                return a("no VAST wrapper in json", null, true);
            }
            String strD0 = metaDataE.d0();
            yi yiVar = (!ajVar.isRecordHops() || TextUtils.isEmpty(strD0)) ? null : new yi(this.f64020g, strD0, ajVar.getPartnerResponse(), ajVar.getPartnerName(), ajVar.isSkipFailed());
            com.startapp.sdk.ads.video.vast.a aVar = new com.startapp.sdk.ads.video.vast.a(this.f64014a, ((tk) this.f64860w.a()).a());
            aVar.f63921f = videoConfigF.f();
            aVar.f63918c = new cj() { // from class: com.startapp.sdk.internal.km
                @Override // com.startapp.sdk.internal.cj
                public final void a(List list, VASTErrorCodes vASTErrorCodes) {
                    this.f64837a.a(list, vASTErrorCodes);
                }
            };
            xi xiVarA = aVar.a(ajVar.getVastTag(), yiVar);
            if (xiVarA == null) {
                if (ajVar.getCampaignId() != null) {
                    this.f65287l.add(ajVar.getCampaignId());
                }
                this.f64857t++;
                this.f64854q.f64799r = null;
                if (System.currentTimeMillis() - this.f64855r >= videoConfigF.o()) {
                    return a("VAST retry timeout", null, false);
                }
                if (this.f64857t > videoConfigF.e()) {
                    return a("VAST too many excludes", null, false);
                }
                ((z6) ((y6) this.f64022i.a())).c(this, ii.f64703h);
                return b();
            }
            ej ejVar = this.f64854q.getType() != Ad.AdType.REWARDED_VIDEO ? new ej(ajVar.getSkipafter(), ajVar.getSkipmin()) : null;
            jj jjVar = this.f64854q;
            jjVar.getClass();
            jjVar.f64799r = new VideoAdDetails(xiVarA, videoConfigF, ejVar);
            Integer num = xiVarA.f65573q;
            if (num != null && xiVarA.f65574r != null) {
                if (num.intValue() <= xiVarA.f65574r.intValue()) {
                    Orientation orientation = Orientation.PORTRAIT;
                    jjVar.f65000e = 1;
                } else if (Orientation.LANDSCAPE == Orientation.PORTRAIT) {
                    jjVar.f65000e = 1;
                } else {
                    jjVar.f65000e = 2;
                }
            }
            if (ajVar.getTtlSec() != null) {
                this.f64854q.c(ajVar.getTtlSec());
            }
            t8Var.f65299b = ajVar.getAdmTag();
            t8Var.f65300c = "text/html";
            return super.a(t8Var);
        } catch (Exception e10) {
            return a("VAST json parsing", e10, true);
        }
    }

    public final void b(String str) {
        VideoAdDetails videoAdDetailsF = f();
        if (videoAdDetailsF != null) {
            videoAdDetailsF.setLocalVideoPath(str);
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    /* JADX INFO: renamed from: c */
    public final void b(boolean z10) {
        super.b(z10);
        if (!z10 || f() == null) {
            e(z10);
            return;
        }
        if (AdsCommonMetaData.k().F().q()) {
            super.d(true);
        }
        VideoAdDetails videoAdDetailsF = f();
        if (videoAdDetailsF != null) {
            videoAdDetailsF.setVideoMuted(this.f64016c.isVideoMuted());
        }
        ((z6) ((y6) this.f64022i.a())).c(this, ii.f64704i);
        if (videoAdDetailsF != null) {
            ij ijVar = (ij) this.f64859v.a();
            ((Executor) ijVar.f64724c.a()).execute(new fj(ijVar, videoAdDetailsF.getVideoUrl(), new ek() { // from class: com.startapp.sdk.internal.lm
                @Override // com.startapp.sdk.internal.ek
                public final void a(String str) {
                    this.f64898a.a(str);
                }
            }, new pe() { // from class: com.startapp.sdk.internal.mm
                @Override // com.startapp.sdk.internal.pe
                public final void a(String str) {
                    this.f64947a.b(str);
                }
            }));
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final void d(boolean z10) {
        if (f() != null) {
            return;
        }
        super.d(z10);
    }

    public final VideoAdDetails f() {
        Ad ad2 = this.f64015b;
        if (ad2 instanceof jj) {
            return ((jj) ad2).f64799r;
        }
        return null;
    }

    @Override // com.startapp.sdk.internal.t1
    public final boolean b(com.startapp.sdk.adsbase.model.a aVar) {
        VideoUtil$VideoEligibility videoUtil$VideoEligibilityA;
        if (aVar == null) {
            return false;
        }
        Ad.AdType adType = aVar.U0;
        if ((adType != Ad.AdType.VIDEO && adType != Ad.AdType.REWARDED_VIDEO) || (videoUtil$VideoEligibilityA = gk.a(this.f64014a)) == VideoUtil$VideoEligibility.ELIGIBLE) {
            return true;
        }
        this.f64019f = videoUtil$VideoEligibilityA.a();
        return false;
    }

    public final void f(boolean z10) throws Throwable {
        Ad ad2 = this.f64015b;
        if ((ad2 == null || ad2.getType() == Ad.AdType.REWARDED_VIDEO || this.f64015b.getType() == Ad.AdType.VIDEO) && !z10) {
            return;
        }
        AdPreferences adPreferences = new AdPreferences(this.f64016c);
        Ad ad3 = this.f64015b;
        adPreferences.setType((ad3 == null || !(ad3.getType() == Ad.AdType.REWARDED_VIDEO || this.f64015b.getType() == Ad.AdType.VIDEO)) ? Ad.AdType.NON_VIDEO : Ad.AdType.VIDEO_NO_VAST);
        CacheKey cacheKeyA = ((p) this.f64858u.a()).a(null, this.f64018e, adPreferences, false, 0, null, null);
        if (z10) {
            this.f64856s = cacheKeyA;
        }
    }

    @Override // com.startapp.sdk.adsbase.c
    public final com.startapp.sdk.adsbase.model.a c() {
        com.startapp.sdk.adsbase.model.a aVarA = a((com.startapp.sdk.adsbase.model.a) new j8());
        if (aVarA != null) {
            aVarA.f(this.f64014a);
        }
        return aVarA;
    }

    public final void a(String str) {
        if (str != null) {
            ((z6) ((y6) this.f64022i.a())).c(this, ii.f64705j);
            if (!str.equals("downloadInterrupted")) {
                super.d(true);
                VideoAdDetails videoAdDetailsF = f();
                if (videoAdDetailsF != null) {
                    videoAdDetailsF.setLocalVideoPath(str);
                }
            }
            e(true);
            return;
        }
        ((z6) ((y6) this.f64022i.a())).c(this, ii.f64706k);
        e(false);
        Context context = this.f64014a;
        AdEventListener adEventListener = this.f64017d;
        this.f64017d = null;
        a0.a(context, adEventListener, this.f64015b, false);
        a(this.f64014a, f(), null, VASTErrorCodes.FileNotFound);
    }

    public final void a(List list, VASTErrorCodes vASTErrorCodes) {
        a(this.f64014a, f(), list, vASTErrorCodes);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r4, com.startapp.sdk.ads.video.VideoAdDetails r5, java.util.List r6, com.startapp.sdk.ads.video.vast.VASTErrorCodes r7) {
        /*
            if (r6 == 0) goto L3f
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L3f
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r0 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.SAProcessSuccess     // Catch: java.lang.Throwable -> L2d
            if (r7 != r0) goto L30
            java.util.WeakHashMap r0 = com.startapp.sdk.internal.vi.f65408a     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L2d
        L17:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L2d
            boolean r2 = com.startapp.sdk.internal.vi.d(r1)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L17
            r0.add(r1)     // Catch: java.lang.Throwable -> L2d
            goto L17
        L2d:
            r6 = move-exception
            goto L3b
        L2f:
            r6 = r0
        L30:
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L50
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r6 = com.startapp.sdk.ads.video.tracking.VideoTrackingDetails.a(r6)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L3b:
            com.startapp.sdk.internal.g9.a(r6)     // Catch: java.lang.Throwable -> L7d
            goto L50
        L3f:
            if (r5 == 0) goto L50
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r6 = r5.getVideoTrackingDetails()     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L50
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r6 = r5.getVideoTrackingDetails()     // Catch: java.lang.Throwable -> L7d
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r6 = r6.e()     // Catch: java.lang.Throwable -> L7d
            goto L51
        L50:
            r6 = 0
        L51:
            if (r6 == 0) goto L81
            int r0 = r6.length     // Catch: java.lang.Throwable -> L7d
            if (r0 <= 0) goto L81
            java.lang.String r0 = ""
            if (r5 == 0) goto L65
            java.lang.String r1 = r5.getVideoUrl()     // Catch: java.lang.Throwable -> L7d
            if (r1 == 0) goto L65
            java.lang.String r5 = r5.getVideoUrl()     // Catch: java.lang.Throwable -> L7d
            goto L66
        L65:
            r5 = r0
        L66:
            com.startapp.sdk.ads.video.tracking.VideoTrackingParams r1 = new com.startapp.sdk.ads.video.tracking.VideoTrackingParams     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "1"
            r3 = 0
            r1.<init>(r3, r3, r0, r2)     // Catch: java.lang.Throwable -> L7d
            com.startapp.sdk.internal.lj r0 = new com.startapp.sdk.internal.lj     // Catch: java.lang.Throwable -> L7d
            r0.<init>(r3, r1, r5, r6)     // Catch: java.lang.Throwable -> L7d
            r0.f64892e = r7     // Catch: java.lang.Throwable -> L7d
            com.startapp.sdk.internal.kj r5 = r0.a()     // Catch: java.lang.Throwable -> L7d
            com.startapp.sdk.internal.gk.a(r4, r5)     // Catch: java.lang.Throwable -> L7d
            goto L81
        L7d:
            r4 = move-exception
            com.startapp.sdk.internal.g9.a(r4)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.l8.a(android.content.Context, com.startapp.sdk.ads.video.VideoAdDetails, java.util.List, com.startapp.sdk.ads.video.vast.VASTErrorCodes):void");
    }

    public final boolean a(String str, Exception exc, boolean z10) {
        if (exc != null) {
            g9.a(exc);
        } else if (z10) {
            g9 g9Var = new g9(h9.f64610e);
            g9Var.f64553d = str;
            g9Var.a();
        }
        Object objB = ((p) this.f64858u.a()).b(this.f64856s);
        if (objB instanceof o8) {
            t8 t8Var = new t8();
            t8Var.f65300c = "text/html";
            t8Var.f65299b = ((o8) objB).a();
            return super.a(t8Var);
        }
        Ad ad2 = this.f64015b;
        if (ad2 == null) {
            return false;
        }
        ad2.setErrorMessage(this.f64019f);
        return false;
    }
}
