package androidx.work.impl.model;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.taurusx.tax.y.z.w.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/model/WorkTagDao_Impl;", "Landroidx/work/impl/model/WorkTagDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfWorkTag", "Landroidx/room/EntityInsertAdapter;", "Landroidx/work/impl/model/WorkTag;", "insert", "", "workTag", "getWorkSpecIdsWithTag", "", "", s.z.f67720z, "getTagsForWorkSpecId", "id", "deleteByWorkSpecId", com.taurusx.tax.f.y.f66058y, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkTagDao_Impl implements WorkTagDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final RoomDatabase __db;

    @NotNull
    private final EntityInsertAdapter<WorkTag> __insertAdapterOfWorkTag;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/model/WorkTagDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }

        private Companion() {
        }
    }

    public WorkTagDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfWorkTag = new EntityInsertAdapter<WorkTag>() { // from class: androidx.work.impl.model.WorkTagDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, WorkTag entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo4253bindText(1, entity.getTag());
                statement.mo4253bindText(2, entity.getWorkSpecId());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deleteByWorkSpecId$lambda$3(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo4253bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return Unit.f93236a;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getTagsForWorkSpecId$lambda$2(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo4253bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkSpecIdsWithTag$lambda$1(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo4253bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insert$lambda$0(WorkTagDao_Impl workTagDao_Impl, WorkTag workTag, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        workTagDao_Impl.__insertAdapterOfWorkTag.insert(_connection, workTag);
        return Unit.f93236a;
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public void deleteByWorkSpecId(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "DELETE FROM worktag WHERE work_spec_id=?";
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.x1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WorkTagDao_Impl.deleteByWorkSpecId$lambda$3(str, id2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkTagDao
    @NotNull
    public List<String> getTagsForWorkSpecId(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.y1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WorkTagDao_Impl.getTagsForWorkSpecId$lambda$2(str, id2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkTagDao
    @NotNull
    public List<String> getWorkSpecIdsWithTag(@NotNull final String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        final String str = "SELECT work_spec_id FROM worktag WHERE tag=?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.a2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WorkTagDao_Impl.getWorkSpecIdsWithTag$lambda$1(str, tag, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public void insert(@NotNull final WorkTag workTag) {
        Intrinsics.checkNotNullParameter(workTag, "workTag");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.z1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WorkTagDao_Impl.insert$lambda$0(this.f5712b, workTag, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkTagDao
    public /* synthetic */ void insertTags(String str, Set set) {
        w1.a(this, str, set);
    }
}
