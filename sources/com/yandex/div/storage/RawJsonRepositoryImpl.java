package com.yandex.div.storage;

import androidx.annotation.UiThread;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.RawJsonRepository;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.rawjson.RawJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\n2\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0011H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u00020 2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R$\u0010%\u001a\u0012\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\u0004\u0012\u00020\u001d0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010'\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/div/storage/RawJsonRepositoryImpl;", "Lcom/yandex/div/storage/RawJsonRepository;", "Lcom/yandex/div/storage/DivStorage;", "divStorage", "<init>", "(Lcom/yandex/div/storage/DivStorage;)V", "", "", "Lcom/yandex/div/storage/JsonId;", "ids", "Lcom/yandex/div/storage/RawJsonRepositoryResult;", "loadFromStorage", "(Ljava/util/Set;)Lcom/yandex/div/storage/RawJsonRepositoryResult;", "deletedRecords", "", "removeFromInMemory", "(Ljava/util/Set;)V", "", "Lcom/yandex/div/storage/database/StorageException;", "Lcom/yandex/div/storage/RawJsonRepositoryException;", "toRawJsonRepositoryExceptions", "(Ljava/util/List;)Ljava/util/List;", "Lcom/yandex/div/storage/RawJsonRepository$Payload;", "payload", "put", "(Lcom/yandex/div/storage/RawJsonRepository$Payload;)Lcom/yandex/div/storage/RawJsonRepositoryResult;", "get", "(Ljava/util/List;)Lcom/yandex/div/storage/RawJsonRepositoryResult;", "Lkotlin/Function1;", "Lcom/yandex/div/storage/rawjson/RawJson;", "", "predicate", "Lcom/yandex/div/storage/RawJsonRepositoryRemoveResult;", "remove", "(Lkotlin/jvm/functions/Function1;)Lcom/yandex/div/storage/RawJsonRepositoryRemoveResult;", "Lcom/yandex/div/storage/DivStorage;", "", "inMemoryData", "Ljava/util/Map;", "jsonIdsWithErrors", "Ljava/util/Set;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RawJsonRepositoryImpl implements RawJsonRepository {

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final Map<String, RawJson> inMemoryData = new LinkedHashMap();

    @NotNull
    private Set<String> jsonIdsWithErrors = SetsKt.emptySet();

    public RawJsonRepositoryImpl(@NotNull DivStorage divStorage) {
        this.divStorage = divStorage;
    }

    private final RawJsonRepositoryResult loadFromStorage(Set<String> ids) {
        ArrayList arrayList = new ArrayList();
        DivStorage.LoadDataResult<RawJson> rawJsons = this.divStorage.readRawJsons(ids);
        List<RawJson> listComponent1 = rawJsons.component1();
        arrayList.addAll(toRawJsonRepositoryExceptions(rawJsons.component2()));
        return new RawJsonRepositoryResult(listComponent1, arrayList);
    }

    private final void removeFromInMemory(Set<String> deletedRecords) {
        Iterator<T> it = deletedRecords.iterator();
        while (it.hasNext()) {
            this.inMemoryData.remove((String) it.next());
        }
    }

    private final List<RawJsonRepositoryException> toRawJsonRepositoryExceptions(List<? extends StorageException> list) {
        List<? extends StorageException> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new RawJsonRepositoryException((StorageException) it.next()));
        }
        return arrayList;
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @UiThread
    @NotNull
    public RawJsonRepositoryResult get(@NotNull List<String> ids) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        if (ids.isEmpty()) {
            return RawJsonRepositoryResult.INSTANCE.getEMPTY();
        }
        List<String> list = ids;
        Set<String> mutableSet = CollectionsKt.toMutableSet(list);
        ArrayList arrayList = new ArrayList(ids.size());
        for (String str : list) {
            RawJson rawJson = this.inMemoryData.get(str);
            if (rawJson != null) {
                arrayList.add(rawJson);
                mutableSet.remove(str);
            }
        }
        if (mutableSet.isEmpty()) {
            return new RawJsonRepositoryResult(arrayList, CollectionsKt.emptyList());
        }
        RawJsonRepositoryResult rawJsonRepositoryResultLoadFromStorage = loadFromStorage(mutableSet);
        for (RawJson rawJson2 : rawJsonRepositoryResultLoadFromStorage.getResultData()) {
            this.inMemoryData.put(rawJson2.getId(), rawJson2);
        }
        return rawJsonRepositoryResultLoadFromStorage.addData(arrayList);
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @UiThread
    @NotNull
    public RawJsonRepositoryResult put(@NotNull RawJsonRepository.Payload payload) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        List<RawJson> jsons = payload.getJsons();
        for (RawJson rawJson : jsons) {
            this.inMemoryData.put(rawJson.getId(), rawJson);
        }
        List<StorageException> errors = this.divStorage.saveRawJsons(jsons, payload.getActionOnError()).getErrors();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(toRawJsonRepositoryExceptions(errors));
        return new RawJsonRepositoryResult(jsons, arrayList);
    }

    @Override // com.yandex.div.storage.RawJsonRepository
    @UiThread
    @NotNull
    public RawJsonRepositoryRemoveResult remove(@NotNull Function1<? super RawJson, Boolean> predicate) {
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.assertMainThread();
        }
        DivStorage.RemoveResult removeResultRemoveRawJsons = this.divStorage.removeRawJsons(predicate);
        Set<String> setComponent1 = removeResultRemoveRawJsons.component1();
        List<RawJsonRepositoryException> rawJsonRepositoryExceptions = toRawJsonRepositoryExceptions(removeResultRemoveRawJsons.component2());
        removeFromInMemory(setComponent1);
        return new RawJsonRepositoryRemoveResult(setComponent1, rawJsonRepositoryExceptions);
    }
}
