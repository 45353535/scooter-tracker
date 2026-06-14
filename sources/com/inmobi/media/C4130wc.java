package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.media.C4130wc;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4240b4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4130wc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f39839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3878m9 f39840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3757hc f39841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3577ac f39842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3577ac f39843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3577ac f39844f;

    public C4130wc(GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci, InterfaceC3878m9 interfaceC3878m9) {
        this.f39839a = gestureDetectorOnGestureListenerC3635ci;
        this.f39840b = interfaceC3878m9;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public static boolean b() {
        Context context = Ji.f37157a;
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        return audioManager != null && audioManager.isWiredHeadsetOn();
    }

    public final void a(String url, Activity activity) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC3878m9 interfaceC3878m9 = this.f39840b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("MraidMediaProcessor", "doPlayMedia");
        }
        C3757hc c3757hc = new C3757hc(activity, this.f39840b);
        this.f39841c = c3757hc;
        c3757hc.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C3757hc c3757hc2 = this.f39841c;
        if (c3757hc2 != null) {
            c3757hc2.setLayoutParams(layoutParams);
        }
        C3782ic c3782ic = new C3782ic(activity);
        c3782ic.setOnTouchListener(new View.OnTouchListener() { // from class: w3.fc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C4130wc.a(view, motionEvent);
            }
        });
        c3782ic.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        c3782ic.addView(this.f39841c);
        InterfaceC3878m9 interfaceC3878m92 = this.f39840b;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c3782ic, new ViewGroup.LayoutParams(-1, -1));
        C3757hc c3757hc3 = this.f39841c;
        if (c3757hc3 != null) {
            c3757hc3.setViewContainer(c3782ic);
        }
        C3757hc c3757hc4 = this.f39841c;
        if (c3757hc4 != null) {
            c3757hc4.requestFocus();
        }
        C3757hc c3757hc5 = this.f39841c;
        if (c3757hc5 != null) {
            c3757hc5.setOnKeyListener(new View.OnKeyListener() { // from class: w3.gc
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                    return C4130wc.a(this.f107072b, view, i10, keyEvent);
                }
            });
        }
        C3757hc c3757hc6 = this.f39841c;
        if (c3757hc6 != null) {
            c3757hc6.setListener(new C4105vc(this));
        }
        C3757hc c3757hc7 = this.f39841c;
        if (c3757hc7 != null) {
            c3757hc7.a();
        }
    }

    public final void b(String str, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39840b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("MraidMediaProcessor", "fireHeadphonePluggedEvent");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39839a;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.a(str, "fireHeadphonePluggedEvent(" + z10 + ");");
        }
    }

    public static final boolean a(C4130wc c4130wc, View view, int i10, KeyEvent keyEvent) {
        if (4 != i10 || keyEvent.getAction() != 0) {
            return false;
        }
        C3757hc c3757hc = c4130wc.f39841c;
        if (c3757hc == null) {
            return true;
        }
        c3757hc.b();
        return true;
    }

    public final int a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC3878m9 interfaceC3878m9 = this.f39840b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("MraidMediaProcessor", C4240b4.j.P);
        }
        Context context = Ji.f37157a;
        if (context == null) {
            return -1;
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39839a;
        if (((gestureDetectorOnGestureListenerC3635ci == null || (renderingConfig = gestureDetectorOnGestureListenerC3635ci.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && Ji.f37162f) {
            return 0;
        }
        Object systemService = context.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final void a(String str, boolean z10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39840b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("MraidMediaProcessor", "fireDeviceMuteChangeEvent");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39839a;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.a(str, "fireDeviceMuteChangeEvent(" + z10 + ");");
        }
    }

    public final void a(String str, int i10) {
        InterfaceC3878m9 interfaceC3878m9 = this.f39840b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("MraidMediaProcessor", "fireDeviceVolumeChangeEvent");
        }
        GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = this.f39839a;
        if (gestureDetectorOnGestureListenerC3635ci != null) {
            gestureDetectorOnGestureListenerC3635ci.a(str, "fireDeviceVolumeChangeEvent(" + i10 + ");");
        }
    }
}
