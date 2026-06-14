package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f58660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f58661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RandomAccessFile f58662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f58663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f58664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f58665g;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58666r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ DataSpec f58668t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DataSpec dataSpec, Continuation continuation) {
            super(2, continuation);
            this.f58668t = dataSpec;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new a(this.f58668t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            File fileA;
            pf.b.g();
            if (this.f58666r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            try {
                b bVar = b.this;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVarC = bVar.c(bVar.f58659a);
                if (hVarC instanceof h.a) {
                    fileA = ((h.a) hVarC).a();
                } else {
                    if (!(hVarC instanceof h.c)) {
                        b.this.f58665g = true;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.f58661c, "Failed to download file: " + b.this.f58659a, null, false, 12, null);
                        throw new IOException("Cannot read file: " + b.this.f58659a);
                    }
                    fileA = ((h.c) hVarC).a();
                }
                if (!fileA.exists()) {
                    throw new IOException("Cannot read file, does not exist yet: " + b.this.f58659a);
                }
                b bVar2 = b.this;
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileA, "r");
                randomAccessFile.seek(this.f58668t.position);
                bVar2.f(randomAccessFile);
                b bVar3 = b.this;
                long length = this.f58668t.length;
                if (length == -1) {
                    length = fileA.length() - this.f58668t.position;
                }
                bVar3.f58663e = length;
                if (b.this.f58663e == 0 && b.this.h(hVarC)) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, b.this.f58661c, "Streaming error likely detected", null, false, 12, null);
                    b.this.f58665g = true;
                }
                return kotlin.coroutines.jvm.internal.b.e(b.this.f58663e);
            } catch (IOException e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, b.this.f58661c, "Failed to open file: " + b.this.f58659a, e10, false, 8, null);
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b$b, reason: collision with other inner class name */
    public static final class C0773b extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58669r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f58671t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0773b(String str, Continuation continuation) {
            super(2, continuation);
            this.f58671t = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0773b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new C0773b(this.f58671t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58669r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return b.this.f58660b.a(this.f58671t);
        }
    }

    public b(String url, m mediaCacheRepository) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        this.f58659a = url;
        this.f58660b = mediaCacheRepository;
        this.f58661c = "ProgressiveMediaFileDataSource";
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Intrinsics.checkNotNullParameter(transferListener, "transferListener");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58661c, "addTransferListener", null, false, 12, null);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h c(String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) eg.h.b(null, new C0773b(str, null), 1, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        try {
            RandomAccessFile randomAccessFile = this.f58662d;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } finally {
            this.f58662d = null;
        }
    }

    public final void f(RandomAccessFile randomAccessFile) {
        this.f58662d = randomAccessFile;
    }

    public final boolean g() {
        return this.f58665g;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ Map getResponseHeaders() {
        return com.google.android.exoplayer2.upstream.c.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return Uri.parse(this.f58659a);
    }

    public final boolean h(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVar) {
        return this.f58664f && (hVar instanceof h.c) && Intrinsics.areEqual(((h.c) hVar).b(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a());
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        return ((Number) eg.h.b(null, new a(dataSpec, null), 1, null)).longValue();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] buffer, int i10, int i11) {
        IOException iOException;
        int i12;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        try {
            if (i11 == 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58661c, "Read length is 0", null, false, 12, null);
                return 0;
            }
            if (this.f58663e == 0 && (c(this.f58659a) instanceof h.a)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58661c, "Media stream is complete", null, false, 12, null);
                return -1;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVarC = c(this.f58659a);
            if (hVarC instanceof h.b) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f58661c, "Streaming failed: " + this.f58659a, null, false, 12, null);
                this.f58665g = true;
                return 0;
            }
            if (hVarC instanceof h.a) {
                RandomAccessFile randomAccessFile = this.f58662d;
                i = randomAccessFile != null ? randomAccessFile.read(buffer, i10, i11) : 0;
                if (i > 0) {
                    this.f58664f = true;
                    this.f58663e -= (long) i;
                }
                return i;
            }
            loop0: while (true) {
                i12 = 0;
                while (i12 <= 0) {
                    try {
                        if (!(c(this.f58659a) instanceof h.c)) {
                            break loop0;
                        }
                        RandomAccessFile randomAccessFile2 = this.f58662d;
                        if (randomAccessFile2 != null) {
                            i12 = randomAccessFile2.read(buffer, i10, i11);
                        }
                    } catch (IOException e10) {
                        iOException = e10;
                        i = i12;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f58661c, "Waiting for more data", iOException, false, 8, null);
                        return i;
                    }
                }
            }
            if (i12 > 0) {
                this.f58664f = true;
                this.f58663e -= (long) i12;
            }
            return i12;
        } catch (IOException e11) {
            iOException = e11;
        }
    }
}
