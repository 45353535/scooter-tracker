package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes4.dex */
public class AutoNextLineLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f102858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f102859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f102860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f102861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Hashtable f102862e;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f102863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f102864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f102865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f102866d;

        private a() {
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.f102862e = new Hashtable();
    }

    private int a(int i10, int i11) {
        if (i10 <= 0) {
            return getPaddingLeft();
        }
        int i12 = i11 - 1;
        return a(i10 - 1, i12) + getChildAt(i12).getMeasuredWidth() + 30;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) this.f102862e.get(childAt);
            if (aVar != null) {
                childAt.layout(aVar.f102863a, aVar.f102864b, aVar.f102865c, aVar.f102866d);
            } else {
                Log.i("MyLayout", "error");
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int childCount = getChildCount();
        byte b10 = 0;
        this.f102858a = 0;
        this.f102859b = 0;
        this.f102860c = 5;
        this.f102861d = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i13 += measuredWidth;
            a aVar = new a(b10);
            int iA = a(i12 - i14, i12);
            this.f102858a = iA;
            this.f102859b = iA + childAt.getMeasuredWidth();
            if (i13 >= size) {
                this.f102858a = 0;
                this.f102859b = childAt.getMeasuredWidth();
                this.f102860c = i15 + measuredHeight + layoutParams.topMargin;
                i14 = i12;
                i13 = measuredWidth;
            }
            int measuredHeight2 = this.f102860c + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
            this.f102861d = measuredHeight2;
            int i16 = this.f102860c;
            aVar.f102863a = this.f102858a;
            aVar.f102864b = i16 + 3;
            aVar.f102865c = this.f102859b;
            aVar.f102866d = measuredHeight2;
            this.f102862e.put(childAt, aVar);
            i12++;
            i15 = i16;
        }
        setMeasuredDimension(size, this.f102861d);
    }

    public AutoNextLineLinearLayout(Context context, int i10, int i11) {
        super(context);
        this.f102862e = new Hashtable();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102862e = new Hashtable();
    }
}
