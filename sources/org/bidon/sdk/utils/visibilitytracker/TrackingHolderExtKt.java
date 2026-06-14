package org.bidon.sdk.utils.visibilitytracker;

import android.graphics.Rect;
import android.view.View;
import com.ironsource.C4329g8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002H\u0002\u001a$\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002\"\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"isOnTop", "", "Landroid/view/View;", C4329g8.f43174s, "Lorg/bidon/sdk/utils/visibilitytracker/VisibilityParams;", "isTransparent", "getRectangle", "Landroid/graphics/Rect;", "hasOverlap", "viewRect", "visibilityPercent", "", "maxCountOverlappedViews", "", "viewNotOverlappedAreaPercent", "coverRect", "TAG", "", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TrackingHolderExtKt {

    @NotNull
    private static final String TAG = "VisibilityTracker";

    private static final Rect getRectangle(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean hasOverlap(android.view.View r16, android.graphics.Rect r17, float r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            android.view.View r2 = r16.getRootView()
            boolean r3 = r2 instanceof android.view.ViewGroup
            r4 = 0
            if (r3 == 0) goto L10
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L11
        L10:
            r2 = r4
        L11:
            android.view.ViewParent r3 = r16.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L1d
        L1c:
            r3 = r4
        L1d:
            r5 = 0
            r6 = r16
            r7 = r5
        L21:
            if (r3 == 0) goto Lc0
            int r8 = r3.indexOfChild(r6)
            r9 = 1
            int r8 = r8 + r9
            int r10 = r3.getChildCount()
        L2d:
            if (r8 >= r10) goto La9
            android.view.View r11 = r3.getChildAt(r8)
            int r12 = r11.getVisibility()
            if (r12 != 0) goto La4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            android.graphics.Rect r12 = getRectangle(r11)
            boolean r13 = android.graphics.Rect.intersects(r0, r12)
            if (r13 == 0) goto La4
            float r12 = viewNotOverlappedAreaPercent(r0, r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Show wasn't tracked: ad view is overlapped by another visible view ("
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = "), visible percent: "
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = " / "
            r13.append(r11)
            r13.append(r1)
            java.lang.String r11 = r13.toString()
            java.lang.String r13 = "VisibilityTracker"
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r13, r11)
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L89
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Show wasn't tracked: ad view is covered by another view - "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r13, r0)
            return r9
        L89:
            int r7 = r7 + 1
            r11 = r19
            if (r7 < r11) goto La6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Show wasn't tracked: ad view is covered by too many views - "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            org.bidon.sdk.logs.logging.impl.LogExtKt.logInfo(r13, r0)
            return r9
        La4:
            r11 = r19
        La6:
            int r8 = r8 + 1
            goto L2d
        La9:
            r11 = r19
            if (r3 == r2) goto Lbd
            android.view.ViewParent r6 = r3.getParent()
            java.lang.String r8 = "null cannot be cast to non-null type android.view.ViewGroup"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r8)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r15 = r6
            r6 = r3
            r3 = r15
            goto L21
        Lbd:
            r3 = r4
            goto L21
        Lc0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.utils.visibilitytracker.TrackingHolderExtKt.hasOverlap(android.view.View, android.graphics.Rect, float, int):boolean");
    }

    public static final boolean isOnTop(@Nullable View view, @NotNull VisibilityParams visibilityParams) {
        Intrinsics.checkNotNullParameter(visibilityParams, "visibilityParams");
        if (view == null) {
            return false;
        }
        float pixelThreshold = visibilityParams.getPixelThreshold();
        int maxCountOverlappedViews = visibilityParams.getMaxCountOverlappedViews();
        boolean zIsIgnoreWindowFocus = visibilityParams.isIgnoreWindowFocus();
        boolean zIsIgnoreOverlap = visibilityParams.isIgnoreOverlap();
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            LogExtKt.logInfo(TAG, "Show wasn't tracked: global visibility verification failed - " + view);
            return false;
        }
        if (!view.isShown()) {
            LogExtKt.logInfo(TAG, "Show wasn't tracked: view visibility verification failed - " + view);
            return false;
        }
        if (isTransparent(view)) {
            LogExtKt.logInfo(TAG, "Show wasn't tracked: view transparent verification failed - " + view);
            return false;
        }
        if (!zIsIgnoreWindowFocus && !view.hasWindowFocus()) {
            LogExtKt.logInfo(TAG, "Show wasn't tracked: window focus verification failed - " + view);
            return false;
        }
        float width = view.getWidth() * view.getHeight();
        if (width == 0.0f) {
            LogExtKt.logInfo(TAG, "Show wasn't tracked: view size verification failed - " + view);
            return false;
        }
        float fWidth = (rect.width() * rect.height()) / width;
        if (fWidth < pixelThreshold) {
            LogExtKt.logInfo(TAG, "Show wasn't tracked: ad view not completely visible (" + fWidth + " / " + pixelThreshold + ") - " + view);
            return false;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        while (view2 != null && view2.getId() != 16908290) {
            Object parent2 = view2.getParent();
            Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.View");
            view2 = (View) parent2;
        }
        if (view2 == null) {
            LogExtKt.logInfo(TAG, "Show wasn't tracked: activity content layout not found - " + view);
            return false;
        }
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (Rect.intersects(rect, rect2)) {
            if (zIsIgnoreOverlap) {
                return true;
            }
            hasOverlap(view, rect, pixelThreshold, maxCountOverlappedViews);
            return true;
        }
        LogExtKt.logInfo(TAG, "Show wasn't tracked: ad view is out of current window - " + view);
        return false;
    }

    private static final boolean isTransparent(View view) {
        return view.getAlpha() == 0.0f;
    }

    private static final float viewNotOverlappedAreaPercent(Rect rect, Rect rect2) {
        int iWidth = rect.width() * rect.height();
        if (iWidth == 0) {
            return 0.0f;
        }
        return (iWidth - (Math.max(0, Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left)) * Math.max(0, Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top)))) / iWidth;
    }
}
