package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.b;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f82507a = new int[2];

    static io.sentry.internal.gestures.b a(SentryAndroidOptions sentryAndroidOptions, View view, float f10, float f11, b.a aVar) {
        List<io.sentry.internal.gestures.a> gestureTargetLocators = sentryAndroidOptions.getGestureTargetLocators();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        io.sentry.internal.gestures.b bVar = null;
        while (linkedList.size() > 0) {
            View view2 = (View) linkedList.poll();
            if (d(view2, f10, f11)) {
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        linkedList.add(viewGroup.getChildAt(i10));
                    }
                }
                for (int i11 = 0; i11 < gestureTargetLocators.size(); i11++) {
                    io.sentry.internal.gestures.b bVarA = gestureTargetLocators.get(i11).a(view2, f10, f11, aVar);
                    if (bVarA != null) {
                        if (aVar == b.a.CLICKABLE) {
                            bVar = bVarA;
                        } else if (aVar == b.a.SCROLLABLE) {
                            return bVarA;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public static String b(View view) {
        int id2 = view.getId();
        if (id2 == -1 || c(id2)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id2) : "";
    }

    private static boolean c(int i10) {
        return ((-16777216) & i10) == 0 && (i10 & ViewCompat.MEASURED_SIZE_MASK) != 0;
    }

    private static boolean d(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        int[] iArr = f82507a;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        return f10 >= ((float) i10) && f10 <= ((float) (i10 + view.getWidth())) && f11 >= ((float) i11) && f11 <= ((float) (i11 + view.getHeight()));
    }
}
