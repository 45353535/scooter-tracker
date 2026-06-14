package com.inmobi.media;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.inmobi.media.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3901n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39083a;

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.view.View r17, android.view.View r18, int r19) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3901n7.a(android.view.View, android.view.View, int):boolean");
    }

    public final boolean b(View view, View view2, int i10) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC3635ci gestureDetectorOnGestureListenerC3635ci = view2 instanceof GestureDetectorOnGestureListenerC3635ci ? (GestureDetectorOnGestureListenerC3635ci) view2 : null;
                if (gestureDetectorOnGestureListenerC3635ci == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC3635ci.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC3635ci.getHeight() <= 0 || gestureDetectorOnGestureListenerC3635ci.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!gestureDetectorOnGestureListenerC3635ci.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.f39083a = ((long) rect.height()) * ((long) rect.width());
                if (gestureDetectorOnGestureListenerC3635ci.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC3635ci.setConfiguredArea(gestureDetectorOnGestureListenerC3635ci.getHeight() * gestureDetectorOnGestureListenerC3635ci.getWidth());
                }
                if (gestureDetectorOnGestureListenerC3635ci.getArea() > 0) {
                    if (((long) 100) * this.f39083a >= gestureDetectorOnGestureListenerC3635ci.getConfiguredArea() * ((long) i10)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
