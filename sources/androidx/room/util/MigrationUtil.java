package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0000\u001a:\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b*\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, d2 = {"isMigrationRequired", "", "Landroidx/room/DatabaseConfiguration;", "fromVersion", "", "toVersion", "contains", "Landroidx/room/RoomDatabase$MigrationContainer;", "startVersion", "endVersion", "findMigrationPath", "", "Landroidx/room/migration/Migration;", "start", "end", "findUpMigrationPath", "result", "", "upgrade", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MigrationUtil {
    public static final boolean contains(@NotNull RoomDatabase.MigrationContainer migrationContainer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        Map<Integer, Map<Integer, Migration>> migrations = migrationContainer.getMigrations();
        if (!migrations.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        Map<Integer, Migration> mapEmptyMap = migrations.get(Integer.valueOf(i10));
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        return mapEmptyMap.containsKey(Integer.valueOf(i11));
    }

    @Nullable
    public static final List<Migration> findMigrationPath(@NotNull RoomDatabase.MigrationContainer migrationContainer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(migrationContainer, "<this>");
        if (i10 == i11) {
            return CollectionsKt.emptyList();
        }
        return findUpMigrationPath(migrationContainer, new ArrayList(), i11 > i10, i10, i11);
    }

    private static final List<Migration> findUpMigrationPath(RoomDatabase.MigrationContainer migrationContainer, List<Migration> list, boolean z10, int i10, int i11) {
        int iIntValue;
        boolean z11;
        while (true) {
            if (z10) {
                if (i10 >= i11) {
                    return list;
                }
            } else if (i10 <= i11) {
                return list;
            }
            Pair<Map<Integer, Migration>, Iterable<Integer>> sortedDescendingNodes$room_runtime = z10 ? migrationContainer.getSortedDescendingNodes$room_runtime(i10) : migrationContainer.getSortedNodes$room_runtime(i10);
            if (sortedDescendingNodes$room_runtime == null) {
                return null;
            }
            Map<Integer, Migration> mapComponent1 = sortedDescendingNodes$room_runtime.component1();
            Iterator<Integer> it = sortedDescendingNodes$room_runtime.component2().iterator();
            while (it.hasNext()) {
                iIntValue = it.next().intValue();
                if (!z10) {
                    if (i11 <= iIntValue && iIntValue < i10) {
                        Migration migration = mapComponent1.get(Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNull(migration);
                        list.add(migration);
                        z11 = true;
                        break;
                    }
                } else if (i10 + 1 <= iIntValue && iIntValue <= i11) {
                    Migration migration2 = mapComponent1.get(Integer.valueOf(iIntValue));
                    Intrinsics.checkNotNull(migration2);
                    list.add(migration2);
                    z11 = true;
                    break;
                }
            }
            iIntValue = i10;
            z11 = false;
            if (!z11) {
                return null;
            }
            i10 = iIntValue;
        }
    }

    public static final boolean isMigrationRequired(@NotNull DatabaseConfiguration databaseConfiguration, int i10, int i11) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "<this>");
        if (i10 > i11 && databaseConfiguration.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> migrationNotRequiredFrom$room_runtime = databaseConfiguration.getMigrationNotRequiredFrom$room_runtime();
        return databaseConfiguration.requireMigration && (migrationNotRequiredFrom$room_runtime == null || !migrationNotRequiredFrom$room_runtime.contains(Integer.valueOf(i10)));
    }
}
