package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f1 extends he {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f69782f = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f69783e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Context context, AttributeSet attributeSet, int i10, Function0 function0) {
        super(context, attributeSet, i10, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f69783e = function0;
        setId(View.generateViewId());
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        setPadding(b(16), b(4), b(16), b(4));
    }

    public abstract void e(m4 m4Var);

    public abstract void f(d9 d9Var, t7 t7Var);

    @Nullable
    public final Function0<Unit> getOnCtaClicked() {
        return this.f69783e;
    }

    public final void setCustomContentDescription(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        setContentDescription(description);
    }
}
