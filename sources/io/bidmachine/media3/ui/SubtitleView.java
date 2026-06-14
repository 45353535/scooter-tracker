package io.bidmachine.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p9.a;

/* JADX INFO: loaded from: classes12.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f81565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private yb.a f81566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f81567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f81568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f81569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f81570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f81571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f81572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private a f81573j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f81574k;

    interface a {
        void a(List list, yb.a aVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81565b = Collections.EMPTY_LIST;
        this.f81566c = yb.a.f118892g;
        this.f81567d = 0;
        this.f81568e = 0.0533f;
        this.f81569f = 0.08f;
        this.f81570g = true;
        this.f81571h = true;
        io.bidmachine.media3.ui.a aVar = new io.bidmachine.media3.ui.a(context);
        this.f81573j = aVar;
        this.f81574k = aVar;
        addView(aVar);
        this.f81572i = 1;
    }

    private p9.a a(p9.a aVar) {
        a.b bVarA = aVar.a();
        if (!this.f81570g) {
            g0.c(bVarA);
        } else if (!this.f81571h) {
            g0.d(bVarA);
        }
        return bVarA.a();
    }

    private void c(int i10, float f10) {
        this.f81567d = i10;
        this.f81568e = f10;
        f();
    }

    private void f() {
        this.f81573j.a(getCuesWithStylingPreferencesApplied(), this.f81566c, this.f81568e, this.f81567d, this.f81569f);
    }

    private List<p9.a> getCuesWithStylingPreferencesApplied() {
        if (this.f81570g && this.f81571h) {
            return this.f81565b;
        }
        ArrayList arrayList = new ArrayList(this.f81565b.size());
        for (int i10 = 0; i10 < this.f81565b.size(); i10++) {
            arrayList.add(a((p9.a) this.f81565b.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private yb.a getUserCaptionStyle() {
        if (isInEditMode()) {
            return yb.a.f118892g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? yb.a.f118892g : yb.a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f81574k);
        View view = this.f81574k;
        if (view instanceof i0) {
            ((i0) view).g();
        }
        this.f81574k = t10;
        this.f81573j = t10;
        addView(t10);
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f81571h = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f81570g = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f81569f = f10;
        f();
    }

    public void setCues(@Nullable List<p9.a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f81565b = list;
        f();
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    public void setStyle(yb.a aVar) {
        this.f81566c = aVar;
        f();
    }

    public void setViewType(int i10) {
        if (this.f81572i == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new io.bidmachine.media3.ui.a(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new i0(getContext()));
        }
        this.f81572i = i10;
    }
}
