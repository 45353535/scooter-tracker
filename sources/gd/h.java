package gd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.bidmachine.rendering.R$drawable;
import io.bidmachine.rendering.R$id;
import io.bidmachine.rendering.R$layout;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import org.jetbrains.annotations.NotNull;
import pd.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f72749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f72750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f72751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f72752e;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final LinearLayout invoke() {
            return (LinearLayout) h.this.findViewById(R$id.f81910a);
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            return h.this.findViewById(R$id.f81911b);
        }
    }

    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) h.this.findViewById(R$id.f81912c);
        }
    }

    static final class d extends Lambda implements Function0 {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final TextView invoke() {
            return (TextView) h.this.findViewById(R$id.f81913d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f72749b = i.a(new d());
        this.f72750c = i.a(new c());
        this.f72751d = i.a(new b());
        this.f72752e = i.a(new a());
        View.inflate(context, R$layout.f81914a, this);
        setOrientation(1);
        setBackgroundResource(R$drawable.f81909b);
        int iK = g0.k(context, 16.0f);
        setPadding(iK, iK, iK, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function0 clickListener, View view) {
        Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
        clickListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Function0 clickListener, View view) {
        Intrinsics.checkNotNullParameter(clickListener, "$clickListener");
        clickListener.invoke();
    }

    private final LinearLayout getActionButtonsContainer() {
        Object value = this.f72752e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-actionButtonsContainer>(...)");
        return (LinearLayout) value;
    }

    private final View getCloseButton() {
        Object value = this.f72751d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-closeButton>(...)");
        return (View) value;
    }

    private final TextView getSubtitleTextView() {
        Object value = this.f72750c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-subtitleTextView>(...)");
        return (TextView) value;
    }

    private final TextView getTitleTextView() {
        Object value = this.f72749b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-titleTextView>(...)");
        return (TextView) value;
    }

    public final void c() {
        getActionButtonsContainer().removeAllViews();
    }

    public final void d(String title, Drawable drawable, final Function0 clickListener) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        LinearLayout actionButtonsContainer = getActionButtonsContainer();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        gd.a aVar = new gd.a(context);
        aVar.setText(title);
        aVar.setActionIcon(drawable);
        aVar.setOnClickListener(new View.OnClickListener() { // from class: gd.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.e(clickListener, view);
            }
        });
        actionButtonsContainer.addView(aVar, -1, -2);
    }

    public final void setOnCloseButtonClickListener(@NotNull final Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: gd.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h.f(clickListener, view);
            }
        });
    }

    public final void setSubtitle(@NotNull String subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        getSubtitleTextView().setText(subtitle);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getTitleTextView().setText(title);
    }
}
