package com.startapp.sdk.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import com.vungle.ads.internal.Constants;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class h6 implements lc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lb f64601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f64602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f64603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64604e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64605f = true;

    public h6(Context context, lb lbVar, lb lbVar2) {
        this.f64600a = context;
        this.f64601b = lbVar;
        this.f64602c = lbVar2;
    }

    public static boolean a(int i10) {
        ConsentConfig consentConfigR = MetaData.E().r();
        ComponentInfoEventConfig componentInfoEventConfigF = consentConfigR != null ? consentConfigR.f() : null;
        return componentInfoEventConfigF != null && componentInfoEventConfigF.a((long) i10);
    }

    public final Boolean b() {
        if (d() && ((vf) this.f64601b.a()).contains("consentApc")) {
            return Boolean.valueOf(((vf) this.f64601b.a()).getBoolean("consentApc", false));
        }
        return null;
    }

    public final Integer c() {
        if (d()) {
            int iHashCode = ((com.startapp.sdk.common.advertisingid.b) this.f64602c.a()).a().f64842a.hashCode();
            if (!((vf) this.f64601b.a()).contains("advIdHash") || ((vf) this.f64601b.a()).getInt("advIdHash", 0) != iHashCode) {
                uf ufVarEdit = ((vf) this.f64601b.a()).edit();
                if (ufVarEdit.f65347b.containsKey("consentType")) {
                    ufVarEdit.f65349d = true;
                }
                ufVarEdit.f65346a.remove("consentType");
                if (ufVarEdit.f65347b.containsKey("consentTimestamp")) {
                    ufVarEdit.f65349d = true;
                }
                ufVarEdit.f65346a.remove("consentTimestamp");
                ufVarEdit.a("advIdHash", Integer.valueOf(iHashCode));
                ufVarEdit.f65346a.putInt("advIdHash", iHashCode);
                ufVarEdit.apply();
            }
        }
        if (d() && ((vf) this.f64601b.a()).contains("consentType")) {
            return Integer.valueOf(((vf) this.f64601b.a()).getInt("consentType", -1));
        }
        return null;
    }

    public final boolean d() {
        ConsentConfig consentConfigR = MetaData.E().r();
        return this.f64605f && consentConfigR != null && consentConfigR.l();
    }

    public final void a(Integer num, Long l10, Boolean bool, boolean z10, boolean z11) {
        if (d()) {
            long j10 = ((vf) this.f64601b.a()).getLong("consentTimestamp", 0L);
            int i10 = ((vf) this.f64601b.a()).getInt("consentType", -1);
            boolean zContains = ((vf) this.f64601b.a()).contains("consentApc");
            boolean z12 = (num == null || i10 == num.intValue()) ? false : true;
            boolean z13 = (bool == null || (zContains && ((vf) this.f64601b.a()).getBoolean("consentApc", false) == bool.booleanValue())) ? false : true;
            boolean z14 = l10 != null && l10.longValue() > j10;
            if (z10 || z14) {
                if (z12 || z13) {
                    uf ufVarEdit = ((vf) this.f64601b.a()).edit();
                    if (z12) {
                        int iIntValue = num.intValue();
                        ufVarEdit.a("consentType", num);
                        ufVarEdit.f65346a.putInt("consentType", iIntValue);
                    }
                    if (z13) {
                        boolean zBooleanValue = bool.booleanValue();
                        ufVarEdit.a("consentApc", bool);
                        ufVarEdit.f65346a.putBoolean("consentApc", zBooleanValue);
                    }
                    if (z14) {
                        long jLongValue = l10.longValue();
                        ufVarEdit.a("consentTimestamp", l10);
                        ufVarEdit.f65346a.putLong("consentTimestamp", jLongValue);
                    }
                    ufVarEdit.apply();
                    if (z11) {
                        MetaData.E().a(this.f64600a, new AdPreferences(), MetaDataRequest$RequestReason.CONSENT, false, null, true);
                    }
                }
            }
        }
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10) {
        MetaData.E().a(this);
        ConsentConfig consentConfigR = MetaData.E().r();
        if (consentConfigR == null || !d()) {
            return;
        }
        Integer numB = consentConfigR.b();
        if (numB != null) {
            a(numB, Long.valueOf(consentConfigR.j()), null, false, false);
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.CONSENT) {
            uf ufVarEdit = ((vf) this.f64601b.a()).edit();
            long j10 = consentConfigR.j();
            ufVarEdit.a("consentTimestamp", Long.valueOf(j10));
            ufVarEdit.f65346a.putLong("consentTimestamp", j10);
            ufVarEdit.apply();
            return;
        }
        if (metaDataRequest$RequestReason == MetaDataRequest$RequestReason.LAUNCH) {
            a(false, null, null, null, null, null);
        }
    }

    @Override // com.startapp.sdk.internal.lc
    public final void a() {
        MetaData.E().a(this);
    }

    public final boolean a(boolean z10, String str, String str2, String str3, String str4, String str5) {
        ConsentConfig consentConfigR;
        String strG;
        Integer consentTypeInfo;
        if ((z10 || jh.f64770u == 2) && (consentConfigR = MetaData.E().r()) != null && ((d() || z10) && !this.f64604e)) {
            Context context = this.f64600a;
            WeakHashMap weakHashMap = vi.f65408a;
            if (((g6) com.startapp.sdk.components.a.a(context).f64193t.a()).b() && vi.c(this.f64600a)) {
                if (!z10 && (consentConfigR.i() == null || consentConfigR.h() == null || ((vf) this.f64601b.a()).contains("consentApc"))) {
                    return false;
                }
                if (z10) {
                    strG = AdInformationMetaData.c().a().getDialogUrl();
                } else {
                    strG = consentConfigR.g();
                }
                if (strG == null) {
                    return false;
                }
                Intent intent = new Intent(this.f64600a, (Class<?>) ConsentActivity.class);
                intent.setFlags(C.ENCODING_PCM_32BIT);
                intent.setData(Uri.parse(strG));
                intent.putExtra("allowCT", consentConfigR.l());
                intent.putExtra("timestamp", consentConfigR.j());
                intent.putExtra("templateName", Integer.valueOf(z10 ? 4 : consentConfigR.i().intValue()));
                intent.putExtra("templateId", Integer.valueOf(z10 ? 7 : consentConfigR.h().intValue()));
                if (!z10) {
                    str = consentConfigR.d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z10) {
                    str2 = consentConfigR.e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z10) {
                    str3 = consentConfigR.a();
                }
                if (str3 != null) {
                    intent.putExtra(Constants.CLICK_URL, str3);
                }
                if (z10) {
                    intent.putExtra("advertisingId", ((com.startapp.sdk.common.advertisingid.b) this.f64602c.a()).a().f64842a);
                    if (((vf) this.f64601b.a()).contains("consentType")) {
                        intent.putExtra("consentType", ((vf) this.f64601b.a()).getInt("consentType", -1));
                    }
                    if (str4 != null) {
                        intent.putExtra("erid", str4);
                    }
                    if (str5 != null) {
                        intent.putExtra("eridUrl", str5);
                    }
                }
                ConsentTypeInfoConfig consentTypeInfoConfigC = consentConfigR.c();
                if (consentTypeInfoConfigC != null) {
                    if (consentTypeInfoConfigC.b() != null) {
                        intent.putExtra("impression", consentTypeInfoConfigC.b());
                    }
                    if (consentTypeInfoConfigC.a() != null) {
                        intent.putExtra("falseClick", consentTypeInfoConfigC.a());
                    }
                    if (consentTypeInfoConfigC.c() != null) {
                        intent.putExtra("trueClick", consentTypeInfoConfigC.c());
                    }
                }
                if (z10 && (consentTypeInfo = AdInformationMetaData.c().a().getConsentTypeInfo()) != null) {
                    intent.putExtra("trueClick", consentTypeInfo);
                }
                try {
                    this.f64600a.startActivity(intent);
                    this.f64604e = true;
                    if (a(1)) {
                        g9 g9Var = new g9(h9.f64609d);
                        g9Var.f64553d = "CNS.shown";
                        g9Var.f64558i = String.valueOf(z10);
                        g9Var.f64554e = String.valueOf(System.currentTimeMillis());
                        g9Var.a();
                    }
                } catch (ActivityNotFoundException unused) {
                } catch (Throwable th2) {
                    if (a(2)) {
                        g9.a(th2);
                    }
                }
                return this.f64604e;
            }
        }
        return false;
    }
}
