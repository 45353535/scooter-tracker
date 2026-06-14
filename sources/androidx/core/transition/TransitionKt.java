package androidx.core.transition;

import android.transition.Transition;
import com.ironsource.C4240b4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a*\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0007\u0010\u0006\u001a*\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\b\u0010\u0006\u001a*\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\u0006\u001a*\u0010\n\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u0006\u001a\u0082\u0001\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0006\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u0014\b\u0006\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/transition/Transition;", "Lkotlin/Function1;", "", "action", "Landroid/transition/Transition$TransitionListener;", "doOnEnd", "(Landroid/transition/Transition;Lkotlin/jvm/functions/Function1;)Landroid/transition/Transition$TransitionListener;", "doOnStart", "doOnCancel", "doOnResume", "doOnPause", "onEnd", "onStart", "onCancel", C4240b4.i.f42655u0, C4240b4.i.f42653t0, "addListener", "(Landroid/transition/Transition;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroid/transition/Transition$TransitionListener;", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TransitionKt {
    @NotNull
    public static final Transition.TransitionListener addListener(@NotNull Transition transition, @NotNull Function1<? super Transition, Unit> function1, @NotNull Function1<? super Transition, Unit> function12, @NotNull Function1<? super Transition, Unit> function13, @NotNull Function1<? super Transition, Unit> function14, @NotNull Function1<? super Transition, Unit> function15) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(function1, function14, function15, function13, function12);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.f93236a;
                }
            };
        }
        if ((i10 & 2) != 0) {
            function12 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.f93236a;
                }
            };
        }
        Function1 function16 = function12;
        if ((i10 & 4) != 0) {
            function13 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.f93236a;
                }
            };
        }
        if ((i10 & 8) != 0) {
            function14 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.f93236a;
                }
            };
        }
        if ((i10 & 16) != 0) {
            function15 = new Function1<Transition, Unit>() { // from class: androidx.core.transition.TransitionKt.addListener.5
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Transition transition2) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Transition transition2) {
                    invoke2(transition2);
                    return Unit.f93236a;
                }
            };
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(function1, function14, function15, function13, function16);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    @NotNull
    public static final Transition.TransitionListener doOnCancel(@NotNull Transition transition, @NotNull final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@NotNull Transition transition2) {
                function1.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@NotNull Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @NotNull
    public static final Transition.TransitionListener doOnEnd(@NotNull Transition transition, @NotNull final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition2) {
                function1.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@NotNull Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @NotNull
    public static final Transition.TransitionListener doOnPause(@NotNull Transition transition, @NotNull final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@NotNull Transition transition2) {
                function1.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@NotNull Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @NotNull
    public static final Transition.TransitionListener doOnResume(@NotNull Transition transition, @NotNull final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@NotNull Transition transition2) {
                function1.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@NotNull Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    @NotNull
    public static final Transition.TransitionListener doOnStart(@NotNull Transition transition, @NotNull final Function1<? super Transition, Unit> function1) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(@NotNull Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(@NotNull Transition transition2) {
                function1.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
