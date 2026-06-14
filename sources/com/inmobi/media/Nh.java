package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.media.Nh;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Nh extends Kh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3635ci f37456b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci) {
        super(gestureDetectorOnGestureListenerC3635ci);
        this.f37456b = gestureDetectorOnGestureListenerC3635ci;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f37456b.f38392u.get() != null) {
            GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f37456b;
            gestureDetectorOnGestureListenerC3635ci.R = view;
            gestureDetectorOnGestureListenerC3635ci.S = callback;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: w3.s3
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        return Nh.a(view2, motionEvent);
                    }
                });
            }
            Activity activity = (Activity) this.f37456b.f38392u.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.f37456b.R;
            if (view2 != null) {
                view2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f37456b.R, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.f37456b.R;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = this.f37456b;
            View view4 = gestureDetectorOnGestureListenerC3635ci2.R;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: w3.t3
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i10, KeyEvent keyEvent) {
                    return Nh.a(gestureDetectorOnGestureListenerC3635ci2, this, view5, i10, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f37456b;
        if (gestureDetectorOnGestureListenerC3635ci.R == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC3635ci.S;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci2 = this.f37456b;
        gestureDetectorOnGestureListenerC3635ci2.S = null;
        View view = gestureDetectorOnGestureListenerC3635ci2.R;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.f37456b.R;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f37456b.R);
            }
            this.f37456b.R = null;
        }
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, Nh nh2, View view, int i10, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        InterfaceC3878m9 interfaceC3878m9 = gestureDetectorOnGestureListenerC3635ci.f38368i;
        if (interfaceC3878m9 != null) {
            String str = GestureDetectorOnGestureListenerC3635ci.f38347g1;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
            ((C3903n9) interfaceC3878m9).a(str, "Back pressed when HTML5 video is playing.");
        }
        nh2.a();
        return true;
    }
}
