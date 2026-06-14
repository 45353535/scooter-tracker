package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes4.dex */
public final class eb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv0 f110277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f110278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f110279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f110280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f110281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f110282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f110283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f110284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tk[] f110285i;

    public eb0(yv0 yv0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, tk[] tkVarArr) {
        this.f110277a = yv0Var;
        this.f110278b = i10;
        this.f110279c = i11;
        this.f110280d = i12;
        this.f110281e = i13;
        this.f110282f = i14;
        this.f110283g = i15;
        this.f110284h = i16;
        this.f110285i = tkVarArr;
    }

    public final AudioTrack a(boolean z10, hk hkVar, int i10) throws xk {
        try {
            AudioTrack audioTrackB = b(z10, hkVar, i10);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new xk(state, this.f110281e, this.f110282f, this.f110284h, this.f110277a, this.f110279c == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new xk(0, this.f110281e, this.f110282f, this.f110284h, this.f110277a, this.f110279c == 1, e10);
        }
    }

    public final AudioTrack b(boolean z10, hk hkVar, int i10) {
        AudioAttributes audioAttributesBuild;
        AudioAttributes audioAttributesBuild2;
        int i11 = w83.f117341a;
        if (i11 >= 29) {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(this.f110281e).setChannelMask(this.f110282f).setEncoding(this.f110283g).build();
            if (z10) {
                audioAttributesBuild2 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (hkVar.f111613g == null) {
                    hkVar.f111613g = new gk(hkVar);
                }
                audioAttributesBuild2 = hkVar.f111613g.f111232a;
            }
            return new AudioTrack.Builder().setAudioAttributes(audioAttributesBuild2).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(this.f110284h).setSessionId(i10).setOffloadedPlayback(this.f110279c == 1).build();
        }
        if (i11 < 21) {
            int iC = w83.c(hkVar.f111610d);
            return i10 == 0 ? new AudioTrack(iC, this.f110281e, this.f110282f, this.f110283g, this.f110284h, 1) : new AudioTrack(iC, this.f110281e, this.f110282f, this.f110283g, this.f110284h, 1, i10);
        }
        if (z10) {
            audioAttributesBuild = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            if (hkVar.f111613g == null) {
                hkVar.f111613g = new gk(hkVar);
            }
            audioAttributesBuild = hkVar.f111613g.f111232a;
        }
        return new AudioTrack(audioAttributesBuild, new AudioFormat.Builder().setSampleRate(this.f110281e).setChannelMask(this.f110282f).setEncoding(this.f110283g).build(), this.f110284h, 1, i10);
    }
}
