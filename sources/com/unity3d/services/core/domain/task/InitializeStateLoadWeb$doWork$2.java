package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, 64, 71}, m = "invokeSuspend")
final class InitializeStateLoadWeb$doWork$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, Continuation continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, continuation);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x017d, code lost:
    
        if (r0 == r8) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0161 A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #5 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:50:0x0180, B:54:0x01a3, B:56:0x01ad, B:59:0x01b8, B:60:0x01ca, B:62:0x01cd, B:63:0x01d9, B:45:0x015b, B:47:0x0161, B:51:0x0183, B:52:0x0195, B:44:0x0151, B:37:0x0123, B:53:0x0196, B:36:0x0119, B:27:0x0075, B:17:0x003d, B:42:0x0148, B:39:0x0129), top: B:79:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0183 A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #5 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:50:0x0180, B:54:0x01a3, B:56:0x01ad, B:59:0x01b8, B:60:0x01ca, B:62:0x01cd, B:63:0x01d9, B:45:0x015b, B:47:0x0161, B:51:0x0183, B:52:0x0195, B:44:0x0151, B:37:0x0123, B:53:0x0196, B:36:0x0119, B:27:0x0075, B:17:0x003d, B:42:0x0148, B:39:0x0129), top: B:79:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cd A[Catch: all -> 0x0020, CancellationException -> 0x0023, TryCatch #5 {CancellationException -> 0x0023, all -> 0x0020, blocks: (B:8:0x0018, B:50:0x0180, B:54:0x01a3, B:56:0x01ad, B:59:0x01b8, B:60:0x01ca, B:62:0x01cd, B:63:0x01d9, B:45:0x015b, B:47:0x0161, B:51:0x0183, B:52:0x0195, B:44:0x0151, B:37:0x0123, B:53:0x0196, B:36:0x0119, B:27:0x0075, B:17:0x003d, B:42:0x0148, B:39:0x0129), top: B:79:0x000c, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.unity3d.services.core.network.model.HttpRequest] */
    @Override // kotlin.coroutines.jvm.internal.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((InitializeStateLoadWeb$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
