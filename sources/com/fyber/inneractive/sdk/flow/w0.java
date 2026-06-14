package com.fyber.inneractive.sdk.flow;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class w0 extends x implements NativeAdContent, com.fyber.inneractive.sdk.flow.nativead.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f21019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f21020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f21021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f21022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri f21023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaView f21024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f21025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Float f21026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f21027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.r f21028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t0 f21029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f21030t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.j f21031u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.a f21032v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f21033w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f21034x;

    public w0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f21027q = new ArrayList();
        this.f21030t = new HashMap();
        this.f21033w = new ArrayList();
        this.f21034x = new ArrayList();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.w0.b(java.lang.String):void");
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void bindMediaView(MediaView mediaView) {
        this.f21024n = mediaView;
        com.fyber.inneractive.sdk.flow.nativead.a aVar = this.f21032v;
        if (aVar != null) {
            aVar.bind(mediaView);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        t0 t0Var = this.f21029s;
        if (t0Var != null) {
            t0Var.destroy();
            this.f21029s = null;
        }
        com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f21031u;
        if (jVar != null) {
            jVar.f20803b = null;
            jVar.f20804c.f20832a = null;
            this.f21031u = null;
        }
        if (this.f21032v != null) {
            this.f21032v = null;
        }
        for (View view : this.f21027q) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        for (View view2 : this.f21027q) {
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
        }
        this.f21028r = null;
        this.f21027q.clear();
        this.f21021k = null;
        this.f21025o = null;
        this.f21022l = null;
        this.f21017g = null;
        this.f21023m = null;
        this.f21024n = null;
        this.f21018h = null;
        this.f21020j = null;
        this.f21019i = null;
        this.f21026p = null;
        this.f21030t.clear();
        this.f21033w.clear();
        this.f21034x.clear();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return (this.f21023m == null && this.f21024n == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdCallToAction() {
        return this.f21019i;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdDescription() {
        return this.f21018h;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdTitle() {
        return this.f21017g;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdvertiserName() {
        return this.f21020j;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Uri getAppIcon() {
        return this.f21022l;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getMediaAspectRatio() {
        return this.f21026p;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final MediaView getMediaView() {
        return this.f21024n;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getPrice() {
        return this.f21021k;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getRating() {
        return this.f21025o;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return this.f21029s != null;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void registerViewsForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, Collection collection) {
        this.f21027q.clear();
        if (collection != null) {
            this.f21027q.addAll(collection);
        }
        if (viewGroup != null && !this.f21027q.contains(viewGroup)) {
            this.f21027q.add(viewGroup);
        }
        if (mediaView != null && !this.f21027q.contains(mediaView)) {
            this.f21027q.add(mediaView);
        }
        if (imageView != null && !this.f21027q.contains(imageView)) {
            this.f21027q.add(imageView);
        }
        MediaView mediaView2 = this.f21024n;
        if (mediaView2 == null || mediaView2.getContext() == null) {
            IAlog.b("%sCould not attach NativeAdViewGestureDetector, MediaView or its context are null", "w0");
            return;
        }
        this.f21028r = new com.fyber.inneractive.sdk.flow.nativead.r(this.f21024n.getContext(), this);
        for (View view : this.f21027q) {
            if (view != null) {
                view.setOnTouchListener(this.f21028r);
            }
        }
    }
}
