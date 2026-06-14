package com.yandex.div.core.view2;

import android.net.Uri;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.DivVisitor;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k8.a7;
import k8.as;
import k8.lq;
import k8.us;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0012¢\u0006\u0004\b\u0011\u0010\u0010J7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader;", "", "Lcom/yandex/div/core/images/DivImageLoader;", "imageLoader", "<init>", "(Lcom/yandex/div/core/images/DivImageLoader;)V", "", "url", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "callback", "Ljava/util/ArrayList;", "Lcom/yandex/div/core/images/LoadReference;", "Lkotlin/collections/ArrayList;", "references", "", "preloadImage", "(Ljava/lang/String;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Ljava/util/ArrayList;)V", "preloadImageBytes", "Lk8/y0;", "div", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/DivPreloader$PreloadFilter;Lcom/yandex/div/core/DivPreloader$DownloadCallback;)Ljava/util/List;", "Lcom/yandex/div/core/images/DivImageLoader;", "PreloadVisitor", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DivImagePreloader {

    @NotNull
    private final DivImageLoader imageLoader;

    @Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u001bJ\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u001dJ\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u001fJ\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010!J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010#J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010%J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010'J\u001f\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0018\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R$\u00100\u001a\u0012\u0012\u0004\u0012\u00020\u00130.j\b\u0012\u0004\u0012\u00020\u0013`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/div/core/view2/DivImagePreloader$PreloadVisitor;", "Lcom/yandex/div/internal/core/DivVisitor;", "", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "callback", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "preloadFilter", "", "visitContainers", "<init>", "(Lcom/yandex/div/core/view2/DivImagePreloader;Lcom/yandex/div/core/DivPreloader$DownloadCallback;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/DivPreloader$PreloadFilter;Z)V", "Lk8/y0;", "data", "visitBackground", "(Lk8/y0;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "div", "", "Lcom/yandex/div/core/images/LoadReference;", "preload", "(Lk8/y0;)Ljava/util/List;", "defaultVisit", "Lk8/y0$r;", "visit", "(Lk8/y0$r;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$h;", "(Lk8/y0$h;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$f;", "(Lk8/y0$f;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$c;", "(Lk8/y0$c;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$g;", "(Lk8/y0$g;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$e;", "(Lk8/y0$e;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$k;", "(Lk8/y0$k;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$q;", "(Lk8/y0$q;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lk8/y0$o;", "(Lk8/y0$o;Lcom/yandex/div/json/expressions/ExpressionResolver;)V", "Lcom/yandex/div/core/DivPreloader$DownloadCallback;", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "Lcom/yandex/div/core/DivPreloader$PreloadFilter;", "Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "references", "Ljava/util/ArrayList;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class PreloadVisitor extends DivVisitor<Unit> {

        @NotNull
        private final DivPreloader.DownloadCallback callback;

        @NotNull
        private final DivPreloader.PreloadFilter preloadFilter;

        @NotNull
        private final ArrayList<LoadReference> references = new ArrayList<>();

        @NotNull
        private final ExpressionResolver resolver;
        private final boolean visitContainers;

        public PreloadVisitor(@NotNull DivPreloader.DownloadCallback downloadCallback, @NotNull ExpressionResolver expressionResolver, @NotNull DivPreloader.PreloadFilter preloadFilter, boolean z10) {
            this.callback = downloadCallback;
            this.resolver = expressionResolver;
            this.preloadFilter = preloadFilter;
            this.visitContainers = z10;
        }

        private final void visitBackground(y0 data, ExpressionResolver resolver) {
            List<a7> background = data.c().getBackground();
            if (background != null) {
                DivImagePreloader divImagePreloader = DivImagePreloader.this;
                for (a7 a7Var : background) {
                    if ((a7Var instanceof a7.c) && this.preloadFilter.shouldPreloadBackground(a7Var, resolver)) {
                        divImagePreloader.preloadImage(((Uri) ((a7.c) a7Var).c().f91662e.evaluate(resolver)).toString(), this.callback, this.references);
                    }
                }
            }
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit defaultVisit(y0 y0Var, ExpressionResolver expressionResolver) {
            defaultVisit2(y0Var, expressionResolver);
            return Unit.f93236a;
        }

        @NotNull
        public final List<LoadReference> preload(@NotNull y0 div) {
            visit(div, this.resolver);
            return this.references;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.c cVar, ExpressionResolver expressionResolver) {
            visit2(cVar, expressionResolver);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: defaultVisit, reason: avoid collision after fix types in other method */
        protected void defaultVisit2(@NotNull y0 data, @NotNull ExpressionResolver resolver) {
            visitBackground(data, resolver);
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.e eVar, ExpressionResolver expressionResolver) {
            visit2(eVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.f fVar, ExpressionResolver expressionResolver) {
            visit2(fVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.g gVar, ExpressionResolver expressionResolver) {
            visit2(gVar, expressionResolver);
            return Unit.f93236a;
        }

        @Override // com.yandex.div.internal.core.DivVisitor
        public /* bridge */ /* synthetic */ Unit visit(y0.h hVar, ExpressionResolver expressionResolver) {
            visit2(hVar, expressionResolver);
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
        public /* bridge */ /* synthetic */ Unit visit(y0.r rVar, ExpressionResolver expressionResolver) {
            visit2(rVar, expressionResolver);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.r data, @NotNull ExpressionResolver resolver) {
            List list;
            defaultVisit2((y0) data, resolver);
            if (!this.preloadFilter.shouldPreloadContent(data, resolver) || (list = data.d().F) == null) {
                return;
            }
            DivImagePreloader divImagePreloader = DivImagePreloader.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                divImagePreloader.preloadImage(((Uri) ((us.d) it.next()).f91786i.evaluate(resolver)).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.h data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                DivImagePreloader.this.preloadImage(((Uri) data.d().B.evaluate(resolver)).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.f data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.preloadFilter.shouldPreloadContent(data, resolver)) {
                DivImagePreloader.this.preloadImageBytes(((Uri) data.d().f87254u.evaluate(resolver)).toString(), this.callback, this.references);
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.c data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.d(), resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.g data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.visitContainers) {
                Iterator<T> it = DivCollectionExtensionsKt.getNonNullItems(data.d()).iterator();
                while (it.hasNext()) {
                    visit((y0) it.next(), resolver);
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.e data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.d(), resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.k data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.visitContainers) {
                for (DivItemBuilderResult divItemBuilderResult : DivCollectionExtensionsKt.buildItems(data.d(), resolver)) {
                    visit(divItemBuilderResult.getDiv(), divItemBuilderResult.getExpressionResolver());
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.q data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.visitContainers) {
                Iterator it = data.d().f86342q.iterator();
                while (it.hasNext()) {
                    visit(((as.c) it.next()).f86355a, resolver);
                }
            }
        }

        /* JADX INFO: renamed from: visit, reason: avoid collision after fix types in other method */
        protected void visit2(@NotNull y0.o data, @NotNull ExpressionResolver resolver) {
            defaultVisit2((y0) data, resolver);
            if (this.visitContainers) {
                Iterator it = data.d().I.iterator();
                while (it.hasNext()) {
                    y0 y0Var = ((lq.c) it.next()).f88889c;
                    if (y0Var != null) {
                        visit(y0Var, resolver);
                    }
                }
            }
        }
    }

    public DivImagePreloader(@NotNull DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImageBytes(String url, DivPreloader.DownloadCallback callback, ArrayList<LoadReference> references) {
        references.add(this.imageLoader.loadImageBytes(url, callback, -1));
        callback.onSingleLoadingStarted();
    }

    @NotNull
    public List<LoadReference> preloadImage(@NotNull y0 div, @NotNull ExpressionResolver resolver, @NotNull DivPreloader.PreloadFilter preloadFilter, @NotNull DivPreloader.DownloadCallback callback) {
        return new PreloadVisitor(callback, resolver, preloadFilter, false).preload(div);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void preloadImage(String url, DivPreloader.DownloadCallback callback, ArrayList<LoadReference> references) {
        references.add(this.imageLoader.loadImage(url, callback, -1));
        callback.onSingleLoadingStarted();
    }
}
