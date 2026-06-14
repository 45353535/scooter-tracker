package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\r\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"I", "O", "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlin/Function1;", "", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityResultCallerKt {
    @NotNull
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(@NotNull ActivityResultCaller activityResultCaller, @NotNull ActivityResultContract<I, O> contract, I i10, @NotNull ActivityResultRegistry registry, @NotNull final Function1<O, Unit> callback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, registry, new ActivityResultCallback() { // from class: androidx.activity.result.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$0(callback, obj);
            }
        }), contract, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$0(Function1 callback, Object obj) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$1(Function1 callback, Object obj) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.invoke(obj);
    }

    @NotNull
    public static final <I, O> ActivityResultLauncher<Unit> registerForActivityResult(@NotNull ActivityResultCaller activityResultCaller, @NotNull ActivityResultContract<I, O> contract, I i10, @NotNull final Function1<O, Unit> callback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "<this>");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultCallerKt.registerForActivityResult$lambda$1(callback, obj);
            }
        }), contract, i10);
    }
}
