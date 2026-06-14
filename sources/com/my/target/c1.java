package com.my.target;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.my.target.common.models.ImageData;
import com.my.target.j5;
import com.my.target.nativeads.constants.NativeAdColor;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class c1 extends ViewGroup implements View.OnTouchListener, j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f59318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f59319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f59320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y2 f59321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kb f59322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ma f59323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f59324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f59325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f59326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Button f59327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f59328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f59329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f59330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f59331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final double f59332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j5.a f59333p;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j5.a aVar = c1.this.f59333p;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    public interface b {
        void a(g4 g4Var, int i10);

        void a(List list);
    }

    public c1(Context context) {
        super(context);
        kb.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
        boolean z10 = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        this.f59331n = z10;
        this.f59332o = z10 ? 0.5d : 0.7d;
        y2 y2Var = new y2(context);
        this.f59321d = y2Var;
        kb kbVarE = kb.e(context);
        this.f59322e = kbVarE;
        TextView textView = new TextView(context);
        this.f59318a = textView;
        TextView textView2 = new TextView(context);
        this.f59319b = textView2;
        TextView textView3 = new TextView(context);
        this.f59320c = textView3;
        ma maVar = new ma(context);
        this.f59323f = maVar;
        Button button = new Button(context);
        this.f59327j = button;
        b1 b1Var = new b1(context);
        this.f59324g = b1Var;
        y2Var.setContentDescription("close");
        y2Var.setVisibility(4);
        maVar.setContentDescription("icon");
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setLines(1);
        textView2.setEllipsize(truncateAt);
        textView3.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        boolean z11 = z10;
        button.setPadding(kbVarE.b(15), kbVarE.b(10), kbVarE.b(15), kbVarE.b(10));
        button.setMinimumWidth(kbVarE.b(100));
        button.setMaxEms(12);
        button.setTransformationMethod(null);
        button.setSingleLine();
        button.setTextSize(18.0f);
        button.setEllipsize(truncateAt);
        button.setElevation(kbVarE.b(2));
        kb.b(button, -16733198, -16746839, kbVarE.b(2));
        button.setTextColor(-1);
        b1Var.setPadding(0, 0, 0, kbVarE.b(8));
        b1Var.setSideSlidesMargins(kbVarE.b(10));
        if (z11) {
            int iB = kbVarE.b(18);
            this.f59329l = iB;
            this.f59328k = iB;
            textView.setTextSize(kbVarE.d(24));
            textView3.setTextSize(kbVarE.d(20));
            textView2.setTextSize(kbVarE.d(20));
            this.f59330m = kbVarE.b(96);
            textView.setTypeface(null, 1);
        } else {
            this.f59328k = kbVarE.b(12);
            this.f59329l = kbVarE.b(10);
            textView.setTextSize(22.0f);
            textView3.setTextSize(18.0f);
            textView2.setTextSize(18.0f);
            this.f59330m = kbVarE.b(64);
        }
        i iVar = new i(context);
        this.f59326i = iVar;
        kb.b(this, "ad_view");
        kb.b(textView, "title_text");
        kb.b(textView3, "description_text");
        kb.b(maVar, "icon_image");
        kb.b(y2Var, "close_button");
        kb.b(textView2, "category_text");
        addView(b1Var);
        addView(maVar);
        addView(textView);
        addView(textView2);
        addView(iVar);
        addView(textView3);
        addView(y2Var);
        addView(button);
        this.f59325h = new HashMap();
    }

    public final /* synthetic */ void a(View view) {
        j5.a aVar = this.f59333p;
        if (aVar != null) {
            aVar.a(1);
        }
    }

    public final /* synthetic */ void b(View view) {
        j5.a aVar = this.f59333p;
        if (aVar != null) {
            aVar.a(2);
        }
    }

    @Override // com.my.target.j5
    public void c() {
        this.f59321d.setVisibility(0);
    }

    @Override // com.my.target.j5
    @NonNull
    public View getCloseButton() {
        return this.f59321d;
    }

    @NonNull
    public int[] getNumbersOfCurrentShowingCards() {
        int iFindFirstVisibleItemPosition = this.f59324g.getCardLayoutManager().findFirstVisibleItemPosition();
        int iFindLastCompletelyVisibleItemPosition = this.f59324g.getCardLayoutManager().findLastCompletelyVisibleItemPosition();
        int i10 = 0;
        if (iFindFirstVisibleItemPosition == -1 || iFindLastCompletelyVisibleItemPosition == -1) {
            return new int[0];
        }
        int i11 = (iFindLastCompletelyVisibleItemPosition - iFindFirstVisibleItemPosition) + 1;
        int[] iArr = new int[i11];
        while (i10 < i11) {
            iArr[i10] = iFindFirstVisibleItemPosition;
            i10++;
            iFindFirstVisibleItemPosition++;
        }
        return iArr;
    }

    @Override // com.my.target.j5
    @NonNull
    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        y2 y2Var = this.f59321d;
        y2Var.layout(i12 - y2Var.getMeasuredWidth(), i11, i12, this.f59321d.getMeasuredHeight() + i11);
        kb.a(this.f59326i, this.f59321d.getLeft() - this.f59326i.getMeasuredWidth(), this.f59321d.getTop(), this.f59321d.getLeft(), this.f59321d.getBottom());
        if (i16 > i15 || this.f59331n) {
            int bottom = this.f59321d.getBottom();
            int measuredHeight = this.f59324g.getMeasuredHeight() + Math.max(this.f59318a.getMeasuredHeight() + this.f59319b.getMeasuredHeight(), this.f59323f.getMeasuredHeight()) + this.f59320c.getMeasuredHeight();
            int i17 = this.f59329l;
            int i18 = measuredHeight + (i17 * 2);
            if (i18 < i16 && (i14 = (i16 - i18) / 2) > bottom) {
                bottom = i14;
            }
            ma maVar = this.f59323f;
            maVar.layout(i17 + i10, bottom, maVar.getMeasuredWidth() + i10 + this.f59329l, i11 + this.f59323f.getMeasuredHeight() + bottom);
            this.f59318a.layout(this.f59323f.getRight(), bottom, this.f59323f.getRight() + this.f59318a.getMeasuredWidth(), this.f59318a.getMeasuredHeight() + bottom);
            this.f59319b.layout(this.f59323f.getRight(), this.f59318a.getBottom(), this.f59323f.getRight() + this.f59319b.getMeasuredWidth(), this.f59318a.getBottom() + this.f59319b.getMeasuredHeight());
            int iMax = Math.max(Math.max(this.f59323f.getBottom(), this.f59319b.getBottom()), this.f59318a.getBottom());
            TextView textView = this.f59320c;
            int i19 = this.f59329l + i10;
            textView.layout(i19, iMax, textView.getMeasuredWidth() + i19, this.f59320c.getMeasuredHeight() + iMax);
            int iMax2 = Math.max(iMax, this.f59320c.getBottom());
            int i20 = this.f59329l;
            int i21 = iMax2 + i20;
            b1 b1Var = this.f59324g;
            b1Var.layout(i10 + i20, i21, i12, b1Var.getMeasuredHeight() + i21);
            this.f59324g.a(!this.f59331n);
            return;
        }
        this.f59324g.a(false);
        ma maVar2 = this.f59323f;
        int i22 = this.f59329l;
        maVar2.layout(i22, (i13 - i22) - maVar2.getMeasuredHeight(), this.f59329l + this.f59323f.getMeasuredWidth(), i13 - this.f59329l);
        int iMax3 = ((Math.max(this.f59323f.getMeasuredHeight(), this.f59327j.getMeasuredHeight()) - this.f59318a.getMeasuredHeight()) - this.f59319b.getMeasuredHeight()) / 2;
        if (iMax3 < 0) {
            iMax3 = 0;
        }
        this.f59319b.layout(this.f59323f.getRight(), ((i13 - this.f59329l) - iMax3) - this.f59319b.getMeasuredHeight(), this.f59323f.getRight() + this.f59319b.getMeasuredWidth(), (i13 - this.f59329l) - iMax3);
        this.f59318a.layout(this.f59323f.getRight(), this.f59319b.getTop() - this.f59318a.getMeasuredHeight(), this.f59323f.getRight() + this.f59318a.getMeasuredWidth(), this.f59319b.getTop());
        int iMax4 = (Math.max(this.f59323f.getMeasuredHeight(), this.f59318a.getMeasuredHeight() + this.f59319b.getMeasuredHeight()) - this.f59327j.getMeasuredHeight()) / 2;
        if (iMax4 < 0) {
            iMax4 = 0;
        }
        Button button = this.f59327j;
        int measuredWidth = (i12 - this.f59329l) - button.getMeasuredWidth();
        int measuredHeight2 = ((i13 - this.f59329l) - iMax4) - this.f59327j.getMeasuredHeight();
        int i23 = this.f59329l;
        button.layout(measuredWidth, measuredHeight2, i12 - i23, (i13 - i23) - iMax4);
        b1 b1Var2 = this.f59324g;
        int i24 = this.f59329l;
        b1Var2.layout(i24, i24, i12, b1Var2.getMeasuredHeight() + i24);
        this.f59320c.layout(0, 0, 0, 0);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        this.f59321d.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f59323f.measure(View.MeasureSpec.makeMeasureSpec(this.f59330m, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f59330m, Integer.MIN_VALUE));
        this.f59326i.measure(i10, i11);
        if (size2 > size || this.f59331n) {
            this.f59327j.setVisibility(8);
            int measuredHeight = this.f59321d.getMeasuredHeight();
            if (this.f59331n) {
                measuredHeight = this.f59329l;
            }
            this.f59318a.measure(View.MeasureSpec.makeMeasureSpec((size - (this.f59329l * 2)) - this.f59323f.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f59319b.measure(View.MeasureSpec.makeMeasureSpec((size - (this.f59329l * 2)) - this.f59323f.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f59320c.measure(View.MeasureSpec.makeMeasureSpec(size - (this.f59329l * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int iMax = ((size2 - measuredHeight) - Math.max(this.f59318a.getMeasuredHeight() + this.f59319b.getMeasuredHeight(), this.f59323f.getMeasuredHeight() - (this.f59329l * 2))) - this.f59320c.getMeasuredHeight();
            int i12 = size - this.f59329l;
            if (size2 > size) {
                double d10 = iMax / size2;
                double d11 = this.f59332o;
                if (d10 > d11) {
                    iMax = (int) (((double) size2) * d11);
                }
            }
            if (this.f59331n) {
                this.f59324g.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax - (this.f59329l * 2), Integer.MIN_VALUE));
            } else {
                this.f59324g.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(iMax - (this.f59329l * 2), 1073741824));
            }
        } else {
            this.f59327j.setVisibility(0);
            this.f59327j.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            int measuredWidth = this.f59327j.getMeasuredWidth();
            int i13 = (size / 2) - (this.f59329l * 2);
            if (measuredWidth > i13) {
                this.f59327j.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            }
            this.f59318a.measure(View.MeasureSpec.makeMeasureSpec((((size - this.f59323f.getMeasuredWidth()) - measuredWidth) - this.f59328k) - this.f59329l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f59319b.measure(View.MeasureSpec.makeMeasureSpec((((size - this.f59323f.getMeasuredWidth()) - measuredWidth) - this.f59328k) - this.f59329l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            this.f59324g.measure(View.MeasureSpec.makeMeasureSpec(size - this.f59329l, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((((size2 - Math.max(this.f59323f.getMeasuredHeight(), Math.max(this.f59327j.getMeasuredHeight(), this.f59318a.getMeasuredHeight() + this.f59319b.getMeasuredHeight()))) - (this.f59329l * 2)) - this.f59324g.getPaddingBottom()) - this.f59324g.getPaddingTop(), Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f59325h.containsKey(view)) {
            return false;
        }
        if (!((Boolean) this.f59325h.get(view)).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        } else if (action == 1) {
            setBackgroundColor(-1);
            if (this.f59333p != null) {
                Button button = this.f59327j;
                this.f59333p.a((view == button && Boolean.TRUE.equals(this.f59325h.get(button))) ? 2 : 1);
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    @Override // com.my.target.j5
    public void setBanner(@NonNull o4 o4Var) {
        ImageData imageDataM = o4Var.M();
        if (imageDataM == null || imageDataM.getData() == null) {
            Bitmap bitmapA = l0.a(this.f59322e.b(28));
            if (bitmapA != null) {
                this.f59321d.a(bitmapA, false);
            }
        } else {
            this.f59321d.a(imageDataM.getData(), true);
        }
        this.f59327j.setText(o4Var.i());
        ImageData imageDataQ = o4Var.q();
        if (imageDataQ != null) {
            this.f59323f.setPlaceholderDimensions(imageDataQ.getWidth(), imageDataQ.getHeight());
            a3.b(imageDataQ, this.f59323f);
        }
        this.f59318a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f59318a.setText(o4Var.A());
        String strF = o4Var.f();
        String strZ = o4Var.z();
        String str = "";
        if (!TextUtils.isEmpty(strF)) {
            str = "" + strF;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(strZ)) {
            str = str + ", ";
        }
        if (!TextUtils.isEmpty(strZ)) {
            str = str + strZ;
        }
        if (TextUtils.isEmpty(str)) {
            this.f59319b.setVisibility(8);
        } else {
            this.f59319b.setText(str);
            this.f59319b.setVisibility(0);
        }
        this.f59320c.setText(o4Var.k());
        this.f59324g.a(o4Var.S());
        c cVarA = o4Var.a();
        if (cVarA != null) {
            a(cVarA);
        } else {
            this.f59326i.setVisibility(8);
        }
    }

    public void setCarouselListener(@Nullable b bVar) {
        this.f59324g.setCarouselListener(bVar);
    }

    @Override // com.my.target.j5
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickArea(@NonNull d1 d1Var) {
        boolean z10 = true;
        if (d1Var.f59463m) {
            setOnClickListener(new View.OnClickListener() { // from class: k5.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f86103b.a(view);
                }
            });
            kb.a(this, -1, NativeAdColor.BACKGROUND_TOUCH);
            setClickable(true);
            this.f59327j.setOnClickListener(new View.OnClickListener() { // from class: k5.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f86113b.b(view);
                }
            });
            return;
        }
        this.f59318a.setOnTouchListener(this);
        this.f59319b.setOnTouchListener(this);
        this.f59323f.setOnTouchListener(this);
        this.f59320c.setOnTouchListener(this);
        this.f59327j.setOnTouchListener(this);
        setOnTouchListener(this);
        this.f59325h.put(this.f59318a, Boolean.valueOf(d1Var.f59451a));
        this.f59325h.put(this.f59319b, Boolean.valueOf(d1Var.f59461k));
        this.f59325h.put(this.f59323f, Boolean.valueOf(d1Var.f59453c));
        this.f59325h.put(this.f59320c, Boolean.valueOf(d1Var.f59452b));
        HashMap map = this.f59325h;
        Button button = this.f59327j;
        if (!d1Var.f59462l && !d1Var.f59457g) {
            z10 = false;
        }
        map.put(button, Boolean.valueOf(z10));
        this.f59325h.put(this, Boolean.valueOf(d1Var.f59462l));
    }

    @Override // com.my.target.j5
    public void setInterstitialPromoViewListener(@Nullable j5.a aVar) {
        this.f59333p = aVar;
    }

    private void a(c cVar) {
        this.f59326i.setImageBitmap(cVar.c().getBitmap());
        this.f59326i.setOnClickListener(new a());
    }
}
