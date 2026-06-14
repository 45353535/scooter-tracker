package com.taurusx.tax.o;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import com.taurusx.tax.o.c;

/* JADX INFO: loaded from: classes11.dex */
public class f0 extends c {

    public class w implements MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ c.z f66425z;

        public w(c.z zVar) {
            this.f66425z = zVar;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            c.z zVar = this.f66425z;
            if (zVar != null) {
                zVar.w(false);
            }
            return false;
        }
    }

    public class z implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ c.z f66427z;

        public z(c.z zVar) {
            this.f66427z = zVar;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            c.z zVar = this.f66427z;
            if (zVar != null) {
                zVar.z(true);
            }
        }
    }

    public f0(Context context, Intent intent, c.z zVar) {
        super(context);
        setOnCompletionListener(new z(zVar));
        setOnErrorListener(new w(zVar));
        setVideoPath(intent.getStringExtra("video_url"));
    }
}
