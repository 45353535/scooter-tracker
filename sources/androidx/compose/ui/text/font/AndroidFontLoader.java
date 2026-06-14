package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.font.FontVariation;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\n \t*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "kotlin.jvm.PlatformType", "awaitLoad", "Landroid/graphics/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidFontLoader implements PlatformFontLoader {

    @Nullable
    private final Object cacheKey;
    private final Context context;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {61, 62}, m = "awaitLoad")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFontLoader.this.awaitLoad(null, this);
        }
    }

    public AndroidFontLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitLoad(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.Font r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AndroidFontLoader.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.ui.text.font.Font) r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.ui.text.font.AndroidFontLoader) r0
            kotlin.d.b(r8)
            goto L78
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            kotlin.d.b(r8)
            return r8
        L42:
            kotlin.d.b(r8)
            boolean r8 = r7 instanceof androidx.compose.ui.text.font.AndroidFont
            if (r8 == 0) goto L5e
            androidx.compose.ui.text.font.AndroidFont r7 = (androidx.compose.ui.text.font.AndroidFont) r7
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r8 = r7.getTypefaceLoader()
            android.content.Context r2 = r6.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.label = r4
            java.lang.Object r7 = r8.awaitLoad(r2, r7, r0)
            if (r7 != r1) goto L5d
            goto L76
        L5d:
            return r7
        L5e:
            boolean r8 = r7 instanceof androidx.compose.ui.text.font.ResourceFont
            if (r8 == 0) goto L8a
            r8 = r7
            androidx.compose.ui.text.font.ResourceFont r8 = (androidx.compose.ui.text.font.ResourceFont) r8
            android.content.Context r2 = r6.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = androidx.compose.ui.text.font.AndroidFontLoader_androidKt.access$loadAsync(r8, r2, r0)
            if (r8 != r1) goto L77
        L76:
            return r1
        L77:
            r0 = r6
        L78:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.ui.text.font.ResourceFont) r7
            androidx.compose.ui.text.font.FontVariation$Settings r7 = r7.getVariationSettings()
            android.content.Context r0 = r0.context
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.graphics.Typeface r7 = androidx.compose.ui.text.font.PlatformTypefacesKt.setFontVariationSettings(r8, r7, r0)
            return r7
        L8a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public android.graphics.Typeface loadBlocking(@NotNull Font font) {
        Object objB;
        android.graphics.Typeface typefaceLoad;
        Intrinsics.checkNotNullParameter(font, "font");
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            return typefaceLoader.loadBlocking(context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
        if (FontLoadingStrategy.m3575equalsimpl0(loadingStrategy, companion.m3580getBlockingPKNRLFQ())) {
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            typefaceLoad = AndroidFontLoader_androidKt.load((ResourceFont) font, context2);
        } else {
            if (!FontLoadingStrategy.m3575equalsimpl0(loadingStrategy, companion.m3581getOptionalLocalPKNRLFQ())) {
                if (FontLoadingStrategy.m3575equalsimpl0(loadingStrategy, companion.m3579getAsyncPKNRLFQ())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m3577toStringimpl(font.getLoadingStrategy())));
            }
            try {
                Result.Companion companion2 = Result.f93230c;
                Context context3 = this.context;
                Intrinsics.checkNotNullExpressionValue(context3, "context");
                objB = Result.b(AndroidFontLoader_androidKt.load((ResourceFont) font, context3));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            typefaceLoad = (android.graphics.Typeface) (Result.i(objB) ? null : objB);
        }
        FontVariation.Settings variationSettings = ((ResourceFont) font).getVariationSettings();
        Context context4 = this.context;
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        return PlatformTypefacesKt.setFontVariationSettings(typefaceLoad, variationSettings, context4);
    }
}
