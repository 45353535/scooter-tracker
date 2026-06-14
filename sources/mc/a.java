package mc;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import ec.b;
import id.a0;
import id.a1;
import id.b1;
import id.i1;
import id.n;
import id.q0;
import jc.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends jc.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f94839t;

    /* JADX INFO: renamed from: mc.a$a, reason: collision with other inner class name */
    private final class C1091a implements b.a {
        public C1091a() {
        }

        @Override // ec.b.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            a.this.f94839t.setImageBitmap(bitmap);
        }

        @Override // ec.b.a
        public void onError(a0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, b repository, id.a adElementParams, c adFormListener, yc.b eventCallback, wc.a aVar) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.f94839t = new ImageView(context);
    }

    private final void L(q0 q0Var) {
        if (q0Var != null) {
            G().f(q0Var, F(), new C1091a());
        }
    }

    @Override // jc.a
    public View H() {
        return this.f94839t;
    }

    @Override // ic.f
    public void c() {
        q0.a aVar = q0.f74599b;
        L(aVar.c(h().k()));
        C().a(this);
        a1 a1VarL = h().l();
        b1 b1VarA = a1VarL != null ? a1VarL.a() : null;
        if (b1VarA == null) {
            L(aVar.a(h().m()));
            return;
        }
        if (b1VarA instanceof n) {
            L(aVar.b(((n) b1VarA).a()));
            return;
        }
        if (b1VarA instanceof i1) {
            L(aVar.e(((i1) b1VarA).a()));
            return;
        }
        A("Invalid resource type (" + b1VarA.getClass().getSimpleName() + "), it should be Base64ResourceSource or UrlResourceSource");
    }
}
