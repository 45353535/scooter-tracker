package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;
import com.startapp.sdk.adsbase.cache.ACMConfig;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RscMetadata;
import com.startapp.sdk.jobs.JobRequest$Network;
import com.startapp.sdk.sensors.SensorsData;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class eh implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f64463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jh f64464c;

    public eh(jh jhVar, Context context, com.startapp.sdk.components.a aVar) {
        this.f64464c = jhVar;
        this.f64462a = context;
        this.f64463b = aVar;
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10) {
        int i10;
        int i11;
        jh jhVar = this.f64464c;
        Context context = this.f64462a;
        int i12 = 0;
        if (jhVar.f64774b) {
            p pVar = (p) com.startapp.sdk.components.a.a(context).M.a();
            if (jhVar.f64786n || !CacheMetaData.b().a().g() || !MetaData.E().f0()) {
                pVar.f65059c = true;
                Context context2 = pVar.f65063g;
                ((Executor) com.startapp.sdk.components.a.a(context2).C.a()).execute(new o6(context2, new k(pVar)));
            } else if (!pVar.f65059c && CacheMetaData.b().a().g() && MetaData.E().f0()) {
                pVar.f65060d = true;
                Context context3 = pVar.f65063g;
                ((Executor) com.startapp.sdk.components.a.a(context3).C.a()).execute(new p6(context3, new j(pVar)));
            }
            if (z10) {
                p pVar2 = (p) com.startapp.sdk.components.a.a(context).M.a();
                ACMConfig aCMConfigA = CacheMetaData.b().a();
                if (aCMConfigA != null) {
                    MetaData metaDataE = MetaData.E();
                    Set<StartAppAd.AdMode> setB = aCMConfigA.b();
                    if (setB != null && !setB.isEmpty() && CacheMetaData.d() && metaDataE.f0() && ((r0) pVar2.f65072p.a()).a() != null) {
                        int iZ = metaDataE.Z();
                        int i13 = AdsCommonMetaData.k().i();
                        for (StartAppAd.AdMode adMode : setB) {
                            if (adMode != null) {
                                String str = "autoLoadNotShownAdPrefix" + adMode.name();
                                int i14 = ((vf) pVar2.f65066j.a()).getInt(str, 0);
                                if (i14 < iZ) {
                                    AdPreferences adPreferences = new AdPreferences();
                                    adPreferences.makePreCached();
                                    StartAppAd.AdMode adMode2 = StartAppAd.AdMode.FULLPAGE;
                                    if (adMode != adMode2) {
                                        StartAppAd.AdMode adMode3 = StartAppAd.AdMode.OFFERWALL;
                                        if (adMode != adMode3) {
                                            pVar2.a(null, adMode, adPreferences, null, null);
                                        } else if (i13 < 100) {
                                            pVar2.a(null, adMode3, adPreferences, null, null);
                                        }
                                    } else if (i13 > 0) {
                                        pVar2.a(null, adMode2, adPreferences, null, null);
                                    }
                                    uf ufVarEdit = ((vf) pVar2.f65066j.a()).edit();
                                    int i15 = i14 + 1;
                                    ufVarEdit.a(str, Integer.valueOf(i15));
                                    ufVarEdit.f65346a.putInt(str, i15);
                                    ufVarEdit.apply();
                                }
                            }
                        }
                    }
                }
            }
        }
        m2 m2Var = (m2) this.f64463b.f64191r.a();
        synchronized (m2Var) {
            m2Var.a(Math.max(0L, (Math.max(60000L, m2Var.d()) + ((vf) m2Var.f64370e.a()).getLong(m2Var.f64373h, 0L)) - System.currentTimeMillis()));
        }
        ((mg) this.f64463b.f64192s.a()).e();
        ((ph) this.f64463b.f64179f.a()).e();
        jh jhVar2 = this.f64464c;
        Context context4 = this.f64462a;
        jhVar2.getClass();
        db dbVar = (db) com.startapp.sdk.components.a.a(context4).f64195v.a();
        if (MetaData.E().m0()) {
            long jO = ((long) MetaData.E().O()) * 60000;
            fe feVar = new fe(ie.class);
            feVar.f64507d = Long.valueOf(jO);
            feVar.f64505b = JobRequest$Network.ANY;
            dbVar.a(new ge(feVar));
        } else {
            int iA = ge.a(ie.class);
            if (!dbVar.f64419b.a(iA)) {
                dbVar.f64418a.a(iA);
            }
        }
        jh jhVar3 = this.f64464c;
        Context context5 = this.f64462a;
        jhVar3.getClass();
        db dbVar2 = (db) com.startapp.sdk.components.a.a(context5).f64195v.a();
        if (MetaData.E().l0()) {
            long jB = ((long) MetaData.E().b(context5)) * 60000;
            fe feVar2 = new fe(ee.class);
            feVar2.f64507d = Long.valueOf(jB);
            feVar2.f64505b = JobRequest$Network.ANY;
            dbVar2.a(new ge(feVar2));
        } else {
            int iA2 = ge.a(ee.class);
            if (!dbVar2.f64419b.a(iA2)) {
                dbVar2.f64418a.a(iA2);
            }
        }
        jh jhVar4 = this.f64464c;
        Context context6 = this.f64462a;
        jhVar4.getClass();
        db dbVar3 = (db) com.startapp.sdk.components.a.a(context6).f64195v.a();
        MetaData metaDataE2 = MetaData.E();
        if (metaDataE2.l0() && metaDataE2.k0()) {
            long millis = TimeUnit.SECONDS.toMillis(metaDataE2.a(context6));
            fe feVar3 = new fe(de.class);
            feVar3.f64507d = Long.valueOf(millis);
            feVar3.f64505b = JobRequest$Network.ANY;
            feVar3.f64506c = true;
            dbVar3.a(new ge(feVar3));
        } else {
            int iA3 = ge.a(de.class);
            if (!dbVar3.f64419b.a(iA3)) {
                dbVar3.f64418a.a(iA3);
            }
        }
        jh jhVar5 = this.f64464c;
        Context context7 = this.f64462a;
        jhVar5.getClass();
        com.startapp.sdk.components.a aVarA = com.startapp.sdk.components.a.a(context7);
        vf vfVar = (vf) aVarA.G.a();
        if (vfVar.getBoolean("shared_prefs_first_init", true)) {
            uf ufVarEdit2 = vfVar.edit();
            ufVarEdit2.a("totalSessions", 0);
            ufVarEdit2.f65346a.putInt("totalSessions", 0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ufVarEdit2.a("firstSessionTime", Long.valueOf(jCurrentTimeMillis));
            ufVarEdit2.f65346a.putLong("firstSessionTime", jCurrentTimeMillis);
            ufVarEdit2.apply();
            ((Executor) aVarA.A.a()).execute(new fh(context7, aVarA, vfVar));
        }
        if (this.f64462a != null) {
            g9 g9Var = new g9(h9.f64614i);
            g9Var.f64559j = false;
            try {
                com.startapp.sdk.components.a aVar = com.startapp.sdk.components.a.U.f65426a;
                if (aVar != null) {
                    ((w9) aVar.f64190q.a()).a(g9Var);
                }
            } catch (Throwable unused) {
            }
        }
        this.f64464c.getClass();
        sf sfVar = (sf) this.f64463b.f64194u.a();
        try {
            if (!sfVar.a()) {
                ((Executor) sfVar.f65260b.a()).execute(new qf(sfVar));
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        hf hfVar = (hf) this.f64463b.f64182i.a();
        List listA = hfVar.a();
        hfVar.f64635b.getClass();
        RscMetadata rscMetadataS = MetaData.E().S();
        MotionMetadata motionMetadata = null;
        if (rscMetadataS == null || !rscMetadataS.d()) {
            rscMetadataS = null;
        }
        if (rscMetadataS != null && (rscMetadataS.a() & 1024) != 0) {
            g9 g9Var2 = new g9(h9.f64609d);
            g9Var2.f64553d = "RSC init";
            StringBuilder sb2 = new StringBuilder("targets: ");
            sb2.append(listA != null ? Integer.valueOf(((LinkedList) listA).size()) : null);
            g9Var2.f64554e = sb2.toString();
            g9Var2.a();
        }
        pc pcVar = (pc) this.f64463b.f64196w.a();
        MotionMetadata motionMetadataJ = MetaData.E().J();
        if (motionMetadataJ != null && motionMetadataJ.u()) {
            motionMetadata = motionMetadataJ;
        }
        if (motionMetadata != null) {
            pcVar.f65104e = Math.random() < motionMetadata.k();
        }
        pcVar.f65102c.post(new oc(pcVar));
        SensorsData sensorsDataU = MetaData.E().U();
        if (sensorsDataU != null && sensorsDataU.h()) {
            ((lg) this.f64463b.f64197x.a()).a(this.f64462a);
        }
        o0 o0Var = (o0) this.f64463b.f64189p.a();
        int i16 = z10 ? 1 : 2;
        Locale locale = Locale.ENGLISH;
        String str2 = "cnt=" + o0Var.f64985b.incrementAndGet() + ",mds=" + i16;
        g9 g9Var3 = new g9(h9.f64609d);
        g9Var3.f64553d = MobileAdsBridgeBase.initializeMethodName;
        g9Var3.f64554e = str2;
        g9Var3.a();
        ((tk) this.f64463b.f64175b.a()).b();
        String strF = MetaData.E().F();
        if (strF != null) {
            String version = StartAppSDK.getVersion();
            String[] strArrSplit = strF.split("\\.");
            String[] strArrSplit2 = version.split("\\.");
            int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
            for (int i17 = 0; i17 < iMin; i17++) {
                try {
                    i10 = Integer.parseInt(strArrSplit[i17]);
                    i11 = Integer.parseInt(strArrSplit2[i17]);
                } catch (NumberFormatException unused2) {
                    int iCompareTo = strArrSplit[i17].compareTo(strArrSplit2[i17]);
                    if (iCompareTo > 0) {
                        i12 = i17 + 1;
                        break;
                    } else if (iCompareTo >= 0) {
                    }
                }
                if (i10 > i11) {
                    i12 = i17 + 1;
                    break;
                } else {
                    if (i10 < i11) {
                        i12 = -(i17 + 1);
                        break;
                    }
                }
            }
            if (strArrSplit.length > strArrSplit2.length) {
                i12 = iMin + 1;
            } else if (strArrSplit.length < strArrSplit2.length) {
                i12 = -(iMin + 1);
            }
            if (i12 > 0) {
                Log.println(5, "StartAppSDK", "Current SDK version (" + StartAppSDK.getVersion() + ") is outdated. Integrate the most recent version (" + strF + ") in order to improve your ads performance.");
            }
        }
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        o0 o0Var = (o0) this.f64463b.f64189p.a();
        Locale locale = Locale.ENGLISH;
        String str = "cnt=" + o0Var.f64985b.incrementAndGet() + ",mds=0";
        g9 g9Var = new g9(h9.f64609d);
        g9Var.f64553d = MobileAdsBridgeBase.initializeMethodName;
        g9Var.f64554e = str;
        g9Var.a();
        ((tk) this.f64463b.f64175b.a()).b();
    }
}
