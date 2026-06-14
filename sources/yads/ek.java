package yads;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ek {
    @DoNotInline
    public static void a(AudioAttributes.Builder builder, int i10) {
        builder.setAllowedCapturePolicy(i10);
    }
}
