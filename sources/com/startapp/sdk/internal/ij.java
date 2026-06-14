package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Base64;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public final class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f64722a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f64723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f64724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lb f64725d;

    public ij(Context context, lb lbVar, lb lbVar2) {
        this.f64723b = context;
        this.f64724c = lbVar;
        this.f64725d = lbVar2;
    }

    public final boolean a(int i10) {
        ArrayList arrayList;
        jj jjVar;
        VideoAdDetails videoAdDetails;
        Iterator it = this.f64722a.iterator();
        boolean z10 = false;
        while (it.hasNext() && this.f64722a.size() > i10) {
            CachedVideoAd cachedVideoAd = (CachedVideoAd) it.next();
            p pVar = (p) this.f64725d.a();
            String strA = cachedVideoAd.a();
            synchronized (pVar) {
                arrayList = new ArrayList(pVar.f65057a.values());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Ad ad2 = ((x2) it2.next()).f65514o;
                    if (!(ad2 instanceof jj) || (videoAdDetails = (jjVar = (jj) ad2).f64799r) == null || videoAdDetails.getLocalVideoPath() == null || !jjVar.f64799r.getLocalVideoPath().equals(strA)) {
                    }
                } else {
                    it.remove();
                    if (cachedVideoAd.a() != null) {
                        new File(cachedVideoAd.a()).delete();
                    }
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void a(Context context, String str, ek ekVar, pe peVar) {
        if (this.f64722a == null) {
            LinkedList linkedList = (LinkedList) g7.c(context, "CachedAds");
            this.f64722a = linkedList;
            if (linkedList == null) {
                this.f64722a = new LinkedList();
            }
            if (a(AdsCommonMetaData.k().F().c())) {
                g7.b(context, "CachedAds", this.f64722a);
            }
        }
        try {
            URL url = new URL(str);
            String str2 = url.getHost() + url.getPath().replace("/", "_");
            try {
                String strSubstring = str2.substring(0, str2.lastIndexOf(46));
                str2 = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(strSubstring.getBytes()), 0).replaceAll("[^a-zA-Z0-9]+", "_") + str2.substring(str2.lastIndexOf(46));
            } catch (NoSuchAlgorithmException e10) {
                g9.a(e10);
            }
            String str3 = str2;
            new fk(context, url, str3, new gj(this, ekVar, new CachedVideoAd(str3), context), new hj(peVar)).a();
        } catch (MalformedURLException e11) {
            if (ekVar != null) {
                ekVar.a(null);
            }
            g9.a(e11);
        }
    }
}
