package com.appodeal.ads.utils;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.Log;
import com.appodeal.ads.z6;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15035c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f15037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f15038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f15039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f15040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15043k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f15033a = new Rect();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15044l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15045m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f15046n = new Runnable() { // from class: com.appodeal.ads.utils.n
        @Override // java.lang.Runnable
        public final void run() {
            this.f15032b.e();
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15036d = 0.8f;

    public o(View view, long j10, p pVar) {
        this.f15034b = view;
        this.f15035c = j10;
        this.f15037e = pVar;
    }

    public static float a(Rect rect, Rect rect2) {
        int iHeight = rect.height() * rect.width();
        if (iHeight == 0) {
            return 0.0f;
        }
        return (iHeight - (Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)) * Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)))) / iHeight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v20, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public final void b(View view, float f10) {
        ?? r42;
        try {
            r42 = view;
        } catch (Exception e10) {
            Log.log(e10);
        }
        if (!r42.getGlobalVisibleRect(this.f15033a)) {
            c("Show wasn't tracked: ad not visible globally");
            return;
        }
        if (!r42.isShown()) {
            c("Show wasn't tracked: ad not shown on view");
            return;
        }
        if (r42.getAlpha() == 0.0f) {
            c("Show wasn't tracked: ad is transparent ");
            return;
        }
        if (!r42.hasWindowFocus()) {
            c("Show wasn't tracked: ad hasn't window focus");
            return;
        }
        Activity resumedActivity = com.appodeal.ads.context.o.f13205b.getResumedActivity();
        View viewFindViewById = resumedActivity != null ? resumedActivity.findViewById(R.id.content) : null;
        if (viewFindViewById == null) {
            c("Activity content layout not found, is your activity running?");
            return;
        }
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        if (!Rect.intersects(this.f15033a, rect)) {
            c("Ad View is out of current window, show wasn't tracked");
            return;
        }
        float width = r42.getWidth() * r42.getHeight();
        if (width == 0.0f) {
            c("Ad View width or height is zero, show wasn't tracked");
            return;
        }
        float fWidth = (this.f15033a.width() * this.f15033a.height()) / width;
        if (fWidth < f10) {
            c("Ad View is not completely visible (" + fWidth + "), show wasn't tracked");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) r42.getRootView();
        ?? r32 = (ViewGroup) r42.getParent();
        int i10 = 0;
        while (r32 != 0) {
            for (int iIndexOfChild = r32.indexOfChild(r42) + 1; iIndexOfChild < r32.getChildCount(); iIndexOfChild++) {
                View childAt = r32.getChildAt(iIndexOfChild);
                if (childAt.getVisibility() == 0) {
                    childAt.getLocationInWindow(new int[2]);
                    Rect rectA = z6.a(childAt);
                    if (Rect.intersects(this.f15033a, rectA)) {
                        float fA = a(this.f15033a, rectA);
                        String strValueOf = String.valueOf(childAt.getId());
                        try {
                            strValueOf = r42.getContext().getResources().getResourceEntryName(childAt.getId());
                        } catch (Exception unused) {
                        }
                        Log.log(LogConstants.KEY_SDK, "Viewability", "Ad view is overlapped by another visible view (type: " + childAt.getClass().getSimpleName() + ", id: " + strValueOf + "), visible percent: " + fA, Log.LogLevel.verbose);
                        if (fA < f10) {
                            c("Ad View is covered by another view, show wasn't tracked");
                            return;
                        }
                        i10++;
                        if (i10 >= 3) {
                            c("Ad View is covered by too many views, show wasn't tracked");
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (r32 != viewGroup) {
                r42 = r32;
                r32 = (ViewGroup) r32.getParent();
            } else {
                r32 = 0;
            }
        }
        if (!this.f15041i) {
            this.f15037e.a();
            this.f15041i = true;
        }
        if (this.f15043k || this.f15042j) {
            return;
        }
        q.f15048b.postDelayed(this.f15046n, this.f15035c);
        this.f15040h = System.currentTimeMillis();
        this.f15043k = true;
    }

    public final void c(String str) {
        if (this.f15044l) {
            this.f15044l = false;
        } else if (!this.f15045m) {
            this.f15045m = true;
            Log.log(LogConstants.KEY_SDK, "Viewability", str, Log.LogLevel.verbose);
        }
        if (this.f15042j) {
            return;
        }
        q.f15048b.removeCallbacks(this.f15046n);
        this.f15043k = false;
        this.f15040h = 0L;
    }

    public final /* synthetic */ boolean d() {
        this.f15044l = false;
        b(this.f15034b, this.f15036d);
        return true;
    }

    public final void e() {
        if (this.f15041i && !this.f15042j && this.f15035c > -1 && this.f15040h > 0 && System.currentTimeMillis() - this.f15040h >= this.f15035c) {
            this.f15042j = true;
            this.f15037e.b();
        }
        this.f15034b.removeOnAttachStateChangeListener(this.f15039g);
        this.f15034b.getViewTreeObserver().removeOnPreDrawListener(this.f15038f);
        q.f15048b.removeCallbacks(this.f15046n);
        HashMap map = q.f15047a;
        synchronized (map) {
            map.remove(this);
        }
    }

    public final void f() {
        if (this.f15038f == null) {
            this.f15038f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.appodeal.ads.utils.m
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return this.f15031b.d();
                }
            };
        }
        if (this.f15039g == null) {
            this.f15039g = new l(this);
        }
        this.f15034b.addOnAttachStateChangeListener(this.f15039g);
        this.f15034b.getViewTreeObserver().addOnPreDrawListener(this.f15038f);
        b(this.f15034b, this.f15036d);
    }
}
