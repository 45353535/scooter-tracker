package com.applovin.impl;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: loaded from: classes6.dex */
public class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f8863c;

    public f8(View view, com.applovin.impl.sdk.k kVar) {
        this.f8861a = kVar;
        this.f8862b = kVar.O();
        this.f8863c = view;
    }

    public long a(h3 h3Var) {
        long j10;
        if (com.applovin.impl.sdk.o.a()) {
            this.f8862b.a("ViewabilityTracker", "Checking visibility...");
        }
        Point pointB = o0.b(this.f8863c.getContext());
        if (this.f8863c.isShown()) {
            j10 = 0;
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8862b.b("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        }
        if (this.f8863c.getAlpha() < h3Var.j0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8862b.b("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f8863c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8862b.b("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f8863c.getParent() == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8862b.b("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f8863c.getContext(), this.f8863c.getWidth());
        if (iPxToDp < Math.min(h3Var.p0(), pointB.x)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8862b.b("ViewabilityTracker", "View has width (" + iPxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f8863c.getContext(), this.f8863c.getHeight());
        if (iPxToDp2 < h3Var.l0()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8862b.b("ViewabilityTracker", "View has height (" + iPxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Rect rect = new Rect(0, 0, pointB.x, pointB.y);
        int[] iArr = {-1, -1};
        this.f8863c.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        Rect rect2 = new Rect(i10, iArr[1], this.f8863c.getWidth() + i10, iArr[1] + this.f8863c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8862b.b("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity activityB = this.f8861a.e().b();
        if (activityB != null && !e8.a(this.f8863c, activityB)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f8862b.b("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f8862b.a("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j10));
        }
        return j10;
    }
}
