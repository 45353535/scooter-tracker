package ld;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import ic.t;
import ic.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import pd.b0;
import pd.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setClickable(false);
        setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(c this$0, Drawable drawable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setBackground(drawable);
    }

    public final void setWatermark(@Nullable final Drawable drawable) {
        b0.b(new u() { // from class: ld.b
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                c.b(this.f94166b, drawable);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                v.b(this);
            }
        });
    }
}
