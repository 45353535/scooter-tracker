package com.startapp.sdk.internal;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.json.JsonParser;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class he extends c8 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MetaData f64630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f64631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f64632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ie f64633p;

    /* JADX WARN: Illegal instructions before constructor call */
    public he(ie ieVar, Context context, lb lbVar, AdPreferences adPreferences, Context context2, AdPreferences adPreferences2) {
        MetaDataRequest$RequestReason metaDataRequest$RequestReason = MetaDataRequest$RequestReason.PERIODIC;
        this.f64633p = ieVar;
        this.f64631n = context2;
        this.f64632o = adPreferences2;
        super(context, lbVar, adPreferences, metaDataRequest$RequestReason, null, 0);
    }

    @Override // com.startapp.sdk.internal.c8
    public final Boolean a() {
        try {
            com.startapp.sdk.adsbase.g.e(this.f64631n);
            mc mcVar = new mc(this.f64631n, (vf) com.startapp.sdk.components.a.a(this.f64631n).G.a(), MetaDataRequest$RequestReason.PERIODIC);
            mcVar.a(this.f64631n, this.f64632o);
            String strA = a(this.f64631n, mcVar);
            if (!TextUtils.isEmpty(strA)) {
                MetaData metaData = (MetaData) JsonParser.fromJson(strA, MetaData.class);
                this.f64630m = metaData;
                return Boolean.valueOf(metaData != null);
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        return Boolean.FALSE;
    }

    @Override // com.startapp.sdk.internal.c8
    /* JADX INFO: renamed from: c */
    public final void b(Boolean bool) {
        MetaData metaData;
        WeakHashMap weakHashMap = vi.f65408a;
        try {
            if (bool.booleanValue() && (metaData = this.f64630m) != null) {
                MetaData.a(this.f64631n, metaData, MetaDataRequest$RequestReason.PERIODIC, this.f64350l);
            }
            this.f64633p.callback.a();
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
