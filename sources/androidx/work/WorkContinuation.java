package androidx.work;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class WorkContinuation {
    public static WorkContinuation combine(List<WorkContinuation> list) {
        return list.get(0).combineInternal(list);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected abstract WorkContinuation combineInternal(List<WorkContinuation> list);

    public abstract Operation enqueue();

    public abstract ListenableFuture<List<WorkInfo>> getWorkInfos();

    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData();

    public final WorkContinuation then(OneTimeWorkRequest oneTimeWorkRequest) {
        return then(Collections.singletonList(oneTimeWorkRequest));
    }

    public abstract WorkContinuation then(List<OneTimeWorkRequest> list);
}
