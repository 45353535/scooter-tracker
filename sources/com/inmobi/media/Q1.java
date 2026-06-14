package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.inmobi.media.Q1;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f37566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f37567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributes f37568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioFocusRequest f37569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f37570f;

    public Q1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f37565a = applicationContext;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        Intrinsics.checkNotNullExpressionValue(audioAttributesBuild, "build(...)");
        this.f37568d = audioAttributesBuild;
    }

    public final void a() {
        this.f37566b = false;
        Object systemService = this.f37565a.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f37569e;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f37570f;
            if (onAudioFocusChangeListener != null) {
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            }
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: w3.a4
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Q1.a(this.f106976b, i10);
            }
        };
    }

    public final void c() {
        WeakReference weakReference = this.f37567c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f37567c = null;
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f37569e = null;
        }
        this.f37570f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f37565a
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.media.AudioManager
            if (r1 == 0) goto Lf
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            r1 = 0
            if (r0 == 0) goto L61
            android.media.AudioManager$OnAudioFocusChangeListener r2 = r5.f37570f
            if (r2 != 0) goto L1d
            android.media.AudioManager$OnAudioFocusChangeListener r2 = r5.b()
            r5.f37570f = r2
        L1d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 2
            if (r2 < r3) goto L59
            android.media.AudioFocusRequest r2 = r5.f37569e
            if (r2 != 0) goto L50
            android.media.AudioFocusRequest$Builder r2 = androidx.media3.exoplayer.g.a(r4)
            android.media.AudioAttributes r3 = r5.f37568d
            android.media.AudioFocusRequest$Builder r2 = androidx.media3.exoplayer.a.a(r2, r3)
            android.media.AudioManager$OnAudioFocusChangeListener r3 = r5.f37570f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            kotlin.Lazy r4 = com.inmobi.media.AbstractC3925o6.f39166e
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.Wb r4 = (com.inmobi.media.Wb) r4
            android.os.Handler r4 = r4.f37946a
            android.media.AudioFocusRequest$Builder r2 = com.google.android.gms.internal.ads.f0.a(r2, r3, r4)
            android.media.AudioFocusRequest r2 = androidx.media3.exoplayer.d.a(r2)
            java.lang.String r3 = "build(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r5.f37569e = r2
        L50:
            android.media.AudioFocusRequest r2 = r5.f37569e
            if (r2 == 0) goto L61
            int r0 = androidx.media3.exoplayer.e.a(r0, r2)
            goto L62
        L59:
            android.media.AudioManager$OnAudioFocusChangeListener r2 = r5.f37570f
            r3 = 3
            int r0 = r0.requestAudioFocus(r2, r3, r4)
            goto L62
        L61:
            r0 = r1
        L62:
            r2 = 1
            if (r0 != r2) goto L66
            return r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q1.d():boolean");
    }

    public static final void a(Q1 q12, int i10) {
        P1 p12;
        P1 p13;
        WeakReference weakReference;
        P1 p14;
        if (i10 == -2) {
            q12.f37566b = true;
            WeakReference weakReference2 = q12.f37567c;
            if (weakReference2 == null || (p12 = (P1) weakReference2.get()) == null) {
                return;
            }
            p12.a();
            return;
        }
        if (i10 == -1) {
            q12.f37566b = false;
            WeakReference weakReference3 = q12.f37567c;
            if (weakReference3 == null || (p13 = (P1) weakReference3.get()) == null) {
                return;
            }
            p13.a();
            return;
        }
        if (i10 != 1) {
            return;
        }
        if (q12.f37566b && (weakReference = q12.f37567c) != null && (p14 = (P1) weakReference.get()) != null) {
            p14.b();
        }
        q12.f37566b = false;
    }
}
