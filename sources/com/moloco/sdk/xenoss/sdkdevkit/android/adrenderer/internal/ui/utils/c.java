package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils;

import android.content.res.Resources;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntSize;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f57289a = new c();

    public final float a(int i10) {
        return i10 / Resources.getSystem().getDisplayMetrics().density;
    }

    public final a.AbstractC0780a.c b(LayoutCoordinates layoutCoordinates, a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        return new a.AbstractC0780a.c(buttonType, d(layoutCoordinates), f(layoutCoordinates));
    }

    public final a.AbstractC0780a.f c(long j10) {
        return new a.AbstractC0780a.f(a((int) Offset.m1371getXimpl(j10)), a((int) Offset.m1372getYimpl(j10)));
    }

    public final a.AbstractC0780a.f d(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new a.AbstractC0780a.f(a((int) Offset.m1371getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))), a((int) Offset.m1372getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))));
    }

    public final boolean e(a.AbstractC0780a.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return cVar.e().a() > 0.0f && cVar.e().b() > 0.0f;
    }

    public final a.AbstractC0780a.g f(LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new a.AbstractC0780a.g(a(IntSize.m4111getWidthimpl(layoutCoordinates.mo3015getSizeYbymL2g())), a(IntSize.m4110getHeightimpl(layoutCoordinates.mo3015getSizeYbymL2g())));
    }
}
