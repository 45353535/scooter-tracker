package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.d0;
import com.applovin.impl.e0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l5 extends i5 implements v3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f9246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f9247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final String f9248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.m f9249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Collection f9250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected ExecutorService f9252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected ExecutorService f9253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected List f9254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d0 f9255p;

    class a implements e0.a {
        a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f9246g.a(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f9073c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f9073c.a(l5Var.f9072b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    class b implements e0.a {
        b() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f9246g.b(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f9073c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f9073c.a(l5Var.f9072b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    class c implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e0.a f9258a;

        c(e0.a aVar) {
            this.f9258a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.o oVar = l5.this.f9073c;
                if (com.applovin.impl.sdk.o.a()) {
                    l5 l5Var = l5.this;
                    l5Var.f9073c.b(l5Var.f9072b, "Failed to cache video");
                }
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong("ad_id", l5.this.f9246g.getAdIdNumber());
                l5.this.f9071a.t().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.o oVar2 = l5.this.f9073c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var2 = l5.this;
                l5Var2.f9073c.a(l5Var2.f9072b, "Finish caching video for ad #" + l5.this.f9246g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f9258a.a(uri);
        }
    }

    class d implements d0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f9260a;

        d(e eVar) {
            this.f9260a = eVar;
        }

        @Override // com.applovin.impl.d0.c
        public void a(String str, boolean z10) {
            if (z10) {
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f9260a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    public interface e {
        void a(String str);
    }

    l5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super(str, kVar);
        this.f9248i = UUID.randomUUID().toString();
        if (bVar == null) {
            throw new IllegalArgumentException("No ad specified.");
        }
        this.f9246g = bVar;
        this.f9247h = appLovinAdLoadListener;
        this.f9249j = kVar.G();
        this.f9250k = h();
        if (((Boolean) kVar.a(x4.I0)).booleanValue()) {
            if (kVar.q0().e()) {
                this.f9252m = kVar.q0().a();
                this.f9253n = kVar.q0().d();
                return;
            }
            String mediationServeId = StringUtils.isValidString(bVar.getMediationServeId()) ? bVar.getMediationServeId() : UUID.randomUUID().toString();
            this.f9252m = kVar.q0().a("com.applovin.sdk.caching." + mediationServeId, ((Integer) kVar.a(x4.K0)).intValue());
            this.f9253n = kVar.q0().a("com.applovin.sdk.caching.html." + mediationServeId, ((Integer) kVar.a(x4.L0)).intValue());
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f9071a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f9247h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f9246g);
            this.f9247h = null;
        }
    }

    @Override // com.applovin.impl.v3.a
    public void a(y2 y2Var) {
        if (y2Var.Q().equalsIgnoreCase(this.f9246g.getMediationServeId())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Updating flag for timeout...");
            }
            g();
        }
        this.f9071a.Z().b(this);
    }

    protected e0 b(String str, e0.a aVar) {
        return a(str, this.f9246g.S(), true, aVar);
    }

    Uri c(String str) {
        return b(str, this.f9246g.S(), true);
    }

    void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Rendered new ad:" + this.f9246g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.cc
            @Override // java.lang.Runnable
            public final void run() {
                this.f8519b.i();
            }
        });
    }

    protected void g() {
        this.f9251l = true;
        List list = this.f9254o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f9254o.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f9071a.q0().e()) {
            d0 d0Var = this.f9255p;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f9252m;
        if (executorService != null) {
            executorService.shutdown();
            this.f9252m = null;
        }
        ExecutorService executorService2 = this.f9253n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f9253n = null;
        }
    }

    void j() {
        if (o0.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Caching mute images...");
        }
        Uri uriA = a(this.f9246g.G(), "mute");
        if (uriA != null) {
            this.f9246g.a(uriA);
        }
        Uri uriA2 = a(this.f9246g.Y(), "unmute");
        if (uriA2 != null) {
            this.f9246g.b(uriA2);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Ad updated with muteImageFilename = " + this.f9246g.G() + ", unmuteImageFilename = " + this.f9246g.Y());
        }
    }

    protected void k() {
        this.f9071a.Z().b(this);
        if (!this.f9071a.q0().e()) {
            ExecutorService executorService = this.f9252m;
            if (executorService != null) {
                executorService.shutdown();
                this.f9252m = null;
            }
            ExecutorService executorService2 = this.f9253n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f9253n = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f9246g.getAdZone().d();
        if (((Boolean) this.f9071a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f9071a.h().b(this.f9246g);
        }
        this.f9071a.d0().a(this.f9248i);
    }

    protected boolean l() {
        return this.f9251l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f9246g.b1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Subscribing to timeout events...");
            }
            this.f9071a.Z().a(this);
        }
    }

    Uri b(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        int iA = this.f9071a.G().a(str, this.f9246g);
        Map mapA = f2.a((AppLovinAdImpl) this.f9246g);
        String strA = this.f9249j.a(a(), str, this.f9246g.getCachePrefix(), list, z10, iA, this.f9248i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f9249j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Finish caching video for ad #" + this.f9246g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    protected String c(String str, List list, boolean z10) {
        try {
            InputStream inputStreamA = this.f9249j.a(str, list, z10, f2.a((AppLovinAdImpl) this.f9246g));
            if (inputStreamA == null) {
                if (inputStreamA == null) {
                    return null;
                }
                inputStreamA.close();
                return null;
            }
            try {
                String strA = this.f9249j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } finally {
            }
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Unknown failure to read input stream.", th2);
            }
            this.f9073c.a(this.f9072b, th2);
            this.f9071a.D().a(this.f9072b, "readInputStreamAsString", th2);
            return null;
        }
    }

    protected List e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f9246g.G() != null) {
            arrayList.add(a(this.f9246g.G().toString(), new a()));
        }
        if (this.f9246g.Y() != null) {
            arrayList.add(a(this.f9246g.Y().toString(), new b()));
        }
        return arrayList;
    }

    protected List a(List list) {
        this.f9254o = list;
        return this.f9071a.q0().a(list, this.f9252m);
    }

    protected e0 a(String str, e0.a aVar) {
        return new e0(str, this.f9246g, this.f9248i, this.f9071a, aVar);
    }

    protected e0 a(String str, List list, boolean z10, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f9073c.a(this.f9072b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Caching video " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        return new e0(str, this.f9246g, list, z10, this.f9248i, this.f9071a, new c(aVar));
    }

    protected d0 a(String str, List list, e eVar) {
        d0 d0Var = new d0(str, this.f9246g, list, this.f9253n, this.f9248i, this.f9071a, new d(eVar));
        this.f9255p = d0Var;
        return d0Var;
    }

    protected Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Caching " + str + " image...");
        }
        return b(string);
    }

    protected Uri b(String str) {
        return a(str, this.f9246g.S(), true);
    }

    Uri a(String str, List list, boolean z10) {
        String str2;
        int iA;
        Map mapA;
        try {
            iA = this.f9071a.G().a(str, this.f9246g);
            mapA = f2.a((AppLovinAdImpl) this.f9246g);
            str2 = str;
        } catch (Throwable th2) {
            th = th2;
            str2 = str;
        }
        try {
            String strA = this.f9249j.a(a(), str2, this.f9246g.getCachePrefix(), list, z10, iA, this.f9248i, mapA);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.f9249j.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9073c.b(this.f9072b, "Unable to extract Uri from image file");
                    }
                    a(strA, "extractUriFromImageFile", mapA);
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.b(this.f9072b, "Unable to retrieve File from cached image filename = " + strA);
                }
                a(strA, "retrieveImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Failed to cache image: " + str2);
            }
            a(str2, "cacheImageResource", mapA);
            return null;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Failed to cache image at url = " + str2, th4);
            }
            Map mapA2 = f2.a((AppLovinAdImpl) this.f9246g);
            CollectionUtils.putStringIfValid("url", str2, mapA2);
            this.f9071a.D().a(this.f9072b, "cacheImageResource", th4, mapA2);
            return null;
        }
    }

    void a(com.applovin.impl.sdk.ad.b bVar) {
        String strA0 = bVar.a0();
        if (bVar.J0() && StringUtils.isValidString(strA0)) {
            String strA = a(strA0, bVar.S(), bVar);
            bVar.c(strA);
            this.f9073c.f(this.f9072b, "Ad updated with video button HTML assets cached = " + strA);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0039, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String a(java.lang.String r12, java.util.List r13, com.applovin.impl.sdk.ad.b r14) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.l5.a(java.lang.String, java.util.List, com.applovin.impl.sdk.ad.b):java.lang.String");
    }

    private Uri a(String str, String str2) {
        File fileA = this.f9249j.a(n7.a(Uri.parse(str2), this.f9246g.getCachePrefix(), this.f9071a), com.applovin.impl.sdk.k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f9071a.a(x4.Q6)).booleanValue() && this.f9249j.a(fileA)) {
            return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
        }
        String str3 = str + str2;
        if (!this.f9249j.a(fileA, str3, Arrays.asList(str), this.f9071a.G().a(str3, this.f9246g), this.f9248i, f2.a((AppLovinAdImpl) this.f9246g))) {
            return null;
        }
        return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
    }

    void a(int i10) {
        if (this.f9247h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Calling back ad load failed with error code: " + i10);
            }
            this.f9247h.failedToReceiveAd(i10);
            this.f9247h = null;
        }
        g();
    }

    protected void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f9071a.D().a(d2.M0, str2, map2);
    }
}
