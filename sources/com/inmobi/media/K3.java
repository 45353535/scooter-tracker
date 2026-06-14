package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.inmobi.media.K3;
import com.squareup.picasso.Picasso;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f37192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V3 f37193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3903n9 f37194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow f37195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Job f37196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f37197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3890ml f37198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3913nj f37199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P3 f37200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U3 f37201j;

    public K3(Context context, CoroutineScope coroutineScope, V3 companionTelemetryHelper, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.f37192a = coroutineScope;
        this.f37193b = companionTelemetryHelper;
        this.f37194c = c3903n9;
        this.f37195d = hg.c0.b(0, 0, null, 7, null);
        this.f37200i = M3.f37339a;
        this.f37201j = new U3(context, c3903n9);
    }

    public final void a(ArrayList companionAds) {
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        if (companionAds.isEmpty()) {
            return;
        }
        if (!Intrinsics.areEqual(this.f37200i, M3.f37339a)) {
            Objects.toString(this.f37200i);
            return;
        }
        Map mapA = AbstractC3789ik.a(this.f37193b.f37879a);
        Wj wj = Wj.f37959a;
        Wj.b("CompanionAdAvailable", mapA, EnumC3585ak.f38215a);
        this.f37196e = eg.i.d(this.f37192a, null, null, new J3(this, companionAds, null), 3, null);
    }

    public final void b() {
        View view = this.f37197f;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: w3.j2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    K3.a(this.f107113b, view2);
                }
            });
        }
    }

    public static final void a(K3 k32, View view) {
        C3890ml c3890ml = k32.f37198g;
        if (c3890ml != null) {
            List listPlus = CollectionsKt.plus((Collection) c3890ml.f39051b, (Iterable) c3890ml.f39052c);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listPlus) {
                if (Intrinsics.areEqual(((C4107ve) obj).f39775b, "click")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C4107ve) it.next()).f39774a);
            }
            P4.a(k32.f37195d, k32.f37192a, new Q3(arrayList2));
        }
    }

    public final void a() {
        ViewParent parent;
        C3903n9 c3903n9 = this.f37194c;
        if (c3903n9 != null) {
            c3903n9.a("CompanionAdManager", "destroy");
        }
        C3913nj c3913nj = this.f37199h;
        if (c3913nj != null) {
            Picasso picasso = Qf.f37593a;
            Qf.b(c3913nj.f39112a).cancelTag(c3913nj.f39114c);
        }
        H6.a(this.f37196e);
        View view = this.f37197f;
        if (view != null && (parent = view.getParent()) != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f37197f);
            }
        }
        this.f37196e = null;
        this.f37199h = null;
        this.f37197f = null;
        this.f37200i = M3.f37339a;
    }
}
