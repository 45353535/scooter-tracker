package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u001b\u0010\t\u001a\u00020\n2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e¢\u0006\u0002\u0010\u000fJ\u0014\u0010\t\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00152\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e¢\u0006\u0002\u0010\u001aJ\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J#\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000e¢\u0006\u0002\u0010\u001cJ!\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/room/EntityUpsertionAdapter;", "T", "", "insertionAdapter", "Landroidx/room/EntityInsertionAdapter;", "updateAdapter", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "<init>", "(Landroidx/room/EntityInsertionAdapter;Landroidx/room/EntityDeletionOrUpdateAdapter;)V", "upsert", "", "entity", "(Ljava/lang/Object;)V", "entities", "", "([Ljava/lang/Object;)V", "", "upsertAndReturnId", "", "(Ljava/lang/Object;)J", "upsertAndReturnIdsArray", "", "([Ljava/lang/Object;)[J", "", "upsertAndReturnIdsList", "", "([Ljava/lang/Object;)Ljava/util/List;", "upsertAndReturnIdsArrayBox", "([Ljava/lang/Object;)[Ljava/lang/Long;", "(Ljava/util/Collection;)[Ljava/lang/Long;", "checkUniquenessException", "ex", "Landroid/database/sqlite/SQLiteConstraintException;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class EntityUpsertionAdapter<T> {

    @NotNull
    private final EntityInsertionAdapter<T> insertionAdapter;

    @NotNull
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(@NotNull EntityInsertionAdapter<T> insertionAdapter, @NotNull EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        Intrinsics.checkNotNullParameter(insertionAdapter, "insertionAdapter");
        Intrinsics.checkNotNullParameter(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException ex) {
        String message = ex.getMessage();
        if (message == null) {
            throw ex;
        }
        if (!StringsKt.e0(message, "unique", true) && !StringsKt.g0(message, "2067", false, 2, null) && !StringsKt.g0(message, "1555", false, 2, null)) {
            throw ex;
        }
    }

    public final void upsert(T entity) {
        try {
            this.insertionAdapter.insert(entity);
        } catch (SQLiteConstraintException e10) {
            checkUniquenessException(e10);
            this.updateAdapter.handle(entity);
        }
    }

    public final long upsertAndReturnId(T entity) {
        try {
            return this.insertionAdapter.insertAndReturnId(entity);
        } catch (SQLiteConstraintException e10) {
            checkUniquenessException(e10);
            this.updateAdapter.handle(entity);
            return -1L;
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull T[] entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(entities[i10]);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(entities[i10]);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull T[] entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(entities[i10]);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(entities[i10]);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    @NotNull
    public final List<Long> upsertAndReturnIdsList(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t10 : entities) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t10)));
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(t10);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final void upsert(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t10 : entities) {
            try {
                this.insertionAdapter.insert(t10);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(t10);
            }
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull Collection<? extends T> entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            jArr[i10] = jInsertAndReturnId;
        }
        return jArr;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull Collection<? extends T> entities) {
        long jInsertAndReturnId;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i10 = 0; i10 < size; i10++) {
            T next = it.next();
            try {
                jInsertAndReturnId = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(next);
                jInsertAndReturnId = -1;
            }
            lArr[i10] = Long.valueOf(jInsertAndReturnId);
        }
        return lArr;
    }

    public final void upsert(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t10 : entities) {
            try {
                this.insertionAdapter.insert(t10);
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(t10);
            }
        }
    }

    @NotNull
    public final List<Long> upsertAndReturnIdsList(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        for (T t10 : entities) {
            try {
                listCreateListBuilder.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t10)));
            } catch (SQLiteConstraintException e10) {
                checkUniquenessException(e10);
                this.updateAdapter.handle(t10);
                listCreateListBuilder.add(-1L);
            }
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
