package com.yandex.div.storage;

import com.ironsource.C4240b4;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/storage/InternalStorageComponent;", "Lcom/yandex/div/storage/DivStorageComponent;", "Lcom/yandex/div/storage/DivDataRepository;", "repository", "Lcom/yandex/div/storage/RawJsonRepository;", "rawJsonRepository", "Lcom/yandex/div/storage/DivStorage;", C4240b4.a.f42506k, "<init>", "(Lcom/yandex/div/storage/DivDataRepository;Lcom/yandex/div/storage/RawJsonRepository;Lcom/yandex/div/storage/DivStorage;)V", "Lcom/yandex/div/storage/DivDataRepository;", "getRepository", "()Lcom/yandex/div/storage/DivDataRepository;", "Lcom/yandex/div/storage/RawJsonRepository;", "getRawJsonRepository", "()Lcom/yandex/div/storage/RawJsonRepository;", "Lcom/yandex/div/storage/DivStorage;", "getStorage", "()Lcom/yandex/div/storage/DivStorage;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InternalStorageComponent implements DivStorageComponent {

    @NotNull
    private final RawJsonRepository rawJsonRepository;

    @NotNull
    private final DivDataRepository repository;

    @NotNull
    private final DivStorage storage;

    public InternalStorageComponent(@NotNull DivDataRepository divDataRepository, @NotNull RawJsonRepository rawJsonRepository, @NotNull DivStorage divStorage) {
        this.repository = divDataRepository;
        this.rawJsonRepository = rawJsonRepository;
        this.storage = divStorage;
    }

    @Override // com.yandex.div.storage.DivStorageComponent
    @NotNull
    public RawJsonRepository getRawJsonRepository() {
        return this.rawJsonRepository;
    }
}
