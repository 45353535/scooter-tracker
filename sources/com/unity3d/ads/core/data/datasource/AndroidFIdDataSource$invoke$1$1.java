package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1", f = "AndroidFIdDataSource.kt", l = {19}, m = "invokeSuspend")
final class AndroidFIdDataSource$invoke$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Task<String> $task;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidFIdDataSource$invoke$1$1(Task<String> task, Continuation continuation) {
        super(2, continuation);
        this.$task = task;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new AndroidFIdDataSource$invoke$1$1(this.$task, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return obj;
        }
        d.b(obj);
        Task<String> task = this.$task;
        this.L$0 = task;
        this.label = 1;
        final of.e eVar = new of.e(pf.b.d(this));
        final Function1<String, Unit> function1 = new Function1<String, Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable String str) {
                eVar.resumeWith(Result.b(str));
            }
        };
        task.addOnSuccessListener(new OnSuccessListener(function1) { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$sam$com_google_android_gms_tasks_OnSuccessListener$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj2) {
                this.function.invoke(obj2);
            }
        });
        task.addOnFailureListener(new OnFailureListener() { // from class: com.unity3d.ads.core.data.datasource.AndroidFIdDataSource$invoke$1$1$1$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(@NotNull Exception it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Continuation continuation = eVar;
                Result.Companion companion = Result.f93230c;
                continuation.resumeWith(Result.b(d.a(it)));
            }
        });
        Object objB = eVar.b();
        if (objB == pf.b.g()) {
            g.c(this);
        }
        return objB == objG ? objG : objB;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((AndroidFIdDataSource$invoke$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
