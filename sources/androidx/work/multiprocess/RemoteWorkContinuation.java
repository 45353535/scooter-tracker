package androidx.work.multiprocess;

import androidx.annotation.RestrictTo;
import androidx.work.OneTimeWorkRequest;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class RemoteWorkContinuation {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected RemoteWorkContinuation() {
    }

    public static RemoteWorkContinuation combine(List<RemoteWorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract RemoteWorkContinuation combineInternal(List<RemoteWorkContinuation> list);

    public abstract ListenableFuture<Void> enqueue();

    public final RemoteWorkContinuation then(OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract RemoteWorkContinuation then(List<OneTimeWorkRequest> list);
}
