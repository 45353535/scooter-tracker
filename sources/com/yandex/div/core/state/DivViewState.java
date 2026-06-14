package com.yandex.div.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class DivViewState {

    @NonNull
    private final Map<String, BlockState> mBlockStates;
    private final long mCurrentDivStateId;

    /* JADX INFO: Access modifiers changed from: package-private */
    public interface BlockState {
    }

    DivViewState(long j10) {
        this(j10, new ArrayMap());
    }

    @Nullable
    public <T extends BlockState> T getBlockState(@NonNull String str) {
        return (T) this.mBlockStates.get(str);
    }

    @NonNull
    Map<String, BlockState> getBlockStates() {
        return this.mBlockStates;
    }

    public long getCurrentDivStateId() {
        return this.mCurrentDivStateId;
    }

    public <T extends BlockState> void putBlockState(@NonNull String str, @NonNull T t10) {
        this.mBlockStates.put(str, t10);
    }

    public void reset() {
        this.mBlockStates.clear();
    }

    DivViewState(long j10, @NonNull Map<String, BlockState> map) {
        this.mCurrentDivStateId = j10;
        this.mBlockStates = map;
    }
}
