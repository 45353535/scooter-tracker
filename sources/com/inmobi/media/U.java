package com.inmobi.media;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.media.U;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes9.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3635ci f37799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f37800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N f37802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3878m9 f37803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f37804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L f37805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E6 f37806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CoroutineScope f37807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f37808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Job f37809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xo f37810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O f37811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f37812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T f37813o;

    public U(GestureDetectorOnGestureListenerC3635ci adView, Set friendlyViews, long j10, N listener, InterfaceC3878m9 interfaceC3878m9) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(friendlyViews, "friendlyViews");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f37799a = adView;
        this.f37800b = friendlyViews;
        this.f37801c = j10;
        this.f37802d = listener;
        this.f37803e = interfaceC3878m9;
        this.f37804f = adView.getContext();
        this.f37807i = A9.f36558d;
        this.f37808j = new AtomicBoolean(false);
        this.f37811m = new O(this);
        this.f37813o = new T(this);
    }

    public static final M a(U u10) {
        Pair pair;
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        u10.getClass();
        Rect rect = new Rect();
        if (u10.f37799a.getRootView() == null || u10.f37799a.getVisibility() != 0 || !u10.f37812n || !u10.f37799a.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = u10.f37804f;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
        } catch (Exception unused) {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        Rect rect2 = new Rect();
        if (!u10.f37799a.getLocalVisibleRect(rect2) || rect2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        View rootView = u10.f37799a.getRootView();
        Set set = u10.f37800b;
        if (rootView instanceof ViewGroup) {
            ArrayList arrayList2 = new ArrayList();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(rootView);
            boolean z10 = false;
            while (!arrayDeque.isEmpty()) {
                View view = (View) arrayDeque.pop();
                if (view.getVisibility() == 0) {
                    if (Intrinsics.areEqual(view, u10.f37799a)) {
                        z10 = true;
                    } else if (!set.contains(view)) {
                        Rect rect3 = new Rect();
                        if (view.getLocalVisibleRect(rect3) && !rect3.isEmpty()) {
                            Rect rect4 = new Rect();
                            boolean globalVisibleRect = view.getGlobalVisibleRect(rect4);
                            if (Intrinsics.areEqual(view, u10.f37799a) || (globalVisibleRect && rect4.intersect(rect))) {
                                C4148x5.f39893a.getClass();
                                boolean z11 = !C4148x5.w() || view.getZ() >= u10.f37799a.getZ();
                                if (z10 && z11) {
                                    arrayList2.add(rect4);
                                }
                                if (view instanceof ViewGroup) {
                                    ViewGroup viewGroup = (ViewGroup) view;
                                    for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                                        arrayDeque.push(viewGroup.getChildAt(childCount));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            L l10 = u10.f37805g;
            if (l10 != null && (rectF4 = l10.f37238b) != null) {
                a(rect, arrayList2, rectF4);
            }
            L l11 = u10.f37805g;
            if (l11 != null && (rectF3 = l11.f37238b) != null) {
                a(rect, arrayList2, rectF3);
            }
            L l12 = u10.f37805g;
            if (l12 != null && (rectF2 = l12.f37239c) != null) {
                a(rect, arrayList2, rectF2);
            }
            L l13 = u10.f37805g;
            if (l13 != null && (rectF = l13.f37240d) != null) {
                a(rect, arrayList2, rectF);
            }
            if (arrayList2.size() == 1) {
                arrayList.add(new RectF((Rect) arrayList2.get(0)));
            } else {
                Region region = new Region();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    region.op((Rect) it.next(), Region.Op.UNION);
                }
                RegionIterator regionIterator = new RegionIterator(region);
                Rect rect5 = new Rect();
                while (regionIterator.next(rect5)) {
                    arrayList.add(new RectF(rect5));
                }
            }
        }
        return new M(new RectF(rect2), arrayList, iIntValue, iIntValue2);
    }

    public static final Unit b(U u10) {
        u10.getClass();
        C4148x5.f39893a.getClass();
        if (C4148x5.s()) {
            u10.f37810l = new xo(u10.f37799a, u10.f37813o, u10.f37803e);
        } else {
            InterfaceC3878m9 interfaceC3878m9 = u10.f37803e;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).c("AdExposureTracker", "Cannot calculate curved areas for this Android OS");
            }
        }
        u10.f37809k = F3.a(u10.f37807i, 0L, u10.f37801c, new S(u10, null));
        return Unit.f93236a;
    }

    public static final Unit c(U u10) {
        Job job = u10.f37809k;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        xo xoVar = u10.f37810l;
        if (xoVar != null) {
            xoVar.a();
        }
        u10.f37810l = null;
        u10.f37809k = null;
        E6 e62 = new E6(0.0f, null, null);
        if (!Intrinsics.areEqual(e62, u10.f37806h)) {
            ((Sh) u10.f37802d).a(e62);
            u10.f37806h = e62;
        }
        return Unit.f93236a;
    }

    public final void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3878m9 interfaceC3878m9 = this.f37803e;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("AdExposureTracker", "Removing friendly view: " + view);
        }
        this.f37800b.remove(view);
    }

    public final void b() {
        InterfaceC3878m9 interfaceC3878m9;
        if (this.f37808j.compareAndSet(true, false)) {
            Object objA = H3.a(new Function0() { // from class: w3.p4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return U.c(this.f107239b);
                }
            });
            Throwable thG = Result.g(objA);
            if (thG != null && (interfaceC3878m9 = this.f37803e) != null) {
                ((C3903n9) interfaceC3878m9).b("AdExposureTracker", "Error stopping exposure tracking - " + thG.getMessage());
            }
            Result.a(objA);
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f37803e;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).c("AdExposureTracker", "Exposure tracking is already stopped");
        }
    }

    public final void a() {
        if (this.f37808j.compareAndSet(false, true)) {
            Object objA = H3.a(new Function0() { // from class: w3.q4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return U.b(this.f107260b);
                }
            });
            Throwable thG = Result.g(objA);
            if (thG != null) {
                InterfaceC3878m9 interfaceC3878m9 = this.f37803e;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).b("AdExposureTracker", "Error starting exposure tracking - " + thG.getMessage());
                }
                this.f37808j.set(false);
                Lazy lazy = P9.f37527a;
                P9.a(new L2(thG));
            }
            Result.a(objA);
            return;
        }
        InterfaceC3878m9 interfaceC3878m92 = this.f37803e;
        if (interfaceC3878m92 != null) {
            ((C3903n9) interfaceC3878m92).c("AdExposureTracker", "Exposure tracking is already started");
        }
    }

    public final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC3878m9 interfaceC3878m9 = this.f37803e;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("AdExposureTracker", "Adding friendly view: " + view);
        }
        this.f37800b.add(view);
    }

    public final void a(Throwable th2) {
        InterfaceC3878m9 interfaceC3878m9 = this.f37803e;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("AdExposureTracker", "Error calculating exposure metrics - " + th2.getMessage());
        }
    }

    public static final void a(Rect rect, ArrayList arrayList, RectF rectF) {
        if (rectF.intersect(new RectF(rect))) {
            arrayList.add(new Rect(F3.b(rectF.left), F3.b(rectF.top), F3.b(rectF.right), F3.b(rectF.bottom)));
        }
    }
}
