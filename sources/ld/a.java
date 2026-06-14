package ld;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import ic.v;
import id.z0;
import io.bidmachine.rendering.R$style;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import pd.g0;
import pd.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Dialog {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1079a f94158d = new C1079a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static WeakReference f94159e = new WeakReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f94160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f94161c;

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    public static final class C1079a {
        public /* synthetic */ C1079a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Context context, z0 privacySheetParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            a aVar = (a) a.f94159e.get();
            if (aVar != null && aVar.isShowing()) {
                if (Intrinsics.areEqual(aVar.f94160b, privacySheetParams)) {
                    return aVar;
                }
                aVar.dismiss();
            }
            a aVar2 = new a(context, privacySheetParams, null);
            a.f94159e = new WeakReference(aVar2);
            try {
                aVar2.show();
                return aVar2;
            } catch (Throwable th2) {
                v.i(th2);
                return aVar2;
            }
        }

        private C1079a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[z0.b.values().length];
            try {
                iArr[z0.b.REDIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z0.b.COPY_TO_CLIPBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        public final void a() {
            a.this.dismiss();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f94163f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context) {
            super(0);
            this.f94163f = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final gd.d invoke() {
            return new gd.d(this.f94163f);
        }
    }

    static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ z0.a f94165g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(z0.a aVar) {
            super(0);
            this.f94165g = aVar;
        }

        public final void a() {
            a.this.d(this.f94165g);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ a(Context context, z0 z0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z0Var);
    }

    private final gd.d a() {
        return (gd.d) this.f94161c.getValue();
    }

    private final Object b(String str) {
        try {
            Result.Companion companion = Result.f93230c;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            ClipboardManager clipboardManagerQ = g0.q(context);
            if (clipboardManagerQ != null) {
                clipboardManagerQ.setPrimaryClip(ClipData.newPlainText("", str));
            }
            return Result.b(Unit.f93236a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    private final void c(Window window) {
        if (Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(z0.a aVar) {
        String strA = aVar.a();
        int i10 = b.$EnumSwitchMapping$0[aVar.d().ordinal()];
        if (i10 == 1) {
            j(strA);
        } else {
            if (i10 != 2) {
                return;
            }
            b(strA);
        }
    }

    private final void e(z0 z0Var) {
        gd.d dVarA = a();
        dVarA.d();
        dVarA.setTitle(z0Var.c());
        dVarA.setSubtitle(z0Var.b());
        for (z0.a aVar : z0Var.a()) {
            Bitmap bitmapB = aVar.b();
            dVarA.f(aVar.c(), bitmapB != null ? new BitmapDrawable(dVarA.getResources(), bitmapB) : null, new e(aVar));
        }
    }

    private final Object j(String str) {
        try {
            Result.Companion companion = Result.f93230c;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return Result.b(Boolean.valueOf(o.j(context, str)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    public static final a k(Context context, z0 z0Var) {
        return f94158d.a(context, z0Var);
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gd.d dVarA = a();
        dVarA.setOnCloseClickListener(new c());
        setContentView(dVarA);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
            c(window);
        }
        e(this.f94160b);
    }

    private a(Context context, z0 z0Var) {
        super(context, R$style.f81915a);
        this.f94160b = z0Var;
        this.f94161c = i.a(new d(context));
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
    }
}
