package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.m0;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
import com.appodeal.ads.modules.common.internal.LogConstants;

/* JADX INFO: loaded from: classes6.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GradientDrawable f9601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Button f9602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.a f9603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f9604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdFormat f9605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f9606f;

    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        return b.LOAD == bVar ? m0.a(R.color.applovin_sdk_brand_color, getContext()) : b.LOADING == bVar ? m0.a(R.color.applovin_sdk_brand_color, getContext()) : m0.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : LogConstants.EVENT_SHOW;
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f9603c.a();
        } else {
            setEnabled(true);
            this.f9603c.b();
        }
        this.f9602b.setText(b(bVar));
        this.f9601a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.f9604d;
    }

    public MaxAdFormat getFormat() {
        return this.f9605e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f9606f;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f9604d != bVar) {
            c(bVar);
        }
        this.f9604d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f9605e = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f9606f = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f9601a = gradientDrawable;
        Button button = new Button(getContext());
        this.f9602b = button;
        com.applovin.impl.a aVar = new com.applovin.impl.a(getContext(), 20, android.R.attr.progressBarStyleSmall);
        this.f9603c = aVar;
        b bVar = b.LOAD;
        this.f9604d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.f9602b.setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{m0.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
