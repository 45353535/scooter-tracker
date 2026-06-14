package com.my.target;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public interface c9 {

    public interface a {
        void a(int i10, Context context);

        void a(View view, int i10, int i11);

        void a(int[] iArr, Context context);
    }

    void dispose();

    Parcelable getState();

    int[] getVisibleCardNumbers();

    void restoreState(Parcelable parcelable);

    void setPromoCardSliderListener(a aVar);
}
