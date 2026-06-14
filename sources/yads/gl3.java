package yads;

import android.content.Context;
import android.webkit.WebSettings;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class gl3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f111273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f111274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gl3(Context context, Continuation continuation) {
        super(2, continuation);
        this.f111274c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        gl3 gl3Var = new gl3(this.f111274c, continuation);
        gl3Var.f111273b = obj;
        return gl3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gl3 gl3Var = new gl3(this.f111274c, (Continuation) obj2);
        gl3Var.f111273b = (CoroutineScope) obj;
        return gl3Var.invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        pf.b.g();
        kotlin.d.b(obj);
        Context context = this.f111274c;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(WebSettings.getDefaultUserAgent(context.getApplicationContext()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return Result.a(objB);
    }
}
