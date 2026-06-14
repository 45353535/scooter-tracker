package com.taurusx.tax.vast;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class VastWebView extends com.taurusx.tax.t.z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f67035w;

    public class w implements View.OnTouchListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f67037z;

        public w() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f67037z = true;
            } else {
                if (action != 1 || !this.f67037z) {
                    return false;
                }
                this.f67037z = false;
                z zVar = VastWebView.this.f67035w;
                if (zVar != null) {
                    zVar.z();
                }
            }
            return false;
        }
    }

    public interface z {
        void z();
    }

    public VastWebView(Context context) {
        super(context);
        c();
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSavePassword(false);
        setBackgroundColor(0);
        setOnTouchListener(new w());
        setId(View.generateViewId());
    }

    private void c() {
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        getSettings().setSupportZoom(false);
        setScrollBarStyle(0);
    }

    public void z(String str) {
    }
}
