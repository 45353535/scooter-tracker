package sg.bigo.ads.common.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public class MixtureTextView extends RelativeLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int[] f102887s = {R.attr.textSize, R.attr.textColor, R.attr.text};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Layout f102888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f102891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f102892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f102893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<List<Rect>> f102894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Integer> f102895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Layout> f102896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f102897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HashSet<Integer> f102898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f102899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f102900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f102901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f102902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f102903p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f102904q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f102905r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map<Integer, Point> f102906t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f102907u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f102908v;

    public interface a {
        void a(UnderlineSpan underlineSpan);
    }

    public MixtureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102888a = null;
        this.f102890c = -9601400;
        this.f102894g = new ArrayList();
        this.f102895h = null;
        this.f102896i = new ArrayList();
        this.f102897j = new ArrayList();
        this.f102898k = new HashSet<>();
        this.f102906t = new HashMap();
        this.f102908v = true;
        this.f102891d = e.b(getContext(), 14);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f102887s);
        this.f102891d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f102891d);
        this.f102890c = typedArrayObtainStyledAttributes.getColor(1, this.f102890c);
        this.f102892e = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f102893f = textPaint;
        textPaint.setDither(true);
        this.f102893f.setAntiAlias(true);
        this.f102893f.setColor(this.f102890c);
        if (TextUtils.isEmpty(this.f102892e)) {
            return;
        }
        this.f102904q = true;
    }

    private static CharSequence a(CharSequence charSequence, int i10, int i11) {
        if (q.a(charSequence)) {
            return null;
        }
        if (!(charSequence instanceof SpannableString)) {
            if (charSequence instanceof String) {
                return ((String) charSequence).substring(i10, i11);
            }
            return null;
        }
        SpannableString spannableString = (SpannableString) charSequence;
        SpannableString spannableString2 = new SpannableString(TextUtils.substring(spannableString, i10, i11));
        Object[] spans = spannableString.getSpans(i10, i11, Object.class);
        for (int length = spans.length - 1; length >= 0; length--) {
            Object obj = spans[length];
            int spanStart = spannableString.getSpanStart(obj) - i10;
            int spanEnd = spannableString.getSpanEnd(obj) - i10;
            try {
                int length2 = spannableString2.length();
                if (spanEnd >= spanStart && spanStart <= length2 && spanEnd <= length2 && spanStart >= 0) {
                    spannableString2.setSpan(obj, spanStart, spanEnd, 33);
                }
            } catch (Exception unused) {
            }
        }
        return spannableString2;
    }

    private static void b(Rect rect, List<Rect> list, int i10, int i11, int i12) {
        if (rect.left > i12) {
            list.add(new Rect(i12, i10, rect.left, i11));
        }
    }

    private void getAllYCors() {
        int i10 = this.f102889b;
        HashSet<Integer> hashSet = this.f102898k;
        hashSet.clear();
        this.f102906t.clear();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                childAt.getTop();
                int top = (((childAt.getTop() - getPaddingTop()) / i10) * i10) + getPaddingTop();
                hashSet.add(Integer.valueOf(top));
                int bottom = childAt.getBottom() - getPaddingTop();
                if (bottom % i10 != 0) {
                    bottom = ((bottom / i10) + 1) * i10;
                }
                int paddingTop = bottom + getPaddingTop();
                hashSet.add(Integer.valueOf(paddingTop));
                this.f102906t.put(Integer.valueOf(i11), new Point(top, paddingTop));
            }
        }
        hashSet.add(Integer.valueOf(getPaddingTop()));
        hashSet.add(Integer.valueOf(this.f102901n == 1073741824 ? getHeight() : Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f102895h = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int i10;
        int i11 = 0;
        int i12 = 1;
        this.f102899l = getPaddingBottom() + getPaddingTop();
        int i13 = this.f102889b;
        List<List<Rect>> list = this.f102894g;
        List<Integer> list2 = this.f102895h;
        list.clear();
        if (list2 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int i14 = 0;
            while (i14 < list2.size() - i12) {
                int iIntValue = list2.get(i14).intValue();
                i14 += i12;
                int iIntValue2 = list2.get(i14).intValue();
                ArrayList arrayList = new ArrayList();
                List<Rect> listA = a(iIntValue, iIntValue2);
                int size = listA.size();
                if (size == 0) {
                    i10 = i12;
                    arrayList.add(new Rect(paddingLeft, iIntValue, width, iIntValue2));
                } else if (size != i12) {
                    b(listA.get(i11), arrayList, iIntValue, iIntValue2, paddingLeft);
                    int i15 = i11;
                    while (i15 < listA.size() - i12) {
                        Rect rect = listA.get(i15);
                        i15 += i12;
                        Rect rect2 = listA.get(i15);
                        int i16 = i12;
                        if (rect.right < rect2.left) {
                            arrayList.add(new Rect(rect.right, iIntValue, rect2.left, iIntValue2));
                        }
                        i12 = i16;
                    }
                    i10 = i12;
                    a(listA.get(listA.size() - 1), arrayList, iIntValue, iIntValue2, width);
                } else {
                    i10 = i12;
                    Rect rect3 = listA.get(i11);
                    b(rect3, arrayList, iIntValue, iIntValue2, paddingLeft);
                    a(rect3, arrayList, iIntValue, iIntValue2, width);
                }
                list.add(arrayList);
                i12 = i10;
                i11 = 0;
            }
            int i17 = i12;
            ArrayList arrayList2 = new ArrayList(list);
            int size2 = list.size();
            int i18 = 0;
            int i19 = 0;
            while (i18 < size2) {
                List<Rect> list3 = list.get(i18);
                int i20 = i17;
                if (list3.size() > i20) {
                    arrayList2.remove(list3);
                    Rect rect4 = list3.get(0);
                    int iHeight = rect4.height() / i13;
                    this.f102899l -= ((list3.size() - i20) * iHeight) * i13;
                    int i21 = i19 + i18;
                    int i22 = i19 - 1;
                    int i23 = 0;
                    while (i23 < iHeight) {
                        int i24 = i21;
                        int i25 = i22;
                        int i26 = 0;
                        while (i26 < list3.size()) {
                            i25 += i20;
                            int i27 = i13 * i23;
                            int i28 = i13;
                            arrayList2.add(i24, Arrays.asList(new Rect(list3.get(i26).left, rect4.top + i27, list3.get(i26).right, rect4.top + i27 + i28)));
                            i26++;
                            i20 = 1;
                            i24++;
                            size2 = size2;
                            list = list;
                            i13 = i28;
                        }
                        i23 += i20;
                        i22 = i25;
                        i21 = i24;
                        size2 = size2;
                    }
                    i19 = i22;
                }
                int i29 = size2;
                int i30 = i20;
                i18 += i30;
                i17 = i30;
                size2 = i29;
                list = list;
                i13 = i13;
            }
            this.f102894g = arrayList2;
        }
        if (a(null)) {
            return;
        }
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public CharSequence getText() {
        return this.f102892e;
    }

    public int getTextColor() {
        return this.f102890c;
    }

    public int getTextSize() {
        return this.f102891d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int offsetForHorizontal;
        a aVar;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && q.b(this.f102892e)) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!this.f102896i.isEmpty() && !this.f102897j.isEmpty()) {
                int i10 = 0;
                offsetForHorizontal = 0;
                int i11 = 0;
                while (true) {
                    if (i10 >= this.f102896i.size()) {
                        break;
                    }
                    Layout layout = this.f102896i.get(i10);
                    int iIntValue = this.f102897j.get(i10).intValue();
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical(y10);
                        if (lineForVertical + 1 <= iIntValue) {
                            offsetForHorizontal += layout.getOffsetForHorizontal(Math.min(lineForVertical, layout.getLineCount() - 1), x10);
                            break;
                        }
                        i11 += iIntValue;
                        y10 -= this.f102889b * i11;
                        offsetForHorizontal += layout.getLineEnd(iIntValue - 1);
                    }
                    i10++;
                }
            } else {
                offsetForHorizontal = 0;
            }
            if (offsetForHorizontal < this.f102892e.length()) {
                CharSequence charSequence = this.f102892e;
                if (charSequence instanceof SpannableString) {
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) ((SpannableString) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, UnderlineSpan.class);
                    if (underlineSpanArr.length > 0 && (aVar = this.f102907u) != null) {
                        aVar.a(underlineSpanArr[0]);
                        return true;
                    }
                }
            }
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f102908v) {
            this.f102901n = View.MeasureSpec.getMode(this.f102900m);
            this.f102908v = false;
            this.f102905r = getMeasuredHeight();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f102904q) {
            getAllYCors();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (!this.f102904q) {
            super.onMeasure(i10, i11);
            return;
        }
        this.f102900m = i11;
        this.f102893f.setTextSize(this.f102891d);
        StaticLayout staticLayout = new StaticLayout("测量行高", this.f102893f, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f102888a = staticLayout;
        this.f102889b = staticLayout.getLineBottom(0) - this.f102888a.getLineTop(0);
        if (this.f102903p) {
            super.onMeasure(i10, this.f102902o);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(a aVar) {
        this.f102907u = aVar;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f102904q = false;
            requestLayout();
        } else {
            this.f102904q = true;
            this.f102892e = charSequence;
            requestLayout();
            invalidate();
        }
    }

    public void setTextColor(int i10) {
        this.f102893f.setColor(i10);
        this.f102890c = i10;
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f102891d = i10;
        this.f102893f.setTextSize(i10);
        requestLayout();
        invalidate();
    }

    private List<Rect> a(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            Point point = this.f102906t.get(Integer.valueOf(i12));
            int i13 = point.x;
            int i14 = point.y;
            if (i13 <= i10 && i14 >= i11) {
                arrayList.add(new Rect(childAt.getLeft(), i10, childAt.getRight(), i11));
            }
        }
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: sg.bigo.ads.common.view.MixtureTextView.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Rect rect, Rect rect2) {
                return rect.left > rect2.left ? 1 : -1;
            }
        });
        if (arrayList.size() < 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Rect rect = (Rect) arrayList.get(0);
        Rect rect2 = (Rect) arrayList.get(1);
        for (int i15 = 1; i15 < arrayList.size(); i15++) {
            if (!Rect.intersects(rect, rect2)) {
                if (arrayList2.size() - i15 < 2) {
                    break;
                }
                Rect rect3 = rect2;
                rect2 = (Rect) arrayList.get(i15 + 1);
                rect = rect3;
            } else {
                int iMin = Math.min(rect.left, rect2.left);
                int iMax = Math.max(rect.right, rect2.right);
                arrayList2.remove(rect);
                arrayList2.remove(rect2);
                arrayList2.add(new Rect(iMin, i10, iMax, i11));
                if (arrayList2.size() < 2) {
                    break;
                }
                rect = (Rect) arrayList.get(0);
                rect2 = (Rect) arrayList.get(1);
            }
        }
        return arrayList2;
    }

    private static void a(Rect rect, List<Rect> list, int i10, int i11, int i12) {
        if (rect.right < i12) {
            list.add(new Rect(rect.right, i10, i12, i11));
        }
    }

    private boolean a(Canvas canvas) {
        boolean z10 = canvas == null;
        int i10 = this.f102889b;
        List<List<Rect>> list = this.f102894g;
        CharSequence charSequence = this.f102892e;
        int length = charSequence != null ? charSequence.length() : 0;
        int lineEnd = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Rect rect = list.get(i12).get(0);
            int iWidth = rect.width();
            int iHeight = rect.height();
            CharSequence charSequenceA = a(this.f102892e, lineEnd, length);
            StaticLayout staticLayout = (q.a(charSequenceA) || this.f102893f == null) ? null : new StaticLayout(charSequenceA, this.f102893f, iWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f102888a = staticLayout;
            if (staticLayout != null) {
                int iMin = Math.min(staticLayout.getLineCount(), iHeight / i10);
                if (!z10) {
                    canvas.save();
                    canvas.translate(rect.left, rect.top);
                    canvas.clipRect(0, 0, rect.width(), this.f102888a.getLineBottom(iMin - 1) - this.f102888a.getLineTop(0));
                    this.f102888a.draw(canvas);
                    canvas.restore();
                }
                lineEnd += this.f102888a.getLineEnd(iMin - 1);
                if (canvas != null) {
                    this.f102896i.add(this.f102888a);
                    this.f102897j.add(Integer.valueOf(iMin));
                }
                i11 += iMin;
                if (lineEnd >= length) {
                    break;
                }
            }
        }
        if (z10) {
            int i13 = this.f102899l + (i11 * i10);
            this.f102899l = i13;
            if (i13 > this.f102905r) {
                int height = getHeight();
                int i14 = this.f102899l;
                if (height != i14 && this.f102901n != 1073741824) {
                    this.f102902o = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    this.f102903p = true;
                    requestLayout();
                    return true;
                }
            }
        }
        return false;
    }
}
