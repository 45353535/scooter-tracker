package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.profileinstaller.ProfileVerifier;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f58288p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f58289q = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f58290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f58291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f58292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f58293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f58294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f58295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f58296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f58297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f58298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f58299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x f58300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f58301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f58302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f58303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f58304o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.h linearTracking, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService) {
            Intrinsics.checkNotNullParameter(linearTracking, "linearTracking");
            Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
            return new l(customUserEventBuilderService, linearTracking.a(), linearTracking.d(), linearTracking.m(), linearTracking.e(), linearTracking.f(), linearTracking.n(), linearTracking.c(), linearTracking.g(), linearTracking.o(), linearTracking.h(), linearTracking.j(), linearTracking.k(), linearTracking.l(), linearTracking.b(), linearTracking.i(), null, null, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, null);
        }

        public a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mf.a.d(Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj).a()), Long.valueOf(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj2).a()));
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mf.a.d(Integer.valueOf(((n) obj).a()), Integer.valueOf(((n) obj2).a()));
        }
    }

    public l(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, r buttonTracker, x vastTracker) {
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f58290a = customUserEventBuilderService;
        this.f58291b = list;
        this.f58292c = list8;
        this.f58293d = list9;
        this.f58294e = list10;
        this.f58295f = list11;
        this.f58296g = list12;
        this.f58297h = list13;
        this.f58298i = list14;
        this.f58299j = buttonTracker;
        this.f58300k = vastTracker;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((String) it.next(), 0L));
            }
            arrayList.addAll(arrayList3);
        }
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a((String) it2.next(), 0L));
            }
            arrayList.addAll(arrayList4);
        }
        if (list4 != null) {
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new n((String) it3.next(), 25));
            }
            arrayList2.addAll(arrayList5);
        }
        if (list5 != null) {
            ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new n((String) it4.next(), 50));
            }
            arrayList2.addAll(arrayList6);
        }
        if (list6 != null) {
            ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
            Iterator it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(new n((String) it5.next(), 75));
            }
            arrayList2.addAll(arrayList7);
        }
        if (list7 != null) {
            ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
            Iterator it6 = list7.iterator();
            while (it6.hasNext()) {
                arrayList8.add(new n((String) it6.next(), 100));
            }
            arrayList2.addAll(arrayList8);
        }
        if (list15 != null) {
            Iterator it7 = list15.iterator();
            while (it7.hasNext()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g) it7.next();
                t tVarA = gVar.a();
                if (tVarA instanceof t.b) {
                    arrayList.add(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a(gVar.b(), ((t.b) gVar.a()).a()));
                } else {
                    if (!(tVarA instanceof t.a)) {
                        throw new lf.m();
                    }
                    arrayList2.add(new n(gVar.b(), ((t.a) gVar.a()).a()));
                }
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new b());
        }
        this.f58301l = arrayList;
        if (arrayList2.size() > 1) {
            CollectionsKt.sortWith(arrayList2, new c());
        }
        this.f58303n = arrayList2;
    }

    public final void a(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f58299j.p(buttonType);
    }

    public final void b(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f58299j.m(button);
    }

    public final void c(a.AbstractC0780a.f lastClickPosition, Integer num, String str) {
        Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        List list = this.f58291b;
        if (list != null) {
            this.f58300k.b(list, null, num, str, this.f58299j.p(), this.f58290a, lastClickPosition);
            this.f58291b = null;
        }
    }

    public final void d(String str, int i10, int i11) {
        double d10 = (((double) i10) / ((double) i11)) * ((double) 100);
        List list = this.f58303n;
        List listSubList = list.subList(this.f58304o, list.size());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            if (((n) obj).a() > d10) {
                break;
            } else {
                arrayList.add(obj);
            }
        }
        x xVar = this.f58300k;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n) it.next()).b());
        }
        xVar.a(arrayList2, null, Integer.valueOf(i10), str);
        this.f58304o += arrayList.size();
        List list2 = this.f58301l;
        List listSubList2 = list2.subList(this.f58302m, list2.size());
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listSubList2) {
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) obj2).a() > i10) {
                break;
            } else {
                arrayList3.add(obj2);
            }
        }
        x xVar2 = this.f58300k;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.a) it2.next()).b());
        }
        xVar2.a(arrayList4, null, Integer.valueOf(i10), str);
        this.f58302m += arrayList3.size();
    }

    public final void e(Integer num, String str) {
        List list = this.f58292c;
        if (list != null) {
            this.f58300k.a(list, null, num, str);
        }
    }

    public final void f(Integer num, String str) {
        List list = this.f58294e;
        if (list != null) {
            this.f58300k.a(list, null, num, str);
        }
    }

    public final void g(Integer num, String str) {
        List list = this.f58295f;
        if (list != null) {
            this.f58300k.a(list, null, num, str);
        }
    }

    public final void h(Integer num, String str) {
        List list = this.f58296g;
        if (list != null) {
            this.f58300k.a(list, null, num, str);
        }
    }

    public final void i(Integer num, String str) {
        List list = this.f58297h;
        if (list != null) {
            this.f58300k.a(list, null, num, str);
        }
    }

    public final void j(Integer num, String str) {
        List list = this.f58293d;
        if (list != null) {
            this.f58300k.a(list, null, num, str);
        }
    }

    public /* synthetic */ l(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15, r rVar, x xVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, list14, list15, (i10 & 65536) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a() : rVar, (i10 & 131072) != 0 ? a0.e() : xVar);
    }
}
