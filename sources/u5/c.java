package u5;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f105237f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.f105237f = view;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8685invoke();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m8685invoke() {
            this.f105237f.invalidate();
        }
    }

    public static final /* synthetic */ b a(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new b(obj, new a(view));
    }
}
