package io.ktor.utils.io;

import eg.u0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f82194a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f82195b = new a();

        a() {
            super(1, t.class, "<init>", "<init>(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(Throwable th2) {
            return new t(th2);
        }
    }

    public r(Throwable th2) {
        this.f82194a = th2;
    }

    public static /* synthetic */ Throwable c(r rVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = a.f82195b;
        }
        return rVar.b(function1);
    }

    public final Unit a(Function1 wrap) throws Throwable {
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        Throwable thB = b(wrap);
        if (thB == null) {
            return null;
        }
        throw thB;
    }

    public final Throwable b(Function1 wrap) {
        Intrinsics.checkNotNullParameter(wrap, "wrap");
        Object obj = this.f82194a;
        if (obj == null) {
            return null;
        }
        return obj instanceof eg.w ? ((eg.w) obj).d() : obj instanceof CancellationException ? u0.a(((CancellationException) obj).getMessage(), this.f82194a) : (Throwable) wrap.invoke(obj);
    }
}
