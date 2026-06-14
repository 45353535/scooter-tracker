package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.Ee;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes9.dex */
public final class Ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f36798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4091un f36799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Be f36800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f36801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f36802e;

    public Ee(CoroutineScope coroutineScope, C4091un viewabilityModel) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(viewabilityModel, "viewabilityModel");
        this.f36798a = coroutineScope;
        this.f36799b = viewabilityModel;
        this.f36801d = new AtomicBoolean(false);
        this.f36802e = new ArrayList();
        Fe fe2 = new Fe(new C4141wn(viewabilityModel.f39702a, viewabilityModel.f39704c), new C4141wn(viewabilityModel.f39703b, viewabilityModel.f39705d));
        ViewGroup parentView = viewabilityModel.f39706e.f37729a.getParentView();
        ImageView iconView = viewabilityModel.f39706e.f37729a.getIconView();
        Sg sg2 = viewabilityModel.f39706e;
        MediaView mediaView = sg2.f37730b;
        Intrinsics.checkNotNullParameter(sg2, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MediaView mediaView2 = sg2.f37730b;
        if (mediaView2 != null) {
            linkedHashSet.add(mediaView2);
        }
        View view = sg2.f37731c;
        if (view != null) {
            linkedHashSet.add(view);
        }
        View ctaView = sg2.f37729a.getCtaView();
        if (ctaView != null) {
            linkedHashSet.add(ctaView);
        }
        ImageView iconView2 = sg2.f37729a.getIconView();
        if (iconView2 != null) {
            linkedHashSet.add(iconView2);
        }
        View titleView = sg2.f37729a.getTitleView();
        if (titleView != null) {
            linkedHashSet.add(titleView);
        }
        View descriptionView = sg2.f37729a.getDescriptionView();
        if (descriptionView != null) {
            linkedHashSet.add(descriptionView);
        }
        View ratingView = sg2.f37729a.getRatingView();
        if (ratingView != null) {
            linkedHashSet.add(ratingView);
        }
        View advertiserView = sg2.f37729a.getAdvertiserView();
        if (advertiserView != null) {
            linkedHashSet.add(advertiserView);
        }
        linkedHashSet.addAll(sg2.f37729a.getExtraViews$media_release());
        this.f36800c = new Be(parentView, iconView, mediaView, CollectionsKt.toList(linkedHashSet), fe2);
    }

    public static final Unit b(Ee ee2, boolean z10) {
        ee2.f36800c.f36628e.f36848b.f39879b = z10;
        return Unit.f93236a;
    }

    public final void a() {
        if (this.f36801d.getAndSet(true)) {
            return;
        }
        ViewGroup parentView = this.f36799b.f39706e.f37729a.getParentView();
        a(this.f36799b.f39706e.f37729a.getIconView(), parentView, this.f36799b.f39702a, new Function1() { // from class: w3.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ee.a(this.f106983b, ((Boolean) obj).booleanValue());
            }
        });
        C4091un c4091un = this.f36799b;
        a(c4091un.f39706e.f37730b, parentView, c4091un.f39703b, new Function1() { // from class: w3.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ee.b(this.f106998b, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void b() {
        if (this.f36801d.getAndSet(false)) {
            ArrayList arrayList = this.f36802e;
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                H6.a((Job) it.next());
            }
            arrayList.clear();
            this.f36802e.clear();
        }
    }

    public static final Unit a(Ee ee2, boolean z10) {
        ee2.f36800c.f36628e.f36847a.f39879b = z10;
        return Unit.f93236a;
    }

    public final void a(View view, ViewGroup parentView, boolean z10, Function1 function1) {
        if (view == null || !z10) {
            return;
        }
        CoroutineScope coroutineScope = this.f36798a;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36802e.add(eg.i.d(this.f36798a, null, null, new De(hg.i.T(hg.i.E(hg.i.f(new C4066tn(view, parentView, null)), eg.o0.c()), coroutineScope, hg.g0.f73226a.d(), Boolean.valueOf(AbstractC4116vn.b(view, parentView))), null, function1), 3, null));
    }
}
