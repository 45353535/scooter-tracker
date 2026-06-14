package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0011\u0010 \u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/text/font/AsyncFontListLoader;", "Landroidx/compose/runtime/State;", "", "fontList", "", "Landroidx/compose/ui/text/font/Font;", "initialType", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "onCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Ljava/util/List;Ljava/lang/Object;Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/font/PlatformFontLoader;)V", "cacheable", "", "getCacheable$ui_text_release", "()Z", "setCacheable$ui_text_release", "(Z)V", "<set-?>", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value$delegate", "Landroidx/compose/runtime/MutableState;", "load", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadWithTimeoutOrNull", "loadWithTimeoutOrNull$ui_text_release", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AsyncFontListLoader implements State<Object> {

    @NotNull
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable;

    @NotNull
    private final List<Font> fontList;

    @NotNull
    private final Function1<TypefaceResult.Immutable, Unit> onCompletion;

    @NotNull
    private final PlatformFontLoader platformFontLoader;

    @NotNull
    private final TypefaceRequest typefaceRequest;

    /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState value;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {268, 281}, m = "load")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return AsyncFontListLoader.this.load(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(@NotNull List<? extends Font> fontList, @NotNull Object initialType, @NotNull TypefaceRequest typefaceRequest, @NotNull AsyncTypefaceCache asyncTypefaceCache, @NotNull Function1<? super TypefaceResult.Immutable, Unit> onCompletion, @NotNull PlatformFontLoader platformFontLoader) {
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(initialType, "initialType");
        Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
        this.fontList = fontList;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = onCompletion;
        this.platformFontLoader = platformFontLoader;
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialType, null, 2, null);
        this.cacheable = true;
    }

    private void setValue(Object obj) {
        this.value.setValue(obj);
    }

    /* JADX INFO: renamed from: getCacheable$ui_text_release, reason: from getter */
    public final boolean getCacheable() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    @NotNull
    public Object getValue() {
        return this.value.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:45:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:42:0x00f9). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object load(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(@org.jetbrains.annotations.NotNull androidx.compose.ui.text.font.Font r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.ui.text.font.Font) r7
            kotlin.d.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            return r8
        L2e:
            r8 = move-exception
            goto L50
        L30:
            r7 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.d.b(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.label = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = eg.x1.e(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 != r1) goto L4f
            return r1
        L4f:
            return r7
        L50:
            kotlin.coroutines.CoroutineContext r1 = r0.getContext()
            eg.c0$b r2 = eg.c0.J8
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            eg.c0 r1 = (eg.c0) r1
            if (r1 == 0) goto L86
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L86
        L7c:
            kotlin.coroutines.CoroutineContext r8 = r0.getContext()
            boolean r8 = kotlinx.coroutines.z.r(r8)
            if (r8 == 0) goto L87
        L86:
            return r4
        L87:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void setCacheable$ui_text_release(boolean z10) {
        this.cacheable = z10;
    }
}
