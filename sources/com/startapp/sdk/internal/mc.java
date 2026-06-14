package com.startapp.sdk.internal;

import android.content.Context;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.startapp.sdk.common.utils.Pair;
import com.vungle.ads.internal.signals.SignalManager;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class mc extends z1 {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Set f64921t0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("ispCarrId", "ispCarrIdName", "isma", "root", "appSessionDuration")));

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f64922j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f64923k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final boolean f64924l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final float f64925m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final MetaDataRequest$RequestReason f64926n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f64927o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Pair f64928p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Integer f64929q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Boolean f64930r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final long f64931s0;

    public mc(Context context, vf vfVar, MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        super(2);
        this.f64922j0 = vfVar.getInt("totalSessions", 0);
        this.f64923k0 = (int) ((System.currentTimeMillis() - vfVar.getLong("firstSessionTime", System.currentTimeMillis())) / SignalManager.TWENTY_FOUR_HOURS_MILLIS);
        this.f64925m0 = vfVar.getFloat("inAppPurchaseAmount", 0.0f);
        this.f64924l0 = vfVar.getBoolean("payingUser", false);
        this.f64927o0 = MetaData.E().Q();
        this.f64926n0 = metaDataRequest$RequestReason;
        this.f64928p0 = com.startapp.sdk.adsbase.g.a();
        this.f64931s0 = com.startapp.sdk.adsbase.g.f64053c;
        h6 h6Var = (h6) com.startapp.sdk.components.a.a(context).f64183j.a();
        this.f64929q0 = h6Var.c();
        this.f64930r0 = h6Var.b();
        this.Y = ((o0) com.startapp.sdk.components.a.a(context).f64189p.a()).a();
    }

    @Override // com.startapp.sdk.internal.z1
    public final Set a() {
        return f64921t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.startapp.sdk.internal.z1
    public final void a(ve veVar) {
        super.a(veVar);
        veVar.a(g.f64534b, g.a(), true, true);
        veVar.a("totalSessions", Integer.valueOf(this.f64922j0), true, true);
        veVar.a("daysSinceFirstSession", Integer.valueOf(this.f64923k0), true, true);
        veVar.a("profileId", this.f64927o0, false, true);
        boolean z10 = this.f64924l0;
        if (z10) {
            veVar.a("payingUser", Boolean.valueOf(z10), true, true);
            veVar.a("paidAmount", Float.valueOf(this.f64925m0), true, true);
        }
        veVar.a("reason", this.f64926n0, true, true);
        veVar.a(ApsMetricsDataMap.APSMETRICS_FIELD_CONNECTIONTYPE, this.f64929q0, false, true);
        veVar.a("apc", this.f64930r0, false, true);
        veVar.a("testAdsEnabled", ih.f64695a.f64792t ? Boolean.TRUE : null, false, true);
        veVar.a("apkHash", null, false, true);
        veVar.a("ian", null, false, true);
        Pair pair = this.f64928p0;
        veVar.a((String) pair.first, pair.second, false, true);
        long j10 = this.f64931s0;
        if (j10 != 0) {
            veVar.a("firstInstalledAppTS", Long.valueOf(j10), false, true);
        }
    }
}
