package androidx.work.impl.utils;

import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"toRawQuery", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroidx/work/WorkQuery;", "bindings", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "count", "", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RawQueries {
    private static final void bindings(StringBuilder sb2, int i10) {
        if (i10 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add("?");
        }
        sb2.append(CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null));
    }

    @NotNull
    public static final SupportSQLiteQuery toRawQuery(@NotNull WorkQuery workQuery) {
        Intrinsics.checkNotNullParameter(workQuery, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        String str = " AND";
        String str2 = " WHERE";
        if (!workQuery.getStates().isEmpty()) {
            List<WorkInfo.State> states = workQuery.getStates();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(states, 10));
            Iterator<T> it = states.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(WorkTypeConverters.stateToInt((WorkInfo.State) it.next())));
            }
            sb2.append(" WHERE state IN (");
            bindings(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        if (!workQuery.getIds().isEmpty()) {
            List<UUID> ids = workQuery.getIds();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(ids, 10));
            Iterator<T> it2 = ids.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb2.append(str2 + " id IN (");
            bindings(sb2, workQuery.getIds().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        if (workQuery.getTags().isEmpty()) {
            str = str2;
        } else {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            bindings(sb2, workQuery.getTags().size());
            sb2.append("))");
            arrayList.addAll(workQuery.getTags());
        }
        if (!workQuery.getUniqueWorkNames().isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            bindings(sb2, workQuery.getUniqueWorkNames().size());
            sb2.append("))");
            arrayList.addAll(workQuery.getUniqueWorkNames());
        }
        sb2.append(";");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new SimpleSQLiteQuery(string, arrayList.toArray(new Object[0]));
    }
}
