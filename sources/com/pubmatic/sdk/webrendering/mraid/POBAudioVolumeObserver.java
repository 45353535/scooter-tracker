package com.pubmatic.sdk.webrendering.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class POBAudioVolumeObserver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile POBAudioVolumeObserver f63297c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f63298a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f63299b;

    interface a {
        void a(Double d10);
    }

    class b extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioManager f63300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f63301b;

        b(Handler handler, AudioManager audioManager) {
            super(handler);
            this.f63300a = audioManager;
            this.f63301b = audioManager.getStreamVolume(3);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            AudioManager audioManager = this.f63300a;
            if (audioManager != null) {
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                int streamVolume = this.f63300a.getStreamVolume(3);
                if (streamVolume != this.f63301b) {
                    this.f63301b = streamVolume;
                    POBAudioVolumeObserver.this.a(streamVolume, streamMaxVolume);
                }
            }
        }
    }

    private POBAudioVolumeObserver() {
    }

    private void b(Context context) {
        if (this.f63299b != null) {
            context.getContentResolver().unregisterContentObserver(this.f63299b);
            this.f63299b = null;
        }
    }

    private void c(Context context) {
        b(context);
        f63297c = null;
    }

    @Nullable
    protected static Double getAudioVolumePercentage(@NonNull Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return Double.valueOf((((double) audioManager.getStreamVolume(3)) * 100.0d) / ((double) audioManager.getStreamMaxVolume(3)));
            }
            return null;
        } catch (Exception e10) {
            POBLog.error("POBAudioVolumeObserver", "Error in getting audio manager. Error: %s", e10.getMessage());
            return null;
        }
    }

    protected void registerListener(@NonNull Context context, @NonNull a aVar) {
        if (this.f63298a.contains(aVar)) {
            return;
        }
        if (this.f63299b == null) {
            a(context);
        }
        this.f63298a.add(aVar);
    }

    protected void unregisterListener(@NonNull Context context, a aVar) {
        this.f63298a.remove(aVar);
        if (this.f63298a.isEmpty()) {
            c(context);
        }
    }

    static POBAudioVolumeObserver a() {
        if (f63297c == null) {
            synchronized (POBAudioVolumeObserver.class) {
                try {
                    if (f63297c == null) {
                        f63297c = new POBAudioVolumeObserver();
                    }
                } finally {
                }
            }
        }
        return f63297c;
    }

    private void a(Context context) {
        if (this.f63299b == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            try {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    this.f63299b = new b(handler, audioManager);
                    context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f63299b);
                }
            } catch (Exception e10) {
                POBLog.warn("POBAudioVolumeObserver", "Error in getting audio manager. Error: %s", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11) {
        Double dValueOf = Double.valueOf((((double) i10) * 100.0d) / ((double) i11));
        Iterator it = this.f63298a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(dValueOf);
        }
    }
}
