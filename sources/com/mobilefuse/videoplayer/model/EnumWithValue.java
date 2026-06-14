package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/mobilefuse/videoplayer/model/EnumWithValue;", "T", "", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "value", "getValue", "()Ljava/lang/Object;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public interface EnumWithValue<T> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        @NotNull
        public static <T> String getStringValue(@NotNull EnumWithValue<T> enumWithValue) {
            return String.valueOf(enumWithValue.getValue());
        }
    }

    @NotNull
    String getStringValue();

    T getValue();
}
