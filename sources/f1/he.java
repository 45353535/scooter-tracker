package f1;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class he extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f70042d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GradientDrawable f70043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xb f70044c;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(Context context, AttributeSet attributeSet, int i10, GradientDrawable backgroundDrawable, xb densityProvider) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundDrawable, "backgroundDrawable");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        this.f70043b = backgroundDrawable;
        this.f70044c = densityProvider;
        c();
    }

    public final int a(double d10) {
        return this.f70044c.a(d10);
    }

    public final int b(int i10) {
        return this.f70044c.a(i10);
    }

    public final void c() {
        GradientDrawable gradientDrawable = this.f70043b;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(16.0f);
        gradientDrawable.setColor(-15262682);
        setBackgroundColor(0);
        setBackground(this.f70043b);
    }

    public final void d(boolean z10) {
        setBackground(z10 ? this.f70043b : null);
    }

    @NotNull
    public final GradientDrawable getBackgroundDrawable() {
        return this.f70043b;
    }

    public final void setCornerRadius(int i10) {
        this.f70043b.setCornerRadius(i10);
    }

    public /* synthetic */ he(Context context, AttributeSet attributeSet, int i10, GradientDrawable gradientDrawable, xb xbVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new GradientDrawable() : gradientDrawable, (i11 & 16) != 0 ? new y7(context) : xbVar);
    }
}
