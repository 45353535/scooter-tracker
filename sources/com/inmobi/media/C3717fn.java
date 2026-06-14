package com.inmobi.media;

import android.media.MediaPlayer;
import com.inmobi.media.C3717fn;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: renamed from: com.inmobi.media.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3717fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaPlayer f38596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f38597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow f38599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f38600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f38601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38602g;

    public C3717fn(MediaPlayer mediaPlayer, CoroutineScope coroutineScope, long j10, MutableSharedFlow progressEvents) {
        Intrinsics.checkNotNullParameter(mediaPlayer, "mediaPlayer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(progressEvents, "progressEvents");
        this.f38596a = mediaPlayer;
        this.f38597b = coroutineScope;
        this.f38598c = j10;
        this.f38599d = progressEvents;
        this.f38600e = new AtomicBoolean(false);
        this.f38602g = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.media.C3717fn r12, kotlin.coroutines.jvm.internal.d r13) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3717fn.a(com.inmobi.media.fn, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void b() {
        if (this.f38600e.getAndSet(true)) {
            return;
        }
        this.f38601f = eg.i.d(this.f38597b, null, null, new C3691en(this, null), 3, null);
        a();
    }

    public final void c() {
        if (this.f38600e.getAndSet(false)) {
            this.f38596a.setOnCompletionListener(null);
            H6.a(this.f38601f);
            this.f38601f = null;
        }
    }

    public final void a() {
        this.f38596a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: w3.f7
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C3717fn.a(this.f107050b, mediaPlayer);
            }
        });
    }

    public static final void a(C3717fn c3717fn, MediaPlayer mediaPlayer) {
        c3717fn.f38602g = 4;
        eg.i.d(c3717fn.f38597b, null, null, new C3640cn(c3717fn, null), 3, null);
    }

    public final boolean a(int i10, int i11, int i12) {
        return i12 >= -1 && i12 <= 4 && i10 >= i11 && this.f38602g == i12 - 1;
    }
}
