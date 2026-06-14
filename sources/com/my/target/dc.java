package com.my.target;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class dc extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f59546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f59547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f59548c;

    public interface a {
        void a(boolean z10);
    }

    public dc(Context context) {
        super(context);
    }

    public final void a() {
        a aVar = this.f59546a;
        if (aVar == null) {
            return;
        }
        if (b()) {
            aVar.a(true);
        } else {
            if (this.f59548c) {
                return;
            }
            aVar.a(false);
        }
    }

    public boolean b() {
        return this.f59547b && this.f59548c;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f59548c = z10;
        a();
    }

    public void setStateChangedListener(@Nullable a aVar) {
        this.f59546a = aVar;
    }

    public final void a(boolean z10) {
        this.f59547b = z10;
        this.f59548c = hasWindowFocus();
        a();
    }
}
