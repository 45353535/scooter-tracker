package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f113124a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    @DoNotInline
    public static int a(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(w83.a(i12)).build(), f113124a)) {
                return i12;
            }
        }
        return 0;
    }

    @DoNotInline
    public static int[] a() {
        v31 v31Var = y31.f118068c;
        u31 u31Var = new u31();
        sk2 sk2Var = mk.f113538e;
        qk2 qk2Var = sk2Var.f108905c;
        if (qk2Var == null) {
            qk2 qk2Var2 = new qk2(sk2Var, new rk2(sk2Var.f115842f, 0, sk2Var.f115843g));
            sk2Var.f108905c = qk2Var2;
            qk2Var = qk2Var2;
        }
        w73 it = qk2Var.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f113124a)) {
                u31Var.a(num);
            }
        }
        u31Var.a((Object) 2);
        return ec1.a(u31Var.a());
    }
}
