package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.skydoves.balloon.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t5.d;
import w5.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR.\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "a", "", "rtlLayout", "b", "(Z)V", "Lw5/a;", "value", "Lw5/a;", "getDrawableTextViewParams", "()Lw5/a;", "setDrawableTextViewParams", "(Lw5/a;)V", "drawableTextViewParams", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VectorTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a drawableTextViewParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, attributeSet);
    }

    private final void a(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.f63576a);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.VectorTextView)");
            setDrawableTextViewParams(new a(u5.a.a(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f63582g, Integer.MIN_VALUE)), u5.a.a(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f63578c, Integer.MIN_VALUE)), u5.a.a(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f63577b, Integer.MIN_VALUE)), u5.a.a(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f63584i, Integer.MIN_VALUE)), null, null, null, null, false, null, null, null, null, u5.a.a(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f63580e, Integer.MIN_VALUE)), u5.a.a(typedArrayObtainStyledAttributes.getColor(R$styleable.f63583h, Integer.MIN_VALUE)), u5.a.a(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f63585j, Integer.MIN_VALUE)), u5.a.a(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f63579d, Integer.MIN_VALUE)), u5.a.a(typedArrayObtainStyledAttributes.getResourceId(R$styleable.f63581f, Integer.MIN_VALUE)), 8176, null));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void b(boolean rtlLayout) {
        a aVar = this.drawableTextViewParams;
        if (aVar != null) {
            aVar.A(rtlLayout);
            d.a(this, aVar);
        }
    }

    @Nullable
    public final a getDrawableTextViewParams() {
        return this.drawableTextViewParams;
    }

    public final void setDrawableTextViewParams(@Nullable a aVar) {
        if (aVar != null) {
            d.a(this, aVar);
        } else {
            aVar = null;
        }
        this.drawableTextViewParams = aVar;
    }
}
