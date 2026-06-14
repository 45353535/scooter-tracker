package yads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: loaded from: classes4.dex */
public final class gj1 implements ej1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f111229b;

    public gj1(boolean z10, boolean z11) {
        this.f111228a = (z10 || z11) ? 1 : 0;
    }

    @Override // yads.ej1
    public final int a() {
        if (this.f111229b == null) {
            this.f111229b = new MediaCodecList(this.f111228a).getCodecInfos();
        }
        return this.f111229b.length;
    }

    @Override // yads.ej1
    public final boolean b() {
        return true;
    }

    @Override // yads.ej1
    public final MediaCodecInfo a(int i10) {
        if (this.f111229b == null) {
            this.f111229b = new MediaCodecList(this.f111228a).getCodecInfos();
        }
        return this.f111229b[i10];
    }

    @Override // yads.ej1
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // yads.ej1
    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
