package com.bytedance.adsdk.ugeno.mzz;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
interface qdl {
    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<lnr> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int qdl(int i10, int i11, int i12);

    int qdl(View view);

    int qdl(View view, int i10, int i11);

    View qdl(int i10);

    void qdl(View view, int i10, int i11, lnr lnrVar);

    void qdl(lnr lnrVar);

    boolean qdl();

    void setFlexLines(List<lnr> list);

    int ud(int i10, int i11, int i12);

    View ud(int i10);
}
