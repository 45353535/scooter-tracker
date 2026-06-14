package com.yandex.div.core;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivPlayerPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.internal.core.DivTreeVisitor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.xw;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u0001:\u0001\u001eB3\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/yandex/div/core/DivViewDataPreloader;", "", "Lcom/yandex/div/core/view2/DivImagePreloader;", "imagePreloader", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "customContainerViewAdapter", "Lcom/yandex/div/core/extension/DivExtensionController;", "extensionController", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "videoPreloader", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "<init>", "(Lcom/yandex/div/core/view2/DivImagePreloader;Lcom/yandex/div/core/DivCustomContainerViewAdapter;Lcom/yandex/div/core/extension/DivExtensionController;Lcom/yandex/div/core/player/DivPlayerPreloader;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "Lk8/y0;", "div", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "Lcom/yandex/div/core/DivPreloader$Ticket;", "preload", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;Lcom/yandex/div/core/DivPreloader$Callback;)Lcom/yandex/div/core/DivPreloader$Ticket;", "Lcom/yandex/div/core/view2/DivImagePreloader;", "Lcom/yandex/div/core/DivCustomContainerViewAdapter;", "Lcom/yandex/div/core/extension/DivExtensionController;", "Lcom/yandex/div/core/player/DivPlayerPreloader;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "PreloadVisitor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivViewDataPreloader {

    @NotNull
    private final DivCustomContainerViewAdapter customContainerViewAdapter;

    @NotNull
    private final DivExtensionController extensionController;

    @Nullable
    private final DivImagePreloader imagePreloader;

    @NotNull
    private final DivPreloader.PreloadFilter preloadFilter;

    @NotNull
    private final DivPlayerPreloader videoPreloader;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0018\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/div/core/DivViewDataPreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivTreeVisitor;", "", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "downloadCallback", "Lcom/yandex/div/core/DivPreloader$Callback;", "callback", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "<init>", "(Lcom/yandex/div/core/DivViewDataPreloader;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Lcom/yandex/div/core/DivPreloader$Callback;Lcom/yandex/div/core/DivPreloader$PreloadFilter;)V", "Lk8/y0;", "div", "Lcom/yandex/div/core/view2/BindingContext;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/yandex/div/core/state/DivStatePath;", "path", "Lcom/yandex/div/core/DivPreloader$Ticket;", "preload", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)Lcom/yandex/div/core/DivPreloader$Ticket;", "data", "defaultVisit", "(Lk8/y0;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$d;", "visit", "(Lk8/y0$d;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "Lk8/y0$s;", "(Lk8/y0$s;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/core/DivPreloader$Callback;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "ticket", "Lcom/yandex/div/core/DivPreloader$TicketImpl;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PreloadVisitor extends DivTreeVisitor<Unit> {

        @NotNull
        private final DivPreloader.Callback callback;

        @NotNull
        private final DivPreloader.DownloadCallback downloadCallback;

        @NotNull
        private final DivPreloader.PreloadFilter preloadFilter;

        @NotNull
        private final DivPreloader.TicketImpl ticket;

        public PreloadVisitor(@NotNull DivPreloader.DownloadCallback downloadCallback, @NotNull DivPreloader.Callback callback, @NotNull DivPreloader.PreloadFilter preloadFilter) {
            super(null, 1, 0 == true ? 1 : 0);
            this.downloadCallback = downloadCallback;
            this.callback = callback;
            this.preloadFilter = preloadFilter;
            this.ticket = new DivPreloader.TicketImpl();
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(y0 y0Var, BindingContext bindingContext, DivStatePath divStatePath) {
            defaultVisit2(y0Var, bindingContext, divStatePath);
            return Unit.f93236a;
        }

        @NotNull
        public final DivPreloader.Ticket preload(@NotNull y0 div, @NotNull BindingContext context, @NotNull DivStatePath path) {
            visit(div, context, path);
            return this.ticket;
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.d dVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(dVar, bindingContext, divStatePath);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull y0 data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            List<LoadReference> listPreloadImage;
            DivImagePreloader divImagePreloader = DivViewDataPreloader.this.imagePreloader;
            if (divImagePreloader != null && (listPreloadImage = divImagePreloader.preloadImage(data, context.getExpressionResolver(), this.preloadFilter, this.downloadCallback)) != null) {
                Iterator<T> it = listPreloadImage.iterator();
                while (it.hasNext()) {
                    this.ticket.addImageReference((LoadReference) it.next());
                }
            }
            DivViewDataPreloader.this.extensionController.preprocessExtensions(data.c(), context.getExpressionResolver());
        }

        @Override // com.yandex.div.internal.core.DivTreeVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.s sVar, BindingContext bindingContext, DivStatePath divStatePath) {
            visit2(sVar, bindingContext, divStatePath);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.d data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            super.visit(data, context, path);
            this.ticket.addReference(DivViewDataPreloader.this.customContainerViewAdapter.preload(data.d(), this.callback));
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.s data, @NotNull BindingContext context, @NotNull DivStatePath path) {
            defaultVisit2((y0) data, context, path);
            if (this.preloadFilter.shouldPreloadContent(data, context.getExpressionResolver())) {
                ArrayList arrayList = new ArrayList();
                Iterator it = data.d().Q.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xw) it.next()).f92542d.evaluate(context.getExpressionResolver()));
                }
                this.ticket.addReference(DivViewDataPreloader.this.videoPreloader.preloadVideo(arrayList));
            }
        }
    }

    public DivViewDataPreloader(@Nullable DivImagePreloader divImagePreloader, @NotNull DivCustomContainerViewAdapter divCustomContainerViewAdapter, @NotNull DivExtensionController divExtensionController, @NotNull DivPlayerPreloader divPlayerPreloader, @NotNull DivPreloader.PreloadFilter preloadFilter) {
        this.imagePreloader = divImagePreloader;
        this.customContainerViewAdapter = divCustomContainerViewAdapter;
        this.extensionController = divExtensionController;
        this.videoPreloader = divPlayerPreloader;
        this.preloadFilter = preloadFilter;
    }

    public static /* synthetic */ DivPreloader.Ticket preload$default(DivViewDataPreloader divViewDataPreloader, y0 y0Var, BindingContext bindingContext, DivStatePath divStatePath, DivPreloader.Callback callback, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        if ((i10 & 8) != 0) {
            callback = DivPreloader.INSTANCE.getNO_CALLBACK$div_release();
        }
        return divViewDataPreloader.preload(y0Var, bindingContext, divStatePath, callback);
    }

    @NotNull
    public DivPreloader.Ticket preload(@NotNull y0 div, @NotNull BindingContext context, @NotNull DivStatePath path, @NotNull DivPreloader.Callback callback) {
        DivPreloader.DownloadCallback downloadCallback = new DivPreloader.DownloadCallback(callback);
        DivPreloader.Ticket ticketPreload = new PreloadVisitor(downloadCallback, callback, this.preloadFilter).preload(div, context, path);
        downloadCallback.onFullPreloadStarted();
        return ticketPreload;
    }
}
