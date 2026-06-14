package androidx.work.impl.model;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/work/impl/model/DependencyDao_Impl;", "Landroidx/work/impl/model/DependencyDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfDependency", "Landroidx/room/EntityInsertAdapter;", "Landroidx/work/impl/model/Dependency;", "insertDependency", "", "dependency", "hasCompletedAllPrerequisites", "", "id", "", "getPrerequisites", "", "getDependentWorkIds", "hasDependents", com.taurusx.tax.f.y.f66058y, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DependencyDao_Impl implements DependencyDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final RoomDatabase __db;

    @NotNull
    private final EntityInsertAdapter<Dependency> __insertAdapterOfDependency;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/model/DependencyDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public DependencyDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
        this.__insertAdapterOfDependency = new EntityInsertAdapter<Dependency>() { // from class: androidx.work.impl.model.DependencyDao_Impl.1
            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement statement, Dependency entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.mo4253bindText(1, entity.getWorkSpecId());
                statement.mo4253bindText(2, entity.getPrerequisiteId());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getDependentWorkIds$lambda$3(String str, String str2, SQLiteConnection _connection) {
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
    public static final List getPrerequisites$lambda$2(String str, String str2, SQLiteConnection _connection) {
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
    public static final boolean hasCompletedAllPrerequisites$lambda$1(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo4253bindText(1, str2);
            boolean z10 = false;
            if (sQLiteStatementPrepare.step()) {
                z10 = ((int) sQLiteStatementPrepare.getLong(0)) != 0;
            }
            return z10;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasDependents$lambda$4(String str, String str2, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            sQLiteStatementPrepare.mo4253bindText(1, str2);
            boolean z10 = false;
            if (sQLiteStatementPrepare.step()) {
                z10 = ((int) sQLiteStatementPrepare.getLong(0)) != 0;
            }
            return z10;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertDependency$lambda$0(DependencyDao_Impl dependencyDao_Impl, Dependency dependency, SQLiteConnection _connection) throws Exception {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        dependencyDao_Impl.__insertAdapterOfDependency.insert(_connection, dependency);
        return Unit.f93236a;
    }

    @Override // androidx.work.impl.model.DependencyDao
    @NotNull
    public List<String> getDependentWorkIds(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyDao_Impl.getDependentWorkIds$lambda$3(str, id2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.DependencyDao
    @NotNull
    public List<String> getPrerequisites(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT prerequisite_id FROM dependency WHERE work_spec_id=?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyDao_Impl.getPrerequisites$lambda$2(str, id2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasCompletedAllPrerequisites(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        return ((Boolean) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DependencyDao_Impl.hasCompletedAllPrerequisites$lambda$1(str, id2, (SQLiteConnection) obj));
            }
        })).booleanValue();
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasDependents(@NotNull final String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        final String str = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        return ((Boolean) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DependencyDao_Impl.hasDependents$lambda$4(str, id2, (SQLiteConnection) obj));
            }
        })).booleanValue();
    }

    @Override // androidx.work.impl.model.DependencyDao
    public void insertDependency(@NotNull final Dependency dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        DBUtil.performBlocking(this.__db, false, true, new Function1() { // from class: androidx.work.impl.model.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DependencyDao_Impl.insertDependency$lambda$0(this.f5557b, dependency, (SQLiteConnection) obj);
            }
        });
    }
}
