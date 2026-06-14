package org.bidon.sdk.databinders.session;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0012\u0010\u000e\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0012\u0010\u0010\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0012\u0010\u0012\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lorg/bidon/sdk/databinders/session/SessionTracker;", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "getSessionId", "()Ljava/lang/String;", "launchTs", "", "getLaunchTs", "()J", "launchMonotonicTs", "getLaunchMonotonicTs", "startTs", "getStartTs", "startMonotonicTs", "getStartMonotonicTs", "ts", "getTs", "monotonicTs", "getMonotonicTs", "memoryWarningsTs", "", "getMemoryWarningsTs", "()Ljava/util/List;", "memoryWarningsMonotonicTs", "getMemoryWarningsMonotonicTs", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SessionTracker {
    long getLaunchMonotonicTs();

    long getLaunchTs();

    @NotNull
    List<Long> getMemoryWarningsMonotonicTs();

    @NotNull
    List<Long> getMemoryWarningsTs();

    long getMonotonicTs();

    @NotNull
    String getSessionId();

    long getStartMonotonicTs();

    long getStartTs();

    long getTs();
}
