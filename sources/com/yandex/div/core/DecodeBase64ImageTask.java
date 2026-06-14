package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.PictureDrawable;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.logging.Severity;
import com.yandex.div.svg.SvgDecoder;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0003H\u0002J\b\u0010\u0014\u001a\u00020\tH\u0017J\u001c\u0010\u0015\u001a\u00020\u0016*\u00020\fH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0015\u001a\u00020\u0019*\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/DecodeBase64ImageTask;", "Ljava/lang/Runnable;", "rawBase64string", "", "synchronous", "", "onDecoded", "Lkotlin/Function1;", "Lcom/yandex/div/core/util/ImageRepresentation;", "", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "decodeToBitmap", "Landroid/graphics/Bitmap;", "bytes", "", "decodeToPictureDrawable", "Landroid/graphics/drawable/PictureDrawable;", "extractFromDataUrl", "base64string", "isSvg", "run", "asImageRepresentation", "Lcom/yandex/div/core/util/ImageRepresentation$Bitmap;", "asImageRepresentation-Mlk_otY", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Lcom/yandex/div/core/util/ImageRepresentation$PictureDrawable;", "asImageRepresentation-9g2PFUk", "(Landroid/graphics/drawable/PictureDrawable;)Landroid/graphics/drawable/PictureDrawable;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DecodeBase64ImageTask implements Runnable {

    @NotNull
    private final Function1<ImageRepresentation, Unit> onDecoded;

    @NotNull
    private String rawBase64string;
    private final boolean synchronous;

    /* JADX WARN: Multi-variable type inference failed */
    public DecodeBase64ImageTask(@NotNull String str, boolean z10, @NotNull Function1<? super ImageRepresentation, Unit> function1) {
        this.rawBase64string = str;
        this.synchronous = z10;
        this.onDecoded = function1;
    }

    /* JADX INFO: renamed from: asImageRepresentation-9g2PFUk, reason: not valid java name */
    private final PictureDrawable m7586asImageRepresentation9g2PFUk(PictureDrawable pictureDrawable) {
        return ImageRepresentation.PictureDrawable.m7604constructorimpl(pictureDrawable);
    }

    /* JADX INFO: renamed from: asImageRepresentation-Mlk_otY, reason: not valid java name */
    private final Bitmap m7587asImageRepresentationMlk_otY(Bitmap bitmap) {
        return ImageRepresentation.Bitmap.m7598constructorimpl(bitmap);
    }

    private final Bitmap decodeToBitmap(byte[] bytes) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (!kLog.isAtLeast(Severity.ERROR)) {
                return null;
            }
            kLog.print(6, "Div", "Problem with decoding base-64 preview image occurred");
            return null;
        }
    }

    private final PictureDrawable decodeToPictureDrawable(byte[] bytes) {
        return new SvgDecoder(false, 1, null).decode(new ByteArrayInputStream(bytes));
    }

    private final String extractFromDataUrl(String base64string) {
        if (!StringsKt.a0(base64string, "data:", false, 2, null)) {
            return base64string;
        }
        String strSubstring = base64string.substring(StringsKt.u0(base64string, ',', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final boolean isSvg(String base64string) {
        return StringsKt.a0(base64string, "data:image/svg", false, 2, null);
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        try {
            byte[] bArrDecode = Base64.decode(extractFromDataUrl(this.rawBase64string), 0);
            final ImageRepresentation imageRepresentationM7597boximpl = null;
            if (isSvg(this.rawBase64string)) {
                PictureDrawable pictureDrawableDecodeToPictureDrawable = decodeToPictureDrawable(bArrDecode);
                PictureDrawable pictureDrawableM7586asImageRepresentation9g2PFUk = pictureDrawableDecodeToPictureDrawable != null ? m7586asImageRepresentation9g2PFUk(pictureDrawableDecodeToPictureDrawable) : null;
                if (pictureDrawableM7586asImageRepresentation9g2PFUk != null) {
                    imageRepresentationM7597boximpl = ImageRepresentation.PictureDrawable.m7603boximpl(pictureDrawableM7586asImageRepresentation9g2PFUk);
                }
            } else {
                Bitmap bitmapDecodeToBitmap = decodeToBitmap(bArrDecode);
                Bitmap bitmapM7587asImageRepresentationMlk_otY = bitmapDecodeToBitmap != null ? m7587asImageRepresentationMlk_otY(bitmapDecodeToBitmap) : null;
                if (bitmapM7587asImageRepresentationMlk_otY != null) {
                    imageRepresentationM7597boximpl = ImageRepresentation.Bitmap.m7597boximpl(bitmapM7587asImageRepresentationMlk_otY);
                }
            }
            if (this.synchronous) {
                this.onDecoded.invoke(imageRepresentationM7597boximpl);
            } else {
                UiThreadHandler.INSTANCE.postOnMainThread(new Function0<Unit>() { // from class: com.yandex.div.core.DecodeBase64ImageTask.run.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        DecodeBase64ImageTask.this.onDecoded.invoke(imageRepresentationM7597boximpl);
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.ERROR)) {
                kLog.print(6, "Div", "Bad base-64 image preview");
            }
        }
    }
}
