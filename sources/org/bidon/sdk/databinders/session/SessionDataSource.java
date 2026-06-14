package org.bidon.sdk.databinders.session;

import java.util.List;
import kotlin.Metadata;
import org.bidon.sdk.databinders.DataSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lorg/bidon/sdk/databinders/session/SessionDataSource;", "Lorg/bidon/sdk/databinders/DataSource;", "getId", "", "getLaunchTs", "", "getLaunchMonotonicTs", "getStartTs", "getMonotonicStartTs", "getTs", "getMonotonicTs", "getMemoryWarningsTs", "", "getMemoryWarningsMonotonicTs", "getRamUsed", "getRamSize", "getStorageFree", "getStorageUsed", "getBattery", "", "getCpuUsage", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SessionDataSource extends DataSource {
    float getBattery();

    float getCpuUsage();

    @NotNull
    String getId();

    long getLaunchMonotonicTs();

    long getLaunchTs();

    @NotNull
    List<Long> getMemoryWarningsMonotonicTs();

    @NotNull
    List<Long> getMemoryWarningsTs();

    long getMonotonicStartTs();

    long getMonotonicTs();

    long getRamSize();

    long getRamUsed();

    long getStartTs();

    long getStorageFree();

    long getStorageUsed();

    long getTs();
}
