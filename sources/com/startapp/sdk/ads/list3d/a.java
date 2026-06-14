package com.startapp.sdk.ads.list3d;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.nb;
import com.startapp.sdk.internal.rb;
import com.startapp.sdk.internal.ub;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List3DActivity f63828a;

    public a(List3DActivity list3DActivity) {
        this.f63828a = list3DActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        String str;
        ag agVar;
        String str2 = ((rb) this.f63828a.f63801h.get(i10)).f65199b;
        String[] strArr = ((rb) this.f63828a.f63801h.get(i10)).f65201d;
        String str3 = ((rb) this.f63828a.f63801h.get(i10)).f65203f;
        boolean z10 = ((rb) this.f63828a.f63801h.get(i10)).f65208k;
        boolean z11 = ((rb) this.f63828a.f63801h.get(i10)).f65209l;
        String str4 = ((rb) this.f63828a.f63801h.get(i10)).f65211n;
        String str5 = ((rb) this.f63828a.f63801h.get(i10)).f65210m;
        Boolean bool = ((rb) this.f63828a.f63801h.get(i10)).f65213p;
        ub ubVarA = this.f63828a.f63802i.a(this.f63828a.f63799f);
        String[] strArr2 = ((rb) this.f63828a.f63801h.get(i10)).f65200c;
        d9 d9Var = ubVarA.f65342a;
        String str6 = ubVarA.f65344c;
        if (strArr2 != null) {
            str = TextUtils.join("^", strArr2) + str6;
        } else {
            str = null;
        }
        HashMap map = d9Var.f64411c;
        if (map != null && (agVar = (ag) map.get(str)) != null) {
            agVar.a(null, null);
        }
        if (str4 != null && !TextUtils.isEmpty(str4)) {
            List3DActivity list3DActivity = this.f63828a;
            h0.a(str4, str5, str2, list3DActivity, new TrackingParams(list3DActivity.f63800g));
            this.f63828a.finish();
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zP = MetaData.E().p();
        Context applicationContext = this.f63828a.getApplicationContext();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
        boolean zA = h0.a(applicationContext);
        if (z10 && !zA) {
            List3DActivity list3DActivity2 = this.f63828a;
            h0.a(list3DActivity2, str2, strArr, str3, list3DActivity2.a(), AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), z11, bool, false, zP ? new nb(this) : null);
            return;
        }
        List3DActivity list3DActivity3 = this.f63828a;
        h0.a(list3DActivity3, str2, strArr, list3DActivity3.a(), z11 && !zA, false);
        if (zP) {
            this.f63828a.finish();
        }
    }
}
