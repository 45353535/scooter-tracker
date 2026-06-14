package com.yandex.div.storage.database;

import android.database.SQLException;
import androidx.annotation.AnyThread;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.database.DatabaseOpenHelper;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.t0;
import lf.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0007¢\u0006\u0002\u0010\rJ!\u0010\u0006\u001a\u00020\u00072\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\fH\u0007¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/storage/database/StorageStatementExecutor;", "", "dbProvider", "Lkotlin/Function0;", "Lcom/yandex/div/storage/database/DatabaseOpenHelper$Database;", "(Lkotlin/jvm/functions/Function0;)V", "execute", "Lcom/yandex/div/storage/database/ExecutionResult;", "actionOnError", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "statements", "", "Lcom/yandex/div/storage/database/StorageStatement;", "(Lcom/yandex/div/storage/DivDataRepository$ActionOnError;[Lcom/yandex/div/storage/database/StorageStatement;)Lcom/yandex/div/storage/database/ExecutionResult;", "([Lcom/yandex/div/storage/database/StorageStatement;)Lcom/yandex/div/storage/database/ExecutionResult;", "throwWithLogging", "", PglCryptUtils.KEY_MESSAGE, "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StorageStatementExecutor {

    @NotNull
    private final Function0<DatabaseOpenHelper.Database> dbProvider;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivDataRepository.ActionOnError.values().length];
            try {
                iArr[DivDataRepository.ActionOnError.ABORT_TRANSACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivDataRepository.ActionOnError.SKIP_ELEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StorageStatementExecutor(@NotNull Function0<? extends DatabaseOpenHelper.Database> function0) {
        this.dbProvider = function0;
    }

    private static final void execute$executeCatchingSqlException(Ref$ObjectRef ref$ObjectRef, t0 t0Var, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, ClosableSqlCompiler closableSqlCompiler, StorageStatement storageStatement) {
        try {
            storageStatement.execute(closableSqlCompiler);
        } catch (SQLException e10) {
            execute$handleException(ref$ObjectRef, t0Var, storageStatementArr, actionOnError, storageStatementExecutor, list, e10);
        } catch (IllegalStateException e11) {
            execute$handleException(ref$ObjectRef, t0Var, storageStatementArr, actionOnError, storageStatementExecutor, list, e11);
        }
    }

    private static final void execute$handleException(Ref$ObjectRef ref$ObjectRef, t0 t0Var, StorageStatement[] storageStatementArr, DivDataRepository.ActionOnError actionOnError, StorageStatementExecutor storageStatementExecutor, List<DivStorageErrorException> list, Exception exc) {
        String str = "Exception at statement '" + ref$ObjectRef.f93280b + "' (" + t0Var.f93331b + " out " + storageStatementArr.length + ')';
        int i10 = WhenMappings.$EnumSwitchMapping$0[actionOnError.ordinal()];
        if (i10 == 1) {
            storageStatementExecutor.throwWithLogging(str, exc);
            throw new g();
        }
        if (i10 != 2) {
            return;
        }
        list.add(new DivStorageErrorException(str, exc, null, 4, null));
    }

    private final Void throwWithLogging(String message, Exception exception) throws SQLException {
        throw new SQLException(message, exception);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[PHI: r3 r6
  0x0087: PHI (r3v5 com.yandex.div.storage.database.DatabaseOpenHelper$Database) = 
  (r3v3 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
  (r3v6 com.yandex.div.storage.database.DatabaseOpenHelper$Database)
 binds: [B:35:0x0085, B:44:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r6v7 com.yandex.div.storage.database.ClosableSqlCompiler) = (r6v5 com.yandex.div.storage.database.ClosableSqlCompiler), (r6v8 com.yandex.div.storage.database.ClosableSqlCompiler) binds: [B:35:0x0085, B:44:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    @androidx.annotation.AnyThread
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.div.storage.database.ExecutionResult execute(@org.jetbrains.annotations.NotNull com.yandex.div.storage.DivDataRepository.ActionOnError r16, @org.jetbrains.annotations.NotNull com.yandex.div.storage.database.StorageStatement... r17) throws java.lang.Throwable {
        /*
            r15 = this;
            r2 = r17
            kotlin.jvm.internal.t0 r1 = new kotlin.jvm.internal.t0
            r1.<init>()
            r8 = 1
            r1.f93331b = r8
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r10 = "Error during statements execution."
            r3 = 0
            kotlin.jvm.functions.Function0<com.yandex.div.storage.database.DatabaseOpenHelper$Database> r4 = r15.dbProvider     // Catch: java.lang.Throwable -> L65 java.lang.IllegalStateException -> L68 android.database.SQLException -> L6c
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L65 java.lang.IllegalStateException -> L68 android.database.SQLException -> L6c
            r9 = r4
            com.yandex.div.storage.database.DatabaseOpenHelper$Database r9 = (com.yandex.div.storage.database.DatabaseOpenHelper.Database) r9     // Catch: java.lang.Throwable -> L65 java.lang.IllegalStateException -> L68 android.database.SQLException -> L6c
            com.yandex.div.storage.database.ClosableSqlCompiler r6 = new com.yandex.div.storage.database.ClosableSqlCompiler     // Catch: java.lang.Throwable -> L5a java.lang.IllegalStateException -> L5d android.database.SQLException -> L61
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L5a java.lang.IllegalStateException -> L5d android.database.SQLException -> L61
            r9.beginTransaction()     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            int r11 = r2.length     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            r3 = 0
            r12 = r3
        L2b:
            if (r12 >= r11) goto L4d
            r7 = r2[r12]     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            r0.f93280b = r7     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            r4 = r15
            r3 = r16
            execute$executeCatchingSqlException(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            int r2 = r1.f93331b     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            int r2 = r2 + r8
            r1.f93331b = r2     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            int r12 = r12 + 1
            r2 = r17
            goto L2b
        L41:
            r0 = move-exception
        L42:
            r3 = r9
            goto Lab
        L45:
            r0 = move-exception
            r11 = r0
        L47:
            r3 = r9
            goto L70
        L49:
            r0 = move-exception
            r11 = r0
        L4b:
            r3 = r9
            goto L8d
        L4d:
            r9.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L41 java.lang.IllegalStateException -> L45 android.database.SQLException -> L49
            com.yandex.div.storage.util.SqlExtensionsKt.endTransactionSilently(r9)
            r6.close()
            com.yandex.div.storage.util.SqlExtensionsKt.closeSilently(r9)
            goto La5
        L5a:
            r0 = move-exception
            r6 = r3
            goto L42
        L5d:
            r0 = move-exception
            r11 = r0
            r6 = r3
            goto L47
        L61:
            r0 = move-exception
            r11 = r0
            r6 = r3
            goto L4b
        L65:
            r0 = move-exception
            r6 = r3
            goto Lab
        L68:
            r0 = move-exception
            r11 = r0
            r6 = r3
            goto L70
        L6c:
            r0 = move-exception
            r11 = r0
            r6 = r3
            goto L8d
        L70:
            com.yandex.div.storage.DivStorageErrorException r9 = new com.yandex.div.storage.DivStorageErrorException     // Catch: java.lang.Throwable -> L8b
            r13 = 4
            r14 = 0
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8b
            r5.add(r9)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L80
            com.yandex.div.storage.util.SqlExtensionsKt.endTransactionSilently(r3)
        L80:
            if (r6 == 0) goto L85
            r6.close()
        L85:
            if (r3 == 0) goto La5
        L87:
            com.yandex.div.storage.util.SqlExtensionsKt.closeSilently(r3)
            goto La5
        L8b:
            r0 = move-exception
            goto Lab
        L8d:
            com.yandex.div.storage.DivStorageErrorException r9 = new com.yandex.div.storage.DivStorageErrorException     // Catch: java.lang.Throwable -> L8b
            r13 = 4
            r14 = 0
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L8b
            r5.add(r9)     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L9d
            com.yandex.div.storage.util.SqlExtensionsKt.endTransactionSilently(r3)
        L9d:
            if (r6 == 0) goto La2
            r6.close()
        La2:
            if (r3 == 0) goto La5
            goto L87
        La5:
            com.yandex.div.storage.database.ExecutionResult r0 = new com.yandex.div.storage.database.ExecutionResult
            r0.<init>(r5)
            return r0
        Lab:
            if (r3 == 0) goto Lb0
            com.yandex.div.storage.util.SqlExtensionsKt.endTransactionSilently(r3)
        Lb0:
            if (r6 == 0) goto Lb5
            r6.close()
        Lb5:
            if (r3 == 0) goto Lba
            com.yandex.div.storage.util.SqlExtensionsKt.closeSilently(r3)
        Lba:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.storage.database.StorageStatementExecutor.execute(com.yandex.div.storage.DivDataRepository$ActionOnError, com.yandex.div.storage.database.StorageStatement[]):com.yandex.div.storage.database.ExecutionResult");
    }

    @AnyThread
    @NotNull
    public final ExecutionResult execute(@NotNull StorageStatement... statements) throws SQLException {
        return execute(DivDataRepository.ActionOnError.ABORT_TRANSACTION, (StorageStatement[]) Arrays.copyOf(statements, statements.length));
    }
}
