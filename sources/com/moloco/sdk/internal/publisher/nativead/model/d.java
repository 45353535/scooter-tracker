package com.moloco.sdk.internal.publisher.nativead.model;

import android.net.Uri;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf.i;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f54992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f54993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f54994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f54995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f54996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f54997f;

    public d(Map data, Map images, Map titles, Map videos, List failedAssets) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(titles, "titles");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(failedAssets, "failedAssets");
        this.f54992a = data;
        this.f54993b = images;
        this.f54994c = titles;
        this.f54995d = videos;
        this.f54996e = failedAssets;
        this.f54997f = i.a(new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.model.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.b(this.f54991b);
            }
        });
    }

    public static final Map b(d dVar) {
        return MapsKt.plus(MapsKt.plus(MapsKt.plus(dVar.f54992a, dVar.f54993b), dVar.f54994c), dVar.f54995d);
    }

    public final String a(int i10) {
        b.a aVar = (b.a) this.f54992a.get(Integer.valueOf(i10));
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public final Uri c(int i10) {
        b.C0674b c0674b = (b.C0674b) this.f54993b.get(Integer.valueOf(i10));
        if (c0674b != null) {
            return c0674b.b();
        }
        return null;
    }

    public final String d(int i10) {
        b.c cVar = (b.c) this.f54994c.get(Integer.valueOf(i10));
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a e(int i10) {
        b.d dVar = (b.d) this.f54995d.get(Integer.valueOf(i10));
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f54992a, dVar.f54992a) && Intrinsics.areEqual(this.f54993b, dVar.f54993b) && Intrinsics.areEqual(this.f54994c, dVar.f54994c) && Intrinsics.areEqual(this.f54995d, dVar.f54995d) && Intrinsics.areEqual(this.f54996e, dVar.f54996e);
    }

    public int hashCode() {
        return (((((((this.f54992a.hashCode() * 31) + this.f54993b.hashCode()) * 31) + this.f54994c.hashCode()) * 31) + this.f54995d.hashCode()) * 31) + this.f54996e.hashCode();
    }

    public String toString() {
        return "PreparedNativeAssets(data=" + this.f54992a + ", images=" + this.f54993b + ", titles=" + this.f54994c + ", videos=" + this.f54995d + ", failedAssets=" + this.f54996e + ')';
    }
}
