package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.EnumWithValue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastVersion;", "", "Lcom/mobilefuse/videoplayer/model/EnumWithValue;", "", "value", "(Ljava/lang/String;II)V", "getValue", "()Ljava/lang/Integer;", "VAST1", "VAST2", "VAST3", "VAST1_WRAPPER", "VAST2_WRAPPER", "VAST3_WRAPPER", "VAST4", "VAST4_WRAPPER", "DAAST1", "DAAST1_WRAPPER", "VAST4_1", "VAST4_1_WRAPPER", "VAST4_2", "VAST4_2_WRAPPER", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public enum VastVersion implements EnumWithValue<Integer> {
    VAST1(1),
    VAST2(2),
    VAST3(3),
    VAST1_WRAPPER(4),
    VAST2_WRAPPER(5),
    VAST3_WRAPPER(6),
    VAST4(7),
    VAST4_WRAPPER(8),
    DAAST1(9),
    DAAST1_WRAPPER(10),
    VAST4_1(11),
    VAST4_1_WRAPPER(12),
    VAST4_2(13),
    VAST4_2_WRAPPER(14);

    private final int value;

    VastVersion(int i10) {
        this.value = i10;
    }

    @Override // com.mobilefuse.videoplayer.model.EnumWithValue
    @NotNull
    public String getStringValue() {
        return EnumWithValue.DefaultImpls.getStringValue(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.mobilefuse.videoplayer.model.EnumWithValue
    @NotNull
    public Integer getValue() {
        return Integer.valueOf(this.value);
    }
}
