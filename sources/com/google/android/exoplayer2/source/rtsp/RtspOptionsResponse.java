package com.google.android.exoplayer2.source.rtsp;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class RtspOptionsResponse {
    public final int status;
    public final ImmutableList<Integer> supportedMethods;

    public RtspOptionsResponse(int i10, List<Integer> list) {
        this.status = i10;
        this.supportedMethods = ImmutableList.copyOf((Collection) list);
    }
}
