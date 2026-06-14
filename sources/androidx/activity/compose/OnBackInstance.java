package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import com.appsflyer.AppsFlyerProperties;
import com.my.target.common.menu.MenuActionType;
import eg.i;
import gg.g;
import gg.j;
import gg.y;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012(\u0010\u000b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000e\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0014\"\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/activity/compose/OnBackInstance;", "", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "isPredictiveBack", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Lkotlin/coroutines/Continuation;", "", "onBack", "<init>", "(Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;)V", "backEvent", "Lgg/k;", "send-JP2dKIU", "(Landroidx/activity/BackEventCompat;)Ljava/lang/Object;", "send", "close", "()Z", MenuActionType.CANCEL, "()V", "Z", "setPredictiveBack", "(Z)V", "Lgg/g;", AppsFlyerProperties.CHANNEL, "Lgg/g;", "getChannel", "()Lgg/g;", "Lkotlinx/coroutines/Job;", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OnBackInstance {

    @NotNull
    private final g channel = j.b(-2, gg.a.f72765b, null, 4, null);
    private boolean isPredictiveBack;

    @NotNull
    private final Job job;

    public OnBackInstance(@NotNull CoroutineScope coroutineScope, boolean z10, @NotNull Function2<? super Flow, ? super Continuation, ? extends Object> function2) {
        this.isPredictiveBack = z10;
        this.job = i.d(coroutineScope, null, null, new OnBackInstance$job$1(function2, this, null), 3, null);
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        Job.a.a(this.job, null, 1, null);
    }

    public final boolean close() {
        return y.a.a(this.channel, null, 1, null);
    }

    @NotNull
    public final g getChannel() {
        return this.channel;
    }

    @NotNull
    public final Job getJob() {
        return this.job;
    }

    /* JADX INFO: renamed from: isPredictiveBack, reason: from getter */
    public final boolean getIsPredictiveBack() {
        return this.isPredictiveBack;
    }

    @NotNull
    /* JADX INFO: renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m0sendJP2dKIU(@NotNull BackEventCompat backEvent) {
        return this.channel.e(backEvent);
    }

    public final void setPredictiveBack(boolean z10) {
        this.isPredictiveBack = z10;
    }
}
