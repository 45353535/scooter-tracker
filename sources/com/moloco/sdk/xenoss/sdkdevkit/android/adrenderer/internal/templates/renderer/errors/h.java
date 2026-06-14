package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f56869f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy f56870g = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f56873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f56874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f56875e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            h hVar = (h) b().get(description);
            return hVar == null ? b.f56876h : hVar;
        }

        public final Map b() {
            return (Map) h.f56870g.getValue();
        }

        public a() {
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f56876h = new b();

        public b() {
            super(Integer.MIN_VALUE, "UNKNOWN", false, true, false, 16, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2068672870;
        }

        public String toString() {
            return "UndocumentedTemplateError";
        }
    }

    public /* synthetic */ h(int i10, String str, boolean z10, boolean z11, boolean z12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, z10, z11, z12);
    }

    public static final Map b() {
        List listListOf = CollectionsKt.listOf((Object[]) new h[]{a.C0725a.f56850i, l.c.f56886j, l.a.f56884j, l.b.f56885j, l.d.f56887j, l.e.f56888j, l.f.f56889j, l.g.f56890j, c.C0727c.f56860i, c.b.f56859i, c.a.f56858i, d.a.f56862i, b.a.f56852i, b.c.f56854i, b.d.f56855i, b.C0726b.f56853i, b.e.f56856i, j.a.f56878i, j.b.f56879i, e.a.f56864i, k.a.f56881i, f.a.f56866i, f.b.f56867i, f.c.f56868i});
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listListOf, 10)), 16));
        for (Object obj : listListOf) {
            linkedHashMap.put(((h) obj).c(), obj);
        }
        return linkedHashMap;
    }

    public String c() {
        return this.f56872b;
    }

    public boolean d() {
        return this.f56875e;
    }

    public boolean e() {
        return this.f56873c;
    }

    public boolean f() {
        return this.f56874d;
    }

    public h(int i10, String str, boolean z10, boolean z11, boolean z12) {
        this.f56871a = i10;
        this.f56872b = str;
        this.f56873c = z10;
        this.f56874d = z11;
        this.f56875e = z12;
    }

    public /* synthetic */ h(int i10, String str, boolean z10, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, z10, z11, (i11 & 16) != 0 ? false : z12, null);
    }
}
