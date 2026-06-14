package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class pb extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65098b;

    public pb(List3DActivity list3DActivity, ArrayList arrayList, String str, String str2) {
        super(list3DActivity, 0, arrayList);
        this.f65097a = str;
        this.f65098b = str2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) throws Throwable {
        View view2;
        tb tbVar;
        String str;
        if (view == null) {
            tbVar = new tb(getContext());
            view2 = tbVar.f65311a;
        } else {
            view2 = view;
            tbVar = (tb) view.getTag();
        }
        rb rbVar = (rb) getItem(i10);
        MetaDataStyle metaDataStyleA = AdsCommonMetaData.k().a(rbVar.f65214q);
        if (tbVar.f65317g != metaDataStyleA) {
            tbVar.f65317g = metaDataStyleA;
            tbVar.f65311a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{metaDataStyleA.e().intValue(), metaDataStyleA.d().intValue()}));
            tbVar.f65313c.setTextSize(metaDataStyleA.h().intValue());
            tbVar.f65313c.setTextColor(metaDataStyleA.f().intValue());
            li.a(tbVar.f65313c, metaDataStyleA.g());
            tbVar.f65314d.setTextSize(metaDataStyleA.c().intValue());
            tbVar.f65314d.setTextColor(metaDataStyleA.a().intValue());
            li.a(tbVar.f65314d, metaDataStyleA.b());
        }
        tbVar.f65313c.setText(rbVar.f65204g);
        tbVar.f65314d.setText(rbVar.f65205h);
        ub ubVarA = ((vb) com.startapp.sdk.components.a.a(getContext()).R.a()).a(this.f65098b);
        Bitmap bitmapA = ubVarA.f65342a.a(rbVar.f65198a, i10, rbVar.f65206i);
        if (bitmapA == null) {
            tbVar.f65312b.setImageResource(R.drawable.sym_def_app_icon);
            tbVar.f65312b.setTag("tag_error");
        } else {
            tbVar.f65312b.setImageBitmap(bitmapA);
            tbVar.f65312b.setTag("tag_ok");
        }
        tbVar.f65316f.setRating(rbVar.f65207j);
        if (rbVar.f65211n != null) {
            tbVar.f65315e.setText("Open");
        } else {
            tbVar.f65315e.setText("Download");
        }
        Context context = getContext();
        String[] strArr = rbVar.f65200c;
        TrackingParams trackingParams = new TrackingParams(this.f65097a);
        Long l10 = rbVar.f65212o;
        long millis = l10 != null ? TimeUnit.SECONDS.toMillis(l10.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
        d9 d9Var = ubVarA.f65342a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String str2 = ubVarA.f65344c;
        if (strArr != null) {
            str = TextUtils.join("^", strArr) + str2;
        } else {
            str = null;
        }
        if (d9Var.f64411c.containsKey(str)) {
            return view2;
        }
        ag agVar = new ag(context, placement, strArr, trackingParams, millis, false, null);
        d9Var.f64411c.put(str, agVar);
        agVar.c();
        return view2;
    }
}
