package com.yandex.div.core;

import android.graphics.drawable.PictureDrawable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageDownloadCallback;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.internal.util.UiThreadHandler;
import com.yandex.div.json.expressions.ExpressionResolver;
import io.appmetrica.analytics.impl.H2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k8.a7;
import k8.as;
import k8.lq;
import k8.us;
import k8.xw;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\b\u001d\u001c\u001e\u001f !\"#B3\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006$"}, d2 = {"Lcom/yandex/div/core/DivPreloader;", "", "Lcom/yandex/div/core/view2/DivImagePreloader;", "imagePreloader", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "customContainerViewAdapter", "Lcom/yandex/div/core/extension/DivExtensionController;", "extensionController", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "videoPreloader", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "<init>", "(Lcom/yandex/div/core/view2/DivImagePreloader;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/player/DivPlayerPreloader;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "Lcom/yandex/div/core/DivPreloader$Ticket;", "preload", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/DivPreloader$Callback;)Lcom/yandex/div/core/DivPreloader$Ticket;", "Lcom/yandex/div/core/view2/DivImagePreloader;", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "Lcom/yandex/div/core/extension/DivExtensionController;", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", y.f66058y, "Callback", "DownloadCallback", "PreloadFilter", "PreloadReference", "PreloadVisitor", "Ticket", "TicketImpl", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivPreloader {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Callback NO_CALLBACK = new Callback() { // from class: y6.h
        @Override // com.yandex.div.core.DivPreloader.Callback
        public final void finish(boolean z10) {
            DivPreloader.NO_CALLBACK$lambda$0(z10);
        }
    };

    @NotNull
    private final DivCustomContainerViewAdapter customContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    @Nullable
    private final DivImagePreloader imagePreloader;

    @NotNull
    private final PreloadFilter preloadFilter;

    @NotNull
    private final DivPlayerPreloader videoPreloader;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivPreloader$Callback;", "", "finish", "", "hasErrors", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Callback {
        void finish(boolean hasErrors);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/DivPreloader$Companion;", "", "()V", "NO_CALLBACK", "Lcom/yandex/div/core/DivPreloader$Callback;", "getNO_CALLBACK$div_release", "()Lcom/yandex/div/core/DivPreloader$Callback;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Callback getNO_CALLBACK$div_release() {
            return DivPreloader.NO_CALLBACK;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/core/images/DivImageDownloadCallback;", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "<init>", "(Lcom/yandex/div/core/DivPreloader$Callback;)V", "", "done", "()V", "onSingleLoadingStarted", "Lcom/yandex/div/core/images/CachedBitmap;", "cachedBitmap", "onSuccess", "(Lcom/yandex/div/core/images/CachedBitmap;)V", "Landroid/graphics/drawable/PictureDrawable;", "pictureDrawable", "(Landroid/graphics/drawable/PictureDrawable;)V", "onError", "onFullPreloadStarted", "Lcom/yandex/div/core/DivPreloader$Callback;", "", "downloadsLeftCount", "I", "failures", "", C4240b4.i.f42621d0, "Z", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DownloadCallback extends DivImageDownloadCallback {

        @NotNull
        private final Callback callback;
        private int downloadsLeftCount;
        private int failures;
        private boolean started;

        public DownloadCallback(@NotNull Callback callback) {
            this.callback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void done() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$done$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.downloadsLeftCount--;
                        if (this.this$0.downloadsLeftCount == 0 && this.this$0.started) {
                            this.this$0.callback.finish(this.this$0.failures != 0);
                        }
                    }
                });
                return;
            }
            this.downloadsLeftCount--;
            if (this.downloadsLeftCount == 0 && this.started) {
                this.callback.finish(this.failures != 0);
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onError() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onError$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.failures++;
                        this.this$0.done();
                    }
                });
            } else {
                this.failures++;
                done();
            }
        }

        public final void onFullPreloadStarted() {
            if (!UiThreadHandler.isMainThread()) {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onFullPreloadStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.started = true;
                        if (this.this$0.downloadsLeftCount == 0) {
                            this.this$0.callback.finish(this.this$0.failures != 0);
                        }
                    }
                });
                return;
            }
            this.started = true;
            if (this.downloadsLeftCount == 0) {
                this.callback.finish(this.failures != 0);
            }
        }

        public final void onSingleLoadingStarted() {
            if (UiThreadHandler.isMainThread()) {
                this.downloadsLeftCount++;
            } else {
                UiThreadHandler.get().post(new Runnable() { // from class: com.yandex.div.core.DivPreloader$DownloadCallback$onSingleLoadingStarted$$inlined$runOnUiThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.this$0.downloadsLeftCount++;
                    }
                });
            }
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull CachedBitmap cachedBitmap) {
            done();
        }

        @Override // com.yandex.div.core.images.DivImageDownloadCallback
        public void onSuccess(@NotNull PictureDrawable pictureDrawable) {
            done();
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "", "shouldPreloadContent", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", "Lk8/a7;", H2.f75840g, "shouldPreloadBackground", "(Lk8/a7;Lcom/yandex/div/json/expressions/ExpressionResolver;)Z", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PreloadFilter {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final PreloadFilter ONLY_PRELOAD_REQUIRED_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$ONLY_PRELOAD_REQUIRED_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(@NotNull a7 background, @NotNull ExpressionResolver resolver) {
                if (background instanceof a7.c) {
                    return ((Boolean) ((a7.c) background).c().f91663f.evaluate(resolver)).booleanValue();
                }
                return false;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(@NotNull y0 div, @NotNull ExpressionResolver resolver) {
                if (!(div instanceof y0.r)) {
                    if (div instanceof y0.s) {
                        return ((Boolean) ((y0.s) div).d().A.evaluate(resolver)).booleanValue();
                    }
                    if (div instanceof y0.h) {
                        return ((Boolean) ((y0.h) div).d().H.evaluate(resolver)).booleanValue();
                    }
                    if (div instanceof y0.f) {
                        return ((Boolean) ((y0.f) div).d().E.evaluate(resolver)).booleanValue();
                    }
                    return false;
                }
                List list = ((y0.r) div).d().F;
                if (list != null) {
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        return false;
                    }
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) ((us.d) it.next()).f91782e.evaluate(resolver)).booleanValue()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };

        @NotNull
        public static final PreloadFilter PRELOAD_ALL_FILTER = new PreloadFilter() { // from class: com.yandex.div.core.DivPreloader$PreloadFilter$Companion$PRELOAD_ALL_FILTER$1
            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadBackground(@NotNull a7 background, @NotNull ExpressionResolver resolver) {
                return true;
            }

            @Override // com.yandex.div.core.DivPreloader.PreloadFilter
            public boolean shouldPreloadContent(@NotNull y0 div, @NotNull ExpressionResolver resolver) {
                return true;
            }
        };

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001R\u0013\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadFilter$Companion;", "", "()V", "ONLY_PRELOAD_REQUIRED_FILTER", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "PRELOAD_ALL_FILTER", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        boolean shouldPreloadBackground(@NotNull a7 background, @NotNull ExpressionResolver resolver);

        boolean shouldPreloadContent(@NotNull y0 div, @NotNull ExpressionResolver resolver);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadReference;", "", MenuActionType.CANCEL, "", y.f66058y, "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PreloadReference {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadReference$Companion;", "", "()V", "EMPTY", "Lcom/yandex/div/core/DivPreloader$PreloadReference;", "getEMPTY", "()Lcom/yandex/div/core/DivPreloader$PreloadReference;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            private static final PreloadReference EMPTY = new PreloadReference() { // from class: y6.i
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public final void cancel() {
                    DivPreloader.PreloadReference.Companion.EMPTY$lambda$0();
                }
            };

            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void EMPTY$lambda$0() {
            }

            @NotNull
            public final PreloadReference getEMPTY() {
                return EMPTY;
            }
        }

        void cancel();
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0019J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u001bJ\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u001dJ\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001e2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u001fJ\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010!J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010#J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020$2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/yandex/div/core/DivPreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivVisitor;", "", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "downloadCallback", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "<init>", "(Lcom/yandex/div/core/DivPreloader;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Lcom/yandex/div/core/DivPreloader$Callback;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "Lk8/y0;", "div", "Lcom/yandex/div/core/DivPreloader$Ticket;", "preload", "(Lk8/y0;)Lcom/yandex/div/core/DivPreloader$Ticket;", "data", "defaultVisit", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$c;", "visit", "(Lk8/y0$c;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$g;", "(Lk8/y0$g;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$e;", "(Lk8/y0$e;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$k;", "(Lk8/y0$k;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$q;", "(Lk8/y0$q;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$o;", "(Lk8/y0$o;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$d;", "(Lk8/y0$d;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$s;", "(Lk8/y0$s;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/core/DivPreloader$Callback;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "ticket", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PreloadVisitor extends DivVisitor<Unit> {

        @NotNull
        private final Callback callback;

        @NotNull
        private final DownloadCallback downloadCallback;

        @NotNull
        private final PreloadFilter preloadFilter;

        @NotNull
        private final ExpressionResolver resolver;

        @NotNull
        private final TicketImpl ticket = new TicketImpl();

        public PreloadVisitor(@NotNull DownloadCallback downloadCallback, @NotNull Callback callback, @NotNull ExpressionResolver expressionResolver, @NotNull PreloadFilter preloadFilter) {
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(y0 y0Var, ExpressionResolver expressionResolver) {
            defaultVisit2(y0Var, expressionResolver);
            return Unit.f93236a;
        }

        @NotNull
        public final Ticket preload(@NotNull y0 div) {
            visit(div, this.resolver);
            return this.ticket;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull y0 data, @NotNull ExpressionResolver resolver) {
            List<LoadReference> listPreloadImage;
            DivImagePreloader divImagePreloader = DivPreloader.this.imagePreloader;
            if (divImagePreloader != null && (listPreloadImage = divImagePreloader.preloadImage(data, resolver, this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = listPreloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivPreloader.this.extensionController.preprocessExtensions(data.c(), resolver);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.d dVar, ExpressionResolver expressionResolver) {
            visit2(dVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.g gVar, ExpressionResolver expressionResolver) {
            visit2(gVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.k kVar, ExpressionResolver expressionResolver) {
            visit2(kVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.o oVar, ExpressionResolver expressionResolver) {
            visit2(oVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.q qVar, ExpressionResolver expressionResolver) {
            visit2(qVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.s sVar, ExpressionResolver expressionResolver) {
            visit2(sVar, expressionResolver);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.c data, @NotNull ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.d(), resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((y0) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.g data, @NotNull ExpressionResolver resolver) {
            Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.d()).iterator();
            while (it.hasNext()) {
                visit((y0) it.next(), resolver);
            }
            defaultVisit2((y0) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.e data, @NotNull ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.d(), resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((y0) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.k data, @NotNull ExpressionResolver resolver) {
            for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.d(), resolver)) {
                visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
            }
            defaultVisit2((y0) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.q data, @NotNull ExpressionResolver resolver) {
            Iterator it = data.d().f86342q.iterator();
            while (it.hasNext()) {
                visit(((as.c) it.next()).f86355a, resolver);
            }
            defaultVisit2((y0) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.o data, @NotNull ExpressionResolver resolver) {
            Iterator it = data.d().I.iterator();
            while (it.hasNext()) {
                y0 y0Var = ((lq.c) it.next()).f88889c;
                if (y0Var != null) {
                    visit(y0Var, resolver);
                }
            }
            defaultVisit2((y0) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.d data, @NotNull ExpressionResolver resolver) {
            List list = data.d().f92318q;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    visit((y0) it.next(), resolver);
                }
            }
            this.ticket.addReference(DivPreloader.this.customContainerViewAdapter.preload(data.d(), this.callback));
            defaultVisit2((y0) data, resolver);
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.s data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = data.d().Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xw) it.next()).f92542d.evaluate(resolver));
                }
                this.ticket.addReference(DivPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/DivPreloader$Ticket;", "", MenuActionType.CANCEL, "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Ticket {
        void cancel();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\f\u0010\f\u001a\u00020\u0005*\u00020\tH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/div/core/DivPreloader$TicketImpl;", "Lcom/yandex/div/core/DivPreloader$Ticket;", "()V", "refs", "", "Lcom/yandex/div/core/DivPreloader$PreloadReference;", "addImageReference", "", TypedValues.Custom.S_REFERENCE, "Lcom/yandex/div/core/images/LoadReference;", "addReference", MenuActionType.CANCEL, "toPreloadReference", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TicketImpl implements Ticket {

        @NotNull
        private final List<PreloadReference> refs = new ArrayList();

        private final PreloadReference toPreloadReference(final LoadReference loadReference) {
            return new PreloadReference() { // from class: com.yandex.div.core.DivPreloader$TicketImpl$toPreloadReference$1
                @Override // com.yandex.div.core.DivPreloader.PreloadReference
                public void cancel() {
                    loadReference.cancel();
                }
            };
        }

        public final void addImageReference(@NotNull LoadReference reference) {
            this.refs.add(toPreloadReference(reference));
        }

        public final void addReference(@NotNull PreloadReference reference) {
            this.refs.add(reference);
        }

        @Override // com.yandex.div.core.DivPreloader.Ticket
        public void cancel() {
            Iterator<T> it = this.refs.iterator();
            while (it.hasNext()) {
                ((PreloadReference) it.next()).cancel();
            }
        }
    }

    public DivPreloader(@Nullable DivImagePreloader divImagePreloader, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController, @NotNull DivPlayerPreloader divPlayerPreloader, @NotNull PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NO_CALLBACK$lambda$0(boolean z10) {
    }

    @NotNull
    public Ticket preload(@NotNull y0 div, @NotNull ExpressionResolver resolver, @NotNull Callback callback) {
        DownloadCallback downloadCallback = new DownloadCallback(callback);
        Ticket ticketPreload = new PreloadVisitor(downloadCallback, callback, resolver, this.preloadFilter).preload(div);
        downloadCallback.onFullPreloadStarted();
        return ticketPreload;
    }
}
