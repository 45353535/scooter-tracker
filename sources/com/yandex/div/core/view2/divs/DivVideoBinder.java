package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.DecodeBase64ImageTask;
import com.yandex.div.core.expression.variables.TwoWayIntegerVariableBinder;
import com.yandex.div.core.expression.variables.TwoWayVariableBinder;
import com.yandex.div.core.player.DivPlayer;
import com.yandex.div.core.player.DivPlayerFactory;
import com.yandex.div.core.player.DivPlayerPlaybackConfig;
import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.player.DivVideoSource;
import com.yandex.div.core.player.DivVideoViewMapper;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivVideoView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k8.pw;
import k8.ww;
import k8.y0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B9\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010 \u001a\u00020\u001f*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J+\u0010$\u001a\u00020\u001f*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b$\u0010%J3\u0010*\u001a\u00020\u001f*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J1\u0010/\u001a\u00020\u001f*\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0014\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\u001f0,H\u0002¢\u0006\u0004\b/\u00100J5\u00102\u001a\u00020\u001f*\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b2\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00108¨\u00069"}, d2 = {"Lcom/yandex/div/core/view2/divs/DivVideoBinder;", "Lcom/yandex/div/core/view2/DivViewBinder;", "Lk8/y0$s;", "Lk8/pw;", "Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;", "Lcom/yandex/div/core/view2/divs/DivBaseBinder;", "baseBinder", "Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;", "variableBinder", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "divActionBinder", "Lcom/yandex/div/core/player/DivVideoViewMapper;", "videoViewMapper", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/yandex/div/core/player/DivPlayerFactory;", "playerFactory", "<init>", "(Lcom/yandex/div/core/view2/divs/DivBaseBinder;Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;Lcom/yandex/div/core/view2/divs/DivActionBinder;Lcom/yandex/div/core/player/DivVideoViewMapper;Ljava/util/concurrent/ExecutorService;Lcom/yandex/div/core/player/DivPlayerFactory;)V", "Lcom/yandex/div/core/view2/BindingContext;", "bindingContext", "div", "Landroid/view/View;", "previewImageView", "Lcom/yandex/div/core/player/DivPlayer$Observer;", "createObserver", "(Lcom/yandex/div/core/view2/BindingContext;Lk8/pw;Landroid/view/View;)Lcom/yandex/div/core/player/DivPlayer$Observer;", "Lcom/yandex/div/core/player/DivPlayer;", "player", "Lcom/yandex/div/core/state/DivStatePath;", "path", "", "observeElapsedTime", "(Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;Lk8/pw;Lcom/yandex/div/core/view2/BindingContext;Lcom/yandex/div/core/player/DivPlayer;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "resolver", "observeMuted", "(Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;Lk8/pw;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/player/DivPlayer;)V", "Lcom/yandex/div/core/player/DivPlayerView;", "playerView", "Lcom/yandex/div/core/view2/divs/PreviewImageView;", "previewView", "observeScale", "(Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;Lk8/pw;Lcom/yandex/div/json/expressions/ExpressionResolver;Lcom/yandex/div/core/player/DivPlayerView;Lcom/yandex/div/core/view2/divs/PreviewImageView;)V", "Lkotlin/Function1;", "Lcom/yandex/div/core/util/ImageRepresentation;", "onPreviewDecoded", "applyPreview", "(Lk8/pw;Lcom/yandex/div/json/expressions/ExpressionResolver;Lkotlin/jvm/functions/Function1;)V", "oldDiv", "bind", "(Lcom/yandex/div/core/view2/divs/widgets/DivVideoView;Lcom/yandex/div/core/view2/BindingContext;Lk8/pw;Lk8/pw;Lcom/yandex/div/core/state/DivStatePath;)V", "Lcom/yandex/div/core/expression/variables/TwoWayIntegerVariableBinder;", "Lcom/yandex/div/core/view2/divs/DivActionBinder;", "Lcom/yandex/div/core/player/DivVideoViewMapper;", "Ljava/util/concurrent/ExecutorService;", "Lcom/yandex/div/core/player/DivPlayerFactory;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DivVideoBinder extends DivViewBinder<y0.s, pw, DivVideoView> {

    @NotNull
    private final DivActionBinder divActionBinder;

    @NotNull
    private final ExecutorService executorService;

    @NotNull
    private final DivPlayerFactory playerFactory;

    @NotNull
    private final TwoWayIntegerVariableBinder variableBinder;

    @NotNull
    private final DivVideoViewMapper videoViewMapper;

    public DivVideoBinder(@NotNull DivBaseBinder divBaseBinder, @NotNull TwoWayIntegerVariableBinder twoWayIntegerVariableBinder, @NotNull DivActionBinder divActionBinder, @NotNull DivVideoViewMapper divVideoViewMapper, @NotNull ExecutorService executorService, @NotNull DivPlayerFactory divPlayerFactory) {
        super(divBaseBinder);
        this.variableBinder = twoWayIntegerVariableBinder;
        this.divActionBinder = divActionBinder;
        this.videoViewMapper = divVideoViewMapper;
        this.executorService = executorService;
        this.playerFactory = divPlayerFactory;
    }

    private final void applyPreview(pw pwVar, ExpressionResolver expressionResolver, Function1<? super ImageRepresentation, Unit> function1) {
        Expression expression = pwVar.B;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        if (str == null) {
            function1.invoke(null);
        } else {
            this.executorService.submit(new DecodeBase64ImageTask(str, false, function1));
        }
    }

    private final DivPlayer.Observer createObserver(BindingContext bindingContext, final pw div, final View previewImageView) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        return new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder.createObserver.1
        };
    }

    private final void observeElapsedTime(DivVideoView divVideoView, pw pwVar, BindingContext bindingContext, final DivPlayer divPlayer, DivStatePath divStatePath) {
        String str = pwVar.f90480m;
        if (str == null) {
            return;
        }
        divVideoView.addSubscription(this.variableBinder.bindVariable(bindingContext, str, new TwoWayVariableBinder.Callbacks() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1
            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void setViewStateChangeListener(@NotNull final Function1<? super Long, Unit> valueUpdater) {
                divPlayer.addObserver(new DivPlayer.Observer() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder$observeElapsedTime$callbacks$1$setViewStateChangeListener$1
                });
            }

            @Override // com.yandex.div.core.expression.variables.TwoWayVariableBinder.Callbacks
            public void onVariableChanged(@Nullable Long value) {
                if (value != null) {
                    divPlayer.seek(value.longValue());
                }
            }
        }, divStatePath));
    }

    private final void observeMuted(DivVideoView divVideoView, pw pwVar, ExpressionResolver expressionResolver, final DivPlayer divPlayer) {
        divVideoView.addSubscription(pwVar.f90490w.observeAndGet(expressionResolver, new Function1<Boolean, Unit>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder.observeMuted.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                divPlayer.setMuted(z10);
            }
        }));
    }

    private final void observeScale(DivVideoView divVideoView, pw pwVar, ExpressionResolver expressionResolver, final DivPlayerView divPlayerView, final PreviewImageView previewImageView) {
        divVideoView.addSubscription(pwVar.G.observeAndGet(expressionResolver, new Function1<ww, Unit>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder.observeScale.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ww wwVar) {
                invoke2(wwVar);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ww wwVar) {
                divPlayerView.setScale(wwVar);
                previewImageView.setScale(wwVar);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(@NotNull DivVideoView divVideoView, @NotNull BindingContext bindingContext, @NotNull pw pwVar, @Nullable pw pwVar2, @NotNull DivStatePath divStatePath) {
        PreviewImageView previewImageView;
        final DivPlayerView divPlayerView;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List<DivVideoSource> listCreateSource = DivVideoBinderKt.createSource(pwVar, expressionResolver);
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = new DivPlayerPlaybackConfig(((Boolean) pwVar.f90474g.evaluate(expressionResolver)).booleanValue(), ((Boolean) pwVar.f90490w.evaluate(expressionResolver)).booleanValue(), ((Boolean) pwVar.C.evaluate(expressionResolver)).booleanValue(), pwVar.f90493z);
        DivPlayerView playerView = divVideoView.getPlayerView();
        int childCount = divVideoView.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                previewImageView = null;
                break;
            }
            View childAt = divVideoView.getChildAt(i10);
            if (childAt instanceof PreviewImageView) {
                previewImageView = (PreviewImageView) childAt;
                break;
            }
            i10++;
        }
        if (playerView == null) {
            DivPlayerView divPlayerViewMakePlayerView = this.playerFactory.makePlayerView(divVideoView.getContext());
            divPlayerViewMakePlayerView.setVisibility(4);
            divPlayerView = divPlayerViewMakePlayerView;
        } else {
            divPlayerView = playerView;
        }
        final PreviewImageView previewImageView2 = previewImageView == null ? new PreviewImageView(divVideoView.getContext()) : previewImageView;
        applyPreview(pwVar, expressionResolver, new Function1<ImageRepresentation, Unit>() { // from class: com.yandex.div.core.view2.divs.DivVideoBinder.bind.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable ImageRepresentation imageRepresentation) {
                if (imageRepresentation != null) {
                    PreviewImageView previewImageView3 = previewImageView2;
                    previewImageView3.setVisibility(0);
                    if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                        previewImageView3.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).getValue());
                    } else if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                        previewImageView3.setImageBitmap(((ImageRepresentation.Bitmap) imageRepresentation).getValue());
                    }
                }
                divPlayerView.setVisibility(0);
            }
        });
        DivPlayer divPlayerMakePlayer = this.playerFactory.makePlayer(listCreateSource, divPlayerPlaybackConfig);
        divPlayerMakePlayer.addObserver(createObserver(bindingContext, pwVar, previewImageView2));
        divPlayerView.a(divPlayerMakePlayer);
        observeElapsedTime(divVideoView, pwVar, bindingContext, divPlayerMakePlayer, divStatePath);
        observeMuted(divVideoView, pwVar, expressionResolver, divPlayerMakePlayer);
        DivPlayerView divPlayerView2 = divPlayerView;
        PreviewImageView previewImageView3 = previewImageView2;
        observeScale(divVideoView, pwVar, expressionResolver, divPlayerView2, previewImageView3);
        if (previewImageView == null && playerView == null) {
            divVideoView.removeAllViews();
            divVideoView.addView(divPlayerView2);
            divVideoView.addView(previewImageView3);
        }
        this.videoViewMapper.addView(divVideoView, pwVar);
        BaseDivViewExtensionsKt.bindAspectRatio(divVideoView, pwVar.f90473f, pwVar2 != null ? pwVar2.f90473f : null, expressionResolver);
    }
}
