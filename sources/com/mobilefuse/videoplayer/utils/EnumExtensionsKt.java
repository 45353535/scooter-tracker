package com.mobilefuse.videoplayer.utils;

import com.mobilefuse.videoplayer.model.AdAutoplay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a4\u0010\u0004\u001a\u0004\u0018\u0001H\u0005\"\u0018\b\u0000\u0010\u0005\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0006*\b\u0012\u0004\u0012\u0002H\u00050\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0086\b¢\u0006\u0002\u0010\n\u001a,\u0010\u000b\u001a\u0004\u0018\u0001H\u0005\"\u0010\b\u0000\u0010\u0005\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00050\u00072\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0086\b¢\u0006\u0002\u0010\n\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\r"}, d2 = {"isAutoplayed", "", "Lcom/mobilefuse/videoplayer/model/AdAutoplay;", "(Lcom/mobilefuse/videoplayer/model/AdAutoplay;)Z", "enumValueFromString", "T", "Lcom/mobilefuse/videoplayer/model/EnumWithValue;", "", "stringValue", "", "(Ljava/lang/String;)Ljava/lang/Enum;", "valueOfOrNull", "type", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
public final class EnumExtensionsKt {
    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Enum<TT;>;:Lcom/mobilefuse/videoplayer/model/EnumWithValue<*>;>(Ljava/lang/String;)TT; */
    public static final /* synthetic */ Enum enumValueFromString(String str) {
        if (str == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(5, "T");
        return null;
    }

    public static final boolean isAutoplayed(@NotNull AdAutoplay isAutoplayed) {
        Intrinsics.checkNotNullParameter(isAutoplayed, "$this$isAutoplayed");
        return isAutoplayed == AdAutoplay.UNMUTED_AUTOPLAY || isAutoplayed == AdAutoplay.MUTED_AUTOPLAY;
    }

    public static final /* synthetic */ <T extends Enum<T>> T valueOfOrNull(String str) {
        if (str == null) {
            return null;
        }
        try {
            Intrinsics.reifiedOperationMarker(4, "T");
            return (T) Enum.valueOf(Enum.class, str);
        } catch (Exception unused) {
            return null;
        }
    }
}
