package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.mbridge.msdk.advanced.middle.c;

/* JADX INFO: loaded from: classes10.dex */
public class MBOutNativeAdvancedViewGroup extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f46441a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f46442a;

        a(int i10) {
            this.f46442a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBOutNativeAdvancedViewGroup.this.f46441a != null) {
                MBOutNativeAdvancedViewGroup.this.f46441a.i(this.f46442a);
            }
        }
    }

    public MBOutNativeAdvancedViewGroup(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f46441a != null) {
            a(1);
            if (getVisibility() == 0) {
                a(2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f46441a;
        if (cVar != null) {
            cVar.f(1);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            a(2);
            if (getParent() != null) {
                a(1);
                return;
            }
            return;
        }
        c cVar = this.f46441a;
        if (cVar != null) {
            cVar.f(2);
        }
    }

    public void setProvider(c cVar) {
        this.f46441a = cVar;
    }

    public MBOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(int i10) {
        postDelayed(new a(i10), 200L);
    }

    public MBOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
