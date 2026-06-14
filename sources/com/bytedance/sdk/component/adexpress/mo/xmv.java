package com.bytedance.sdk.component.adexpress.mo;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class xmv extends LinearLayout {
    private TextView lnr;
    private qdl mml;
    private com.bytedance.adsdk.ud.mo mo;
    private LinearLayout mzz;
    private TextView qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private com.bytedance.sdk.component.utils.uw f16445ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.mml.to f16446wd;

    public interface qdl {
    }

    public xmv(@NonNull Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.mml.to toVar) {
        super(context);
        this.f16446wd = toVar;
        qdl(context, view);
    }

    public TextView getTopTextView() {
        return this.qdl;
    }

    public LinearLayout getWriggleLayout() {
        return this.mzz;
    }

    public View getWriggleProgressIv() {
        return this.mo;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f16445ud == null) {
                this.f16445ud = new com.bytedance.sdk.component.utils.uw(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.mo.xmv.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.mml.to toVar = this.f16446wd;
            if (toVar != null) {
                toVar.lnr();
                this.f16446wd.mzz();
                this.f16446wd.mo();
                this.f16446wd.jpc();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.ud.mo moVar = this.mo;
            if (moVar != null) {
                moVar.mzz();
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public void setOnShakeViewListener(qdl qdlVar) {
        this.mml = qdlVar;
    }

    public void setShakeText(String str) {
        this.lnr.setText(str);
    }

    private void qdl(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.mzz = (LinearLayout) findViewById(2097610722);
        this.qdl = (TextView) findViewById(2097610719);
        this.lnr = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.ud.mo moVar = (com.bytedance.adsdk.ud.mo) findViewById(2097610706);
        this.mo = moVar;
        moVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.mo.setImageAssetsFolder("images/");
        this.mo.qdl(true);
    }

    public void qdl() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.mo.xmv.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    xmv.this.mo.qdl();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }
}
