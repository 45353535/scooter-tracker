package com.bytedance.sdk.openadsdk.core.tvp;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.fs;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes6.dex */
public class ljh extends GestureDetector {
    private final qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.lnr.mo f17520ud;

    static class qdl extends GestureDetector.SimpleOnGestureListener {
        boolean qdl = false;

        qdl() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.qdl = true;
            return super.onSingleTapUp(motionEvent);
        }

        void qdl() {
            this.qdl = false;
        }

        boolean ud() {
            return this.qdl;
        }
    }

    public ljh(Context context) {
        this(context, new qdl());
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f17520ud.qdl(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    void qdl() {
        this.qdl.qdl();
    }

    public boolean ud() {
        return this.qdl.ud();
    }

    public ljh(Context context, qdl qdlVar) {
        super(context, qdlVar);
        this.qdl = qdlVar;
        this.f17520ud = new com.bytedance.sdk.openadsdk.core.lnr.mo();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.fs qdl(Context context, View view) {
        if (this.f17520ud == null) {
            return new fs.qdl().qdl();
        }
        return new fs.qdl().mo(this.f17520ud.qdl).mzz(this.f17520ud.f17297ud).mml(this.f17520ud.lnr).lnr(this.f17520ud.mml).ud(this.f17520ud.mzz).qdl(this.f17520ud.mo).qdl(ax.qdl(view)).ud(ax.lnr(view)).mml(this.f17520ud.f17298wd).mzz(this.f17520ud.jpc).mo(this.f17520ud.tvp).qdl(this.f17520ud.fs).ud(com.bytedance.sdk.openadsdk.core.tvp.ud().qdl() ? 1 : 2).qdl("vessel").qdl(ax.jpc(context)).lnr(ax.to(context)).ud(ax.tvp(context)).qdl();
    }
}
