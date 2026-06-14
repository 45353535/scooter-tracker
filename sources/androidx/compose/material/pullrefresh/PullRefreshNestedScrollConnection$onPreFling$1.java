package androidx.compose.material.pullrefresh;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {117}, m = "onPreFling-QWom1Mo")
final class PullRefreshNestedScrollConnection$onPreFling$1 extends d {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullRefreshNestedScrollConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, Continuation continuation) {
        super(continuation);
        this.this$0 = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo316onPreFlingQWom1Mo(0L, this);
    }
}
