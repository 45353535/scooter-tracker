package com.bytedance.adsdk.ugeno.mzz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.mzz.mml;
import com.bytedance.adsdk.ugeno.wd.wd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class mzz extends ViewGroup implements com.bytedance.adsdk.ugeno.mzz.qdl {
    private mml bjy;
    private int[] exu;
    private int fs;
    private mml.qdl jl;
    private Drawable jpc;
    private List<lnr> jtx;
    private int lnr;
    private int mml;
    private int mo;
    private int mzz;
    private int qdl;
    private SparseIntArray rdp;
    private int rq;
    private int to;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16210ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private Drawable f16211wd;
    private com.bytedance.adsdk.ugeno.mml yt;

    public static class qdl extends ViewGroup.MarginLayoutParams implements ud {
        public static final Parcelable.Creator<qdl> CREATOR = new Parcelable.Creator<qdl>() { // from class: com.bytedance.adsdk.ugeno.mzz.mzz.qdl.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public qdl createFromParcel(Parcel parcel) {
                return new qdl(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public qdl[] newArray(int i10) {
                return new qdl[i10];
            }
        };
        private int jpc;
        private float lnr;
        private int mml;
        private int mo;
        private float mzz;
        private int qdl;
        private boolean to;
        private int tvp;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private float f16212ud;

        /* JADX INFO: renamed from: wd, reason: collision with root package name */
        private int f16213wd;

        public qdl(qdl qdlVar) {
            super((ViewGroup.MarginLayoutParams) qdlVar);
            this.qdl = 1;
            this.f16212ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.f16213wd = -1;
            this.jpc = ViewCompat.MEASURED_SIZE_MASK;
            this.tvp = ViewCompat.MEASURED_SIZE_MASK;
            this.qdl = qdlVar.qdl;
            this.f16212ud = qdlVar.f16212ud;
            this.lnr = qdlVar.lnr;
            this.mml = qdlVar.mml;
            this.mzz = qdlVar.mzz;
            this.mo = qdlVar.mo;
            this.f16213wd = qdlVar.f16213wd;
            this.jpc = qdlVar.jpc;
            this.tvp = qdlVar.tvp;
            this.to = qdlVar.to;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int bjy() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int exu() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public float fs() {
            return this.mzz;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int jpc() {
            return this.f16213wd;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int jtx() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int lnr() {
            return this.qdl;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public float mml() {
            return this.f16212ud;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int mo() {
            return this.mml;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public float mzz() {
            return this.lnr;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int qdl() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int rdp() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public boolean rq() {
            return this.to;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int to() {
            return this.tvp;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int tvp() {
            return this.jpc;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int ud() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public int wd() {
            return this.mo;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.qdl);
            parcel.writeFloat(this.f16212ud);
            parcel.writeFloat(this.lnr);
            parcel.writeInt(this.mml);
            parcel.writeFloat(this.mzz);
            parcel.writeInt(this.mo);
            parcel.writeInt(this.f16213wd);
            parcel.writeInt(this.jpc);
            parcel.writeInt(this.tvp);
            parcel.writeByte(this.to ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public void lnr(int i10) {
            this.qdl = i10;
        }

        public void mml(int i10) {
            this.mml = i10;
        }

        public void qdl(float f10) {
            this.f16212ud = f10;
        }

        public void ud(float f10) {
            this.lnr = f10;
        }

        public void lnr(float f10) {
            this.mzz = f10;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public void qdl(int i10) {
            this.mo = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.mzz.ud
        public void ud(int i10) {
            this.f16213wd = i10;
        }

        public qdl(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.qdl = 1;
            this.f16212ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.f16213wd = -1;
            this.jpc = ViewCompat.MEASURED_SIZE_MASK;
            this.tvp = ViewCompat.MEASURED_SIZE_MASK;
        }

        public qdl(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.qdl = 1;
            this.f16212ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.f16213wd = -1;
            this.jpc = ViewCompat.MEASURED_SIZE_MASK;
            this.tvp = ViewCompat.MEASURED_SIZE_MASK;
        }

        public qdl(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.qdl = 1;
            this.f16212ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.f16213wd = -1;
            this.jpc = ViewCompat.MEASURED_SIZE_MASK;
            this.tvp = ViewCompat.MEASURED_SIZE_MASK;
        }

        protected qdl(Parcel parcel) {
            super(0, 0);
            this.qdl = 1;
            this.f16212ud = 0.0f;
            this.lnr = 0.0f;
            this.mml = -1;
            this.mzz = -1.0f;
            this.mo = -1;
            this.f16213wd = -1;
            this.jpc = ViewCompat.MEASURED_SIZE_MASK;
            this.tvp = ViewCompat.MEASURED_SIZE_MASK;
            this.qdl = parcel.readInt();
            this.f16212ud = parcel.readFloat();
            this.lnr = parcel.readFloat();
            this.mml = parcel.readInt();
            this.mzz = parcel.readFloat();
            this.mo = parcel.readInt();
            this.f16213wd = parcel.readInt();
            this.jpc = parcel.readInt();
            this.tvp = parcel.readInt();
            this.to = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public mzz(Context context) {
        super(context, null);
        this.mo = -1;
        this.bjy = new mml(this);
        this.jtx = new ArrayList();
        this.jl = new mml.qdl();
    }

    private boolean mml(int i10, int i11) {
        return mzz(i10, i11) ? qdl() ? (this.to & 1) != 0 : (this.tvp & 1) != 0 : qdl() ? (this.to & 2) != 0 : (this.tvp & 2) != 0;
    }

    private boolean mo(int i10) {
        if (i10 >= 0 && i10 < this.jtx.size()) {
            for (int i11 = i10 + 1; i11 < this.jtx.size(); i11++) {
                if (this.jtx.get(i11).ud() > 0) {
                    return false;
                }
            }
            if (qdl()) {
                return (this.tvp & 4) != 0;
            }
            if ((this.to & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean mzz(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewLnr = lnr(i10 - i12);
            if (viewLnr != null && viewLnr.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.rdp == null) {
            this.rdp = new SparseIntArray(getChildCount());
        }
        this.exu = this.bjy.qdl(view, i10, layoutParams, this.rdp);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qdl;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qdl ? new qdl((qdl) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new qdl((ViewGroup.MarginLayoutParams) layoutParams) : new qdl(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getAlignContent() {
        return this.mzz;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getAlignItems() {
        return this.mml;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f16211wd;
    }

    public Drawable getDividerDrawableVertical() {
        return this.jpc;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getFlexDirection() {
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<lnr> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.jtx.size());
        for (lnr lnrVar : this.jtx) {
            if (lnrVar.ud() != 0) {
                arrayList.add(lnrVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public List<lnr> getFlexLinesInternal() {
        return this.jtx;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getFlexWrap() {
        return this.f16210ud;
    }

    public int getJustifyContent() {
        return this.lnr;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getLargestMainSize() {
        Iterator<lnr> it = this.jtx.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().mzz);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getMaxLine() {
        return this.mo;
    }

    public int getShowDividerHorizontal() {
        return this.tvp;
    }

    public int getShowDividerVertical() {
        return this.to;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int getSumOfCrossSize() {
        int size = this.jtx.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            lnr lnrVar = this.jtx.get(i11);
            if (mml(i11)) {
                i10 += qdl() ? this.rq : this.fs;
            }
            if (mo(i11)) {
                i10 += qdl() ? this.rq : this.fs;
            }
            i10 += lnrVar.f16205wd;
        }
        return i10;
    }

    public View lnr(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.exu;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            mmlVar.wd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            mmlVar.jpc();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.jpc == null && this.f16211wd == null) {
            return;
        }
        if (this.tvp == 0 && this.to == 0) {
            return;
        }
        int iQdl = wd.qdl(this);
        int i10 = this.qdl;
        if (i10 == 0) {
            qdl(canvas, iQdl == 1, this.f16210ud == 2);
            return;
        }
        if (i10 == 1) {
            qdl(canvas, iQdl != 1, this.f16210ud == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iQdl == 1;
            if (this.f16210ud == 2) {
                z10 = !z10;
            }
            ud(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iQdl == 1;
        if (this.f16210ud == 2) {
            z11 = !z11;
        }
        ud(canvas, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        mzz mzzVar;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        mzz mzzVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z13;
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            mmlVar.mo();
        }
        int iQdl = wd.qdl(this);
        int i22 = this.qdl;
        if (i22 == 0) {
            if (iQdl == 1) {
                z11 = true;
                mzzVar = this;
                i14 = i10;
                i17 = i11;
                i16 = i13;
                i15 = i12;
            } else {
                z11 = false;
                mzzVar = this;
                i14 = i10;
                i15 = i12;
                i16 = i13;
                i17 = i11;
            }
            mzzVar.qdl(z11, i14, i17, i15, i16);
        } else if (i22 == 1) {
            if (iQdl != 1) {
                z12 = true;
                mzzVar2 = this;
                i18 = i10;
                i21 = i11;
                i20 = i13;
                i19 = i12;
            } else {
                z12 = false;
                mzzVar2 = this;
                i18 = i10;
                i19 = i12;
                i20 = i13;
                i21 = i11;
            }
            mzzVar2.qdl(z12, i18, i21, i19, i20);
        } else if (i22 == 2) {
            z13 = iQdl == 1;
            if (this.f16210ud == 2) {
                z13 = !z13;
            }
            qdl(z13, false, i10, i11, i12, i13);
        } else {
            if (i22 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.qdl);
            }
            z13 = iQdl == 1;
            if (this.f16210ud == 2) {
                z13 = !z13;
            }
            qdl(z13, true, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.mml mmlVar2 = this.yt;
        if (mmlVar2 != null) {
            mmlVar2.qdl(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            int[] iArrQdl = mmlVar.qdl(i10, i11);
            qdl(iArrQdl[0], iArrQdl[1]);
        } else {
            qdl(i10, i11);
        }
        com.bytedance.adsdk.ugeno.mml mmlVar2 = this.yt;
        if (mmlVar2 != null) {
            mmlVar2.mzz();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.mml mmlVar = this.yt;
        if (mmlVar != null) {
            mmlVar.ud(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int qdl(View view) {
        return 0;
    }

    public void setAlignContent(int i10) {
        if (this.mzz != i10) {
            this.mzz = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.mml != i10) {
            this.mml = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f16211wd) {
            return;
        }
        this.f16211wd = drawable;
        if (drawable != null) {
            this.rq = drawable.getIntrinsicHeight();
        } else {
            this.rq = 0;
        }
        ud();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.jpc) {
            return;
        }
        this.jpc = drawable;
        if (drawable != null) {
            this.fs = drawable.getIntrinsicWidth();
        } else {
            this.fs = 0;
        }
        ud();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.qdl != i10) {
            this.qdl = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public void setFlexLines(List<lnr> list) {
        this.jtx = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f16210ud != i10) {
            this.f16210ud = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.lnr != i10) {
            this.lnr = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.mo != i10) {
            this.mo = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.tvp) {
            this.tvp = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.to) {
            this.to = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public View ud(int i10) {
        return lnr(i10);
    }

    private void qdl(int i10, int i11) {
        if (this.rdp == null) {
            this.rdp = new SparseIntArray(getChildCount());
        }
        if (this.bjy.ud(this.rdp)) {
            this.exu = this.bjy.qdl(this.rdp);
        }
        int i12 = this.qdl;
        if (i12 == 0 || i12 == 1) {
            ud(i10, i11);
        } else if (i12 == 2 || i12 == 3) {
            lnr(i10, i11);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.qdl);
        }
    }

    private void ud(int i10, int i11) {
        this.jtx.clear();
        this.jl.qdl();
        this.bjy.qdl(this.jl, i10, i11);
        this.jtx = this.jl.qdl;
        this.bjy.qdl(i10, i11);
        if (this.mml == 3) {
            for (lnr lnrVar : this.jtx) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < lnrVar.jpc; i12++) {
                    View viewLnr = lnr(lnrVar.bjy + i12);
                    if (viewLnr != null && viewLnr.getVisibility() != 8) {
                        qdl qdlVar = (qdl) viewLnr.getLayoutParams();
                        iMax = this.f16210ud != 2 ? Math.max(iMax, viewLnr.getMeasuredHeight() + Math.max(lnrVar.fs - viewLnr.getBaseline(), ((ViewGroup.MarginLayoutParams) qdlVar).topMargin) + ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin) : Math.max(iMax, viewLnr.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) qdlVar).topMargin + Math.max((lnrVar.fs - viewLnr.getMeasuredHeight()) + viewLnr.getBaseline(), ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin));
                    }
                }
                lnrVar.f16205wd = iMax;
            }
        }
        this.bjy.ud(i10, i11, getPaddingTop() + getPaddingBottom());
        this.bjy.qdl();
        qdl(this.qdl, i10, i11, this.jl.f16207ud);
    }

    private void lnr(int i10, int i11) {
        this.jtx.clear();
        this.jl.qdl();
        this.bjy.ud(this.jl, i10, i11);
        this.jtx = this.jl.qdl;
        this.bjy.qdl(i10, i11);
        this.bjy.ud(i10, i11, getPaddingLeft() + getPaddingRight());
        this.bjy.qdl();
        qdl(this.qdl, i10, i11, this.jl.f16207ud);
    }

    private boolean mzz(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.jtx.get(i11).ud() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean mml(int i10) {
        if (i10 >= 0 && i10 < this.jtx.size()) {
            if (mzz(i10)) {
                return qdl() ? (this.tvp & 1) != 0 : (this.to & 1) != 0;
            }
            if (qdl()) {
                return (this.tvp & 2) != 0;
            }
            if ((this.to & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public View qdl(int i10) {
        return getChildAt(i10);
    }

    private void qdl(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void ud(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.jtx.size();
        for (int i12 = 0; i12 < size; i12++) {
            lnr lnrVar = this.jtx.get(i12);
            for (int i13 = 0; i13 < lnrVar.jpc; i13++) {
                int i14 = lnrVar.bjy + i13;
                View viewLnr = lnr(i14);
                if (viewLnr != null && viewLnr.getVisibility() != 8) {
                    qdl qdlVar = (qdl) viewLnr.getLayoutParams();
                    if (mml(i14, i13)) {
                        if (z11) {
                            top = viewLnr.getBottom() + ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin;
                        } else {
                            top = (viewLnr.getTop() - ((ViewGroup.MarginLayoutParams) qdlVar).topMargin) - this.rq;
                        }
                        ud(canvas, lnrVar.qdl, top, lnrVar.f16205wd);
                    }
                    if (i13 == lnrVar.jpc - 1 && (this.tvp & 4) > 0) {
                        if (z11) {
                            bottom = (viewLnr.getTop() - ((ViewGroup.MarginLayoutParams) qdlVar).topMargin) - this.rq;
                        } else {
                            bottom = viewLnr.getBottom() + ((ViewGroup.MarginLayoutParams) qdlVar).bottomMargin;
                        }
                        ud(canvas, lnrVar.qdl, bottom, lnrVar.f16205wd);
                    }
                }
            }
            if (mml(i12)) {
                if (z10) {
                    i11 = lnrVar.lnr;
                } else {
                    i11 = lnrVar.qdl - this.fs;
                }
                qdl(canvas, i11, paddingTop, iMax);
            }
            if (mo(i12) && (this.to & 4) > 0) {
                if (z10) {
                    i10 = lnrVar.qdl - this.fs;
                } else {
                    i10 = lnrVar.lnr;
                }
                qdl(canvas, i10, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public boolean qdl() {
        int i10 = this.qdl;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qdl(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.mzz.mzz.qdl(boolean, int, int, int, int):void");
    }

    private void ud(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f16211wd;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.rq + i11);
        this.f16211wd.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int ud(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void ud() {
        if (this.f16211wd == null && this.jpc == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void qdl(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.mzz.mzz.qdl(boolean, boolean, int, int, int, int):void");
    }

    private void qdl(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.jtx.size();
        for (int i12 = 0; i12 < size; i12++) {
            lnr lnrVar = this.jtx.get(i12);
            for (int i13 = 0; i13 < lnrVar.jpc; i13++) {
                int i14 = lnrVar.bjy + i13;
                View viewLnr = lnr(i14);
                if (viewLnr != null && viewLnr.getVisibility() != 8) {
                    qdl qdlVar = (qdl) viewLnr.getLayoutParams();
                    if (mml(i14, i13)) {
                        if (z10) {
                            left = viewLnr.getRight() + ((ViewGroup.MarginLayoutParams) qdlVar).rightMargin;
                        } else {
                            left = (viewLnr.getLeft() - ((ViewGroup.MarginLayoutParams) qdlVar).leftMargin) - this.fs;
                        }
                        qdl(canvas, left, lnrVar.f16204ud, lnrVar.f16205wd);
                    }
                    if (i13 == lnrVar.jpc - 1 && (this.to & 4) > 0) {
                        if (z10) {
                            right = (viewLnr.getLeft() - ((ViewGroup.MarginLayoutParams) qdlVar).leftMargin) - this.fs;
                        } else {
                            right = viewLnr.getRight() + ((ViewGroup.MarginLayoutParams) qdlVar).rightMargin;
                        }
                        qdl(canvas, right, lnrVar.f16204ud, lnrVar.f16205wd);
                    }
                }
            }
            if (mml(i12)) {
                if (z11) {
                    i11 = lnrVar.mml;
                } else {
                    i11 = lnrVar.f16204ud - this.rq;
                }
                ud(canvas, paddingLeft, i11, iMax);
            }
            if (mo(i12) && (this.tvp & 4) > 0) {
                if (z11) {
                    i10 = lnrVar.f16204ud - this.rq;
                } else {
                    i10 = lnrVar.mml;
                }
                ud(canvas, paddingLeft, i10, iMax);
            }
        }
    }

    private void qdl(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.jpc;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.fs + i10, i12 + i11);
        this.jpc.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int qdl(View view, int i10, int i11) {
        int i12;
        int i13;
        if (qdl()) {
            i12 = mml(i10, i11) ? this.fs : 0;
            if ((this.to & 4) <= 0) {
                return i12;
            }
            i13 = this.fs;
        } else {
            i12 = mml(i10, i11) ? this.rq : 0;
            if ((this.tvp & 4) <= 0) {
                return i12;
            }
            i13 = this.rq;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public void qdl(lnr lnrVar) {
        if (qdl()) {
            if ((this.to & 4) > 0) {
                int i10 = lnrVar.mzz;
                int i11 = this.fs;
                lnrVar.mzz = i10 + i11;
                lnrVar.mo += i11;
                return;
            }
            return;
        }
        if ((this.tvp & 4) > 0) {
            int i12 = lnrVar.mzz;
            int i13 = this.rq;
            lnrVar.mzz = i12 + i13;
            lnrVar.mo += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public int qdl(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.mzz.qdl
    public void qdl(View view, int i10, int i11, lnr lnrVar) {
        if (mml(i10, i11)) {
            if (qdl()) {
                int i12 = lnrVar.mzz;
                int i13 = this.fs;
                lnrVar.mzz = i12 + i13;
                lnrVar.mo += i13;
                return;
            }
            int i14 = lnrVar.mzz;
            int i15 = this.rq;
            lnrVar.mzz = i14 + i15;
            lnrVar.mo += i15;
        }
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.yt = lnrVar;
    }
}
