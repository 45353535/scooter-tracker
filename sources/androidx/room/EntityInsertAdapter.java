package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H$J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H$¢\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J'\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0014J\u001d\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001aJ'\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0002\u0010\u001bJ-\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a¢\u0006\u0002\u0010\u001dJ/\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0002\u0010\u001eJ-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0012¢\u0006\u0002\u0010!J&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160 2\u0006\u0010\u000e\u001a\u00020\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a¨\u0006\""}, d2 = {"Landroidx/room/EntityInsertAdapter;", "T", "", "<init>", "()V", "createQuery", "", "bind", "", "statement", "Landroidx/sqlite/SQLiteStatement;", "entity", "(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V", "insert", "connection", "Landroidx/sqlite/SQLiteConnection;", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)V", "entities", "", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)V", "", "insertAndReturnId", "", "(Landroidx/sqlite/SQLiteConnection;Ljava/lang/Object;)J", "insertAndReturnIdsArray", "", "", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)[J", "insertAndReturnIdsArrayBox", "(Landroidx/sqlite/SQLiteConnection;Ljava/util/Collection;)[Ljava/lang/Long;", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)[Ljava/lang/Long;", "insertAndReturnIdsList", "", "(Landroidx/sqlite/SQLiteConnection;[Ljava/lang/Object;)Ljava/util/List;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class EntityInsertAdapter<T> {
    protected abstract void bind(@NotNull SQLiteStatement statement, T entity);

    @NotNull
    protected abstract String createQuery();

    public final void insert(@NotNull SQLiteConnection connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, entity);
            sQLiteStatementPrepare.step();
            wf.a.a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public final long insertAndReturnId(@NotNull SQLiteConnection connection, @Nullable T entity) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entity == null) {
            return -1L;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            bind(sQLiteStatementPrepare, entity);
            sQLiteStatementPrepare.step();
            wf.a.a(sQLiteStatementPrepare, null);
            return SQLiteConnectionUtil.getLastInsertedRowId(connection);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final long[] insertAndReturnIdsArray(@NotNull SQLiteConnection connection, @Nullable Collection<? extends T> entities) throws Exception {
        long lastInsertedRowId;
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int size = entities.size();
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objElementAt = CollectionsKt.elementAt(entities, i10);
                if (objElementAt != null) {
                    bind(sQLiteStatementPrepare, objElementAt);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i10] = lastInsertedRowId;
            }
            wf.a.a(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Long[] insertAndReturnIdsArrayBox(@NotNull SQLiteConnection connection, @Nullable Collection<? extends T> entities) throws Exception {
        long lastInsertedRowId;
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i10 = 0; i10 < size; i10++) {
                Object objElementAt = CollectionsKt.elementAt(entities, i10);
                if (objElementAt != null) {
                    bind(sQLiteStatementPrepare, objElementAt);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i10] = Long.valueOf(lastInsertedRowId);
            }
            wf.a.a(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull SQLiteConnection connection, @Nullable T[] entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : entities) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    listCreateListBuilder.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(connection)));
                } else {
                    listCreateListBuilder.add(-1L);
                }
            }
            Unit unit = Unit.f93236a;
            wf.a.a(sQLiteStatementPrepare, null);
            return CollectionsKt.build(listCreateListBuilder);
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void insert(@NotNull SQLiteConnection connection, @Nullable T[] entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            Iterator itA = kotlin.jvm.internal.i.a(entities);
            while (itA.hasNext()) {
                Object next = itA.next();
                if (next != null) {
                    bind(sQLiteStatementPrepare, next);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                }
            }
            Unit unit = Unit.f93236a;
            wf.a.a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    @NotNull
    public final long[] insertAndReturnIdsArray(@NotNull SQLiteConnection connection, @Nullable T[] entities) throws Exception {
        long lastInsertedRowId;
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return new long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int length = entities.length;
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                T t10 = entities[i10];
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                jArr[i10] = lastInsertedRowId;
            }
            wf.a.a(sQLiteStatementPrepare, null);
            return jArr;
        } finally {
        }
    }

    @NotNull
    public final Long[] insertAndReturnIdsArrayBox(@NotNull SQLiteConnection connection, @Nullable T[] entities) throws Exception {
        long lastInsertedRowId;
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return new Long[0];
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i10 = 0; i10 < length; i10++) {
                T t10 = entities[i10];
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    lastInsertedRowId = SQLiteConnectionUtil.getLastInsertedRowId(connection);
                } else {
                    lastInsertedRowId = -1;
                }
                lArr[i10] = Long.valueOf(lastInsertedRowId);
            }
            wf.a.a(sQLiteStatementPrepare, null);
            return lArr;
        } finally {
        }
    }

    public final void insert(@NotNull SQLiteConnection connection, @Nullable Iterable<? extends T> entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : entities) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                }
            }
            Unit unit = Unit.f93236a;
            wf.a.a(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull SQLiteConnection connection, @Nullable Collection<? extends T> entities) throws Exception {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (entities == null) {
            return CollectionsKt.emptyList();
        }
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        SQLiteStatement sQLiteStatementPrepare = connection.prepare(createQuery());
        try {
            for (T t10 : entities) {
                if (t10 != null) {
                    bind(sQLiteStatementPrepare, t10);
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.reset();
                    listCreateListBuilder.add(Long.valueOf(SQLiteConnectionUtil.getLastInsertedRowId(connection)));
                } else {
                    listCreateListBuilder.add(-1L);
                }
            }
            Unit unit = Unit.f93236a;
            wf.a.a(sQLiteStatementPrepare, null);
            return CollectionsKt.build(listCreateListBuilder);
        } finally {
        }
    }
}
