package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/work/impl/model/Dependency;", "", "workSpecId", "", "prerequisiteId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWorkSpecId", "()Ljava/lang/String;", "getPrerequisiteId", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class Dependency {

    @ColumnInfo(name = "prerequisite_id")
    @NotNull
    private final String prerequisiteId;

    @ColumnInfo(name = "work_spec_id")
    @NotNull
    private final String workSpecId;

    public Dependency(@NotNull String workSpecId, @NotNull String prerequisiteId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(prerequisiteId, "prerequisiteId");
        this.workSpecId = workSpecId;
        this.prerequisiteId = prerequisiteId;
    }

    @NotNull
    public final String getPrerequisiteId() {
        return this.prerequisiteId;
    }

    @NotNull
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
