package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/work/impl/StartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "<init>", "()V", "runs", "", "Landroidx/work/impl/model/WorkGenerationalId;", "Landroidx/work/impl/StartStopToken;", "tokenFor", "id", "remove", "", "workSpecId", "", "contains", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class StartStopTokensImpl implements StartStopTokens {

    @NotNull
    private final Map<WorkGenerationalId, StartStopToken> runs = new LinkedHashMap();

    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.runs.containsKey(id2);
    }

    @Override // androidx.work.impl.StartStopTokens
    public /* synthetic */ StartStopToken remove(WorkSpec workSpec) {
        return f.a(this, workSpec);
    }

    @Override // androidx.work.impl.StartStopTokens
    public /* synthetic */ StartStopToken tokenFor(WorkSpec workSpec) {
        return f.b(this, workSpec);
    }

    @Override // androidx.work.impl.StartStopTokens
    @Nullable
    public StartStopToken remove(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.runs.remove(id2);
    }

    @Override // androidx.work.impl.StartStopTokens
    @NotNull
    public StartStopToken tokenFor(@NotNull WorkGenerationalId id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Map<WorkGenerationalId, StartStopToken> map = this.runs;
        StartStopToken startStopToken = map.get(id2);
        if (startStopToken == null) {
            startStopToken = new StartStopToken(id2);
            map.put(id2, startStopToken);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    @NotNull
    public List<StartStopToken> remove(@NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Map<WorkGenerationalId, StartStopToken> map = this.runs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<WorkGenerationalId, StartStopToken> entry : map.entrySet()) {
            if (Intrinsics.areEqual(entry.getKey().getWorkSpecId(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.runs.remove((WorkGenerationalId) it.next());
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }
}
