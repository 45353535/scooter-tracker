package com.yandex.div.core.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/util/ImageRepresentation;", "", "Bitmap", "PictureDrawable", "Lcom/yandex/div/core/util/ImageRepresentation$Bitmap;", "Lcom/yandex/div/core/util/ImageRepresentation$PictureDrawable;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ImageRepresentation {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/util/ImageRepresentation$Bitmap;", "Lcom/yandex/div/core/util/ImageRepresentation;", "Landroid/graphics/Bitmap;", "value", "constructor-impl", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "", "toString-impl", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroid/graphics/Bitmap;)I", "hashCode", "", "other", "", "equals-impl", "(Landroid/graphics/Bitmap;Ljava/lang/Object;)Z", "equals", "Landroid/graphics/Bitmap;", "getValue", "()Landroid/graphics/Bitmap;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Bitmap implements ImageRepresentation {

        @NotNull
        private final android.graphics.Bitmap value;

        private /* synthetic */ Bitmap(android.graphics.Bitmap bitmap) {
            this.value = bitmap;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bitmap m7597boximpl(android.graphics.Bitmap bitmap) {
            return new Bitmap(bitmap);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.Bitmap m7598constructorimpl(@NotNull android.graphics.Bitmap bitmap) {
            return bitmap;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m7599equalsimpl(android.graphics.Bitmap bitmap, Object obj) {
            return (obj instanceof Bitmap) && Intrinsics.areEqual(bitmap, ((Bitmap) obj).getValue());
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m7600hashCodeimpl(android.graphics.Bitmap bitmap) {
            return bitmap.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m7601toStringimpl(android.graphics.Bitmap bitmap) {
            return "Bitmap(value=" + bitmap + ')';
        }

        public boolean equals(Object obj) {
            return m7599equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7600hashCodeimpl(this.value);
        }

        public String toString() {
            return m7601toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ android.graphics.Bitmap getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/core/util/ImageRepresentation$PictureDrawable;", "Lcom/yandex/div/core/util/ImageRepresentation;", "Landroid/graphics/drawable/PictureDrawable;", "value", "constructor-impl", "(Landroid/graphics/drawable/PictureDrawable;)Landroid/graphics/drawable/PictureDrawable;", "", "toString-impl", "(Landroid/graphics/drawable/PictureDrawable;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Landroid/graphics/drawable/PictureDrawable;)I", "hashCode", "", "other", "", "equals-impl", "(Landroid/graphics/drawable/PictureDrawable;Ljava/lang/Object;)Z", "equals", "Landroid/graphics/drawable/PictureDrawable;", "getValue", "()Landroid/graphics/drawable/PictureDrawable;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PictureDrawable implements ImageRepresentation {

        @NotNull
        private final android.graphics.drawable.PictureDrawable value;

        private /* synthetic */ PictureDrawable(android.graphics.drawable.PictureDrawable pictureDrawable) {
            this.value = pictureDrawable;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PictureDrawable m7603boximpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return new PictureDrawable(pictureDrawable);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.drawable.PictureDrawable m7604constructorimpl(@NotNull android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m7605equalsimpl(android.graphics.drawable.PictureDrawable pictureDrawable, Object obj) {
            return (obj instanceof PictureDrawable) && Intrinsics.areEqual(pictureDrawable, ((PictureDrawable) obj).getValue());
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m7606hashCodeimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m7607toStringimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return "PictureDrawable(value=" + pictureDrawable + ')';
        }

        public boolean equals(Object obj) {
            return m7605equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7606hashCodeimpl(this.value);
        }

        public String toString() {
            return m7607toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ android.graphics.drawable.PictureDrawable getValue() {
            return this.value;
        }
    }
}
