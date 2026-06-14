package com.inmobi.media;

import android.view.View;
import android.view.WindowInsets;
import com.inmobi.media.to;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f39622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f39623b;

    public to(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f39622a = new ArrayList();
        this.f39623b = new WeakReference(view);
        C4148x5.f39893a.getClass();
        if (C4148x5.u()) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: w3.wa
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return to.a(this.f107368a, view2, windowInsets);
                }
            });
        }
    }

    public static final WindowInsets a(to toVar, View view, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (!toVar.f39622a.isEmpty()) {
            Iterator it = toVar.f39622a.iterator();
            while (it.hasNext()) {
                xo xoVar = (xo) ((so) it.next());
                xoVar.getClass();
                Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
                xoVar.f39954a.a(windowInsets);
                xoVar.a(windowInsets);
            }
        }
        return windowInsets;
    }

    public final void a() {
        View view;
        this.f39622a.clear();
        C4148x5.f39893a.getClass();
        if (!C4148x5.u() || (view = (View) this.f39623b.get()) == null) {
            return;
        }
        view.setOnApplyWindowInsetsListener(null);
    }
}
