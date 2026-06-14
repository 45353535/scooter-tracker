package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: com.google.android.exoplayer2.mediacodec.e
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z10, boolean z11) {
            return MediaCodecUtil.getDecoderInfos(str, z10, z11);
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException;
}
