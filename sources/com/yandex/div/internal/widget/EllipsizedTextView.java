package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.yandex.div.R$styleable;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 o2\u00020\u0001:\u0001oB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\u0006H\u0003¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\fH\u0014¢\u0006\u0004\b'\u0010\u0018J\u000f\u0010(\u001a\u00020\fH\u0014¢\u0006\u0004\b(\u0010\u0018J\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*J#\u0010-\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0006H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J1\u00109\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0014¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u0006H\u0014¢\u0006\u0004\b=\u0010>J/\u0010?\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b?\u0010\u0016J\u000f\u0010@\u001a\u00020\u0006H\u0004¢\u0006\u0004\b@\u0010AR*\u0010\u000b\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010C\u001a\u0004\bD\u0010*\"\u0004\bE\u0010\u000eR*\u0010F\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\u001d\"\u0004\bI\u0010JR.\u0010K\u001a\u0004\u0018\u0001022\b\u0010B\u001a\u0004\u0018\u0001028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u00105R\u0016\u0010P\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010GR4\u0010Q\u001a\u0004\u0018\u00010\n2\b\u0010B\u001a\u0004\u0018\u00010\n8\u0006@BX\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010C\u0012\u0004\bT\u0010\u0018\u001a\u0004\bR\u0010*\"\u0004\bS\u0010\u000eR.\u0010V\u001a\u0004\u0018\u00010\n2\b\u0010U\u001a\u0004\u0018\u00010\n8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010C\u0012\u0004\bX\u0010\u0018\u001a\u0004\bW\u0010*R\"\u0010Y\u001a\u00020\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010G\u001a\u0004\bY\u0010\u001d\"\u0004\bZ\u0010JR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010]\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b]\u0010\\\u001a\u0004\b^\u0010A\"\u0004\b_\u00101R\u0018\u0010`\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010CR\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010GR\u001a\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bf\u0010g\u0012\u0004\bh\u0010\u0018R$\u0010n\u001a\u00020i2\u0006\u0010B\u001a\u00020i8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006p"}, d2 = {"Lcom/yandex/div/internal/widget/EllipsizedTextView;", "Lcom/yandex/div/internal/widget/SuperLineHeightTextView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "ellipsis", "", "onEllipsisChanged", "(Ljava/lang/CharSequence;)V", "text", "setTextInternal", "width", "height", "oldWidth", "oldHeight", "sizeChangeInternal", "(IIII)V", "requestEllipsize", "()V", "invalidateEllipsis", "ellipsizeIfNeeded", "", "noMaxLines", "()Z", "ellipsize", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "calculateFittedSymbols", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I", "textWidth", "Landroid/text/Layout;", "layoutText", "(Ljava/lang/CharSequence;I)Landroid/text/Layout;", "layoutTextWithHyphenation", "onAttachedToWindow", "onDetachedFromWindow", "getText", "()Ljava/lang/CharSequence;", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "maxLines", "setMaxLines", "(I)V", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onSizeChanged", "availableWidth", "()I", "value", "Ljava/lang/CharSequence;", "getEllipsis", "setEllipsis", "autoEllipsize", "Z", "getAutoEllipsize", "setAutoEllipsize", "(Z)V", "ellipsisLocation", "Landroid/text/TextUtils$TruncateAt;", "getEllipsisLocation", "()Landroid/text/TextUtils$TruncateAt;", "setEllipsisLocation", "isRemeasureNeeded", "ellipsizedText", "getEllipsizedText", "setEllipsizedText", "getEllipsizedText$annotations", "<set-?>", "displayText", "getDisplayText", "getDisplayText$annotations", "isInternalTextChange", "setInternalTextChange", "lastMeasuredWidth", "I", "lastMeasuredHeight", "getLastMeasuredHeight", "setLastMeasuredHeight", "originalText", "", "cachedEllipsisWidth", "F", "isEllipsizeRequested", "Lcom/yandex/div/internal/widget/AutoEllipsizeHelper;", "autoEllipsizeHelper", "Lcom/yandex/div/internal/widget/AutoEllipsizeHelper;", "getAutoEllipsizeHelper$annotations", "Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "getDrawingPassOverrideStrategy$div_release", "()Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;", "setDrawingPassOverrideStrategy$div_release", "(Lcom/yandex/div/core/view/DrawingPassOverrideStrategy;)V", "drawingPassOverrideStrategy", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class EllipsizedTextView extends SuperLineHeightTextView {
    private boolean autoEllipsize;

    @NotNull
    private final AutoEllipsizeHelper autoEllipsizeHelper;
    private float cachedEllipsisWidth;

    @Nullable
    private CharSequence displayText;

    @NotNull
    private CharSequence ellipsis;

    @Nullable
    private TextUtils.TruncateAt ellipsisLocation;

    @Nullable
    private CharSequence ellipsizedText;
    private boolean isEllipsizeRequested;
    private boolean isInternalTextChange;
    private boolean isRemeasureNeeded;
    private int lastMeasuredHeight;
    private int lastMeasuredWidth;

    @Nullable
    private CharSequence originalText;

    public /* synthetic */ EllipsizedTextView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final int calculateFittedSymbols(CharSequence text, CharSequence ellipsis) {
        int iAvailableWidth;
        if (text.length() == 0 || getMaxLines() == 0 || (iAvailableWidth = availableWidth()) <= 0) {
            return 0;
        }
        Layout layoutLayoutTextWithHyphenation = TextViewsKt.isHyphenationEnabled(this) ? layoutTextWithHyphenation(text, iAvailableWidth) : layoutText(text, iAvailableWidth);
        int lineCount = layoutLayoutTextWithHyphenation.getLineCount();
        float lineWidth = layoutLayoutTextWithHyphenation.getLineWidth(lineCount - 1);
        if (lineCount < getMaxLines() || (lineCount == getMaxLines() && lineWidth <= iAvailableWidth)) {
            this.isRemeasureNeeded = true;
            return text.length();
        }
        if (this.cachedEllipsisWidth == -1.0f) {
            this.cachedEllipsisWidth = layoutText$default(this, ellipsis, 0, 2, null).getLineWidth(0);
        }
        this.isRemeasureNeeded = true;
        float f10 = iAvailableWidth - this.cachedEllipsisWidth;
        int offsetForHorizontal = layoutLayoutTextWithHyphenation.getOffsetForHorizontal(getMaxLines() - 1, f10);
        while (layoutLayoutTextWithHyphenation.getPrimaryHorizontal(offsetForHorizontal) > f10 && offsetForHorizontal > 0) {
            offsetForHorizontal--;
        }
        return (offsetForHorizontal <= 0 || !Character.isHighSurrogate(text.charAt(offsetForHorizontal + (-1)))) ? offsetForHorizontal : offsetForHorizontal - 1;
    }

    private final CharSequence ellipsize(CharSequence text) {
        CharSequence charSequence;
        int iCalculateFittedSymbols;
        if (text == null || text.length() == 0 || (iCalculateFittedSymbols = calculateFittedSymbols(text, (charSequence = this.ellipsis))) <= 0) {
            return null;
        }
        if (iCalculateFittedSymbols == text.length()) {
            return text;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text, 0, iCalculateFittedSymbols);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private final void ellipsizeIfNeeded() {
        CharSequence charSequence = this.ellipsizedText;
        boolean z10 = noMaxLines() || Intrinsics.areEqual(this.ellipsis, "…");
        if (this.ellipsizedText != null || !z10) {
            if (z10) {
                CharSequence charSequence2 = this.originalText;
                if (charSequence2 != null) {
                    this.isRemeasureNeeded = !Intrinsics.areEqual(charSequence2, charSequence);
                } else {
                    charSequence2 = null;
                }
                setEllipsizedText(charSequence2);
            } else {
                setEllipsizedText(ellipsize(this.originalText));
            }
        }
        this.isEllipsizeRequested = false;
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDisplayText$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    private final void invalidateEllipsis() {
        this.cachedEllipsisWidth = -1.0f;
        this.isRemeasureNeeded = false;
    }

    private final Layout layoutText(CharSequence text, int textWidth) {
        return new StaticLayout(text, getPaint(), textWidth, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
    }

    static /* synthetic */ Layout layoutText$default(EllipsizedTextView ellipsizedTextView, CharSequence charSequence, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layoutText");
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return ellipsizedTextView.layoutText(charSequence, i10);
    }

    @RequiresApi(23)
    private final Layout layoutTextWithHyphenation(CharSequence text, int textWidth) {
        return StaticLayout.Builder.obtain(text, 0, text.length(), getPaint(), textWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
    }

    private final boolean noMaxLines() {
        return getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE;
    }

    private final void onEllipsisChanged(CharSequence ellipsis) {
        if (noMaxLines()) {
            super.setEllipsize(null);
        } else if (Intrinsics.areEqual(ellipsis, "…")) {
            super.setEllipsize(this.ellipsisLocation);
        } else {
            super.setEllipsize(null);
            requestEllipsize();
            invalidateEllipsis();
        }
        requestLayout();
    }

    private final void requestEllipsize() {
        this.isEllipsizeRequested = true;
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.ellipsizedText = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence text) {
        this.isInternalTextChange = true;
        super.setText(text);
        this.isInternalTextChange = false;
    }

    private final void sizeChangeInternal(int width, int height, int oldWidth, int oldHeight) {
        if (width == oldWidth && height == oldHeight) {
            return;
        }
        requestEllipsize();
    }

    protected final int availableWidth() {
        return (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
    }

    public final boolean getAutoEllipsize() {
        return this.autoEllipsize;
    }

    @Nullable
    public final CharSequence getDisplayText() {
        return this.displayText;
    }

    @NotNull
    public final DrawingPassOverrideStrategy getDrawingPassOverrideStrategy$div_release() {
        return this.autoEllipsizeHelper.getDrawingPassOverrideStrategy();
    }

    @NotNull
    public final CharSequence getEllipsis() {
        return this.ellipsis;
    }

    @Nullable
    public final TextUtils.TruncateAt getEllipsisLocation() {
        return this.ellipsisLocation;
    }

    @Nullable
    public final CharSequence getEllipsizedText() {
        return this.ellipsizedText;
    }

    protected final int getLastMeasuredHeight() {
        return this.lastMeasuredHeight;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    @NotNull
    public CharSequence getText() {
        CharSequence charSequence = this.originalText;
        return charSequence == null ? "" : charSequence;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.autoEllipsizeHelper.onViewAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.autoEllipsizeHelper.onViewDetachedFromWindow();
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        sizeChangeInternal(getMeasuredWidth(), getMeasuredHeight(), this.lastMeasuredWidth, this.lastMeasuredHeight);
        if (this.isEllipsizeRequested) {
            ellipsizeIfNeeded();
            CharSequence charSequence = this.ellipsizedText;
            if (charSequence != null) {
                if (!this.isRemeasureNeeded) {
                    charSequence = null;
                }
                if (charSequence != null) {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }
        }
        this.lastMeasuredWidth = getMeasuredWidth();
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        sizeChangeInternal(width, height, oldWidth, oldHeight);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    protected void onTextChanged(@Nullable CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        if (this.isInternalTextChange) {
            return;
        }
        this.originalText = text;
        requestLayout();
        requestEllipsize();
    }

    public final void setAutoEllipsize(boolean z10) {
        this.autoEllipsize = z10;
        this.autoEllipsizeHelper.setEnabled(z10);
    }

    public final void setDrawingPassOverrideStrategy$div_release(@NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.autoEllipsizeHelper.setDrawingPassOverrideStrategy(drawingPassOverrideStrategy);
    }

    public final void setEllipsis(@NotNull CharSequence charSequence) {
        onEllipsisChanged(charSequence);
        this.ellipsis = charSequence;
    }

    public final void setEllipsisLocation(@Nullable TextUtils.TruncateAt truncateAt) {
        this.ellipsisLocation = truncateAt;
        if (truncateAt == null) {
            setAutoEllipsize(false);
        }
        onEllipsisChanged(this.ellipsis);
    }

    @Override // android.widget.TextView
    public void setEllipsize(@Nullable TextUtils.TruncateAt where) {
    }

    protected final void setInternalTextChange(boolean z10) {
        this.isInternalTextChange = z10;
    }

    protected final void setLastMeasuredHeight(int i10) {
        this.lastMeasuredHeight = i10;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        if (maxLines == getMaxLines()) {
            return;
        }
        super.setMaxLines(maxLines);
        onEllipsisChanged(this.ellipsis);
        requestEllipsize();
        invalidateEllipsis();
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        this.displayText = text;
        super.setText(text, type);
    }

    public EllipsizedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        CharSequence charSequence = "…";
        this.ellipsis = "…";
        this.ellipsisLocation = TextUtils.TruncateAt.END;
        this.lastMeasuredWidth = -1;
        this.lastMeasuredHeight = -1;
        this.cachedEllipsisWidth = -1.0f;
        this.autoEllipsizeHelper = new AutoEllipsizeHelper(this);
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.EllipsizedTextView, i10, 0);
            try {
                CharSequence text = typedArrayObtainStyledAttributes.getText(R$styleable.EllipsizedTextView_ellipsis);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        onEllipsisChanged(this.ellipsis);
    }
}
