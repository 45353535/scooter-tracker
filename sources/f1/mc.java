package f1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd f70489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s9 f70490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f70491c;

    public mc(dd compositeCloseChipView) {
        Intrinsics.checkNotNullParameter(compositeCloseChipView, "compositeCloseChipView");
        this.f70489a = compositeCloseChipView;
    }

    public final void a() {
        s9 s9Var = this.f70490b;
        if (s9Var != null) {
            s9Var.b();
        }
    }

    public final void b(long j10, ob mode, String str, String str2, Function0 function0) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f70491c = function0;
        s9 s9Var = this.f70490b;
        if (s9Var != null) {
            s9Var.b();
        }
        s9 s9Var2 = new s9(j10, this.f70491c);
        s9Var2.e(this.f70489a.getTimerChipView());
        s9Var2.f(mode, str, str2);
        this.f70490b = s9Var2;
    }

    public final void c(Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f70491c = listener;
    }

    public final s9 d() {
        return this.f70490b;
    }

    public final void e() {
        s9 s9Var = this.f70490b;
        if (s9Var != null) {
            s9Var.n();
        }
    }

    public final void f() {
        s9 s9Var = this.f70490b;
        if (s9Var != null) {
            s9Var.o();
        }
    }
}
