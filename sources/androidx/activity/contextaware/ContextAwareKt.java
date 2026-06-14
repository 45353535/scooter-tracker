package androidx.activity.contextaware;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.z;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R", "Landroidx/activity/contextaware/ContextAware;", "Lkotlin/Function1;", "Landroid/content/Context;", "onContextAvailable", "withContextAvailable", "(Landroidx/activity/contextaware/ContextAware;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContextAwareKt {
    @Nullable
    public static final <R> Object withContextAvailable(@NotNull ContextAware contextAware, @NotNull Function1<Context, R> function1, @NotNull Continuation continuation) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        e eVar = new e(b.d(continuation), 1);
        eVar.I();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(eVar, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        eVar.v(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objC = eVar.C();
        if (objC == b.g()) {
            g.c(continuation);
        }
        return objC;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, Function1<Context, R> function1, Continuation continuation) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return function1.invoke(contextPeekAvailableContext);
        }
        z.c(0);
        e eVar = new e(b.d(continuation), 1);
        eVar.I();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(eVar, function1);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        eVar.v(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Unit unit = Unit.f93236a;
        Object objC = eVar.C();
        if (objC == b.g()) {
            g.c(continuation);
        }
        z.c(1);
        return objC;
    }
}
