package com.moloco.sdk.internal.publisher.nativead.ui;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {

    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function3 f55038b;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.ui.c$a$a, reason: collision with other inner class name */
        public static final class C0677a implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Function3 f55039b;

            public C0677a(Function3 function3) {
                this.f55039b = function3;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-964093233, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdComposeViewWrapper.<anonymous>.<anonymous>.<anonymous> (NativeAdComposeViewWrapper.kt:15)");
                }
                this.f55039b.invoke(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Composer) obj, ((Number) obj2).intValue());
                return Unit.f93236a;
            }
        }

        public a(Function3 function3) {
            this.f55038b = function3;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1870157091, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdComposeViewWrapper.<anonymous>.<anonymous> (NativeAdComposeViewWrapper.kt:14)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableLambdaKt.composableLambda(composer, -964093233, true, new C0677a(this.f55038b)), composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Composer) obj, ((Number) obj2).intValue());
            return Unit.f93236a;
        }
    }

    public static final ComposeView a(Context context, Function3 content) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1870157091, true, new a(content)));
        return composeView;
    }
}
