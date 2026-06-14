package com.my.target;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public interface y {

    public interface a {
        void a(float f10);

        void a(float f10, float f11);

        void a(String str);

        void b();

        void d();

        void e();

        void f();

        void l();

        void n();

        void p();
    }

    void a();

    void a(Uri uri, Context context);

    void a(Uri uri, z zVar);

    void a(a aVar);

    void a(z zVar);

    boolean b();

    void c();

    void d();

    void destroy();

    boolean e();

    void f();

    boolean g();

    float getDuration();

    Uri getUri();

    void h();

    long i();

    boolean isPlaying();

    void pause();

    void resume();

    void seekTo(long j10);

    void setVolume(float f10);

    void stop();
}
