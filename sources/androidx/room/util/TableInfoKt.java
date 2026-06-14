package androidx.room.util;

import androidx.room.util.TableInfo;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import mf.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\bH\u0000\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\bH\u0002\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\tH\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\rH\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\rH\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u000eH\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u000eH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u0011H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u0011H\u0002¨\u0006\u0014"}, d2 = {"equalsCommon", "", "Landroidx/room/util/TableInfo;", "other", "", "hashCodeCommon", "", "toStringCommon", "", "Landroidx/room/util/TableInfo$Column;", "defaultValueEqualsCommon", "current", "containsSurroundingParenthesis", "Landroidx/room/util/TableInfo$ForeignKey;", "Landroidx/room/util/TableInfo$Index;", "formatString", "collection", "", "joinToStringMiddleWithIndent", "joinToStringEndWithIndent", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TableInfoKt {
    private static final boolean containsSurroundingParenthesis(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            int i13 = i12 + 1;
            if (i12 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i11++;
            } else if (cCharAt == ')' && i11 - 1 == 0 && i12 != str.length() - 1) {
                return false;
            }
            i10++;
            i12 = i13;
        }
        return i11 == 0;
    }

    public static final boolean defaultValueEqualsCommon(@NotNull String current, @Nullable String str) {
        Intrinsics.checkNotNullParameter(current, "current");
        if (Intrinsics.areEqual(current, str)) {
            return true;
        }
        if (!containsSurroundingParenthesis(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return Intrinsics.areEqual(StringsKt.v1(strSubstring).toString(), str);
    }

    public static final boolean equalsCommon(@NotNull TableInfo tableInfo, @Nullable Object obj) {
        Set<TableInfo.Index> set;
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        if (tableInfo == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo)) {
            return false;
        }
        TableInfo tableInfo2 = (TableInfo) obj;
        if (!Intrinsics.areEqual(tableInfo.name, tableInfo2.name) || !Intrinsics.areEqual(tableInfo.columns, tableInfo2.columns) || !Intrinsics.areEqual(tableInfo.foreignKeys, tableInfo2.foreignKeys)) {
            return false;
        }
        Set<TableInfo.Index> set2 = tableInfo.indices;
        if (set2 == null || (set = tableInfo2.indices) == null) {
            return true;
        }
        return Intrinsics.areEqual(set2, set);
    }

    @NotNull
    public static final String formatString(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return StringsKt.j(CollectionsKt.joinToString$default(collection, ",\n", IOUtils.LINE_SEPARATOR_UNIX, IOUtils.LINE_SEPARATOR_UNIX, 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int hashCodeCommon(@NotNull TableInfo tableInfo) {
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        return (((tableInfo.name.hashCode() * 31) + tableInfo.columns.hashCode()) * 31) + tableInfo.foreignKeys.hashCode();
    }

    private static final String joinToStringEndWithIndent(Collection<?> collection) {
        return StringsKt.j(CollectionsKt.joinToString$default(collection, StringUtils.COMMA, null, null, 0, null, null, 62, null), null, 1, null) + StringsKt.j(" }", null, 1, null);
    }

    private static final String joinToStringMiddleWithIndent(Collection<?> collection) {
        return StringsKt.j(CollectionsKt.joinToString$default(collection, StringUtils.COMMA, null, null, 0, null, null, 62, null), null, 1, null) + StringsKt.j("},", null, 1, null);
    }

    @NotNull
    public static final String toStringCommon(@NotNull TableInfo tableInfo) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(tableInfo, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |TableInfo {\n            |    name = '");
        sb2.append(tableInfo.name);
        sb2.append("',\n            |    columns = {");
        sb2.append(formatString(CollectionsKt.sortedWith(tableInfo.columns.values(), new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a.d(((TableInfo.Column) t10).name, ((TableInfo.Column) t11).name);
            }
        })));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(formatString(tableInfo.foreignKeys));
        sb2.append("\n            |    indices = {");
        Set<TableInfo.Index> set = tableInfo.indices;
        if (set == null || (listEmptyList = CollectionsKt.sortedWith(set, new Comparator() { // from class: androidx.room.util.TableInfoKt$toStringCommon$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a.d(((TableInfo.Index) t10).name, ((TableInfo.Index) t11).name);
            }
        })) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        sb2.append(formatString(listEmptyList));
        sb2.append("\n            |}\n        ");
        return StringsKt.p(sb2.toString(), null, 1, null);
    }

    public static final int hashCodeCommon(@NotNull TableInfo.Column column) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        return (((((column.name.hashCode() * 31) + column.affinity) * 31) + (column.notNull ? 1231 : 1237)) * 31) + column.primaryKeyPosition;
    }

    public static final boolean equalsCommon(@NotNull TableInfo.Column column, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        if (column == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Column)) {
            return false;
        }
        TableInfo.Column column2 = (TableInfo.Column) obj;
        if (column.isPrimaryKey() != column2.isPrimaryKey() || !Intrinsics.areEqual(column.name, column2.name) || column.notNull != column2.notNull) {
            return false;
        }
        String str = column.defaultValue;
        String str2 = column2.defaultValue;
        if (column.createdFrom == 1 && column2.createdFrom == 2 && str != null && !defaultValueEqualsCommon(str, str2)) {
            return false;
        }
        if (column.createdFrom == 2 && column2.createdFrom == 1 && str2 != null && !defaultValueEqualsCommon(str2, str)) {
            return false;
        }
        int i10 = column.createdFrom;
        return (i10 == 0 || i10 != column2.createdFrom || (str == null ? str2 == null : defaultValueEqualsCommon(str, str2))) && column.affinity == column2.affinity;
    }

    public static final int hashCodeCommon(@NotNull TableInfo.ForeignKey foreignKey) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        return (((((((foreignKey.referenceTable.hashCode() * 31) + foreignKey.onDelete.hashCode()) * 31) + foreignKey.onUpdate.hashCode()) * 31) + foreignKey.columnNames.hashCode()) * 31) + foreignKey.referenceColumnNames.hashCode();
    }

    public static final int hashCodeCommon(@NotNull TableInfo.Index index) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        return ((((((StringsKt.a0(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null) ? -1184239155 : index.name.hashCode()) * 31) + (index.unique ? 1 : 0)) * 31) + index.columns.hashCode()) * 31) + index.orders.hashCode();
    }

    public static final boolean equalsCommon(@NotNull TableInfo.ForeignKey foreignKey, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        if (foreignKey == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.ForeignKey)) {
            return false;
        }
        TableInfo.ForeignKey foreignKey2 = (TableInfo.ForeignKey) obj;
        if (Intrinsics.areEqual(foreignKey.referenceTable, foreignKey2.referenceTable) && Intrinsics.areEqual(foreignKey.onDelete, foreignKey2.onDelete) && Intrinsics.areEqual(foreignKey.onUpdate, foreignKey2.onUpdate) && Intrinsics.areEqual(foreignKey.columnNames, foreignKey2.columnNames)) {
            return Intrinsics.areEqual(foreignKey.referenceColumnNames, foreignKey2.referenceColumnNames);
        }
        return false;
    }

    @NotNull
    public static final String toStringCommon(@NotNull TableInfo.Column column) {
        Intrinsics.checkNotNullParameter(column, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Column {\n            |   name = '");
        sb2.append(column.name);
        sb2.append("',\n            |   type = '");
        sb2.append(column.type);
        sb2.append("',\n            |   affinity = '");
        sb2.append(column.affinity);
        sb2.append("',\n            |   notNull = '");
        sb2.append(column.notNull);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(column.primaryKeyPosition);
        sb2.append("',\n            |   defaultValue = '");
        String str = column.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return StringsKt.j(StringsKt.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final boolean equalsCommon(@NotNull TableInfo.Index index, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        if (index == obj) {
            return true;
        }
        if (!(obj instanceof TableInfo.Index)) {
            return false;
        }
        TableInfo.Index index2 = (TableInfo.Index) obj;
        if (index.unique != index2.unique || !Intrinsics.areEqual(index.columns, index2.columns) || !Intrinsics.areEqual(index.orders, index2.orders)) {
            return false;
        }
        if (StringsKt.a0(index.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null)) {
            return StringsKt.a0(index2.name, TableInfo.Index.DEFAULT_PREFIX, false, 2, null);
        }
        return Intrinsics.areEqual(index.name, index2.name);
    }

    @NotNull
    public static final String toStringCommon(@NotNull TableInfo.ForeignKey foreignKey) {
        Intrinsics.checkNotNullParameter(foreignKey, "<this>");
        return StringsKt.j(StringsKt.p("\n            |ForeignKey {\n            |   referenceTable = '" + foreignKey.referenceTable + "',\n            |   onDelete = '" + foreignKey.onDelete + "',\n            |   onUpdate = '" + foreignKey.onUpdate + "',\n            |   columnNames = {" + joinToStringMiddleWithIndent(CollectionsKt.sorted(foreignKey.columnNames)) + "\n            |   referenceColumnNames = {" + joinToStringEndWithIndent(CollectionsKt.sorted(foreignKey.referenceColumnNames)) + "\n            |}\n        ", null, 1, null), null, 1, null);
    }

    @NotNull
    public static final String toStringCommon(@NotNull TableInfo.Index index) {
        Intrinsics.checkNotNullParameter(index, "<this>");
        return StringsKt.j(StringsKt.p("\n            |Index {\n            |   name = '" + index.name + "',\n            |   unique = '" + index.unique + "',\n            |   columns = {" + joinToStringMiddleWithIndent(index.columns) + "\n            |   orders = {" + joinToStringEndWithIndent(index.orders) + "\n            |}\n        ", null, 1, null), null, 1, null);
    }
}
