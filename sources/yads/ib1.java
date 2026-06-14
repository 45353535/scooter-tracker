package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ib1 {
    public static fb1 a(View view, cm cmVar) {
        return view.isInEditMode() ? new hb1() : new gb1(cmVar);
    }
}
