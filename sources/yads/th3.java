package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class th3 {
    public static final void a(final View view) {
        ViewParent parent = view.getParent();
        final ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            viewGroup.removeView(view);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: yads.uq0
                @Override // java.lang.Runnable
                public final void run() {
                    th3.a(viewGroup, view);
                }
            });
        }
    }

    public static final void a(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }
}
