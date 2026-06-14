package com.yandex.div.storage.database;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.rawjson.RawJson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/storage/database/SingleTransactionDataSavePerformer;", "", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "storageStatementsExecutor", "<init>", "(Lcom/yandex/div/storage/database/StorageStatementExecutor;)V", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "Lkotlin/Function1;", "", "Lcom/yandex/div/storage/database/StorageStatement;", "", "statementsBuilder", "Lcom/yandex/div/storage/database/ExecutionResult;", "executeStatements", "(Lcom/yandex/div/storage/DivDataRepository$ActionOnError;Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/database/ExecutionResult;", "", "Lcom/yandex/div/storage/rawjson/RawJson;", "rawJsons", "createRawJsonsSaveStatement", "(Ljava/util/List;)Lcom/yandex/div/storage/database/StorageStatement;", "saveRawJsons", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/database/ExecutionResult;", "Lcom/yandex/div/storage/database/StorageStatementExecutor;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleTransactionDataSavePerformer {

    @NotNull
    private final StorageStatementExecutor storageStatementsExecutor;

    public SingleTransactionDataSavePerformer(@NotNull StorageStatementExecutor storageStatementExecutor) {
        this.storageStatementsExecutor = storageStatementExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageStatement createRawJsonsSaveStatement(List<? extends RawJson> rawJsons) {
        return StorageStatements.replaceRawJsons$default(StorageStatements.INSTANCE, rawJsons, null, 2, null);
    }

    private final ExecutionResult executeStatements(DivDataRepository.ActionOnError actionOnError, Function1<? super List<StorageStatement>, Unit> statementsBuilder) {
        ArrayList arrayList = new ArrayList();
        statementsBuilder.invoke(arrayList);
        StorageStatementExecutor storageStatementExecutor = this.storageStatementsExecutor;
        StorageStatement[] storageStatementArr = (StorageStatement[]) arrayList.toArray(new StorageStatement[0]);
        return storageStatementExecutor.execute(actionOnError, (StorageStatement[]) Arrays.copyOf(storageStatementArr, storageStatementArr.length));
    }

    @NotNull
    public final ExecutionResult saveRawJsons(@NotNull final List<? extends RawJson> rawJsons, @NotNull DivDataRepository.ActionOnError actionOnError) throws IOException {
        return executeStatements(actionOnError, new Function1<List<StorageStatement>, Unit>() { // from class: com.yandex.div.storage.database.SingleTransactionDataSavePerformer.saveRawJsons.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<StorageStatement> list) {
                invoke2(list);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull List<StorageStatement> list) {
                list.add(SingleTransactionDataSavePerformer.this.createRawJsonsSaveStatement(rawJsons));
            }
        });
    }
}
