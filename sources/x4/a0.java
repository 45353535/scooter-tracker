package x4;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.ktwapps.speedometer.R;

/* JADX INFO: loaded from: classes10.dex */
public class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a0 f108111c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SoundPool f108112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f108113b;

    public a0(Context context) {
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(4).build()).build();
        this.f108112a = soundPoolBuild;
        int[] iArr = new int[5];
        this.f108113b = iArr;
        iArr[0] = soundPoolBuild.load(context, R.raw.alert, 1);
        this.f108113b[1] = this.f108112a.load(context, R.raw.alert_1, 1);
        this.f108113b[2] = this.f108112a.load(context, R.raw.alert_2, 1);
        this.f108113b[3] = this.f108112a.load(context, R.raw.alert_3, 1);
        this.f108113b[4] = this.f108112a.load(context, R.raw.alert_4, 1);
    }

    public static synchronized a0 a(Context context) {
        try {
            if (f108111c == null) {
                f108111c = new a0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f108111c;
    }

    public void b(int i10) {
        try {
            this.f108112a.play(this.f108113b[i10], 1.0f, 1.0f, 1, 0, 1.0f);
        } catch (Exception unused) {
        }
    }

    public void c(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createWaveform(new long[]{0, 250, 250, 250, 250, 250, 250, 250, 250}, -1));
            } else {
                vibrator.vibrate(new long[]{0, 250, 250, 250, 250, 250, 250, 250, 250}, -1);
            }
        }
    }
}
