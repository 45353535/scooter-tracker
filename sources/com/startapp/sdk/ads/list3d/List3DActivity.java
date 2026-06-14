package com.startapp.sdk.ads.list3d;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.C4240b4;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject$Size;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.ag;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.g2;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.i0;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.li;
import com.startapp.sdk.internal.mb;
import com.startapp.sdk.internal.ob;
import com.startapp.sdk.internal.pb;
import com.startapp.sdk.internal.rb;
import com.startapp.sdk.internal.tb;
import com.startapp.sdk.internal.ub;
import com.startapp.sdk.internal.ug;
import com.startapp.sdk.internal.vb;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.zb;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class List3DActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List3DView f63794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Long f63796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f63797d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f63799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f63800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList f63801h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private vb f63802i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f63798e = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private mb f63803j = new mb(this);

    @Override // android.app.Activity
    public final void finish() {
        vb vbVar;
        try {
            SystemClock.uptimeMillis();
            ArrayList arrayList = this.f63801h;
            String str = (arrayList == null || arrayList.isEmpty() || ((rb) this.f63801h.get(0)).f65202e == null) ? "" : ((rb) this.f63801h.get(0)).f65202e;
            h0.a(this, str, a());
            ih.f64695a.getClass();
            if (this.f63795b == getResources().getConfiguration().orientation) {
                zb.a(this).a(new Intent("com.startapp.android.HideDisplayBroadcastListener"));
            }
            synchronized (this) {
                try {
                    if (this.f63803j != null) {
                        zb.a(this).a(this.f63803j);
                        this.f63803j = null;
                    }
                } finally {
                }
            }
            String str2 = this.f63799f;
            if (str2 != null && (vbVar = this.f63802i) != null) {
                for (ag agVar : vbVar.a(str2).f65342a.f64411c.values()) {
                    if (agVar != null) {
                        agVar.a("AD_CLOSED_TOO_QUICKLY", null);
                    }
                }
                if (!i0.f64666f.booleanValue()) {
                    this.f63802i.f65393a.remove(this.f63799f);
                }
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        vb vbVar = this.f63802i;
        if (vbVar != null) {
            for (ag agVar : vbVar.a(this.f63799f).f65342a.f64411c.values()) {
                if (agVar != null) {
                    agVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Throwable th2;
        View view;
        try {
            overridePendingTransition(0, 0);
            super.onCreate(bundle);
            if (getIntent().getBooleanExtra("fullscreen", false)) {
                try {
                    requestWindowFeature(1);
                    getWindow().setFlags(1024, 1024);
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            if (bundle == null) {
                zb.a(this).a(new Intent("com.startapp.android.ShowDisplayBroadcastListener"));
                this.f63796c = (Long) getIntent().getSerializableExtra("lastLoadTime");
                this.f63797d = (Long) getIntent().getSerializableExtra("adCacheTtl");
            } else {
                if (bundle.containsKey("lastLoadTime")) {
                    this.f63796c = (Long) bundle.getSerializable("lastLoadTime");
                }
                if (bundle.containsKey("adCacheTtl")) {
                    this.f63797d = (Long) bundle.getSerializable("adCacheTtl");
                }
            }
            getIntent().getStringExtra(C4240b4.i.L);
            this.f63799f = getIntent().getStringExtra("listModelUuid");
            zb.a(this).a(this.f63803j, new IntentFilter("com.startapp.android.CloseAdActivity"));
            this.f63795b = getResources().getConfiguration().orientation;
            WeakHashMap weakHashMap = vi.f65408a;
            vi.a((Activity) this, getResources().getConfiguration().orientation, true);
            requestWindowFeature(1);
            this.f63800g = getIntent().getStringExtra("adTag");
            int iD = AdsCommonMetaData.k().d();
            int iC = AdsCommonMetaData.k().c();
            this.f63794a = new List3DView(this);
            this.f63794a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iD, iC}));
            vb vbVar = (vb) com.startapp.sdk.components.a.a(this).R.a();
            this.f63802i = vbVar;
            ArrayList arrayList = vbVar.a(this.f63799f).f65343b;
            this.f63801h = arrayList;
            if (arrayList == null) {
                finish();
                return;
            }
            this.f63794a.setStarted();
            this.f63794a.setHint(true);
            this.f63794a.setFade(true);
            pb pbVar = new pb(this, this.f63801h, this.f63800g, this.f63799f);
            this.f63802i.a(this.f63799f).a(this);
            this.f63794a.setAdapter(pbVar);
            this.f63794a.setDynamics(new ug());
            this.f63794a.setOnItemClickListener(new a(this));
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setFitsSystemWindows(true);
            relativeLayout.setContentDescription("StartApp Ad");
            relativeLayout.setId(i0.f64668h);
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            relativeLayout.addView(linearLayout, layoutParams2);
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            relativeLayout2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout2.setBackgroundColor(AdsCommonMetaData.k().z().intValue());
            linearLayout.addView(relativeLayout2);
            TextView textView = new TextView(this);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            textView.setLayoutParams(layoutParams3);
            float f10 = 2;
            textView.setPadding(0, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 5, getResources().getDisplayMetrics())));
            textView.setTextColor(AdsCommonMetaData.k().C().intValue());
            textView.setTextSize(AdsCommonMetaData.k().E().intValue());
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setText(AdsCommonMetaData.k().A());
            textView.setShadowLayer(2.5f, -2.0f, 2.0f, -11513776);
            li.a(textView, AdsCommonMetaData.k().D());
            relativeLayout2.addView(textView);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(11);
            layoutParams4.addRule(15);
            Bitmap bitmapB = g2.b(this, "close_button.png");
            if (bitmapB == null) {
                bitmapB = g2.b(this, "close_button.png");
            }
            if (bitmapB != null) {
                ImageButton imageButton = new ImageButton(this, null, R.style.Theme.Translucent);
                float f11 = 36;
                imageButton.setImageBitmap(Bitmap.createScaledBitmap(bitmapB, Math.round(TypedValue.applyDimension(1, f11, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, f11, getResources().getDisplayMetrics())), true));
                view = imageButton;
            } else {
                TextView textView2 = new TextView(this);
                textView2.setText("   x   ");
                textView2.setTextSize(20.0f);
                view = textView2;
            }
            view.setLayoutParams(layoutParams4);
            view.setOnClickListener(new b(this));
            view.setContentDescription("x");
            view.setId(i0.f64670j);
            relativeLayout2.addView(view);
            View view2 = new View(this);
            view2.setLayoutParams(new LinearLayout.LayoutParams(-1, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics()))));
            view2.setBackgroundColor(AdsCommonMetaData.k().B().intValue());
            linearLayout.addView(view2);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
            layoutParams5.weight = 1.0f;
            this.f63794a.setLayoutParams(layoutParams5);
            linearLayout.addView(this.f63794a);
            LinearLayout linearLayout2 = new LinearLayout(this);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.gravity = 80;
            linearLayout2.setLayoutParams(layoutParams6);
            linearLayout2.setBackgroundColor(AdsCommonMetaData.k().u().intValue());
            linearLayout2.setGravity(17);
            linearLayout.addView(linearLayout2);
            TextView textView3 = new TextView(this);
            textView3.setTextColor(AdsCommonMetaData.k().v().intValue());
            textView3.setPadding(0, Math.round(TypedValue.applyDimension(1, f10, getResources().getDisplayMetrics())), 0, Math.round(TypedValue.applyDimension(1, 3, getResources().getDisplayMetrics())));
            textView3.setText("Powered By ");
            textView3.setTextSize(16.0f);
            linearLayout2.addView(textView3);
            ImageView imageView = new ImageView(this);
            Bitmap bitmapB2 = g2.b(this, "logo.png");
            if (bitmapB2 == null) {
                bitmapB2 = g2.b(this, "logo.png");
            }
            imageView.setImageBitmap(Bitmap.createScaledBitmap(bitmapB2, Math.round(TypedValue.applyDimension(1, 56, getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 12, getResources().getDisplayMetrics())), true));
            linearLayout2.addView(imageView);
            try {
                new com.startapp.sdk.adsbase.adinformation.a(this, AdInformationObject$Size.LARGE, AdPreferences.Placement.INAPP_OFFER_WALL, (AdInformationOverrides) getIntent().getSerializableExtra("adInfoOverride"), null, null, null, null, null).a(relativeLayout);
                setContentView(relativeLayout, layoutParams);
                new Handler().postDelayed(new ob(this), 500L);
                return;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        g9.a(th2);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        if (this.f63803j != null) {
            zb.a(this).a(this.f63803j);
        }
        WeakHashMap weakHashMap = vi.f65408a;
        vi.a((Activity) this, getResources().getConfiguration().orientation, false);
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        super.onPause();
        vb vbVar = this.f63802i;
        if (vbVar != null) {
            for (ag agVar : vbVar.a(this.f63799f).f65342a.f64411c.values()) {
                if (agVar != null) {
                    agVar.a();
                }
            }
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (this.f63796c != null && this.f63797d != null && System.currentTimeMillis() - this.f63796c.longValue() > this.f63797d.longValue()) {
            finish();
            return;
        }
        ih.f64695a.getClass();
        this.f63798e = SystemClock.uptimeMillis();
        vb vbVar = this.f63802i;
        if (vbVar != null) {
            d9 d9Var = vbVar.a(this.f63799f).f65342a;
            for (String str : d9Var.f64411c.keySet()) {
                if (d9Var.f64411c.get(str) != null) {
                    ((ag) d9Var.f64411c.get(str)).c();
                }
            }
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Long l10 = this.f63796c;
        if (l10 != null) {
            bundle.putSerializable("lastLoadTime", l10);
        }
        Long l11 = this.f63797d;
        if (l11 != null) {
            bundle.putSerializable("adCacheTtl", l11);
        }
    }

    protected final CloseTrackingParams a() {
        return new CloseTrackingParams(this.f63800g, (SystemClock.uptimeMillis() - this.f63798e) / 1000);
    }

    public final void a(int i10) {
        ArrayList arrayList;
        List3DView list3DView = this.f63794a;
        View childAt = list3DView.getChildAt(i10 - list3DView.f63812i);
        if (childAt == null) {
            return;
        }
        tb tbVar = (tb) childAt.getTag();
        vb vbVar = this.f63802i;
        ub ubVarA = vbVar != null ? vbVar.a(this.f63799f) : null;
        if (ubVarA == null || (arrayList = ubVarA.f65343b) == null || i10 >= arrayList.size()) {
            return;
        }
        rb rbVar = (rb) ubVarA.f65343b.get(i10);
        tbVar.f65312b.setImageBitmap(ubVarA.f65342a.a(rbVar.f65198a, i10, rbVar.f65206i));
        tbVar.f65312b.requestLayout();
        if (rbVar.f65211n != null) {
            tbVar.f65315e.setText("Open");
        } else {
            tbVar.f65315e.setText("Download");
        }
    }
}
