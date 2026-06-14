package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a8\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "block", "record", "(Landroid/graphics/Picture;IILkotlin/jvm/functions/Function1;)Landroid/graphics/Picture;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PictureKt {
    @NotNull
    public static final Picture record(@NotNull Picture picture, int i10, int i11, @NotNull Function1<? super Canvas, Unit> function1) {
        Canvas canvasBeginRecording = picture.beginRecording(i10, i11);
        try {
            function1.invoke(canvasBeginRecording);
            return picture;
        } finally {
            z.b(1);
            picture.endRecording();
            z.a(1);
        }
    }
}
