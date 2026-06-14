package com.yandex.div.svg;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.PictureDrawable;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DtbConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.svg.SvgDivImageLoader;
import eg.g;
import eg.o0;
import f7.a;
import hh.c0;
import hh.x;
import hh.z;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;
import uf.c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/yandex/div/svg/SvgDivImageLoader;", "Lcom/yandex/div/core/images/DivImageLoader;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Landroid/content/Context;)V", "", "imageUrl", "Lhh/e;", "createCallOrNull", "(Ljava/lang/String;)Lhh/e;", NotificationCompat.CATEGORY_CALL, "", "downloadImage", "(Lhh/e;)[B", "getImageData", "(Ljava/lang/String;)[B", "", "hasSvgSupport", "()Ljava/lang/Boolean;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "callback", "Lcom/yandex/div/core/images/LoadReference;", "loadImage", "(Ljava/lang/String;Lcom/yandex/div/core/images/DivImageDownloadCallback;)Lcom/yandex/div/core/images/LoadReference;", "loadImageBytes", "Landroid/content/Context;", "Lhh/x;", "httpClient", "Lhh/x;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yandex/div/svg/SvgDecoder;", "svgDecoder", "Lcom/yandex/div/svg/SvgDecoder;", "Lcom/yandex/div/svg/SvgCacheManager;", "svgCacheManager", "Lcom/yandex/div/svg/SvgCacheManager;", "div-svg_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SvgDivImageLoader implements DivImageLoader {

    @NotNull
    private final Context context;

    @NotNull
    private final x httpClient = new x.a().c();

    @NotNull
    private final CoroutineScope coroutineScope = i.b();

    @NotNull
    private final SvgDecoder svgDecoder = new SvgDecoder(false, 1, null);

    @NotNull
    private final SvgCacheManager svgCacheManager = new SvgCacheManager();

    /* JADX INFO: renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", f = "SvgDivImageLoader.kt", l = {36}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ hh.e $call;
        final /* synthetic */ DivImageDownloadCallback $callback;
        final /* synthetic */ String $imageUrl;
        int label;
        final /* synthetic */ SvgDivImageLoader this$0;

        /* JADX INFO: renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/PictureDrawable;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1", f = "SvgDivImageLoader.kt", l = {}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ hh.e $call;
            final /* synthetic */ String $imageUrl;
            int label;
            final /* synthetic */ SvgDivImageLoader this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(hh.e eVar, SvgDivImageLoader svgDivImageLoader, String str, Continuation continuation) {
                super(2, continuation);
                this.$call = eVar;
                this.this$0 = svgDivImageLoader;
                this.$imageUrl = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                PictureDrawable pictureDrawableDecode;
                b.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                hh.e eVar = this.$call;
                byte[] imageData = eVar == null ? this.this$0.getImageData(this.$imageUrl) : this.this$0.downloadImage(eVar);
                if (imageData == null || (pictureDrawableDecode = this.this$0.svgDecoder.decode(new ByteArrayInputStream(imageData))) == null) {
                    return null;
                }
                this.this$0.svgCacheManager.set(this.$imageUrl, pictureDrawableDecode);
                return pictureDrawableDecode;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DivImageDownloadCallback divImageDownloadCallback, hh.e eVar, SvgDivImageLoader svgDivImageLoader, String str, Continuation continuation) {
            super(2, continuation);
            this.$callback = divImageDownloadCallback;
            this.$call = eVar;
            this.this$0 = svgDivImageLoader;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$callback, this.$call, this.this$0, this.$imageUrl, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            Unit unit = null;
            if (i10 == 0) {
                d.b(obj);
                CoroutineDispatcher coroutineDispatcherB = o0.b();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, null);
                this.label = 1;
                obj = g.g(coroutineDispatcherB, anonymousClass1, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            PictureDrawable pictureDrawable = (PictureDrawable) obj;
            if (pictureDrawable != null) {
                this.$callback.onSuccess(pictureDrawable);
                unit = Unit.f93236a;
            }
            if (unit == null) {
                this.$callback.onError();
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public SvgDivImageLoader(@NotNull Context context) {
        this.context = context;
    }

    private final hh.e createCallOrNull(String imageUrl) {
        if (!StringsKt.a0(imageUrl, "http://", false, 2, null) && !StringsKt.a0(imageUrl, DtbConstants.HTTPS, false, 2, null)) {
            return null;
        }
        return this.httpClient.a(new z.a().n(imageUrl).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] downloadImage(hh.e call) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            c0 c0VarM = call.execute().m();
            objB = Result.b(c0VarM != null ? c0VarM.bytes() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        return (byte[]) (Result.i(objB) ? null : objB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getImageData(String imageUrl) throws IOException {
        AssetManager assets;
        InputStream inputStreamOpen;
        String strP0 = StringsKt.P0(imageUrl, "file:///android_asset/");
        Context applicationContext = this.context.getApplicationContext();
        if (applicationContext == null || (assets = applicationContext.getAssets()) == null || (inputStreamOpen = assets.open(strP0)) == null) {
            return null;
        }
        try {
            byte[] bArrC = uf.b.c(inputStreamOpen);
            c.a(inputStreamOpen, null);
            return bArrC;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImage$lambda$1(hh.e eVar) {
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public Boolean hasSvgSupport() {
        return Boolean.TRUE;
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* synthetic */ LoadReference loadImage(String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return a.b(this, str, divImageDownloadCallback, i10);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    public /* synthetic */ LoadReference loadImageBytes(String str, DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return a.c(this, str, divImageDownloadCallback, i10);
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImage(@NotNull String imageUrl, @NotNull DivImageDownloadCallback callback) {
        final hh.e eVarCreateCallOrNull = createCallOrNull(imageUrl);
        PictureDrawable pictureDrawable = this.svgCacheManager.get(imageUrl);
        if (pictureDrawable != null) {
            callback.onSuccess(pictureDrawable);
            return new LoadReference() { // from class: j8.a
                @Override // com.yandex.div.core.images.LoadReference
                public final void cancel() {
                    SvgDivImageLoader.loadImage$lambda$0();
                }
            };
        }
        eg.i.d(this.coroutineScope, null, null, new AnonymousClass2(callback, eVarCreateCallOrNull, this, imageUrl, null), 3, null);
        return new LoadReference() { // from class: j8.b
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                SvgDivImageLoader.loadImage$lambda$1(eVarCreateCallOrNull);
            }
        };
    }

    @Override // com.yandex.div.core.images.DivImageLoader
    @NotNull
    public LoadReference loadImageBytes(@NotNull final String imageUrl, @NotNull final DivImageDownloadCallback callback) {
        return new LoadReference() { // from class: j8.c
            @Override // com.yandex.div.core.images.LoadReference
            public final void cancel() {
                this.f85513a.loadImage(imageUrl, callback);
            }
        };
    }
}
