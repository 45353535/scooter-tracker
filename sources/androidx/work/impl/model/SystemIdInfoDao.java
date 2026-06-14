package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/SystemIdInfoDao;", "", "insertSystemIdInfo", "", "systemIdInfo", "Landroidx/work/impl/model/SystemIdInfo;", "getSystemIdInfo", "workSpecId", "", "generation", "", "id", "Landroidx/work/impl/model/WorkGenerationalId;", "removeSystemIdInfo", "getWorkSpecIds", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface SystemIdInfoDao {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static SystemIdInfo getSystemIdInfo(@NotNull SystemIdInfoDao systemIdInfoDao, @NotNull WorkGenerationalId id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return n.a(systemIdInfoDao, id2);
        }

        @Deprecated
        public static void removeSystemIdInfo(@NotNull SystemIdInfoDao systemIdInfoDao, @NotNull WorkGenerationalId id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            n.b(systemIdInfoDao, id2);
        }
    }

    @Nullable
    SystemIdInfo getSystemIdInfo(@NotNull WorkGenerationalId id2);

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    @Nullable
    SystemIdInfo getSystemIdInfo(@NotNull String workSpecId, int generation);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    @NotNull
    List<String> getWorkSpecIds();

    @Insert(onConflict = 1)
    void insertSystemIdInfo(@NotNull SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(@NotNull WorkGenerationalId id2);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(@NotNull String workSpecId);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void removeSystemIdInfo(@NotNull String workSpecId, int generation);
}
