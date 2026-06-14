package androidx.sqlite.driver;

import android.database.Cursor;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteProgram;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import j.c;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.g;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00132\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "sql", "", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "getDb", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "getSql", "()Ljava/lang/String;", "isClosed", "", "()Z", "setClosed", "(Z)V", "throwIfClosed", "", y.f66058y, "TransactionSQLiteStatement", "JournalModeSetStatement", "RowSQLiteStatement", "OtherSQLiteStatement", "Landroidx/sqlite/driver/SupportSQLiteStatement$JournalModeSetStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$OtherSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement$TransactionSQLiteStatement;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class SupportSQLiteStatement implements SQLiteStatement {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final SupportSQLiteDatabase db;
    private boolean isClosed;

    @NotNull
    private final String sql;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\tH\u0002J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0002¨\u0006\u0018"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion;", "", "<init>", "()V", "create", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "sql", "", "getTransactionOperation", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "prefix", "getSpecialOperation", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation;", "isRowStatement", "", "getStatementPrefix", "getStatementPrefix$sqlite_framework", "getStatementPrefixIndex", "", "s", "TransactionOperation", "SpecialOperation", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation;", "", "<init>", "()V", "JournalModeOperation", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation$JournalModeOperation;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static abstract class SpecialOperation {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation$JournalModeOperation;", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$SpecialOperation;", "<init>", "()V", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class JournalModeOperation extends SpecialOperation {

                @NotNull
                public static final JournalModeOperation INSTANCE = new JournalModeOperation();

                private JournalModeOperation() {
                    super(null);
                }
            }

            public /* synthetic */ SpecialOperation(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private SpecialOperation() {
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "", "<init>", "(Ljava/lang/String;I)V", "END", "ROLLBACK", "BEGIN_EXCLUSIVE", "BEGIN_IMMEDIATE", "BEGIN_DEFERRED", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class TransactionOperation {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TransactionOperation[] $VALUES;
            public static final TransactionOperation END = new TransactionOperation("END", 0);
            public static final TransactionOperation ROLLBACK = new TransactionOperation("ROLLBACK", 1);
            public static final TransactionOperation BEGIN_EXCLUSIVE = new TransactionOperation("BEGIN_EXCLUSIVE", 2);
            public static final TransactionOperation BEGIN_IMMEDIATE = new TransactionOperation("BEGIN_IMMEDIATE", 3);
            public static final TransactionOperation BEGIN_DEFERRED = new TransactionOperation("BEGIN_DEFERRED", 4);

            private static final /* synthetic */ TransactionOperation[] $values() {
                return new TransactionOperation[]{END, ROLLBACK, BEGIN_EXCLUSIVE, BEGIN_IMMEDIATE, BEGIN_DEFERRED};
            }

            static {
                TransactionOperation[] transactionOperationArr$values = $values();
                $VALUES = transactionOperationArr$values;
                $ENTRIES = a.a(transactionOperationArr$values);
            }

            private TransactionOperation(String str, int i10) {
            }

            @NotNull
            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static TransactionOperation valueOf(String str) {
                return (TransactionOperation) Enum.valueOf(TransactionOperation.class, str);
            }

            public static TransactionOperation[] values() {
                return (TransactionOperation[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SpecialOperation getSpecialOperation(String prefix, String sql) {
            if (Intrinsics.areEqual(prefix, "PRA")) {
                String lowerCase = sql.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.g0(StringsKt.f1(lowerCase, "journal_mode", ""), C4240b4.j.f42668b, false, 2, null)) {
                    return SpecialOperation.JournalModeOperation.INSTANCE;
                }
            }
            return null;
        }

        private final int getStatementPrefixIndex(String s10) {
            String str;
            int i10;
            int length = s10.length() - 2;
            if (length < 0) {
                return -1;
            }
            int i11 = 0;
            while (i11 < length) {
                char cCharAt = s10.charAt(i11);
                if (Intrinsics.compare((int) cCharAt, 32) <= 0) {
                    i11++;
                } else {
                    if (cCharAt != '-') {
                        str = s10;
                        if (cCharAt == '/') {
                            int iU0 = i11 + 1;
                            if (str.charAt(iU0) == '*') {
                                do {
                                    String str2 = str;
                                    iU0 = StringsKt.u0(str2, '*', iU0 + 1, false, 4, null);
                                    str = str2;
                                    if (iU0 >= 0) {
                                        i10 = iU0 + 1;
                                        if (i10 >= length) {
                                            break;
                                        }
                                    } else {
                                        return -1;
                                    }
                                } while (str.charAt(i10) != '/');
                                i11 = iU0 + 2;
                                s10 = str;
                            }
                        }
                        return i11;
                    }
                    if (s10.charAt(i11 + 1) != '-') {
                        return i11;
                    }
                    str = s10;
                    int iU02 = StringsKt.u0(str, '\n', i11 + 2, false, 4, null);
                    if (iU02 < 0) {
                        return -1;
                    }
                    i11 = iU02 + 1;
                    s10 = str;
                }
            }
            return -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            if (r5.equals("END") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:
        
            if (r5.equals("COM") == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            return androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.END;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation getTransactionOperation(java.lang.String r5, java.lang.String r6) {
            /*
                r4 = this;
                int r0 = r5.hashCode()
                r1 = 2
                r2 = 0
                r3 = 0
                switch(r0) {
                    case 65636: goto L35;
                    case 66913: goto L29;
                    case 68795: goto L20;
                    case 81327: goto Lb;
                    default: goto La;
                }
            La:
                goto L3d
            Lb:
                java.lang.String r0 = "ROL"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L14
                goto L3d
            L14:
                java.lang.String r5 = " TO "
                boolean r5 = kotlin.text.StringsKt.g0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L1d
                return r3
            L1d:
                androidx.sqlite.driver.SupportSQLiteStatement$Companion$TransactionOperation r5 = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.ROLLBACK
                return r5
            L20:
                java.lang.String r6 = "END"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L32
                goto L3d
            L29:
                java.lang.String r6 = "COM"
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L32
                goto L3d
            L32:
                androidx.sqlite.driver.SupportSQLiteStatement$Companion$TransactionOperation r5 = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.END
                return r5
            L35:
                java.lang.String r0 = "BEG"
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L3e
            L3d:
                return r3
            L3e:
                java.lang.String r5 = "EXCLUSIVE"
                boolean r5 = kotlin.text.StringsKt.g0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L49
                androidx.sqlite.driver.SupportSQLiteStatement$Companion$TransactionOperation r5 = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.BEGIN_EXCLUSIVE
                return r5
            L49:
                java.lang.String r5 = "IMMEDIATE"
                boolean r5 = kotlin.text.StringsKt.g0(r6, r5, r2, r1, r3)
                if (r5 == 0) goto L54
                androidx.sqlite.driver.SupportSQLiteStatement$Companion$TransactionOperation r5 = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.BEGIN_IMMEDIATE
                return r5
            L54:
                androidx.sqlite.driver.SupportSQLiteStatement$Companion$TransactionOperation r5 = androidx.sqlite.driver.SupportSQLiteStatement.Companion.TransactionOperation.BEGIN_DEFERRED
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.driver.SupportSQLiteStatement.Companion.getTransactionOperation(java.lang.String, java.lang.String):androidx.sqlite.driver.SupportSQLiteStatement$Companion$TransactionOperation");
        }

        private final boolean isRowStatement(String prefix) {
            int iHashCode = prefix.hashCode();
            return iHashCode != 79487 ? iHashCode != 81978 ? iHashCode == 85954 && prefix.equals("WIT") : prefix.equals("SEL") : prefix.equals("PRA");
        }

        @NotNull
        public final SupportSQLiteStatement create(@NotNull SupportSQLiteDatabase db2, @NotNull String sql) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            String upperCase = StringsKt.v1(sql).toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String statementPrefix$sqlite_framework = getStatementPrefix$sqlite_framework(upperCase);
            if (statementPrefix$sqlite_framework == null) {
                return new OtherSQLiteStatement(db2, sql);
            }
            TransactionOperation transactionOperation = getTransactionOperation(statementPrefix$sqlite_framework, upperCase);
            return transactionOperation != null ? new TransactionSQLiteStatement(db2, sql, transactionOperation) : getSpecialOperation(statementPrefix$sqlite_framework, upperCase) instanceof SpecialOperation.JournalModeOperation ? new JournalModeSetStatement(db2, sql, new RowSQLiteStatement(db2, sql)) : isRowStatement(statementPrefix$sqlite_framework) ? new RowSQLiteStatement(db2, sql) : new OtherSQLiteStatement(db2, sql);
        }

        @VisibleForTesting
        @Nullable
        public final String getStatementPrefix$sqlite_framework(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            int statementPrefixIndex = getStatementPrefixIndex(sql);
            if (statementPrefixIndex < 0 || statementPrefixIndex > sql.length()) {
                return null;
            }
            String strSubstring = sql.substring(statementPrefixIndex, Math.min(statementPrefixIndex + 3, sql.length()));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001b\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096\u0001J\u001b\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0096\u0001J\u001b\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0014H\u0096\u0001J\u001b\u0010\u0015\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0016H\u0096\u0001J\u001b\u0010\u0017\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0001J\u001b\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0019H\u0096\u0001J\u0013\u0010\u001a\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u001b\u0010\u001b\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0096\u0001J\t\u0010\u001c\u001a\u00020\rH\u0096\u0001J\t\u0010\u001d\u001a\u00020\rH\u0096\u0001J\u0013\u0010\u001e\u001a\u00020\u00112\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\t\u0010 \u001a\u00020\u000fH\u0096\u0001J\u0013\u0010!\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060#H\u0096\u0001J\u0013\u0010$\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0013\u0010%\u001a\u00020\u00142\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0013\u0010&\u001a\u00020\u00162\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0013\u0010(\u001a\u00020\u00192\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0013\u0010)\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\u0013\u0010*\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0096\u0001J\t\u0010+\u001a\u00020\rH\u0096\u0001R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$JournalModeSetStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "Landroidx/sqlite/SQLiteStatement;", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "sql", "", "delegate", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;Landroidx/sqlite/driver/SupportSQLiteStatement;)V", "step", "", "bindBlob", "", FirebaseAnalytics.Param.INDEX, "", "value", "", "bindBoolean", "bindDouble", "", "bindFloat", "", "bindInt", "bindLong", "", "bindNull", "bindText", "clearBindings", "close", "getBlob", "getBoolean", "getColumnCount", "getColumnName", "getColumnNames", "", "getColumnType", "getDouble", "getFloat", "getInt", "getLong", "getText", "isNull", "reset", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class JournalModeSetStatement extends SupportSQLiteStatement implements SQLiteStatement, AutoCloseable {

        @NotNull
        private final SupportSQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JournalModeSetStatement(@NotNull SupportSQLiteDatabase db2, @NotNull String sql, @NotNull SupportSQLiteStatement delegate) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public void mo4249bindBlob(@IntRange(from = 1) int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.mo4249bindBlob(index, value);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public void bindBoolean(@IntRange(from = 1) int index, boolean value) {
            this.delegate.bindBoolean(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public void mo4250bindDouble(@IntRange(from = 1) int index, double value) {
            this.delegate.mo4250bindDouble(index, value);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public void bindFloat(@IntRange(from = 1) int index, float value) {
            this.delegate.bindFloat(index, value);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public void bindInt(@IntRange(from = 1) int index, int value) {
            this.delegate.bindInt(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public void mo4251bindLong(@IntRange(from = 1) int index, long value) {
            this.delegate.mo4251bindLong(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public void mo4252bindNull(@IntRange(from = 1) int index) {
            this.delegate.mo4252bindNull(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public void mo4253bindText(@IntRange(from = 1) int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.mo4253bindText(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public void mo4254clearBindings() {
            this.delegate.mo4254clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public byte[] getBlob(@IntRange(from = 0) int index) {
            return this.delegate.getBlob(index);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public boolean getBoolean(@IntRange(from = 0) int index) {
            return this.delegate.getBoolean(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getColumnName(@IntRange(from = 0) int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        @NotNull
        public List<String> getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(@IntRange(from = 0) int index) {
            return this.delegate.getColumnType(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(@IntRange(from = 0) int index) {
            return this.delegate.getDouble(index);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public float getFloat(@IntRange(from = 0) int index) {
            return this.delegate.getFloat(index);
        }

        @Override // androidx.sqlite.driver.SupportSQLiteStatement, androidx.sqlite.SQLiteStatement
        public int getInt(@IntRange(from = 0) int index) {
            return this.delegate.getInt(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(@IntRange(from = 0) int index) {
            return this.delegate.getLong(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getText(@IntRange(from = 0) int index) {
            return this.delegate.getText(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(@IntRange(from = 0) int index) {
            return this.delegate.isNull(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            this.delegate.reset();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            boolean zStep = this.delegate.step();
            if (StringsKt.N(getText(0), "wal", true)) {
                getDb().enableWriteAheadLogging();
                return zStep;
            }
            getDb().disableWriteAheadLogging();
            return zStep;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010 \u001a\u00020\u001cH\u0016J\b\u0010!\u001a\u00020\fH\u0016J\b\u0010\"\u001a\u00020\fH\u0016J\b\u0010#\u001a\u00020\fH\u0016R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$OtherSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "sql", "", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "delegate", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Landroidx/sqlite/driver/SupportStatement;", "bindBlob", "", FirebaseAnalytics.Param.INDEX, "", "value", "", "bindDouble", "", "bindLong", "", "bindText", "bindNull", "getBlob", "getDouble", "getLong", "getText", "isNull", "", "getColumnCount", "getColumnName", "getColumnType", "step", "reset", "clearBindings", "close", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class OtherSQLiteStatement extends SupportSQLiteStatement {

        @NotNull
        private final androidx.sqlite.db.SupportSQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherSQLiteStatement(@NotNull SupportSQLiteDatabase db2, @NotNull String sql) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.delegate = db2.compileStatement(sql);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public void mo4249bindBlob(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throwIfClosed();
            this.delegate.bindBlob(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public void mo4250bindDouble(int index, double value) {
            throwIfClosed();
            this.delegate.bindDouble(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public void mo4251bindLong(int index, long value) {
            throwIfClosed();
            this.delegate.bindLong(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public void mo4252bindNull(int index) {
            throwIfClosed();
            this.delegate.bindNull(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public void mo4253bindText(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throwIfClosed();
            this.delegate.bindString(index, value);
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public void mo4254clearBindings() {
            throwIfClosed();
            this.delegate.clearBindings();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public byte[] getBlob(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getColumnName(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getText(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            throwIfClosed();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            throwIfClosed();
            this.delegate.execute();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020&H\u0016J\b\u0010+\u001a\u00020\u0017H\u0016J\b\u0010,\u001a\u00020\u0017H\u0016J\b\u0010-\u001a\u00020\u0017H\u0016J\u0018\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u00100\u001a\u00020\u0017H\u0002J\b\u00101\u001a\u00020\u0015H\u0002J\u0018\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "sql", "", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;)V", "bindingTypes", "", "longBindings", "", "doubleBindings", "", "stringBindings", "", "[Ljava/lang/String;", "blobBindings", "", "[[B", "cursor", "Landroid/database/Cursor;", "bindBlob", "", FirebaseAnalytics.Param.INDEX, "", "value", "bindDouble", "", "bindLong", "", "bindText", "bindNull", "getBlob", "getDouble", "getLong", "getText", "isNull", "", "getColumnCount", "getColumnName", "getColumnType", "step", "reset", "clearBindings", "close", "ensureCapacity", "columnType", "ensureCursor", "throwIfNoRow", "throwIfInvalidColumn", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, y.f66058y, "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class RowSQLiteStatement extends SupportSQLiteStatement {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private int[] bindingTypes;

        @NotNull
        private byte[][] blobBindings;

        @Nullable
        private Cursor cursor;

        @NotNull
        private double[] doubleBindings;

        @NotNull
        private long[] longBindings;

        @NotNull
        private String[] stringBindings;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\b"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$RowSQLiteStatement$Companion;", "", "<init>", "()V", "getDataType", "", "Landroid/database/Cursor;", FirebaseAnalytics.Param.INDEX, "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int getDataType(Cursor cursor, int i10) {
                int type = cursor.getType(i10);
                int type2 = cursor.getType(i10);
                if (type2 == 0) {
                    return 5;
                }
                int i11 = 1;
                if (type2 != 1) {
                    i11 = 2;
                    if (type2 != 2) {
                        i11 = 3;
                        if (type2 != 3) {
                            if (type2 == 4) {
                                return 4;
                            }
                            throw new IllegalStateException(("Unknown field type: " + type).toString());
                        }
                    }
                }
                return i11;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RowSQLiteStatement(@NotNull SupportSQLiteDatabase db2, @NotNull String sql) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void ensureCapacity(int columnType, int index) {
            int i10 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i10) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i10) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
                    Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i10) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
                    Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i10) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i10);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i10) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i10);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        private final void ensureCursor() {
            if (this.cursor == null) {
                this.cursor = getDb().query(new SupportSQLiteQuery() { // from class: androidx.sqlite.driver.SupportSQLiteStatement$RowSQLiteStatement$ensureCursor$1
                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public void bindTo(SupportSQLiteProgram statement) {
                        Intrinsics.checkNotNullParameter(statement, "statement");
                        int length = this.this$0.bindingTypes.length;
                        for (int i10 = 1; i10 < length; i10++) {
                            int i11 = this.this$0.bindingTypes[i10];
                            if (i11 == 1) {
                                statement.bindLong(i10, this.this$0.longBindings[i10]);
                            } else if (i11 == 2) {
                                statement.bindDouble(i10, this.this$0.doubleBindings[i10]);
                            } else if (i11 == 3) {
                                String str = this.this$0.stringBindings[i10];
                                Intrinsics.checkNotNull(str);
                                statement.bindString(i10, str);
                            } else if (i11 == 4) {
                                byte[] bArr = this.this$0.blobBindings[i10];
                                Intrinsics.checkNotNull(bArr);
                                statement.bindBlob(i10, bArr);
                            } else if (i11 == 5) {
                                statement.bindNull(i10);
                            }
                        }
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    public int getArgCount() {
                        return this.this$0.bindingTypes.length;
                    }

                    @Override // androidx.sqlite.db.SupportSQLiteQuery
                    /* JADX INFO: renamed from: getSql */
                    public String getQuery() {
                        return this.this$0.getSql();
                    }
                });
            }
        }

        private final void throwIfInvalidColumn(Cursor c10, int index) {
            if (index < 0 || index >= c10.getColumnCount()) {
                SQLite.throwSQLiteException(25, "column index out of range");
                throw new g();
            }
        }

        private final Cursor throwIfNoRow() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public void mo4249bindBlob(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throwIfClosed();
            ensureCapacity(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public void mo4250bindDouble(int index, double value) {
            throwIfClosed();
            ensureCapacity(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public void mo4251bindLong(int index, long value) {
            throwIfClosed();
            ensureCapacity(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public void mo4252bindNull(int index) {
            throwIfClosed();
            ensureCapacity(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public void mo4253bindText(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throwIfClosed();
            ensureCapacity(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public void mo4254clearBindings() {
            throwIfClosed();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                mo4254clearBindings();
                reset();
            }
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public byte[] getBlob(int index) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, index);
            byte[] blob = cursorThrowIfNoRow.getBlob(index);
            Intrinsics.checkNotNullExpressionValue(blob, "getBlob(...)");
            return blob;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getColumnName(int index) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throwIfInvalidColumn(cursor, index);
            String columnName = cursor.getColumnName(index);
            Intrinsics.checkNotNullExpressionValue(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int index) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throwIfInvalidColumn(cursor, index);
            return INSTANCE.getDataType(cursor, index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int index) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, index);
            return cursorThrowIfNoRow.getDouble(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, index);
            return cursorThrowIfNoRow.getLong(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getText(int index) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, index);
            String string = cursorThrowIfNoRow.getString(index);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            throwIfClosed();
            Cursor cursorThrowIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(cursorThrowIfNoRow, index);
            return cursorThrowIfNoRow.isNull(index);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            throwIfClosed();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\b\u0010\"\u001a\u00020\rH\u0016J\b\u0010#\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\rH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006%"}, d2 = {"Landroidx/sqlite/driver/SupportSQLiteStatement$TransactionSQLiteStatement;", "Landroidx/sqlite/driver/SupportSQLiteStatement;", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "sql", "", "operation", "Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "<init>", "(Landroidx/sqlite/db/SupportSQLiteDatabase;Ljava/lang/String;Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;)V", "getOperation", "()Landroidx/sqlite/driver/SupportSQLiteStatement$Companion$TransactionOperation;", "bindBlob", "", FirebaseAnalytics.Param.INDEX, "", "value", "", "bindDouble", "", "bindLong", "", "bindText", "bindNull", "getBlob", "getDouble", "getLong", "getText", "isNull", "", "getColumnCount", "getColumnName", "getColumnType", "step", "reset", "clearBindings", "close", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class TransactionSQLiteStatement extends SupportSQLiteStatement {

        @NotNull
        private final Companion.TransactionOperation operation;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Companion.TransactionOperation.values().length];
                try {
                    iArr[Companion.TransactionOperation.END.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Companion.TransactionOperation.ROLLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Companion.TransactionOperation.BEGIN_EXCLUSIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Companion.TransactionOperation.BEGIN_IMMEDIATE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Companion.TransactionOperation.BEGIN_DEFERRED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionSQLiteStatement(@NotNull SupportSQLiteDatabase db2, @NotNull String sql, @NotNull Companion.TransactionOperation operation) {
            super(db2, sql, null);
            Intrinsics.checkNotNullParameter(db2, "db");
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindBlob */
        public void mo4249bindBlob(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindDouble */
        public void mo4250bindDouble(int index, double value) {
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindLong */
        public void mo4251bindLong(int index, long value) {
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindNull */
        public void mo4252bindNull(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: bindText */
        public void mo4253bindText(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throwIfClosed();
            SQLite.throwSQLiteException(25, "column index out of range");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        /* JADX INFO: renamed from: clearBindings */
        public void mo4254clearBindings() {
            throwIfClosed();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            setClosed(true);
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public byte[] getBlob(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getColumnName(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnType(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public double getDouble(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @NotNull
        public final Companion.TransactionOperation getOperation() {
            return this.operation;
        }

        @Override // androidx.sqlite.SQLiteStatement
        @NotNull
        public String getText(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            throwIfClosed();
            SQLite.throwSQLiteException(21, "no row");
            throw new g();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            throwIfClosed();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean step() {
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.operation.ordinal()];
            if (i10 == 1) {
                getDb().setTransactionSuccessful();
                getDb().endTransaction();
                return false;
            }
            if (i10 == 2) {
                getDb().endTransaction();
                return false;
            }
            if (i10 == 3) {
                getDb().beginTransaction();
                return false;
            }
            if (i10 == 4) {
                getDb().beginTransactionNonExclusive();
                return false;
            }
            if (i10 != 5) {
                throw new m();
            }
            getDb().beginTransactionReadOnly();
            return false;
        }
    }

    public /* synthetic */ SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(supportSQLiteDatabase, str);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindBoolean(int i10, boolean z10) {
        c.a(this, i10, z10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindFloat(int i10, float f10) {
        c.b(this, i10, f10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ void bindInt(int i10, int i11) {
        c.c(this, i10, i11);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ boolean getBoolean(int i10) {
        return c.d(this, i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ List getColumnNames() {
        return c.e(this);
    }

    @NotNull
    protected final SupportSQLiteDatabase getDb() {
        return this.db;
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ float getFloat(int i10) {
        return c.f(this, i10);
    }

    @Override // androidx.sqlite.SQLiteStatement
    public /* synthetic */ int getInt(int i10) {
        return c.g(this, i10);
    }

    @NotNull
    protected final String getSql() {
        return this.sql;
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    protected final boolean getIsClosed() {
        return this.isClosed;
    }

    protected final void setClosed(boolean z10) {
        this.isClosed = z10;
    }

    protected final void throwIfClosed() {
        if (this.isClosed) {
            SQLite.throwSQLiteException(21, "statement is closed");
            throw new g();
        }
    }

    private SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.db = supportSQLiteDatabase;
        this.sql = str;
    }
}
