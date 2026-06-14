package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.taurusx.tax.y.z.w.s;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Dao
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\bH'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0007\u001a\u00020\bH'J\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "insert", "", "workTag", "Landroidx/work/impl/model/WorkTag;", "deleteByWorkSpecId", "id", "", "getWorkSpecIdsWithTag", "", s.z.f67720z, "getTagsForWorkSpecId", "insertTags", "tags", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface WorkTagDao {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void insertTags(@NotNull WorkTagDao workTagDao, @NotNull String id2, @NotNull Set<String> tags) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            w1.a(workTagDao, id2, tags);
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(@NotNull String id2);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @NotNull
    List<String> getTagsForWorkSpecId(@NotNull String id2);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    @NotNull
    List<String> getWorkSpecIdsWithTag(@NotNull String tag);

    @Insert(onConflict = 5)
    void insert(@NotNull WorkTag workTag);

    void insertTags(@NotNull String id2, @NotNull Set<String> tags);
}
