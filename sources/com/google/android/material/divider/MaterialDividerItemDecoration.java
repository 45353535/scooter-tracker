package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes9.dex */
public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f26492j = R.style.Widget_MaterialComponents_MaterialDivider;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f26493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f26499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f26500i;

    public MaterialDividerItemDecoration(@NonNull Context context, int i10) {
        this(context, null, i10);
    }

    private void a(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i10;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i12 = paddingTop + this.f26497f;
        int i13 = height - this.f26498g;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = recyclerView.getChildAt(i14);
            if (d(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f26500i);
                int iRound = Math.round(childAt.getTranslationX());
                if (zIsLayoutRtl) {
                    i11 = this.f26500i.left + iRound;
                    i10 = this.f26494c + i11;
                } else {
                    i10 = iRound + this.f26500i.right;
                    i11 = i10 - this.f26494c;
                }
                this.f26493b.setBounds(i11, i12, i10, i13);
                this.f26493b.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f26493b.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void b(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(recyclerView);
        int i10 = paddingLeft + (zIsLayoutRtl ? this.f26498g : this.f26497f);
        int i11 = width - (zIsLayoutRtl ? this.f26497f : this.f26498g);
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            if (d(recyclerView, childAt)) {
                recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f26500i);
                int iRound = this.f26500i.bottom + Math.round(childAt.getTranslationY());
                this.f26493b.setBounds(i10, iRound - this.f26494c, i11, iRound);
                this.f26493b.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                this.f26493b.draw(canvas);
            }
        }
        canvas.restore();
    }

    private boolean d(RecyclerView recyclerView, View view) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        return childAdapterPosition != -1 && (!(adapter != null && childAdapterPosition == adapter.getItemCount() - 1) || this.f26499h) && c(childAdapterPosition, adapter);
    }

    protected boolean c(int i10, RecyclerView.Adapter adapter) {
        return true;
    }

    @ColorInt
    public int getDividerColor() {
        return this.f26495d;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f26498g;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f26497f;
    }

    @Px
    public int getDividerThickness() {
        return this.f26494c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (d(recyclerView, view)) {
            if (this.f26496e == 1) {
                rect.bottom = this.f26494c;
            } else if (ViewUtils.isLayoutRtl(recyclerView)) {
                rect.left = this.f26494c;
            } else {
                rect.right = this.f26494c;
            }
        }
    }

    public int getOrientation() {
        return this.f26496e;
    }

    public boolean isLastItemDecorated() {
        return this.f26499h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.f26496e == 1) {
            b(canvas, recyclerView);
        } else {
            a(canvas, recyclerView);
        }
    }

    public void setDividerColor(@ColorInt int i10) {
        this.f26495d = i10;
        Drawable drawableWrap = DrawableCompat.wrap(this.f26493b);
        this.f26493b = drawableWrap;
        drawableWrap.setTint(i10);
    }

    public void setDividerColorResource(@NonNull Context context, @ColorRes int i10) {
        setDividerColor(ContextCompat.getColor(context, i10));
    }

    public void setDividerInsetEnd(@Px int i10) {
        this.f26498g = i10;
    }

    public void setDividerInsetEndResource(@NonNull Context context, @DimenRes int i10) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerInsetStart(@Px int i10) {
        this.f26497f = i10;
    }

    public void setDividerInsetStartResource(@NonNull Context context, @DimenRes int i10) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i10));
    }

    public void setDividerThickness(@Px int i10) {
        this.f26494c = i10;
    }

    public void setDividerThicknessResource(@NonNull Context context, @DimenRes int i10) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i10));
    }

    public void setLastItemDecorated(boolean z10) {
        this.f26499h = z10;
    }

    public void setOrientation(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f26496e = i10;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i10 + ". It should be either HORIZONTAL or VERTICAL");
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, R.attr.materialDividerStyle, i10);
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        this.f26500i = new Rect();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.MaterialDivider, i10, f26492j, new int[0]);
        this.f26495d = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.f26494c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.f26497f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.f26498g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.f26499h = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialDivider_lastItemDecorated, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f26493b = new ShapeDrawable();
        setDividerColor(this.f26495d);
        setOrientation(i11);
    }
}
